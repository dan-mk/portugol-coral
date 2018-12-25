/**
 * generated by Xtext 2.16.0
 */
package org.xtext.coral.portugolcoral;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Portugolcoral</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.coral.portugolcoral.Portugolcoral#getElementos <em>Elementos</em>}</li>
 * </ul>
 *
 * @see org.xtext.coral.portugolcoral.PortugolcoralPackage#getPortugolcoral()
 * @model
 * @generated
 */
public interface Portugolcoral extends EObject
{
  /**
   * Returns the value of the '<em><b>Elementos</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.coral.portugolcoral.Acoes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elementos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elementos</em>' containment reference list.
   * @see org.xtext.coral.portugolcoral.PortugolcoralPackage#getPortugolcoral_Elementos()
   * @model containment="true"
   * @generated
   */
  EList<Acoes> getElementos();

} // Portugolcoral
