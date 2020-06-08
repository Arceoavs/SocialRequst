/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.socialRequest.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.socialRequest.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SocialRequestFactoryImpl extends EFactoryImpl implements SocialRequestFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SocialRequestFactory init()
  {
    try
    {
      SocialRequestFactory theSocialRequestFactory = (SocialRequestFactory)EPackage.Registry.INSTANCE.getEFactory(SocialRequestPackage.eNS_URI);
      if (theSocialRequestFactory != null)
      {
        return theSocialRequestFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SocialRequestFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SocialRequestFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SocialRequestPackage.MODEL: return createModel();
      case SocialRequestPackage.ENTITY: return createEntity();
      case SocialRequestPackage.ATTRIBUTE: return createAttribute();
      case SocialRequestPackage.TYPE_REFERENCE: return createTypeReference();
      case SocialRequestPackage.ENTITY_TYPE_REFERENCE: return createEntityTypeReference();
      case SocialRequestPackage.DATA_TYPE_REFERENCE: return createDataTypeReference();
      case SocialRequestPackage.MODIFIER: return createModifier();
      case SocialRequestPackage.VALIDATION: return createValidation();
      case SocialRequestPackage.REPOSITORY: return createRepository();
      case SocialRequestPackage.QUERY: return createQuery();
      case SocialRequestPackage.PARAM: return createParam();
      case SocialRequestPackage.SQL_QUERY: return createSQLQuery();
      case SocialRequestPackage.SELECT: return createSelect();
      case SocialRequestPackage.FROM: return createFrom();
      case SocialRequestPackage.JOIN: return createJoin();
      case SocialRequestPackage.WHERE: return createWhere();
      case SocialRequestPackage.ORDER: return createOrder();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SocialRequestPackage.DATA_TYPE:
        return createDataTypeFromString(eDataType, initialValue);
      case SocialRequestPackage.JOIN_TYPE:
        return createJoinTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SocialRequestPackage.DATA_TYPE:
        return convertDataTypeToString(eDataType, instanceValue);
      case SocialRequestPackage.JOIN_TYPE:
        return convertJoinTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeReference createTypeReference()
  {
    TypeReferenceImpl typeReference = new TypeReferenceImpl();
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityTypeReference createEntityTypeReference()
  {
    EntityTypeReferenceImpl entityTypeReference = new EntityTypeReferenceImpl();
    return entityTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataTypeReference createDataTypeReference()
  {
    DataTypeReferenceImpl dataTypeReference = new DataTypeReferenceImpl();
    return dataTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Modifier createModifier()
  {
    ModifierImpl modifier = new ModifierImpl();
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Validation createValidation()
  {
    ValidationImpl validation = new ValidationImpl();
    return validation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Repository createRepository()
  {
    RepositoryImpl repository = new RepositoryImpl();
    return repository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SQLQuery createSQLQuery()
  {
    SQLQueryImpl sqlQuery = new SQLQueryImpl();
    return sqlQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Select createSelect()
  {
    SelectImpl select = new SelectImpl();
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public From createFrom()
  {
    FromImpl from = new FromImpl();
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Join createJoin()
  {
    JoinImpl join = new JoinImpl();
    return join;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Where createWhere()
  {
    WhereImpl where = new WhereImpl();
    return where;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Order createOrder()
  {
    OrderImpl order = new OrderImpl();
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataTypeFromString(EDataType eDataType, String initialValue)
  {
    DataType result = DataType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinType createJoinTypeFromString(EDataType eDataType, String initialValue)
  {
    JoinType result = JoinType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertJoinTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SocialRequestPackage getSocialRequestPackage()
  {
    return (SocialRequestPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SocialRequestPackage getPackage()
  {
    return SocialRequestPackage.eINSTANCE;
  }

} //SocialRequestFactoryImpl
