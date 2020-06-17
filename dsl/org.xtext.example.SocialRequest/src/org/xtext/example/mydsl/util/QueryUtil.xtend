package org.xtext.example.mydsl.util

import org.xtext.example.mydsl.socialRequest.AdditionalJoinCondition
import org.xtext.example.mydsl.socialRequest.AdditionalOrderClause
import org.xtext.example.mydsl.socialRequest.AdditionalWhereCondition
import org.xtext.example.mydsl.socialRequest.Join
import org.xtext.example.mydsl.socialRequest.JoinCondition
import org.xtext.example.mydsl.socialRequest.OrderClause
import org.xtext.example.mydsl.socialRequest.AbstractReferenceValue
import org.xtext.example.mydsl.socialRequest.SQLCondition
import org.xtext.example.mydsl.socialRequest.SQLConditionPart
import org.xtext.example.mydsl.socialRequest.SQLQuery

class QueryUtil {

	static def generateJPQL(SQLQuery query)'''
		"«query.generateSelectClause» " +
		"«query.generateFromClause» "«IF !query.joins.empty || query.where !== null || query.order !== null» +«ENDIF»
		«IF query.joins !== null»
			«FOR join : query.joins»
				"«join.generateJoin» "«query.joins.indexOf(join) !== query.joins.length || query.where !== null || query.order !== null ? ' +' : ''»
			«ENDFOR»
		«ENDIF»
		«IF query.where !== null»
			"«query.generateWhereClause» "«IF query.order !== null» +«ENDIF»
		«ENDIF»
		«IF query.order !== null»
			"«query.generateOrderByClause» "
		«ENDIF»
	'''
	
	private static def generateSelectClause(SQLQuery query)'''SELECT«query.select.isDistinct ? " DISTINCT" : ""» «query.select.clause.generateReferenceValue»'''
	
	private static def generateFromClause(SQLQuery query)'''FROM «query.from.entity.name» «query.from.alias»'''
	
	private static def generateJoin(Join join)'''«join.joinType» «IF join.entity !== null»«join.entity.name»«ELSE»«join.reference.generateReferenceValue»«ENDIF» «join.alias»«IF join.joinCondition !== null» ON «join.joinCondition.generateJoinCondition»«IF join.joinConditions !== null»«FOR condition : join.joinConditions»«condition.generateJoinCondition»«ENDFOR»«ENDIF»«ENDIF»'''
		
	private static def generateJoinCondition(JoinCondition joinCondition) {
		switch (joinCondition) {
			case AdditionalJoinCondition:
				''' «(joinCondition as AdditionalJoinCondition).linkage» «joinCondition.leftReferenceValue.generateReferenceValue» = «joinCondition.rightReferenceValue.generateReferenceValue»'''
			default:
				'''«joinCondition.leftReferenceValue.generateReferenceValue» = «joinCondition.rightReferenceValue.generateReferenceValue»'''
		}
	}
	
	private static def generateReferenceValue(AbstractReferenceValue refVal)'''«IF refVal.alias !== null»«refVal.alias»«IF refVal.attribute !== null».«refVal.attribute»«ENDIF»«ENDIF»'''
			
	private static def generateWhereClause(SQLQuery query)'''WHERE «query.where.condition.generateWhereCondition»«IF query.where.additionalConditions !== null»«FOR condition : query.where.additionalConditions»«condition.generateWhereCondition»«ENDFOR»«ENDIF»'''
	
	private static def generateWhereCondition(SQLCondition condition) {
		switch (condition.class) {
			case org.xtext.example.mydsl.socialRequest.impl.AdditionalWhereConditionImpl:
				'''«(condition as AdditionalWhereCondition).linkage» «FOR part : condition.parts»«part.generateSQLPart»«ENDFOR»'''
			default:
				'''«FOR part : condition.parts»«part.generateSQLPart»«ENDFOR» '''
		}
	}
	
	private static def generateSQLPart(SQLConditionPart part)'''«IF part.leftString !== null»«part.leftString» «ENDIF»«IF part.referenceValue !== null»«part.referenceValue.generateReferenceValue»«ELSEIF part.queryParam !== null»:«part.queryParam.name»«ELSEIF part.subquery !== null»(«part.subquery.generateSubQuery»)«ENDIF»«IF part.rightString !== null» «part.rightString» «ENDIF»'''
	
	private static def generateOrderByClause(SQLQuery query)'''ORDER BY «query.order.clause.generateOrderByPart»«IF query.order.additionalClauses !== null»«FOR clause : query.order.additionalClauses»«clause.generateOrderByPart»«ENDFOR»«ENDIF»'''
	
	private static def generateOrderByPart(OrderClause orderClause)'''«orderClause.referenceValue.generateReferenceValue»«IF orderClause.order !== null» «orderClause.order»«ENDIF»'''
	
	private static def generateOrderByPart(AdditionalOrderClause orderClause)''', «orderClause.referenceValue.generateReferenceValue»«IF orderClause.order !== null» «orderClause.order»«ENDIF»'''
	
	private static def generateSubQuery(SQLQuery query)'''«query.generateSelectClause» «query.generateFromClause»«IF query.joins !== null»«FOR join : query.joins» «join.generateJoin»«ENDFOR»«ENDIF»«IF query.where !== null» «query.generateWhereClause»«ENDIF»«IF query.order !== null» «query.generateOrderByClause»«ENDIF»'''

}