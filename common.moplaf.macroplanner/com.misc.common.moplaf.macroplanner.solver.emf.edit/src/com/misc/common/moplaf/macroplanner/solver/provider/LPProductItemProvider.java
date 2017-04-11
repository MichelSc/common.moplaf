/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
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


import com.misc.common.moplaf.macroplanner.solver.LPProduct;
import com.misc.common.moplaf.macroplanner.solver.LPProductBucket;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverFactory;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimePlotsProvider;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.macroplanner.solver.LPProduct} object.
 * <!-- begin-user-doc -->
 * @implements IItemTimePlotsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class LPProductItemProvider extends LPTimeLineItemProvider implements IItemTimePlotsProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPProductItemProvider(AdapterFactory adapterFactory) {
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

			addProductPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Product feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProductPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LPProduct_Product_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LPProduct_Product_feature", "_UI_LPProduct_type"),
				 MacroPlannerSolverPackage.Literals.LP_PRODUCT__PRODUCT,
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
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_PRODUCT__SUPPLIES);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_PRODUCT__CAPACITIES);
			childrenFeatures.add(MacroPlannerSolverPackage.Literals.LP_PRODUCT__LP_BUCKETS);
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
		String label = ((LPProduct)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_LPProduct_type") :
			getString("_UI_LPProduct_type") + " " + label;
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

		switch (notification.getFeatureID(LPProduct.class)) {
			case MacroPlannerSolverPackage.LP_PRODUCT__SUPPLIES:
			case MacroPlannerSolverPackage.LP_PRODUCT__CAPACITIES:
			case MacroPlannerSolverPackage.LP_PRODUCT__LP_BUCKETS:
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
				(MacroPlannerSolverPackage.Literals.LP_PRODUCT__SUPPLIES,
				 MacroPlannerSolverFactory.eINSTANCE.createLPSupply()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_PRODUCT__CAPACITIES,
				 MacroPlannerSolverFactory.eINSTANCE.createLPCapacity()));

		newChildDescriptors.add
			(createChildParameter
				(MacroPlannerSolverPackage.Literals.LP_PRODUCT__LP_BUCKETS,
				 MacroPlannerSolverFactory.eINSTANCE.createLPProductBucket()));
	}

	/**
	 * 
	 * @author MiSc
	 *
	 */
	private static abstract class ProductTimePlot implements IItemLabelProvider{
		public abstract float getScale(LPProduct product);
		public abstract Date getEventMoment(LPProductBucket bucket);
		public abstract float getEventAmountBefore(LPProductBucket bucket);
		public abstract float getEventAmountAfter(LPProductBucket bucket);
	};
	
	private static ProductTimePlot TIME_PLOT_CONSUMPTION = new ProductTimePlot(){
		
		@Override
		public float getScale(LPProduct product) {
			return 1.0f;
		}

		@Override
		public Date getEventMoment(LPProductBucket bucket) {
			return bucket.getBucket().getBucketEnd();
		}

		@Override
		public float getEventAmountBefore(LPProductBucket bucket) {
			return bucket.getConsumed().getSelectedSolutionValue();
		}

		@Override
		public float getEventAmountAfter(LPProductBucket bucket) {
			LPProductBucket nextBucket = (LPProductBucket)bucket.getNext();
			return nextBucket == null ? 0.0f : nextBucket.getConsumed().getSelectedSolutionValue();
		}

		@Override
		public String getText(Object object) {
			return "Conso";
		}

		@Override
		public Object getImage(Object object) {
			return null;
		}
	};		
	
	private static ProductTimePlot TIME_PLOT_STOCK = new ProductTimePlot(){
		
		@Override
		public float getScale(LPProduct product) {
			return 1.0f;
		}

		@Override
		public Date getEventMoment(LPProductBucket bucket) {
			return bucket.getBucket().getBucketEnd();
		}

		@Override
		public float getEventAmountBefore(LPProductBucket bucket) {
			return bucket.getStocked().getSelectedSolutionValue();
		}

		@Override
		public float getEventAmountAfter(LPProductBucket bucket) {
			LPProductBucket nextBucket = (LPProductBucket)bucket.getNext();
			return nextBucket == null ? 0.0f : nextBucket.getStocked().getSelectedSolutionValue();
		}
		@Override
		public String getText(Object object) {
			return "Stock";
		}

		@Override
		public Object getImage(Object object) {
			return null;
		}
	};		
	
	private static List<ProductTimePlot> TIME_PLOTS = Arrays.asList(TIME_PLOT_CONSUMPTION, TIME_PLOT_STOCK);

	@Override
	public Collection<?> getTimePlots(Object element) {
		return TIME_PLOTS;
	}

	@Override
	public Collection<?> getAmountEvents(Object element, Object timeplot) {
		LPProduct product = (LPProduct) element;
		return product.getBuckets();
	}

	@Override
	public float getScale(Object element, Object timeplot) {
		LPProduct product = (LPProduct) element;
		ProductTimePlot the_timeplot = (ProductTimePlot)timeplot;
		return the_timeplot.getScale(product);
	}

	@Override
	public Date getEventMoment(Object element, Object timeplot, Object event) {
		ProductTimePlot the_timeplot = (ProductTimePlot)timeplot;
		LPProductBucket productbucket = (LPProductBucket)event;
		return the_timeplot.getEventMoment(productbucket);
	}

	@Override
	public float getEventAmountBefore(Object element, Object timeplot, Object event) {
		ProductTimePlot the_timeplot = (ProductTimePlot)timeplot;
		LPProductBucket productbucket = (LPProductBucket)event;
		return the_timeplot.getEventAmountBefore(productbucket);
	}

	@Override
	public float getEventAmountAfter(Object element, Object timeplot, Object event) {
		ProductTimePlot the_timeplot = (ProductTimePlot)timeplot;
		LPProductBucket productbucket = (LPProductBucket)event;
		return the_timeplot.getEventAmountAfter(productbucket);
	}

}
