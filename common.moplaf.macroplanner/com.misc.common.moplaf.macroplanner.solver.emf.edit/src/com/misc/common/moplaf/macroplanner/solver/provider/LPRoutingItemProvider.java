/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.macroplanner.solver.provider;


import com.misc.common.moplaf.common.Color;
import com.misc.common.moplaf.macroplanner.solver.LPRoutingBucket;
import com.misc.common.moplaf.macroplanner.solver.LPRouting;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverFactory;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimePlotsProvider;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.macroplanner.solver.LPRouting} object.
 * <!-- begin-user-doc -->
 * @implements IItemTimePlotsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class LPRoutingItemProvider extends LPTimeLineItemProvider  implements IItemTimePlotsProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPRoutingItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRoutingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Routing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoutingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPRouting_Routing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPRouting_Routing_feature", "_UI_LPRouting_type"),
				 MacroPlannerSolverPackage.Literals.LP_ROUTING__ROUTING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_ROUTING__LP_BUCKETS);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_ROUTING__PRODUCTS);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_ROUTING__RESOURCES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LPRouting)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_LPRouting_type") :
			getString("_UI_LPRouting_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(LPRouting.class)) {
			case MacroPlannerSolverPackage.LP_ROUTING__LP_BUCKETS:
			case MacroPlannerSolverPackage.LP_ROUTING__PRODUCTS:
			case MacroPlannerSolverPackage.LP_ROUTING__RESOURCES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_ROUTING__LP_BUCKETS,
				 MacroPlannerSolverFactory.eINSTANCE.createLPRoutingBucket()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_ROUTING__PRODUCTS,
				 MacroPlannerSolverFactory.eINSTANCE.createLPRoutingProduct()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_ROUTING__RESOURCES,
				 MacroPlannerSolverFactory.eINSTANCE.createLPRoutingResource()));
	}

	/**
	 * 
	 * @author MiSc
	 *
	 */
	private static abstract class RoutingTimePlot {
		public abstract float  getScale(LPRouting routing);
		public abstract String getText(LPRouting routing);
		public abstract URI    getForegroundColor(LPRouting routing);
		public abstract float  getEventAmount(LPRoutingBucket bucket, int moment);
	};
	
	private static RoutingTimePlot TIME_PLOT_PLANNED = new RoutingTimePlot(){
		
		@Override
		public float getScale(LPRouting routing) {
			return 1.0f;
		}

		@Override
		public float getEventAmount(LPRoutingBucket bucket, int moment) {
			return (float) bucket.getQuantitySelectedSolution();
		}

		@Override
		public String getText(LPRouting routing) {
			String text = String.format("Planned: %s", routing.getCode());
			return text;
		}

		@Override
		public URI getForegroundColor(LPRouting routing) {
			Color color = new Color(0, 255, 0);
			return color.toURI();			
		}


	};		
	
	private static List<RoutingTimePlot> TIME_PLOTS = Arrays.asList(TIME_PLOT_PLANNED);

	@Override
	public Collection<?> getTimePlots(Object element) {
		return TIME_PLOTS;
	}

	@Override
	public float getScale(Object element, Object timeplot) {
		LPRouting routing = (LPRouting) element;
		RoutingTimePlot the_timeplot = (RoutingTimePlot)timeplot;
		return the_timeplot.getScale(routing);
	}

	@Override
	public String getText(Object element, Object timeplot) {
		LPRouting routing = (LPRouting) element;
		RoutingTimePlot the_timeplot = (RoutingTimePlot)timeplot;
		return the_timeplot.getText(routing);
	}

	@Override
	public Object getForeground(Object element, Object timeplot) {
		LPRouting routing = (LPRouting) element;
		RoutingTimePlot the_timeplot = (RoutingTimePlot)timeplot;
		return the_timeplot.getForegroundColor(routing);
	}

	@Override
	public Collection<?> getEvents(Object element, Object timeplot) {
		LPRouting routing = (LPRouting) element;
		return routing.getBuckets();
	}

	@Override
	public int getNrMoments(Object element, Object timeplot, Object event) {
		return 2;
	}

	@Override
	public Date getMoment(Object element, Object timeplot, Object event, Object moment) {
		LPRoutingBucket productbucket = (LPRoutingBucket)event;
		Integer moment_index = (Integer)moment;
		switch ( moment_index )
		{
		case 0: 
			return productbucket.getBucket().getBucketStart();
		case 1: 
			return productbucket.getBucket().getBucketEnd();
		}
		return null;
	}

	@Override
	public float getAmount(Object element, Object timeplot, Object event, Object moment) {
		RoutingTimePlot the_timeplot = (RoutingTimePlot)timeplot;
		LPRoutingBucket productbucket = (LPRoutingBucket)event;
		Integer moment_index = (Integer)moment;
		return the_timeplot.getEventAmount(productbucket, moment_index);
	}
}
