/**
 * generated by Xtext 2.16.0
 */
package org.xtext.coral.portugolcoral.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.coral.portugolcoral.Expressao;
import org.xtext.coral.portugolcoral.Parenteses;
import org.xtext.coral.portugolcoral.PortugolcoralPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parenteses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.coral.portugolcoral.impl.ParentesesImpl#getDireita <em>Direita</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParentesesImpl extends MinimalEObjectImpl.Container implements Parenteses
{
  /**
   * The cached value of the '{@link #getDireita() <em>Direita</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDireita()
   * @generated
   * @ordered
   */
  protected Expressao direita;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParentesesImpl()
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
    return PortugolcoralPackage.Literals.PARENTESES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expressao getDireita()
  {
    return direita;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDireita(Expressao newDireita, NotificationChain msgs)
  {
    Expressao oldDireita = direita;
    direita = newDireita;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PortugolcoralPackage.PARENTESES__DIREITA, oldDireita, newDireita);
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
  public void setDireita(Expressao newDireita)
  {
    if (newDireita != direita)
    {
      NotificationChain msgs = null;
      if (direita != null)
        msgs = ((InternalEObject)direita).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PortugolcoralPackage.PARENTESES__DIREITA, null, msgs);
      if (newDireita != null)
        msgs = ((InternalEObject)newDireita).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PortugolcoralPackage.PARENTESES__DIREITA, null, msgs);
      msgs = basicSetDireita(newDireita, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PortugolcoralPackage.PARENTESES__DIREITA, newDireita, newDireita));
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
      case PortugolcoralPackage.PARENTESES__DIREITA:
        return basicSetDireita(null, msgs);
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
      case PortugolcoralPackage.PARENTESES__DIREITA:
        return getDireita();
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
      case PortugolcoralPackage.PARENTESES__DIREITA:
        setDireita((Expressao)newValue);
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
      case PortugolcoralPackage.PARENTESES__DIREITA:
        setDireita((Expressao)null);
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
      case PortugolcoralPackage.PARENTESES__DIREITA:
        return direita != null;
    }
    return super.eIsSet(featureID);
  }

} //ParentesesImpl