package org.xtext.example.mydsl.validation

import org.eclipse.xtext.validation.Check

import org.xtext.example.mydsl.socialRequest.SQLQuery

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SocialRequestValidator extends AbstractSocialRequestValidator {

	@Check
	def void checkQueryDoesNotUseFalseAttributes(SQLQuery sqlQuery) {
		
	}
	
	@Check
	def void checkQueryJoinsAreUsedInTheQuery(SQLQuery sqlQuery) {
		
	}
	
}