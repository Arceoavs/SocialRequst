/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.socialRequest.Entity
import org.xtext.example.mydsl.socialRequest.Repository
import org.xtext.example.mydsl.socialRequest.Attribute
import org.xtext.example.mydsl.socialRequest.EntityTypeReference
import org.xtext.example.mydsl.socialRequest.DataTypeReference
import org.xtext.example.mydsl.socialRequest.Validation

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SocialRequestGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
	
		for(entity : resource.allContents.toIterable.filter(Entity)) {
			fsa.generateFile(entity.name+".java", generateEntity(entity))
		}
		
		for(repo : resource.allContents.toIterable.filter(Repository)) {
			fsa.generateFile(repo.entity.name+".java", generateQuery(repo))
		}
	}
	
	private def generateEntity(Entity entity)'''
		package ????

		import javax.persistence.*;
		import javax.validation.constraints.*;

		public class �entity.name� implements Serializable �IF entity.hasUserDetails�, UserDetails �ENDIF�{
			private static final long serialVersionUID = 1L;

			�FOR attribute : entity.attributes�
			�generateAttribute(attribute)�
			�ENDFOR�

			�generateToStringMethod(entity)�
		}
	'''
	
	private def generateAttribute(Attribute attribute)'''
		�FOR validation : attribute.validations�
			�generateValidation(validation)�
		�ENDFOR�
		�IF attribute.association != null�
			�generateAssociationAnnotation(attribute)�
		�ENDIF�
		private �attributeType(attribute)� �attribute.name�;

	'''

	
	private def attributeType(Attribute attribute) {
		var String rawAttributeType

		if (attribute.typeRef instanceof EntityTypeReference) {
			rawAttributeType = (attribute.typeRef as EntityTypeReference).type.name.toString
		} else {
			rawAttributeType = (attribute.typeRef as DataTypeReference).type.toString
		}
		
		if (attribute.association != null && attribute.association.endsWith("One")) {
			"Set<" + rawAttributeType + ">"
		} else {
			rawAttributeType
		}
	}
	
	private def generateValidation(Validation validation) {
		if (validation.validator != null) {
			"@" + validation.validator.toString
		} else if (validation.min != null) {
			"@Min(" + validation.min + ")"
		} else if (validation.max != null) {
			"@Max(" + validation.max + ")"
		} else if (validation.regex != null) {
			"@Pattern(regexp = \"" + validation.regex + "\")"
		}
	}
	
	private def generateAssociationAnnotation(Attribute attribute)'''
		�IF attribute.mappedBy == null && attribute.fetchType == null�
			@�attribute.association�
		�ELSEIF attribute.mappedBy != null && attribute.fetchType != null�
			@�attribute.association�(mappedBy = "�attribute.mappedBy�", fetch = FetchType.�attribute.fetchType�)
		�ELSEIF attribute.mappedBy != null && attribute.fetchType == null�
			@�attribute.association�(mappedBy = "�attribute.mappedBy�")
	    �ELSEIF attribute.mappedBy == null && attribute.fetchType != null�
	    	@�attribute.association�(fetch = FetchType.�attribute.fetchType�)
		�ENDIF�
	'''
	
	private def generateToStringMethod(Entity entity)'''
		@Override
		public String toString() {
			return (
				"�entity.name�{" +
				�FOR attribute : entity.attributes�
				"�attribute.name�='" + �attribute.name� + '\'' +
				�ENDFOR�
				'}';
			)
		}
	'''
	
	private def generateQuery(Repository r)'''
	
	'''
}
