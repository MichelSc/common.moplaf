package com.misc.common.moplaf.propagator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
/**
 * The base class of the Adapters used by the Propagator framework. Listens to notifications. 
 * <p>
 * Implement some convenience methods such as
 * <ul>
 * <li>{@link #isFeatureChanged(Notification, Object)}: if some EMF feature is changed
 * <li>{@link #isListFeatureAddedRemoved(Notification, Object)}: if some reference is added/removed
 * </ul>
 * @author michel
 *
 */
public class AbstractAdapter extends AdapterImpl {

	public AbstractAdapter() {
		super();
	}

	/**
	 * Return true when the feature receives a new (different) value
	 * @param msg
	 * @param feature
	 * @return true if the feature's value changed
	 */
	protected boolean isFeatureChanged(Notification msg, Object feature) {
		if ( msg.isTouch() ) { return false; }
		if ( msg.getFeature()!= feature)  { return false ; }
		return true;
	}

	/**
	 * Return true when the feature is added or removed
	 * @param msg
	 * @param feature
	 * @return true if some reference is added or removed to the feature
	 */
	protected boolean isListFeatureAddedRemoved(Notification msg, Object feature) {
		if ( msg.isTouch() ) { return false; }
		if ( msg.getFeature()!= feature)  { return false ; }
		if ( msg.getEventType()!=Notification.ADD 
		  && msg.getEventType()!=Notification.REMOVE
		  && msg.getEventType()!=Notification.ADD_MANY		
		  && msg.getEventType()!=Notification.REMOVE_MANY		
		  && msg.getEventType()!=Notification.SET) { return false; }
		return true;
	}

	public void notifyChanged(Notification msg) {
		super.notifyChanged(msg);
		/*
		CommonPlugin.INSTANCE.log( "Notify Changed "
		         + com.misc.common.moplaf.propagator.Util.FormatNotification(this, msg));
        */
	}

}