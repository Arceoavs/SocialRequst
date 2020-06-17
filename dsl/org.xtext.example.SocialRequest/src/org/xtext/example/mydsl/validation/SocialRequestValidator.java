/*
* generated by Xtext 2.21.0
*/
package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.emf.ecore.EReference;
import org.xtext.example.mydsl.socialRequest.AbstractOrderClause;
import org.xtext.example.mydsl.socialRequest.AbstractReferenceValue;
import org.xtext.example.mydsl.socialRequest.AdditionalJoinCondition;
import org.xtext.example.mydsl.socialRequest.AdditionalOrderClause;
import org.xtext.example.mydsl.socialRequest.AdditionalWhereCondition;
import org.xtext.example.mydsl.socialRequest.Attribute;
import org.xtext.example.mydsl.socialRequest.Entity;
import org.xtext.example.mydsl.socialRequest.EntityTypeReference;
import org.xtext.example.mydsl.socialRequest.From;
import org.xtext.example.mydsl.socialRequest.Join;
import org.xtext.example.mydsl.socialRequest.JoinCondition;
import org.xtext.example.mydsl.socialRequest.Param;
import org.xtext.example.mydsl.socialRequest.Query;
import org.xtext.example.mydsl.socialRequest.Repository;
import org.xtext.example.mydsl.socialRequest.SQLConditionPart;
import org.xtext.example.mydsl.socialRequest.SQLQuery;
import org.xtext.example.mydsl.socialRequest.Select;
import org.xtext.example.mydsl.socialRequest.SocialRequestPackage;

/**
* This class contains custom validation rules.
*
* See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
*/
public class SocialRequestValidator extends AbstractSocialRequestValidator {

  @Check
  public void checkEntitiesAreUsedWithinAQuery(SQLQuery query) {
    try {
      if (!query.getFrom().getAlias().contentEquals(query.getSelect().getClause().getAlias())) {
        warning(
          "Defined entity alias " + query.getFrom().getAlias() + " is not used within the query's result",
          query.getFrom(),
          SocialRequestPackage.Literals.FROM__ALIAS,
          ValidationMessageAcceptor.INSIGNIFICANT_INDEX
        );
      }

      ArrayList<Join> joins = new ArrayList<Join>();
      if (query.getJoins() != null) {
        joins.addAll(query.getJoins());
      }

      ArrayList<String> referenceValueAliases = collectPrimaryReferenceValues(query).stream().map(reference -> reference.getAlias()).collect(Collectors.toCollection(ArrayList::new));

      for (Join join : joins) {
        if (!referenceValueAliases.contains(join.getAlias())) {
          warning(
            "Defined entity alias " + join.getAlias() + " is not used within the query",
            join,
            SocialRequestPackage.Literals.JOIN__ALIAS,
            ValidationMessageAcceptor.INSIGNIFICANT_INDEX
          );
        }
      }
    } catch (Exception e) {
      handleException(e);
    }
  }

  @Check
  public void checkEntityInFromClauseEqualsEntityOfRepository(Query query) {
    try {
      if (query.getSqlQuery() != null) {
        Repository repository = (Repository) query.eContainer();
        From from = query.getSqlQuery().getFrom();
        if (!repository.getEntity().getName().contentEquals(from.getEntity().getName())) {
          error(
          "The entity " + from.getEntity().getName() + " specified in the From clause does not correspond to the entity of its repository",
          from,
          SocialRequestPackage.Literals.FROM__ENTITY,
          ValidationMessageAcceptor.INSIGNIFICANT_INDEX
          );
        }
      }
    } catch (Exception e) {
      handleException(e);
    }
  }

  @Check
  public void checkAttributesInQueryAreCorrect(SQLQuery query) {
    try {
      String entityAlias = query.getFrom().getAlias();
      Entity primaryEntity = query.getFrom().getEntity();

      ArrayList<Join> joins = new ArrayList<Join>();
      if (query.getJoins() != null) {
        joins.addAll(query.getJoins());
      }

      ArrayList<String> joinAliases = new ArrayList<String>();
      for (Join join : joins) {
        joinAliases.add(join.getAlias());
      }

      ArrayList<AbstractReferenceValue> referenceValues = collectPrimaryReferenceValues(query);

      for(AbstractReferenceValue refVal : referenceValues) {
        String alias = refVal.getAlias();
        String attribute = refVal.getAttribute();
        EReference literal = getReferenceValueLiteral(refVal);

        if (alias != null && !alias.contentEquals("") && !alias.isEmpty()) {
          if(!entityAlias.contentEquals(alias) && !joinAliases.contains(alias)) {
            error(
              "Alias " + alias + " is not defined within the query",
              refVal.eContainer(),
              literal,
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
                literal,
                ValidationMessageAcceptor.INSIGNIFICANT_INDEX
              );
            }
          }
        }
      }
    } catch (Exception e) {
      handleException(e);
    }
  }

  private ArrayList<AbstractReferenceValue> collectPrimaryReferenceValues(SQLQuery query) {
    ArrayList<AbstractReferenceValue> referenceValues = new ArrayList<AbstractReferenceValue>();
    referenceValues.add(query.getSelect().getClause());
    if (query.getJoins() != null) {
      for (Join join : query.getJoins()) {
        if (join.getReference() != null) {
          referenceValues.add(join.getReference());
        }

        if (join.getJoinCondition() != null) {
          referenceValues.add(join.getJoinCondition().getLeftReferenceValue());
          referenceValues.add(join.getJoinCondition().getRightReferenceValue());
          if (join.getJoinConditions() != null && !join.getJoinConditions().isEmpty()) {
            for (AdditionalJoinCondition condition : join.getJoinConditions()) {
              referenceValues.add(condition.getLeftReferenceValue());
              referenceValues.add(condition.getRightReferenceValue());
            }
          }
        }

      }
    }
    if (query.getWhere() != null) {
      for (SQLConditionPart part : query.getWhere().getCondition().getParts()) {
        if (part.getReferenceValue() != null) {
          referenceValues.add(part.getReferenceValue());
        }
      }
      if (query.getWhere().getAdditionalConditions() != null && !query.getWhere().getAdditionalConditions().isEmpty()) {
        for (AdditionalWhereCondition condition : query.getWhere().getAdditionalConditions()) {
          for (SQLConditionPart part : condition.getParts()) {
            if (part.getReferenceValue() != null) {
              referenceValues.add(part.getReferenceValue());
            }
          }
        }
      }

    }
    if (query.getOrder() != null) {
      referenceValues.add(query.getOrder().getClause().getReferenceValue());
      if (query.getOrder().getAdditionalClauses() != null && !query.getOrder().getAdditionalClauses().isEmpty()) {
        for (AdditionalOrderClause clause : query.getOrder().getAdditionalClauses()) {
          referenceValues.add(clause.getReferenceValue());
        }
      }
    }

    return referenceValues;
  }

  private EReference getReferenceValueLiteral(AbstractReferenceValue referenceValue) {
    if (referenceValue.eContainer() instanceof Select) {
      return SocialRequestPackage.Literals.SELECT__CLAUSE;
    } else if (referenceValue.eContainer() instanceof Join) {
      return SocialRequestPackage.Literals.JOIN__REFERENCE;
    } else if (referenceValue.eContainer() instanceof JoinCondition) {
      if (referenceValue == ((JoinCondition) referenceValue.eContainer()).getLeftReferenceValue()) {
        return SocialRequestPackage.Literals.JOIN_CONDITION__LEFT_REFERENCE_VALUE;
      }
      return SocialRequestPackage.Literals.JOIN_CONDITION__RIGHT_REFERENCE_VALUE;
    } else if (referenceValue.eContainer() instanceof SQLConditionPart) {
      return SocialRequestPackage.Literals.SQL_CONDITION_PART__REFERENCE_VALUE;
    } else if (referenceValue.eContainer() instanceof AbstractOrderClause) {
      return SocialRequestPackage.Literals.ABSTRACT_ORDER_CLAUSE__REFERENCE_VALUE;
    }
    return null;
  }

  @Check
  public void checkParamsAreUsedInAQuery(Query query) {
    try {
      if (query.getSqlQuery() != null && query.getSqlQuery().getWhere() != null) {
        ArrayList<Param> params = new ArrayList<Param>();
        params.addAll(query.getParams());

        Set<Param> usedParams = collectAllUsedParams(query.getSqlQuery());

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

  private Set<Param> collectAllUsedParams(SQLQuery query) {
    Set<Param> usedParams = new HashSet<Param>();

    for (SQLConditionPart part : query.getWhere().getCondition().getParts()) {
      if (part.getQueryParam() != null) {
        usedParams.add(part.getQueryParam());
      } else if (part.getSubquery() != null) {
        usedParams.addAll(collectAllUsedParams(part.getSubquery()));
      }
    }

    if (query.getWhere().getAdditionalConditions() != null && !query.getWhere().getAdditionalConditions().isEmpty()) {
      for (AdditionalWhereCondition condition : query.getWhere().getAdditionalConditions()) {
        for (SQLConditionPart part : condition.getParts()) {
          if (part.getQueryParam() != null) {
            usedParams.add(part.getQueryParam());
          } else if (part.getSubquery() != null) {
            usedParams.addAll(collectAllUsedParams(part.getSubquery()));
          }
        }
      }
    }

    return usedParams;
  }

  @Check
  public void checkParamsAreUsedInAQueryWithoutSQL(Query query) {
    try {
      if ((query.getSqlQuery() == null || query.getSqlQuery().getWhere() == null) && query.getParams() != null) {
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
