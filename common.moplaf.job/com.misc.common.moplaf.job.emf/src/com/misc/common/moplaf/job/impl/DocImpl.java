/**
 */
package com.misc.common.moplaf.job.impl;

import com.misc.common.moplaf.common.EnabledFeedback;
import com.misc.common.moplaf.common.IMoplafObject;
import com.misc.common.moplaf.job.Doc;
import com.misc.common.moplaf.job.DocRef;
import com.misc.common.moplaf.job.JobPackage;
import com.misc.common.moplaf.job.Plugin;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doc</b></em>'.
 * @implements IMoplafObject
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.impl.DocImpl#getCloneFeedback <em>Clone Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.DocImpl#getFlushFeedback <em>Flush Feedback</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.DocImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.DocImpl#isLoaded <em>Loaded</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.impl.DocImpl#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DocImpl extends KeyIndicatorsImpl implements Doc, IMoplafObject {
	/**
	 * The default value of the '{@link #getCloneFeedback() <em>Clone Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloneFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback CLONE_FEEDBACK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFlushFeedback() <em>Flush Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlushFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final EnabledFeedback FLUSH_FEEDBACK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isLoaded() <em>Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoaded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOADED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLoaded() <em>Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoaded()
	 * @generated
	 * @ordered
	 */
	protected boolean loaded = LOADED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefs() <em>Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<DocRef> refs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobPackage.Literals.DOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getCloneFeedback() {
		return EnabledFeedback.NOFEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EnabledFeedback getFlushFeedback() {
		return new EnabledFeedback(false, "Flush not implemented");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocRef> getRefs() {
		if (refs == null) {
			refs = new EObjectWithInverseResolvingEList<DocRef>(DocRef.class, this, JobPackage.DOC__REFS, JobPackage.DOC_REF__DOC);
		}
		return refs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Doc clone() {
		Doc new_doc = this.cloneImpl();
		if ( new_doc==null ) { return null; }
		InternalEObject container = this.eContainer;
		EReference reference = (EReference) this.eContainingFeature();
		if ( reference.isMany() ) {
			EList<Doc> list = (EList<Doc>)container.eGet(reference);
			list.add(new_doc);
			return new_doc;
		} else {
			// this is an error
			Plugin.INSTANCE.logError("Doc.clone: no owning feature, object not cloned");
			return null;
		}
	}
	
	protected Doc cloneImpl() {
		Doc doc = (Doc)EcoreUtil.copy(this);
		return doc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoaded() {
		return loaded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoaded(boolean newLoaded) {
		boolean oldLoaded = loaded;
		loaded = newLoaded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobPackage.DOC__LOADED, oldLoaded, loaded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		// TODO: implement this method to return the 'Description' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void save() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void load() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void flush() {
		this.flushImpl();
		this.setLoaded(false);
		this.refreshKeyIndicators();
	}

	/**
	 * 
	 */
	protected void flushImpl() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobPackage.DOC__REFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobPackage.DOC__REFS:
				return ((InternalEList<?>)getRefs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobPackage.DOC__CLONE_FEEDBACK:
				return getCloneFeedback();
			case JobPackage.DOC__FLUSH_FEEDBACK:
				return getFlushFeedback();
			case JobPackage.DOC__DESCRIPTION:
				return getDescription();
			case JobPackage.DOC__LOADED:
				return isLoaded();
			case JobPackage.DOC__REFS:
				return getRefs();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JobPackage.DOC__LOADED:
				setLoaded((Boolean)newValue);
				return;
			case JobPackage.DOC__REFS:
				getRefs().clear();
				getRefs().addAll((Collection<? extends DocRef>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case JobPackage.DOC__LOADED:
				setLoaded(LOADED_EDEFAULT);
				return;
			case JobPackage.DOC__REFS:
				getRefs().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JobPackage.DOC__CLONE_FEEDBACK:
				return CLONE_FEEDBACK_EDEFAULT == null ? getCloneFeedback() != null : !CLONE_FEEDBACK_EDEFAULT.equals(getCloneFeedback());
			case JobPackage.DOC__FLUSH_FEEDBACK:
				return FLUSH_FEEDBACK_EDEFAULT == null ? getFlushFeedback() != null : !FLUSH_FEEDBACK_EDEFAULT.equals(getFlushFeedback());
			case JobPackage.DOC__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case JobPackage.DOC__LOADED:
				return loaded != LOADED_EDEFAULT;
			case JobPackage.DOC__REFS:
				return refs != null && !refs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JobPackage.DOC___CLONE:
				return clone();
			case JobPackage.DOC___FLUSH:
				flush();
				return null;
			case JobPackage.DOC___SAVE:
				save();
				return null;
			case JobPackage.DOC___LOAD:
				load();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Loaded: ");
		result.append(loaded);
		result.append(')');
		return result.toString();
	}

} //DocImpl
