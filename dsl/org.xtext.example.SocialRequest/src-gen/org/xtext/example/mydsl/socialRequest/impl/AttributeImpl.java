/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.socialRequest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.socialRequest.Attribute;
import org.xtext.example.mydsl.socialRequest.Entity;
import org.xtext.example.mydsl.socialRequest.Modifier;
import org.xtext.example.mydsl.socialRequest.SocialRequestPackage;
import org.xtext.example.mydsl.socialRequest.Validation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.AttributeImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.AttributeImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.AttributeImpl#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.AttributeImpl#getFetchType <em>Fetch Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.impl.AttributeImpl#getValidations <em>Validations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
{
  /**
   * The default value of the '{@link #getAssociation() <em>Association</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssociation()
   * @generated
   * @ordered
   */
  protected static final String ASSOCIATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssociation() <em>Association</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssociation()
   * @generated
   * @ordered
   */
  protected String association = ASSOCIATION_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Entity type;

  /**
   * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifier()
   * @generated
   * @ordered
   */
  protected Modifier modifier;

  /**
   * The default value of the '{@link #getMappedBy() <em>Mapped By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedBy()
   * @generated
   * @ordered
   */
  protected static final String MAPPED_BY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMappedBy() <em>Mapped By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedBy()
   * @generated
   * @ordered
   */
  protected String mappedBy = MAPPED_BY_EDEFAULT;

  /**
   * The default value of the '{@link #getFetchType() <em>Fetch Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFetchType()
   * @generated
   * @ordered
   */
  protected static final String FETCH_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFetchType() <em>Fetch Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFetchType()
   * @generated
   * @ordered
   */
  protected String fetchType = FETCH_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getValidations() <em>Validations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidations()
   * @generated
   * @ordered
   */
  protected EList<Validation> validations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl()
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
    return SocialRequestPackage.Literals.ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAssociation()
  {
    return association;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAssociation(String newAssociation)
  {
    String oldAssociation = association;
    association = newAssociation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocialRequestPackage.ATTRIBUTE__ASSOCIATION, oldAssociation, association));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocialRequestPackage.ATTRIBUTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Entity)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SocialRequestPackage.ATTRIBUTE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(Entity newType)
  {
    Entity oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocialRequestPackage.ATTRIBUTE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Modifier getModifier()
  {
    return modifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModifier(Modifier newModifier, NotificationChain msgs)
  {
    Modifier oldModifier = modifier;
    modifier = newModifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SocialRequestPackage.ATTRIBUTE__MODIFIER, oldModifier, newModifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setModifier(Modifier newModifier)
  {
    if (newModifier != modifier)
    {
      NotificationChain msgs = null;
      if (modifier != null)
        msgs = ((InternalEObject)modifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SocialRequestPackage.ATTRIBUTE__MODIFIER, null, msgs);
      if (newModifier != null)
        msgs = ((InternalEObject)newModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SocialRequestPackage.ATTRIBUTE__MODIFIER, null, msgs);
      msgs = basicSetModifier(newModifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocialRequestPackage.ATTRIBUTE__MODIFIER, newModifier, newModifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMappedBy()
  {
    return mappedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMappedBy(String newMappedBy)
  {
    String oldMappedBy = mappedBy;
    mappedBy = newMappedBy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocialRequestPackage.ATTRIBUTE__MAPPED_BY, oldMappedBy, mappedBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFetchType()
  {
    return fetchType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFetchType(String newFetchType)
  {
    String oldFetchType = fetchType;
    fetchType = newFetchType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocialRequestPackage.ATTRIBUTE__FETCH_TYPE, oldFetchType, fetchType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Validation> getValidations()
  {
    if (validations == null)
    {
      validations = new EObjectContainmentEList<Validation>(Validation.class, this, SocialRequestPackage.ATTRIBUTE__VALIDATIONS);
    }
    return validations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SocialRequestPackage.ATTRIBUTE__MODIFIER:
        return basicSetModifier(null, msgs);
      case SocialRequestPackage.ATTRIBUTE__VALIDATIONS:
        return ((InternalEList<?>)getValidations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SocialRequestPackage.ATTRIBUTE__ASSOCIATION:
        return getAssociation();
      case SocialRequestPackage.ATTRIBUTE__NAME:
        return getName();
      case SocialRequestPackage.ATTRIBUTE__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case SocialRequestPackage.ATTRIBUTE__MODIFIER:
        return getModifier();
      case SocialRequestPackage.ATTRIBUTE__MAPPED_BY:
        return getMappedBy();
      case SocialRequestPackage.ATTRIBUTE__FETCH_TYPE:
        return getFetchType();
      case SocialRequestPackage.ATTRIBUTE__VALIDATIONS:
        return getValidations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SocialRequestPackage.ATTRIBUTE__ASSOCIATION:
        setAssociation((String)newValue);
        return;
      case SocialRequestPackage.ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case SocialRequestPackage.ATTRIBUTE__TYPE:
        setType((Entity)newValue);
        return;
      case SocialRequestPackage.ATTRIBUTE__MODIFIER:
        setModifier((Modifier)newValue);
        return;
      case SocialRequestPackage.ATTRIBUTE__MAPPED_BY:
        setMappedBy((String)newValue);
        return;
      case SocialRequestPackage.ATTRIBUTE__FETCH_TYPE:
        setFetchType((String)newValue);
        return;
      case SocialRequestPackage.ATTRIBUTE__VALIDATIONS:
        getValidations().clear();
        getValidations().addAll((Collection<? extends Validation>)newValue);
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
      case SocialRequestPackage.ATTRIBUTE__ASSOCIATION:
        setAssociation(ASSOCIATION_EDEFAULT);
        return;
      case SocialRequestPackage.ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SocialRequestPackage.ATTRIBUTE__TYPE:
        setType((Entity)null);
        return;
      case SocialRequestPackage.ATTRIBUTE__MODIFIER:
        setModifier((Modifier)null);
        return;
      case SocialRequestPackage.ATTRIBUTE__MAPPED_BY:
        setMappedBy(MAPPED_BY_EDEFAULT);
        return;
      case SocialRequestPackage.ATTRIBUTE__FETCH_TYPE:
        setFetchType(FETCH_TYPE_EDEFAULT);
        return;
      case SocialRequestPackage.ATTRIBUTE__VALIDATIONS:
        getValidations().clear();
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
      case SocialRequestPackage.ATTRIBUTE__ASSOCIATION:
        return ASSOCIATION_EDEFAULT == null ? association != null : !ASSOCIATION_EDEFAULT.equals(association);
      case SocialRequestPackage.ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SocialRequestPackage.ATTRIBUTE__TYPE:
        return type != null;
      case SocialRequestPackage.ATTRIBUTE__MODIFIER:
        return modifier != null;
      case SocialRequestPackage.ATTRIBUTE__MAPPED_BY:
        return MAPPED_BY_EDEFAULT == null ? mappedBy != null : !MAPPED_BY_EDEFAULT.equals(mappedBy);
      case SocialRequestPackage.ATTRIBUTE__FETCH_TYPE:
        return FETCH_TYPE_EDEFAULT == null ? fetchType != null : !FETCH_TYPE_EDEFAULT.equals(fetchType);
      case SocialRequestPackage.ATTRIBUTE__VALIDATIONS:
        return validations != null && !validations.isEmpty();
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
    result.append(" (association: ");
    result.append(association);
    result.append(", name: ");
    result.append(name);
    result.append(", mappedBy: ");
    result.append(mappedBy);
    result.append(", fetchType: ");
    result.append(fetchType);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl