/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.socialRequest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Attribute#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Attribute#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Attribute#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Attribute#getFetchType <em>Fetch Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Attribute#getValidations <em>Validations</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Association</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Association</em>' attribute.
   * @see #setAssociation(String)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getAttribute_Association()
   * @model
   * @generated
   */
  String getAssociation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.Attribute#getAssociation <em>Association</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Association</em>' attribute.
   * @see #getAssociation()
   * @generated
   */
  void setAssociation(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Entity)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getAttribute_Type()
   * @model
   * @generated
   */
  Entity getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.Attribute#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Entity value);

  /**
   * Returns the value of the '<em><b>Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' containment reference.
   * @see #setModifier(Modifier)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getAttribute_Modifier()
   * @model containment="true"
   * @generated
   */
  Modifier getModifier();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.Attribute#getModifier <em>Modifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' containment reference.
   * @see #getModifier()
   * @generated
   */
  void setModifier(Modifier value);

  /**
   * Returns the value of the '<em><b>Mapped By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped By</em>' attribute.
   * @see #setMappedBy(String)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getAttribute_MappedBy()
   * @model
   * @generated
   */
  String getMappedBy();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.Attribute#getMappedBy <em>Mapped By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped By</em>' attribute.
   * @see #getMappedBy()
   * @generated
   */
  void setMappedBy(String value);

  /**
   * Returns the value of the '<em><b>Fetch Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fetch Type</em>' attribute.
   * @see #setFetchType(String)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getAttribute_FetchType()
   * @model
   * @generated
   */
  String getFetchType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.Attribute#getFetchType <em>Fetch Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fetch Type</em>' attribute.
   * @see #getFetchType()
   * @generated
   */
  void setFetchType(String value);

  /**
   * Returns the value of the '<em><b>Validations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.socialRequest.Validation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validations</em>' containment reference list.
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getAttribute_Validations()
   * @model containment="true"
   * @generated
   */
  EList<Validation> getValidations();

} // Attribute