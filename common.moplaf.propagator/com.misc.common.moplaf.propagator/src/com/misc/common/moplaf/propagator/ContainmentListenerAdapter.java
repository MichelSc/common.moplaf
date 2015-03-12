package com.misc.common.moplaf.propagator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EReference;

public class ContainmentListenerAdapter extends AbstractAdapter {

	@Override
	public void notifyChanged(Notification msg) {
		if ( msg.isTouch() ) { return ; }
		if ( !(msg.getFeature() instanceof EReference) ) { return; }
		if ( !((EReference)msg.getFeature()).isContainment()) { return; }
		if ( msg.getEventType()!=Notification.ADD 
		  && msg.getEventType()!=Notification.REMOVE
		  && msg.getEventType()!=Notification.SET) { return ; }
		
		Notifier oldvalue = (Notifier)msg.getOldValue();
		if ( oldvalue != null ){
			for ( Adapter adapter : oldvalue.eAdapters()){
				if ( adapter instanceof PropagatorFunctionAdapter){
					//CommonPlugin.INSTANCE.log( "OnNOTContained: "+ Util.FormatNotification(this,  msg));
					((PropagatorFunctionAdapter) adapter).onNotContained(oldvalue);
				}
			}
		}
		
		Notifier newvalue = (Notifier)msg.getNewValue();
		if ( newvalue != null ){
			for ( Adapter adapter : newvalue.eAdapters()){
				if ( adapter instanceof PropagatorFunctionAdapter){
					((PropagatorFunctionAdapter) adapter).onContained(newvalue);
				}
			}
		}
		
	super.notifyChanged(msg);
	}

};
