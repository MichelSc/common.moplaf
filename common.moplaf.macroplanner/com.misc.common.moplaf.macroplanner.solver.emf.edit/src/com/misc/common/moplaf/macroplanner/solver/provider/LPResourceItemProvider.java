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
import com.misc.common.moplaf.macroplanner.solver.LPResource;
import com.misc.common.moplaf.macroplanner.solver.LPResourceBucket;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.macroplanner.solver.LPResource} object.
 * <!-- begin-user-doc -->
 * @implements IItemTimePlotsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class LPResourceItemProvider extends LPTimeLineItemProvider implements IItemTimePlotsProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPResourceItemProvider(AdapterFactory adapterFactory) {
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

			addResourcePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPResource_Resource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPResource_Resource_feature", "_UI_LPResource_type"),
				 MacroPlannerSolverPackage.Literals.LP_RESOURCE__RESOURCE,
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
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_RESOURCE__AVAILABILITIES);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_RESOURCE__LP_BUCKETS);
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
		String label = ((LPResource)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_LPResource_type") :
			getString("_UI_LPResource_type") + " " + label;
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

		switch (notification.getFeatureID(LPResource.class)) {
			case MacroPlannerSolverPackage.LP_RESOURCE__AVAILABILITIES:
			case MacroPlannerSolverPackage.LP_RESOURCE__LP_BUCKETS:
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
				(MacroPlannerSolverPackage.Literals.LP_RESOURCE__AVAILABILITIES,
				 MacroPlannerSolverFactory.eINSTANCE.createLPAvailability()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_RESOURCE__LP_BUCKETS,
				 MacroPlannerSolverFactory.eINSTANCE.createLPResourceBucket()));
	}

	/**
	 * 
	 * @author MiSc
	 *
	 */
	private static abstract class ResourceTimePlot {
		public abstract float  getScale(LPResource resource);
		public abstract String getText(LPResource resource);
		public abstract URI    getForegroundColor(LPResource resource);
		public abstract float  getEventAmount(LPResourceBucket bucket, int moment);
	};
	
	private static ResourceTimePlot TIME_PLOT_RESERVED = new ResourceTimePlot(){
		
		@Override
		public float getScale(LPResource resource) {
			return 1.0f;
		}

		@Override
		public float getEventAmount(LPResourceBucket bucket, int moment) {
			return (float)bucket.getReservationSelectedSolution();
		}

		@Override
		public String getText(LPResource resource) {
			String text = String.format("Reservation: %s", resource.getCode());
			return text;
		}

		@Override
		public URI getForegroundColor(LPResource resource) {
			Color color = new Color(0, 255, 0);
			return color.toURI();			
		}


	};		
	
	private static ResourceTimePlot TIME_PLOT_AVAILABILITY = new ResourceTimePlot(){
		
		@Override
		public float getScale(LPResource resource) {
			return 1.0f;
		}

		public float getEventAmount(LPResourceBucket bucket, int moment) {
			return (float)bucket.getReservationMaximum();
		}

		@Override
		public String getText(LPResource resource) {
			String text = String.format("Available: %s", resource.getCode());
			return text;
		}
		
		@Override
		public URI getForegroundColor(LPResource resource) {
			Color color = new Color(0, 0, 255);
			return color.toURI();			
		}
	};		
	
	private static List<ResourceTimePlot> TIME_PLOTS = Arrays.asList(TIME_PLOT_RESERVED, TIME_PLOT_AVAILABILITY);

	@Override
	public Collection<?> getTimePlots(Object element) {
		return TIME_PLOTS;
	}

	@Override
	public float getScale(Object element, Object timeplot) {
		LPResource resource = (LPResource) element;
		ResourceTimePlot the_timeplot = (ResourceTimePlot)timeplot;
		return the_timeplot.getScale(resource);
	}

	@Override
	public String getText(Object element, Object timeplot) {
		LPResource resource = (LPResource) element;
		ResourceTimePlot the_timeplot = (ResourceTimePlot)timeplot;
		return the_timeplot.getText(resource);
	}

	@Override
	public Object getForeground(Object element, Object timeplot) {
		LPResource resource = (LPResource) element;
		ResourceTimePlot the_timeplot = (ResourceTimePlot)timeplot;
		return the_timeplot.getForegroundColor(resource);
	}

	@Override
	public Collection<?> getEvents(Object element, Object timeplot) {
		LPResource resource = (LPResource) element;
		return resource.getBuckets();
	}

	@Override
	public int getNrMoments(Object element, Object timeplot, Object event) {
		return 2;
	}

	@Override
	public Date getMoment(Object element, Object timeplot, Object event, Object moment) {
		LPResourceBucket productbucket = (LPResourceBucket)event;
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
		ResourceTimePlot the_timeplot = (ResourceTimePlot)timeplot;
		LPResourceBucket productbucket = (LPResourceBucket)event;
		Integer moment_index = (Integer)moment;
		return the_timeplot.getEventAmount(productbucket, moment_index);
	}

}
