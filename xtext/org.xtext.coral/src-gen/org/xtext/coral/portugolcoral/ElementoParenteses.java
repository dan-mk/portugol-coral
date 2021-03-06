/**
 * generated by Xtext 2.16.0
 */
package org.xtext.coral.portugolcoral;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento Parenteses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.coral.portugolcoral.ElementoParenteses#getDireita <em>Direita</em>}</li>
 * </ul>
 *
 * @see org.xtext.coral.portugolcoral.PortugolcoralPackage#getElementoParenteses()
 * @model
 * @generated
 */
public interface ElementoParenteses extends Expressao
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
   * @see #setDireita(Parenteses)
   * @see org.xtext.coral.portugolcoral.PortugolcoralPackage#getElementoParenteses_Direita()
   * @model containment="true"
   * @generated
   */
  Parenteses getDireita();

  /**
   * Sets the value of the '{@link org.xtext.coral.portugolcoral.ElementoParenteses#getDireita <em>Direita</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direita</em>' containment reference.
   * @see #getDireita()
   * @generated
   */
  void setDireita(Parenteses value);

} // ElementoParenteses
