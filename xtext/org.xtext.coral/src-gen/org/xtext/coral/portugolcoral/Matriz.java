/**
 * generated by Xtext 2.16.0
 */
package org.xtext.coral.portugolcoral;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matriz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.coral.portugolcoral.Matriz#getVariavel <em>Variavel</em>}</li>
 *   <li>{@link org.xtext.coral.portugolcoral.Matriz#getDireita <em>Direita</em>}</li>
 * </ul>
 *
 * @see org.xtext.coral.portugolcoral.PortugolcoralPackage#getMatriz()
 * @model
 * @generated
 */
public interface Matriz extends Expressao
{
  /**
   * Returns the value of the '<em><b>Variavel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variavel</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variavel</em>' attribute.
   * @see #setVariavel(String)
   * @see org.xtext.coral.portugolcoral.PortugolcoralPackage#getMatriz_Variavel()
   * @model
   * @generated
   */
  String getVariavel();

  /**
   * Sets the value of the '{@link org.xtext.coral.portugolcoral.Matriz#getVariavel <em>Variavel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variavel</em>' attribute.
   * @see #getVariavel()
   * @generated
   */
  void setVariavel(String value);

  /**
   * Returns the value of the '<em><b>Direita</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.coral.portugolcoral.PosicaoMatriz}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direita</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direita</em>' containment reference list.
   * @see org.xtext.coral.portugolcoral.PortugolcoralPackage#getMatriz_Direita()
   * @model containment="true"
   * @generated
   */
  EList<PosicaoMatriz> getDireita();

} // Matriz
