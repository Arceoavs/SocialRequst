/*
* generated by Xtext 2.21.0
*/
package org.xtext.example.mydsl.validation;

import java.util.ArrayList;


import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.xtext.example.mydsl.socialRequest.Attribute;
import org.xtext.example.mydsl.socialRequest.Entity;
import org.xtext.example.mydsl.socialRequest.EntityTypeReference;
import org.xtext.example.mydsl.socialRequest.Join;
import org.xtext.example.mydsl.socialRequest.Param;
import org.xtext.example.mydsl.socialRequest.Query;
import org.xtext.example.mydsl.socialRequest.ReferenceValue;
import org.xtext.example.mydsl.socialRequest.SQLPart;
import org.xtext.example.mydsl.socialRequest.SQLConditionPart;
import org.xtext.example.mydsl.socialRequest.SocialRequestPackage;

/**
* This class contains custom validation rules.
*
* See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
*/
public class SocialRequestValidator extends AbstractSocialRequestValidator {

  @Check
  public void checkAttributesInQueryAreCorrect(Query query) {
    try {
      if (query.getSqlQuery() != null) {
        String entityAlias = query.getSqlQuery().getFrom().getAlias();
        Entity primaryEntity = query.getSqlQuery().getFrom().getEntity();

        ArrayList<Param> params = new ArrayList<Param>();
        params.addAll(query.getParams());

        ArrayList<Join> joins = new ArrayList<Join>();
        joins.addAll(query.getSqlQuery().getJoins());

        ArrayList<SQLPart> parts = new ArrayList<SQLPart>();
        parts.addAll(query.getSqlQuery().getWhere().getCondition().getParts());
        parts.addAll(query.getSqlQuery().getOrder().getClause().getParts());

        ArrayList<String> joinAliases = new ArrayList<String>();
        ArrayList<Entity> joinEntities = new ArrayList<Entity>();
        for(Join join : joins) {
          joinAliases.add(join.getAlias());
          joinEntities.add(join.getEntity());
          if (join.getJoinCondition() != null) {
            parts.addAll(join.getJoinCondition().getParts());
          }
        }

        for(SQLPart part : parts) {
          if (part.getReferenceValue() == null) continue;

          ReferenceValue refVal = part.getReferenceValue();
          String alias = refVal.getAlias();
          String attribute = refVal.getAttribute();

          if (alias != null && !alias.contentEquals("") && !alias.isEmpty()) {
            if(!entityAlias.contentEquals(alias) && !joinAliases.contains(alias)) {
              error(
                "Alias " + alias + " is not defined within the query",
                refVal.eContainer(),
                SocialRequestPackage.Literals.SQL_PART__REFERENCE_VALUE,
                ValidationMessageAcceptor.INSIGNIFICANT_INDEX
              );
            } else if (attribute != null && !attribute.isEmpty() && !attribute.contentEquals("")) {
              boolean attributeMatches = false;

              if (alias.contentEquals(entityAlias)) {
                for(Attribute attr : primaryEntity.getAttributes()) {
                  attributeMatches = attr.getName().contentEquals(attribute);
                  if (attributeMatches) {
                    break;
                  }
                }
              }

              for(Join join : joins) {
                if (attributeMatches) {
                  break;
                }
                if (alias.contentEquals(join.getAlias())) {
                  for(Attribute attr : join.getEntity().getAttributes()) {
                    attributeMatches = attr.getName().contentEquals(attribute);
                    if (attributeMatches) {
                      break;
                    }
                  }
                }
              }

              if (!attributeMatches) {
                error(
                  "Attribute " + attribute + " is not defined within the entity of the alias " + alias,
                  refVal.eContainer(),
                  SocialRequestPackage.Literals.SQL_PART__REFERENCE_VALUE,
                  ValidationMessageAcceptor.INSIGNIFICANT_INDEX
                );
              }
            }
          }
        }
      }
    } catch (Exception e) {
      handleException(e);
    }
  }

  @Check
  public void checkParamsAreUsedInAQuery(Query query) {
    try {
      if (query.getSqlQuery() != null) {
        ArrayList<Param> params = new ArrayList<Param>();
        params.addAll(query.getParams());

        ArrayList<Param> usedParams = new ArrayList<Param>();
        for (SQLConditionPart part : query.getSqlQuery().getWhere().getCondition().getParts()) {
          if (part.getQueryParam() != null) {
            usedParams.add(part.getQueryParam());
          }
        }

        ArrayList<Join> joins = new ArrayList<Join>();
        joins.addAll(query.getSqlQuery().getJoins());

        ArrayList<SQLConditionPart> parts = new ArrayList<SQLConditionPart>();
        parts.addAll(query.getSqlQuery().getWhere().getCondition().getParts());

        ArrayList<String> joinAliases = new ArrayList<String>();
        ArrayList<Entity> joinEntities = new ArrayList<Entity>();
        for(Join join : joins) {
          joinAliases.add(join.getAlias());
          joinEntities.add(join.getEntity());
        }

        int index = 0;
        for (Param param : params) {
          if (!usedParams.contains(param)) {
            warning(
              "Parameter " + param.getName() + " is not used within the query",
              param.eContainer(),
              SocialRequestPackage.Literals.QUERY__PARAMS,
              index
            );
          }

          index++;
        }
      }
    } catch (Exception e) {
      handleException(e);
    }
  }

  @Check
  public void checkParamsAreUsedInAQueryWithoutSQL(Query query) {
    try {
      if (query.getSqlQuery() == null && query.getParams() != null) {
        Entity entity = null;
        int index = 0;

        for (Param param : query.getParams()) {
          if (param.getType() instanceof EntityTypeReference) {
            entity = ((EntityTypeReference) param.getType()).getType();
          }

          if (entity != null && !query.getName().contains(entity.getName())) {
            error("Parameter " + param.getName() + " is not used within the query", param.eContainer(), SocialRequestPackage.Literals.QUERY__PARAMS, index);
          }

          index++;
        }
      }
    } catch (Exception e) {
      handleException(e);
    }
  }

  private void handleException(Exception exception) {
    System.out.println("Error" + exception.getClass() + "occurred with message:" + exception.getMessage());
    exception.printStackTrace();
  }

}
