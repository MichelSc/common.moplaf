package com.misc.common.moplaf.common.util;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * List of objects used for returning values for derived relations.
 * It may be used for not notifying.
 * 
 * @author michel
 *
 * @param <E>
 */
public class EObjectListDerived<E> extends EObjectEList<E> {
	/**
	 * 
	 */
	private boolean skipNotifications = false;

	public EObjectListDerived(Class<?> dataClass, InternalEObject owner, int featureID) {
		super(dataClass, owner, featureID);
	}

	public EObjectListDerived(Class<?> dataClass, InternalEObject owner, int featureID, boolean skipNotifications) {
		super(dataClass, owner, featureID);
		this.skipNotifications = skipNotifications;
	}
	
	@Override
	protected boolean isNotificationRequired() {
		if ( this.skipNotifications){
			return false;
		}
	return super.isNotificationRequired();
	}
}
