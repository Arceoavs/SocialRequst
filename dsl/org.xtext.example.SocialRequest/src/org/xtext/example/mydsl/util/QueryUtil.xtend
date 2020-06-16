package org.xtext.example.mydsl.util

import org.xtext.example.mydsl.socialRequest.SQLQuery
import org.xtext.example.mydsl.socialRequest.Join
import org.xtext.example.mydsl.socialRequest.SQLConditionPart
import org.xtext.example.mydsl.socialRequest.ReferenceValue
import org.xtext.example.mydsl.socialRequest.SQLClausePart

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
			"«query.generateOrderByClause»"
		«ENDIF»
	'''
	
	private static def generateSelectClause(SQLQuery query)'''SELECT«query.select.isDistinct ? " DISTINCT" : ""» «query.select.clause.generateReferenceValue»'''
	
	private static def generateFromClause(SQLQuery query)'''FROM «query.from.entity.name» «query.from.alias»'''
	
	private static def generateJoin(Join join)'''«join.joinType» «join.entity.name» «join.alias»«IF join.joinCondition !== null» ON «FOR part : join.joinCondition.parts»«part.generateSQLPart»«ENDFOR»«ENDIF»'''
	
	private static def generateSQLPart(SQLClausePart part)'''«IF part.leftString !== null»«part.leftString» «ENDIF»«part.referenceValue.generateReferenceValue»«IF part.rightString !== null» «part.rightString» «ENDIF»'''
	
	private static def generateReferenceValue(ReferenceValue refVal)'''«IF refVal.alias !== null»«refVal.alias»«IF refVal.attribute !== null».«refVal.attribute»«ENDIF»«ENDIF»'''
		
	private static def generateWhereClause(SQLQuery query)'''WHERE «FOR part : query.where.condition.parts»«part.generateSQLPart»«ENDFOR»'''
	
	private static def generateSQLPart(SQLConditionPart part)'''«IF part.leftString !== null»«part.leftString» «ENDIF»«IF part.referenceValue !== null»«part.referenceValue.generateReferenceValue»«ELSE»:«part.queryParam.name»«ENDIF»«IF part.rightString !== null» «part.rightString» «ENDIF»'''
	
	private static def generateOrderByClause(SQLQuery query)'''ORDER BY «FOR part : query.order.clause.parts»«part.generateSQLPart»«ENDFOR»'''

}