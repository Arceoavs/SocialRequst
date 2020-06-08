/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.socialRequest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.socialRequest.Entity;
import org.xtext.example.mydsl.socialRequest.Join;
import org.xtext.example.mydsl.socialRequest.JoinType;
import org.xtext.example.mydsl.socialRequest.SocialRequestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.JoinImpl#getJoinType <em>Join Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.JoinImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.JoinImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.JoinImpl#getJoinCondition <em>Join Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinImpl extends MinimalEObjectImpl.Container implements Join
{
  /**
   * The default value of the '{@link #getJoinType() <em>Join Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoinType()
   * @generated
   * @ordered
   */
  protected static final JoinType JOIN_TYPE_EDEFAULT = JoinType.LEFT_JOIN;

  /**
   * The cached value of the '{@link #getJoinType() <em>Join Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoinType()
   * @generated
   * @ordered
   */
  protected JoinType joinType = JOIN_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected Entity entity;

  /**
   * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected static final String ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected String alias = ALIAS_EDEFAULT;

  /**
   * The default value of the '{@link #getJoinCondition() <em>Join Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoinCondition()
   * @generated
   * @ordered
   */
  protected static final String JOIN_CONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJoinCondition() <em>Join Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoinCondition()
   * @generated
   * @ordered
   */
  protected String joinCondition = JOIN_CONDITION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JoinImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SocialRequestPackage.Literals.JOIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JoinType getJoinType()
  {
    return joinType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setJoinType(JoinType newJoinType)
  {
    JoinType oldJoinType = joinType;
    joinType = newJoinType == null ? JOIN_TYPE_EDEFAULT : newJoinType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocialRequestPackage.JOIN__JOIN_TYPE, oldJoinType, joinType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity getEntity()
  {
    if (entity != null && entity.eIsProxy())
    {
      InternalEObject oldEntity = (InternalEObject)entity;
      entity = (Entity)eResolveProxy(oldEntity);
      if (entity != oldEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SocialRequestPackage.JOIN__ENTITY, oldEntity, entity));
      }
    }
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEntity(Entity newEntity)
  {
    Entity oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocialRequestPackage.JOIN__ENTITY, oldEntity, entity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAlias(String newAlias)
  {
    String oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocialRequestPackage.JOIN__ALIAS, oldAlias, alias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getJoinCondition()
  {
    return joinCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setJoinCondition(String newJoinCondition)
  {
    String oldJoinCondition = joinCondition;
    joinCondition = newJoinCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocialRequestPackage.JOIN__JOIN_CONDITION, oldJoinCondition, joinCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SocialRequestPackage.JOIN__JOIN_TYPE:
        return getJoinType();
      case SocialRequestPackage.JOIN__ENTITY:
        if (resolve) return getEntity();
        return basicGetEntity();
      case SocialRequestPackage.JOIN__ALIAS:
        return getAlias();
      case SocialRequestPackage.JOIN__JOIN_CONDITION:
        return getJoinCondition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SocialRequestPackage.JOIN__JOIN_TYPE:
        setJoinType((JoinType)newValue);
        return;
      case SocialRequestPackage.JOIN__ENTITY:
        setEntity((Entity)newValue);
        return;
      case SocialRequestPackage.JOIN__ALIAS:
        setAlias((String)newValue);
        return;
      case SocialRequestPackage.JOIN__JOIN_CONDITION:
        setJoinCondition((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SocialRequestPackage.JOIN__JOIN_TYPE:
        setJoinType(JOIN_TYPE_EDEFAULT);
        return;
      case SocialRequestPackage.JOIN__ENTITY:
        setEntity((Entity)null);
        return;
      case SocialRequestPackage.JOIN__ALIAS:
        setAlias(ALIAS_EDEFAULT);
        return;
      case SocialRequestPackage.JOIN__JOIN_CONDITION:
        setJoinCondition(JOIN_CONDITION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SocialRequestPackage.JOIN__JOIN_TYPE:
        return joinType != JOIN_TYPE_EDEFAULT;
      case SocialRequestPackage.JOIN__ENTITY:
        return entity != null;
      case SocialRequestPackage.JOIN__ALIAS:
        return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
      case SocialRequestPackage.JOIN__JOIN_CONDITION:
        return JOIN_CONDITION_EDEFAULT == null ? joinCondition != null : !JOIN_CONDITION_EDEFAULT.equals(joinCondition);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (joinType: ");
    result.append(joinType);
    result.append(", alias: ");
    result.append(alias);
    result.append(", joinCondition: ");
    result.append(joinCondition);
    result.append(')');
    return result.toString();
  }

} //JoinImpl
