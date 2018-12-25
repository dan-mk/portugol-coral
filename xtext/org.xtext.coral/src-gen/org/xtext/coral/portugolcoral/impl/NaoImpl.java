/**
 * generated by Xtext 2.16.0
 */
package org.xtext.coral.portugolcoral.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.coral.portugolcoral.Expressao;
import org.xtext.coral.portugolcoral.Nao;
import org.xtext.coral.portugolcoral.PortugolcoralPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.coral.portugolcoral.impl.NaoImpl#getNaos <em>Naos</em>}</li>
 *   <li>{@link org.xtext.coral.portugolcoral.impl.NaoImpl#getDireita <em>Direita</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NaoImpl extends ExpressaoImpl implements Nao
{
  /**
   * The cached value of the '{@link #getNaos() <em>Naos</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNaos()
   * @generated
   * @ordered
   */
  protected EList<String> naos;

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
  protected NaoImpl()
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
    return PortugolcoralPackage.Literals.NAO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getNaos()
  {
    if (naos == null)
    {
      naos = new EDataTypeEList<String>(String.class, this, PortugolcoralPackage.NAO__NAOS);
    }
    return naos;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PortugolcoralPackage.NAO__DIREITA, oldDireita, newDireita);
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
        msgs = ((InternalEObject)direita).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PortugolcoralPackage.NAO__DIREITA, null, msgs);
      if (newDireita != null)
        msgs = ((InternalEObject)newDireita).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PortugolcoralPackage.NAO__DIREITA, null, msgs);
      msgs = basicSetDireita(newDireita, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PortugolcoralPackage.NAO__DIREITA, newDireita, newDireita));
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
      case PortugolcoralPackage.NAO__DIREITA:
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
      case PortugolcoralPackage.NAO__NAOS:
        return getNaos();
      case PortugolcoralPackage.NAO__DIREITA:
        return getDireita();
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
      case PortugolcoralPackage.NAO__NAOS:
        getNaos().clear();
        getNaos().addAll((Collection<? extends String>)newValue);
        return;
      case PortugolcoralPackage.NAO__DIREITA:
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
      case PortugolcoralPackage.NAO__NAOS:
        getNaos().clear();
        return;
      case PortugolcoralPackage.NAO__DIREITA:
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
      case PortugolcoralPackage.NAO__NAOS:
        return naos != null && !naos.isEmpty();
      case PortugolcoralPackage.NAO__DIREITA:
        return direita != null;
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
    result.append(" (naos: ");
    result.append(naos);
    result.append(')');
    return result.toString();
  }

} //NaoImpl
