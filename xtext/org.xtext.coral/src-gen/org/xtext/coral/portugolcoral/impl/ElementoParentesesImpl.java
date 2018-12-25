/**
 * generated by Xtext 2.16.0
 */
package org.xtext.coral.portugolcoral.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.coral.portugolcoral.ElementoParenteses;
import org.xtext.coral.portugolcoral.Parenteses;
import org.xtext.coral.portugolcoral.PortugolcoralPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elemento Parenteses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.coral.portugolcoral.impl.ElementoParentesesImpl#getDireita <em>Direita</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementoParentesesImpl extends ExpressaoImpl implements ElementoParenteses
{
  /**
   * The cached value of the '{@link #getDireita() <em>Direita</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDireita()
   * @generated
   * @ordered
   */
  protected Parenteses direita;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementoParentesesImpl()
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
    return PortugolcoralPackage.Literals.ELEMENTO_PARENTESES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parenteses getDireita()
  {
    return direita;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDireita(Parenteses newDireita, NotificationChain msgs)
  {
    Parenteses oldDireita = direita;
    direita = newDireita;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PortugolcoralPackage.ELEMENTO_PARENTESES__DIREITA, oldDireita, newDireita);
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
  public void setDireita(Parenteses newDireita)
  {
    if (newDireita != direita)
    {
      NotificationChain msgs = null;
      if (direita != null)
        msgs = ((InternalEObject)direita).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PortugolcoralPackage.ELEMENTO_PARENTESES__DIREITA, null, msgs);
      if (newDireita != null)
        msgs = ((InternalEObject)newDireita).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PortugolcoralPackage.ELEMENTO_PARENTESES__DIREITA, null, msgs);
      msgs = basicSetDireita(newDireita, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PortugolcoralPackage.ELEMENTO_PARENTESES__DIREITA, newDireita, newDireita));
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
      case PortugolcoralPackage.ELEMENTO_PARENTESES__DIREITA:
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
      case PortugolcoralPackage.ELEMENTO_PARENTESES__DIREITA:
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
      case PortugolcoralPackage.ELEMENTO_PARENTESES__DIREITA:
        setDireita((Parenteses)newValue);
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
      case PortugolcoralPackage.ELEMENTO_PARENTESES__DIREITA:
        setDireita((Parenteses)null);
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
      case PortugolcoralPackage.ELEMENTO_PARENTESES__DIREITA:
        return direita != null;
    }
    return super.eIsSet(featureID);
  }

} //ElementoParentesesImpl