/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.socialRequest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Query#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Query#isIsList <em>Is List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Query#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.socialRequest.Query#getSqlQuery <em>Sql Query</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getQuery_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.Query#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Is List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is List</em>' attribute.
   * @see #setIsList(boolean)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getQuery_IsList()
   * @model
   * @generated
   */
  boolean isIsList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.Query#isIsList <em>Is List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is List</em>' attribute.
   * @see #isIsList()
   * @generated
   */
  void setIsList(boolean value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.socialRequest.Param}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getQuery_Params()
   * @model containment="true"
   * @generated
   */
  EList<Param> getParams();

  /**
   * Returns the value of the '<em><b>Sql Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sql Query</em>' attribute.
   * @see #setSqlQuery(String)
   * @see org.xtext.example.mydsl.socialRequest.SocialRequestPackage#getQuery_SqlQuery()
   * @model
   * @generated
   */
  String getSqlQuery();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.socialRequest.Query#getSqlQuery <em>Sql Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sql Query</em>' attribute.
   * @see #getSqlQuery()
   * @generated
   */
  void setSqlQuery(String value);

} // Query
