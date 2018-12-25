/**
 * generated by Xtext 2.16.0
 */
package org.xtext.coral.portugolcoral;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenteses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.coral.portugolcoral.Parenteses#getDireita <em>Direita</em>}</li>
 * </ul>
 *
 * @see org.xtext.coral.portugolcoral.PortugolcoralPackage#getParenteses()
 * @model
 * @generated
 */
public interface Parenteses extends EObject
{
  /**
   * Returns the value of the '<em><b>Direita</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direita</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direita</em>' containment reference.
   * @see #setDireita(Expressao)
   * @see org.xtext.coral.portugolcoral.PortugolcoralPackage#getParenteses_Direita()
   * @model containment="true"
   * @generated
   */
  Expressao getDireita();

  /**
   * Sets the value of the '{@link org.xtext.coral.portugolcoral.Parenteses#getDireita <em>Direita</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direita</em>' containment reference.
   * @see #getDireita()
   * @generated
   */
  void setDireita(Expressao value);

} // Parenteses
