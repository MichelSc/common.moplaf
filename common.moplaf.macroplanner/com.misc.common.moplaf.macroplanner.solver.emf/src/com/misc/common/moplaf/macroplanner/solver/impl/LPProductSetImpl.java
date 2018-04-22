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
package com.misc.common.moplaf.macroplanner.solver.impl;


import com.misc.common.moplaf.macroplanner.Capacity;
import com.misc.common.moplaf.macroplanner.LocationProduct;
import com.misc.common.moplaf.macroplanner.MacroPlannerDataElement;
import com.misc.common.moplaf.macroplanner.Supply;
import com.misc.common.moplaf.macroplanner.solver.LPCapacity;
import com.misc.common.moplaf.macroplanner.solver.LPMacroPlanner;
import com.misc.common.moplaf.macroplanner.solver.LPProduct;
import com.misc.common.moplaf.macroplanner.solver.LPProductSet;
import com.misc.common.moplaf.macroplanner.solver.LPSupply;
import com.misc.common.moplaf.macroplanner.solver.LPTuple;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverFactory;
import com.misc.common.moplaf.macroplanner.solver.MacroPlannerSolverPackage;
import com.misc.common.moplaf.macroplanner.solver.Scenario;
import com.misc.common.moplaf.solver.impl.GeneratorTupleImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LP Product Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductSetImpl#getMacroPlanner <em>Macro Planner</em>}</li>
 *   <li>{@link com.misc.common.moplaf.macroplanner.solver.impl.LPProductSetImpl#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LPProductSetImpl extends GeneratorTupleImpl implements LPProductSet {
	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<LPProduct> products;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LPProductSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MacroPlannerSolverPackage.Literals.LP_PRODUCT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPMacroPlanner getMacroPlanner() {
		if (eContainerFeatureID() != MacroPlannerSolverPackage.LP_PRODUCT_SET__MACRO_PLANNER) return null;
		return (LPMacroPlanner)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMacroPlanner(LPMacroPlanner newMacroPlanner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMacroPlanner, MacroPlannerSolverPackage.LP_PRODUCT_SET__MACRO_PLANNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacroPlanner(LPMacroPlanner newMacroPlanner) {
		if (newMacroPlanner != eInternalContainer() || (eContainerFeatureID() != MacroPlannerSolverPackage.LP_PRODUCT_SET__MACRO_PLANNER && newMacroPlanner != null)) {
			if (EcoreUtil.isAncestor(this, newMacroPlanner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMacroPlanner != null)
				msgs = ((InternalEObject)newMacroPlanner).eInverseAdd(this, MacroPlannerSolverPackage.LP_MACRO_PLANNER__PRODUCT_SET, LPMacroPlanner.class, msgs);
			msgs = basicSetMacroPlanner(newMacroPlanner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MacroPlannerSolverPackage.LP_PRODUCT_SET__MACRO_PLANNER, newMacroPlanner, newMacroPlanner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LPProduct> getProducts() {
		if (products == null) {
			products = new EObjectContainmentWithInverseEList<LPProduct>(LPProduct.class, this, MacroPlannerSolverPackage.LP_PRODUCT_SET__PRODUCTS, MacroPlannerSolverPackage.LP_PRODUCT__PRODUCT_SET);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public LPProduct getProduct(LocationProduct locationProduct) {
		for (LPProduct p : this.getProducts()){
			if ( p.getProduct() == locationProduct){
				return p;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LPMacroPlanner getLPMacroPlanner() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
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
			case MacroPlannerSolverPackage.LP_PRODUCT_SET__MACRO_PLANNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMacroPlanner((LPMacroPlanner)otherEnd, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT_SET__PRODUCTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducts()).basicAdd(otherEnd, msgs);
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
			case MacroPlannerSolverPackage.LP_PRODUCT_SET__MACRO_PLANNER:
				return basicSetMacroPlanner(null, msgs);
			case MacroPlannerSolverPackage.LP_PRODUCT_SET__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MacroPlannerSolverPackage.LP_PRODUCT_SET__MACRO_PLANNER:
				return eInternalContainer().eInverseRemove(this, MacroPlannerSolverPackage.LP_MACRO_PLANNER__PRODUCT_SET, LPMacroPlanner.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MacroPlannerSolverPackage.LP_PRODUCT_SET__MACRO_PLANNER:
				return getMacroPlanner();
			case MacroPlannerSolverPackage.LP_PRODUCT_SET__PRODUCTS:
				return getProducts();
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
			case MacroPlannerSolverPackage.LP_PRODUCT_SET__MACRO_PLANNER:
				setMacroPlanner((LPMacroPlanner)newValue);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_SET__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends LPProduct>)newValue);
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
			case MacroPlannerSolverPackage.LP_PRODUCT_SET__MACRO_PLANNER:
				setMacroPlanner((LPMacroPlanner)null);
				return;
			case MacroPlannerSolverPackage.LP_PRODUCT_SET__PRODUCTS:
				getProducts().clear();
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
			case MacroPlannerSolverPackage.LP_PRODUCT_SET__MACRO_PLANNER:
				return getMacroPlanner() != null;
			case MacroPlannerSolverPackage.LP_PRODUCT_SET__PRODUCTS:
				return products != null && !products.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == LPTuple.class) {
			switch (baseOperationID) {
				case MacroPlannerSolverPackage.LP_TUPLE___GET_LP_MACRO_PLANNER: return MacroPlannerSolverPackage.LP_PRODUCT_SET___GET_LP_MACRO_PLANNER;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MacroPlannerSolverPackage.LP_PRODUCT_SET___GET_PRODUCT__LOCATIONPRODUCT:
				return getProduct((LocationProduct)arguments.get(0));
			case MacroPlannerSolverPackage.LP_PRODUCT_SET___GET_LP_MACRO_PLANNER:
				return getLPMacroPlanner();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * 
	 */
	@Override
	public void generateTuples() {
		super.generateTuples();
		
		LPMacroPlanner lp = this.getMacroPlanner();
		Scenario scenario = lp.getScenario();

	    HashMap<LocationProduct,LPProduct> locationProducts = new HashMap<LocationProduct,LPProduct>();
		for ( MacroPlannerDataElement dataelement : scenario.getSelectedDataElements()){
			if ( dataelement instanceof Supply){
				// supplies
				Supply supply = (Supply) dataelement;
				LocationProduct locationProduct = supply.getLocationProduct();
				// create the LPSupply
				LPSupply lpsupply = MacroPlannerSolverFactory.eINSTANCE.createLPSupply();
				lpsupply.setSupply(supply);
				String name = String.format("suppl(%s, %tF)", locationProduct.getCode(), supply.getFrom());
				lpsupply.setName(name);
				// get or create the LPProduct
				LPProduct product = locationProducts.get(locationProduct);
				if ( product == null ){
					product = this.constructLPProduct(locationProduct);
					locationProducts.put(locationProduct, product);
				}
				product.getSupplies().add(lpsupply); // owning
			} else if ( dataelement instanceof Capacity){
				// capacities
				Capacity capacity = (Capacity)dataelement;
				LocationProduct locationProduct = capacity.getLocationProduct();
				// create the LPCapacity
				LPCapacity lpcapacity= MacroPlannerSolverFactory.eINSTANCE.createLPCapacity();
				lpcapacity.setCapacity(capacity);
				String name = String.format("capac(%s, %tF)", locationProduct.getCode(), capacity.getFrom());
				lpcapacity.setName(name);
				// get or create the LPProduct
				LPProduct product = locationProducts.get(locationProduct);
				if ( product == null ){
					product = this.constructLPProduct(locationProduct);
					locationProducts.put(locationProduct, product);
				}
				product.getCapacities().add(lpcapacity); // owning
			}
		}
	}
	
	private LPProduct constructLPProduct(LocationProduct locationProduct){
		LPProduct lpproduct = MacroPlannerSolverFactory.eINSTANCE.createLPProduct();
		lpproduct.setProduct(locationProduct);
		lpproduct.setName(locationProduct.getCode());
		this.getProducts().add(lpproduct); // owning
		return lpproduct;
	}
} //LPProductSetImpl
