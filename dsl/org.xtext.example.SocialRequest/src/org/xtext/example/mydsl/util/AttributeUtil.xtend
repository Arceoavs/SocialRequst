package org.xtext.example.mydsl.util

import org.xtext.example.mydsl.socialRequest.EntityTypeReference
import org.xtext.example.mydsl.socialRequest.DataTypeReference
import org.xtext.example.mydsl.socialRequest.Attribute
import org.xtext.example.mydsl.socialRequest.Param

class AttributeUtil {

	static def attributeType(Attribute attribute) {
		if (attribute.association !== null && attribute.association.endsWith("Many")) {
			"Set<" + attribute.rawAttributeType + ">"
		} else {
			attribute.rawAttributeType
		}
	}
	
	static def rawAttributeType(Attribute attribute) {
		if (attribute.typeRef instanceof EntityTypeReference) {
			(attribute.typeRef as EntityTypeReference).type.name.toString
		} else {
			(attribute.typeRef as DataTypeReference).type.toString
		}
	}

	static def rawAttributeType(Param param) {
		if (param.type instanceof EntityTypeReference) {
			(param.type as EntityTypeReference).type.name.toString
		} else {
			(param.type as DataTypeReference).type.toString
		}
	}

}