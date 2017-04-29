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


import com.misc.common.moplaf.common.Color;
import com.misc.common.moplaf.macroplanner.solver.LPProduct;
import com.misc.common.moplaf.macroplanner.solver.LPProductBucket;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverFactory;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimePlotsEventsMomentsProvider;

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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.macroplanner.solver.LPProduct} object.
 * <!-- begin-user-doc -->
 * @implements IItemTimePlotsEventsMomentsProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class LPProductItemProvider extends LPTimeLineItemProvider implements IItemTimePlotsEventsMomentsProvider {
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
	private static abstract class ProductTimePlot {
		public abstract float  getScale(LPProduct product);
		public abstract String getText(LPProduct product);
		public abstract URI    getForegroundColor(LPProduct product);
		public abstract float  getEventAmount(LPProductBucket bucket, int moment);
	};
	
	private static ProductTimePlot TIME_PLOT_CONSUMPTION = new ProductTimePlot(){
		
		@Override
		public float getScale(LPProduct product) {
			return 1.0f;
		}

		@Override
		public float getEventAmount(LPProductBucket bucket, int moment) {
			return bucket.getConsumed().getSelectedSolutionValue();
		}

		@Override
		public String getText(LPProduct product) {
			String text = String.format("Conso: %s", product.getCode());
			return text;
		}

		@Override
		public URI getForegroundColor(LPProduct product) {
			Color color = new Color(0, 255, 0);
			return color.toURI();			
		}


	};		
	
	private static ProductTimePlot TIME_PLOT_SUPPLY = new ProductTimePlot(){
		
		@Override
		public float getScale(LPProduct product) {
			return 1.0f;
		}

		@Override
		public float getEventAmount(LPProductBucket bucket, int moment) {
			return (float)bucket.getSupplySelectedSolution();
		}

		@Override
		public String getText(LPProduct product) {
			String text = String.format("Supply: %s", product.getCode());
			return text;
		}

		@Override
		public URI getForegroundColor(LPProduct product) {
			Color color = new Color(255, 0, 0);
			return color.toURI();			
		}

	};		
	
	private static ProductTimePlot TIME_PLOT_STOCK = new ProductTimePlot(){
		
		@Override
		public float getScale(LPProduct product) {
			return 1.0f;
		}

		@Override
		public float getEventAmount(LPProductBucket bucket, int moment) {
			return (float)bucket.getStockSelectedSolution();
		}

		@Override
		public String getText(LPProduct product) {
			String text = String.format("Stock: %s", product.getCode());
			return text;
		}
		
		@Override
		public URI getForegroundColor(LPProduct product) {
			Color color = new Color(0, 0, 255);
			return color.toURI();			
		}
	};		
	
	private static ProductTimePlot TIME_PLOT_CAPACITY = new ProductTimePlot(){
		
		@Override
		public float getScale(LPProduct product) {
			return 1.0f;
		}

		public float getEventAmount(LPProductBucket bucket, int moment) {
			return (float)bucket.getStockMaximum();
		}

		@Override
		public String getText(LPProduct product) {
			String text = String.format("Capac: %s", product.getCode());
			return text;
		}
		
		@Override
		public URI getForegroundColor(LPProduct product) {
			Color color = new Color(0, 128, 128);
			return color.toURI();			
		}
	};		
	
	private static List<ProductTimePlot> TIME_PLOTS = Arrays.asList(TIME_PLOT_CONSUMPTION, TIME_PLOT_STOCK, TIME_PLOT_SUPPLY, TIME_PLOT_CAPACITY);

	@Override
	public Collection<?> getTimePlots(Object element) {
		return TIME_PLOTS;
	}

	@Override
	public float getScale(Object element, Object timeplot) {
		LPProduct product = (LPProduct) element;
		ProductTimePlot the_timeplot = (ProductTimePlot)timeplot;
		return the_timeplot.getScale(product);
	}

	@Override
	public String getText(Object element, Object timeplot) {
		LPProduct product = (LPProduct) element;
		ProductTimePlot the_timeplot = (ProductTimePlot)timeplot;
		return the_timeplot.getText(product);
	}

	@Override
	public Object getForeground(Object element, Object timeplot) {
		LPProduct product = (LPProduct) element;
		ProductTimePlot the_timeplot = (ProductTimePlot)timeplot;
		return the_timeplot.getForegroundColor(product);
	}

	@Override
	public Collection<?> getEventsMoments(Object element, Object timeplot) {
		LPProduct product = (LPProduct) element;
		return product.getBuckets();
	}

	@Override
	public int getMoments(Object element, Object timeplot, Object event) {
		return 2;
	}

	@Override
	public Date getMoment(Object element, Object timeplot, Object event, int moment) {
		LPProductBucket productbucket = (LPProductBucket)event;
		switch ( moment )
		{
		case 0: 
			return productbucket.getBucket().getBucketStart();
		case 1: 
			return productbucket.getBucket().getBucketEnd();
		}
		return null;
	}

	@Override
	public float getAmount(Object element, Object timeplot, Object event, int moment) {
		ProductTimePlot the_timeplot = (ProductTimePlot)timeplot;
		LPProductBucket productbucket = (LPProductBucket)event;
		return the_timeplot.getEventAmount(productbucket, moment);
	}

}
