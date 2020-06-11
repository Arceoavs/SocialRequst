package org.xtext.example.mydsl.util

import org.xtext.example.mydsl.socialRequest.SQLQuery
import org.xtext.example.mydsl.socialRequest.Join

class QueryUtil {

	static def generateJPQL(SQLQuery query)'''
		"«query.generateSelectClause»" +
		"«query.generateFromClause»"«IF query.joins.empty || query.where !== null || query.order !== null» +«ENDIF»
		«FOR join : query.joins»
			"«join.generateJoin»"«query.joins.indexOf(join) !== query.joins.length || query.where !== null || query.order !== null ? ' +' : ''»
		«ENDFOR»
		«IF query.where !== null»
			"«query.generateWhereClause»"«IF query.order !== null» +«ENDIF»
		«ENDIF»
		«IF query.order !== null»
			"«query.generateOrderByClause»""
		«ENDIF»
	'''
	
	private static def generateSelectClause(SQLQuery query)'''SELECT «query.select.isDistinct ? "DISTINCT" : ""»«query.select.clause»'''
	
	private static def generateFromClause(SQLQuery query)'''FROM «query.from.entity.name» «query.from.alias»'''
	
	private static def generateJoin(Join join)'''«join.joinType» «join.entity.name» «join.alias»«IF join.joinCondition !== null» ON «join.joinCondition»«ENDIF»'''
	
	private static def generateWhereClause(SQLQuery query)'''WHERE «query.where.condition»'''
	
	private static def generateOrderByClause(SQLQuery query)'''ORDER BY «query.order.clause»'''

}