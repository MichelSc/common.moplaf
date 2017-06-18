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
package com.misc.common.moplaf.solver.impl;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.common.util.EObjectListDerived;
import com.misc.common.moplaf.job.RunContext;
import com.misc.common.moplaf.job.impl.RunImpl;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorCons;
import com.misc.common.moplaf.solver.GeneratorFeatureMode;
import com.misc.common.moplaf.solver.GeneratorGoal;
import com.misc.common.moplaf.solver.GeneratorTuple;
import com.misc.common.moplaf.solver.ITupleVisitor;
import com.misc.common.moplaf.solver.Plugin;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionProvider;
import com.misc.common.moplaf.solver.SolverPackage;


import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorImpl#getTupleRoot <em>Tuple Root</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorImpl#getGeneratorFeatureModes <em>Generator Feature Modes</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorImpl#getSolutionProvider <em>Solution Provider</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorImpl#getFootprintNofVars <em>Footprint Nof Vars</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorImpl#getFootprintNofCons <em>Footprint Nof Cons</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorImpl#getFootprintNofTerms <em>Footprint Nof Terms</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorImpl#getCode <em>Code</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.GeneratorImpl#getSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneratorImpl extends RunImpl implements Generator {
	/**
	 * The cached value of the '{@link #getGeneratorFeatureModes() <em>Generator Feature Modes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratorFeatureModes()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratorFeatureMode> generatorFeatureModes;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFootprintNofVars() <em>Footprint Nof Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFootprintNofVars()
	 * @generated
	 * @ordered
	 */
	protected static final int FOOTPRINT_NOF_VARS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFootprintNofVars() <em>Footprint Nof Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFootprintNofVars()
	 * @generated
	 * @ordered
	 */
	protected int footprintNofVars = FOOTPRINT_NOF_VARS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFootprintNofCons() <em>Footprint Nof Cons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFootprintNofCons()
	 * @generated
	 * @ordered
	 */
	protected static final int FOOTPRINT_NOF_CONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFootprintNofCons() <em>Footprint Nof Cons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFootprintNofCons()
	 * @generated
	 * @ordered
	 */
	protected int footprintNofCons = FOOTPRINT_NOF_CONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFootprintNofTerms() <em>Footprint Nof Terms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFootprintNofTerms()
	 * @generated
	 * @ordered
	 */
	protected static final int FOOTPRINT_NOF_TERMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFootprintNofTerms() <em>Footprint Nof Terms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFootprintNofTerms()
	 * @generated
	 * @ordered
	 */
	protected int footprintNofTerms = FOOTPRINT_NOF_TERMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getSelected() <em>Selected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected Solution selected;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<GeneratorTuple> getTupleRoot() {
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		EList<GeneratorTuple> newList = new EObjectListDerived<GeneratorTuple>(GeneratorTuple.class, this, SolverPackage.GENERATOR__TUPLE_ROOT, true);
		for ( EObject element : this.eContents()){
			if ( element instanceof GeneratorTuple){
				GeneratorTuple tuple= (GeneratorTuple)element;
				newList.add(tuple);
			}
			
		}
		return newList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFootprintNofVars() {
		return footprintNofVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFootprintNofVars(int newFootprintNofVars) {
		int oldFootprintNofVars = footprintNofVars;
		footprintNofVars = newFootprintNofVars;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR__FOOTPRINT_NOF_VARS, oldFootprintNofVars, footprintNofVars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFootprintNofCons() {
		return footprintNofCons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFootprintNofCons(int newFootprintNofCons) {
		int oldFootprintNofCons = footprintNofCons;
		footprintNofCons = newFootprintNofCons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR__FOOTPRINT_NOF_CONS, oldFootprintNofCons, footprintNofCons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFootprintNofTerms() {
		return footprintNofTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFootprintNofTerms(int newFootprintNofTerms) {
		int oldFootprintNofTerms = footprintNofTerms;
		footprintNofTerms = newFootprintNofTerms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR__FOOTPRINT_NOF_TERMS, oldFootprintNofTerms, footprintNofTerms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<SolutionProvider> getSolutionProvider() {
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		EList<SolutionProvider> newList = new EObjectListDerived<SolutionProvider>(SolutionProvider.class, this, SolverPackage.GENERATOR__SOLUTION_PROVIDER, true);
		for ( EObject element : this.eContents()){
			if ( element instanceof SolutionProvider){
				SolutionProvider solutionProvider = (SolutionProvider)element;
				newList.add(solutionProvider);
			}
			
		}
		return newList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getSelected() {
		if (selected != null && selected.eIsProxy()) {
			InternalEObject oldSelected = (InternalEObject)selected;
			selected = (Solution)eResolveProxy(oldSelected);
			if (selected != oldSelected) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolverPackage.GENERATOR__SELECTED, oldSelected, selected));
			}
		}
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution basicGetSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setSelected(Solution newSelected) {
		Solution oldSelected = selected;
		selected = newSelected;
		if ( oldSelected!=newSelected ){
			Resource resource = this.eResource();
			if ( resource instanceof ResourceImpl){
				ResourceImpl resourceImpl = (ResourceImpl)resource;
				if ( !resourceImpl.isLoading()){
					this.refreshSelectedSolution();
				}
			}
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.GENERATOR__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<GeneratorGoal> getGoals() {
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		EList<GeneratorGoal> newList = new EObjectListDerived<GeneratorGoal>(GeneratorGoal.class, this, SolverPackage.GENERATOR__GOALS, true);
		for ( EObject element : this.eContents()){
			if ( element instanceof GeneratorGoal){
				GeneratorGoal goal= (GeneratorGoal)element;
				newList.add(goal);
			}
		}
		return newList;
	}
	
	


	/*
	 * (non-Javadoc)
	 * @see com.misc.common.moplaf.common.impl.RunImpl#runImpl()
	 */
	@Override
	protected ReturnFeedback runImpl(RunContext runContext) {
		try {
			ReturnFeedback generateFeedback = this.generate();
			if ( generateFeedback.isFailure() ){
				Plugin.INSTANCE.logError("Generator.run: failed, reason "+generateFeedback.getFeedback());
			}
			return generateFeedback;
		} catch (Exception e){
			Plugin.INSTANCE.logError("Generator.run: failed, exception "+e.getMessage());
			return new ReturnFeedback("Generator.run", e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ReturnFeedback generate() {
		Plugin.INSTANCE.logInfo("Generator.generate: called");
		//this.getTupleRoot().clear();
		while ( !this.getTupleRoot().isEmpty()){
			EcoreUtil.delete(this.getTupleRoot().get(0), true);
		}
		while ( !this.getGoals().isEmpty()){
			EcoreUtil.delete(this.getGoals().get(0), true);
		}
		while ( !this.getSolutionProvider().isEmpty()){
			EcoreUtil.delete(this.getSolutionProvider().get(0), true);
		}
		Plugin.INSTANCE.logInfo("Generator.generate: flushed");
	
		try {
			this.generateTuples();
			Plugin.INSTANCE.logInfo("Generator.generate: tuples generated");
			this.generateTupleXReferences();
			Plugin.INSTANCE.logInfo("Generator.generate: tuple cross references generated");
			this.generateVars();
			Plugin.INSTANCE.logInfo("Generator.generate: vars generated");
			this.generateCons();
			Plugin.INSTANCE.logInfo("Generator.generate: con generated");
			this.generateGoals();
			Plugin.INSTANCE.logInfo("Generator.generate: goals generated");
		} catch (Exception e) {
			Plugin.INSTANCE.logError("Generator.generate: error "+ e.toString());
			e.printStackTrace();
			return new ReturnFeedback("Generator.generate", e);
		}
		return ReturnFeedback.SUCCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Generate the root tuples. Default implementation does nothing
	 * <!-- end-user-doc -->
	 */
	public void generateRootTuples() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * Generate all the tuples. Default implementation calls generateRootTuples, then recursively tuple.generateTuples
	 * <!-- end-user-doc -->
	 * @throws Exception 
	 */
	public void generateTuples() throws Exception  {
		this.generateRootTuples();
		this.visitTuples(new ITupleVisitor(){
			@Override
			public void visitTuple(GeneratorTuple tuple) {
				tuple.generateTuples();
			}
			});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void generateTupleXReferences() throws Exception {
		class TupleXReferenceGenerator implements ITupleVisitor{
			@Override
			public void visitTuple(GeneratorTuple tuple) {
				tuple.generateXReferences();
			}
		}
		TupleXReferenceGenerator tuple_x_ref_generator = new TupleXReferenceGenerator();
			this.visitTuples(tuple_x_ref_generator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void generateVars() throws Exception {
		class VarGenerator implements ITupleVisitor{
			private int varcounter;
			@Override
			public void visitTuple(GeneratorTuple tuple) {
				tuple.generateVars();
				varcounter += tuple.getVar().size();
			}
		}
		VarGenerator vargenerator = new VarGenerator();
		this.visitTuples(vargenerator);
		this.setFootprintNofVars(vargenerator.varcounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void generateCons() throws Exception  {
		class ConsGenerator implements ITupleVisitor{
			private int conscounter=0;
			private int termscounter=0;
			@Override
			public void visitTuple(GeneratorTuple tuple) {
				tuple.generateCons();
				for (GeneratorCons cons : tuple.getCons()){
					conscounter++;
					termscounter += cons.getNofTerms();
				}
			}
		}
		ConsGenerator consgenerator = new ConsGenerator();
		this.visitTuples(consgenerator);
		this.setFootprintNofCons(consgenerator.conscounter);
		this.setFootprintNofTerms(consgenerator.termscounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Generate the goals. Default implementation does nothing
	 * <!-- end-user-doc -->
	 */
	public void generateGoals() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void acceptSolution(Solution solutionprovider) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorFeatureMode selectFeatureMode(GeneratorFeatureMode feature, GeneratorTuple object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void visitTuples(ITupleVisitor visitor) throws Exception {
		for (GeneratorTuple roottuple : this.getTupleRoot()){
			roottuple.visitTuples(visitor);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshSelectedSolution() {
		class TupleRefreshor implements ITupleVisitor{
			@Override
			public void visitTuple(GeneratorTuple tuple) {
				tuple.refreshSelectedSolution();
				}
			}
		TupleRefreshor refreshor = new TupleRefreshor();
		try {
			// refresh the tuples
			this.visitTuples(refreshor);
			// refresh the goals
			for ( GeneratorGoal goal : this.getGoals()){
				goal.refreshSelectedSolution();
			}
		} catch (Exception e) {
			Plugin.INSTANCE.logError("Generator: refresh selected solution failed, "+e.getMessage());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratorFeatureMode> getGeneratorFeatureModes() {
		if (generatorFeatureModes == null) {
			generatorFeatureModes = new EObjectWithInverseResolvingEList<GeneratorFeatureMode>(GeneratorFeatureMode.class, this, SolverPackage.GENERATOR__GENERATOR_FEATURE_MODES, SolverPackage.GENERATOR_FEATURE_MODE__GENERATOR);
		}
		return generatorFeatureModes;
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
			case SolverPackage.GENERATOR__GENERATOR_FEATURE_MODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneratorFeatureModes()).basicAdd(otherEnd, msgs);
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
			case SolverPackage.GENERATOR__GENERATOR_FEATURE_MODES:
				return ((InternalEList<?>)getGeneratorFeatureModes()).basicRemove(otherEnd, msgs);
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
			case SolverPackage.GENERATOR__TUPLE_ROOT:
				return getTupleRoot();
			case SolverPackage.GENERATOR__GOALS:
				return getGoals();
			case SolverPackage.GENERATOR__GENERATOR_FEATURE_MODES:
				return getGeneratorFeatureModes();
			case SolverPackage.GENERATOR__SOLUTION_PROVIDER:
				return getSolutionProvider();
			case SolverPackage.GENERATOR__REMARKS:
				return getRemarks();
			case SolverPackage.GENERATOR__FOOTPRINT_NOF_VARS:
				return getFootprintNofVars();
			case SolverPackage.GENERATOR__FOOTPRINT_NOF_CONS:
				return getFootprintNofCons();
			case SolverPackage.GENERATOR__FOOTPRINT_NOF_TERMS:
				return getFootprintNofTerms();
			case SolverPackage.GENERATOR__CODE:
				return getCode();
			case SolverPackage.GENERATOR__SELECTED:
				if (resolve) return getSelected();
				return basicGetSelected();
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
			case SolverPackage.GENERATOR__GENERATOR_FEATURE_MODES:
				getGeneratorFeatureModes().clear();
				getGeneratorFeatureModes().addAll((Collection<? extends GeneratorFeatureMode>)newValue);
				return;
			case SolverPackage.GENERATOR__REMARKS:
				setRemarks((String)newValue);
				return;
			case SolverPackage.GENERATOR__FOOTPRINT_NOF_VARS:
				setFootprintNofVars((Integer)newValue);
				return;
			case SolverPackage.GENERATOR__FOOTPRINT_NOF_CONS:
				setFootprintNofCons((Integer)newValue);
				return;
			case SolverPackage.GENERATOR__FOOTPRINT_NOF_TERMS:
				setFootprintNofTerms((Integer)newValue);
				return;
			case SolverPackage.GENERATOR__CODE:
				setCode((String)newValue);
				return;
			case SolverPackage.GENERATOR__SELECTED:
				setSelected((Solution)newValue);
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
			case SolverPackage.GENERATOR__GENERATOR_FEATURE_MODES:
				getGeneratorFeatureModes().clear();
				return;
			case SolverPackage.GENERATOR__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case SolverPackage.GENERATOR__FOOTPRINT_NOF_VARS:
				setFootprintNofVars(FOOTPRINT_NOF_VARS_EDEFAULT);
				return;
			case SolverPackage.GENERATOR__FOOTPRINT_NOF_CONS:
				setFootprintNofCons(FOOTPRINT_NOF_CONS_EDEFAULT);
				return;
			case SolverPackage.GENERATOR__FOOTPRINT_NOF_TERMS:
				setFootprintNofTerms(FOOTPRINT_NOF_TERMS_EDEFAULT);
				return;
			case SolverPackage.GENERATOR__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case SolverPackage.GENERATOR__SELECTED:
				setSelected((Solution)null);
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
			case SolverPackage.GENERATOR__TUPLE_ROOT:
				return !getTupleRoot().isEmpty();
			case SolverPackage.GENERATOR__GOALS:
				return !getGoals().isEmpty();
			case SolverPackage.GENERATOR__GENERATOR_FEATURE_MODES:
				return generatorFeatureModes != null && !generatorFeatureModes.isEmpty();
			case SolverPackage.GENERATOR__SOLUTION_PROVIDER:
				return !getSolutionProvider().isEmpty();
			case SolverPackage.GENERATOR__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case SolverPackage.GENERATOR__FOOTPRINT_NOF_VARS:
				return footprintNofVars != FOOTPRINT_NOF_VARS_EDEFAULT;
			case SolverPackage.GENERATOR__FOOTPRINT_NOF_CONS:
				return footprintNofCons != FOOTPRINT_NOF_CONS_EDEFAULT;
			case SolverPackage.GENERATOR__FOOTPRINT_NOF_TERMS:
				return footprintNofTerms != FOOTPRINT_NOF_TERMS_EDEFAULT;
			case SolverPackage.GENERATOR__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case SolverPackage.GENERATOR__SELECTED:
				return selected != null;
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
			case SolverPackage.GENERATOR___GENERATE:
				return generate();
			case SolverPackage.GENERATOR___GENERATE_ROOT_TUPLES:
				try {
					generateRootTuples();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.GENERATOR___GENERATE_TUPLES:
				try {
					generateTuples();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.GENERATOR___GENERATE_TUPLE_XREFERENCES:
				try {
					generateTupleXReferences();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.GENERATOR___GENERATE_VARS:
				try {
					generateVars();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.GENERATOR___GENERATE_CONS:
				try {
					generateCons();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.GENERATOR___GENERATE_GOALS:
				try {
					generateGoals();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.GENERATOR___ACCEPT_SOLUTION__SOLUTION:
				acceptSolution((Solution)arguments.get(0));
				return null;
			case SolverPackage.GENERATOR___SELECT_FEATURE_MODE__GENERATORFEATUREMODE_GENERATORTUPLE:
				return selectFeatureMode((GeneratorFeatureMode)arguments.get(0), (GeneratorTuple)arguments.get(1));
			case SolverPackage.GENERATOR___VISIT_TUPLES__ITUPLEVISITOR:
				try {
					visitTuples((ITupleVisitor)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SolverPackage.GENERATOR___REFRESH_SELECTED_SOLUTION:
				refreshSelectedSolution();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Remarks: ");
		result.append(remarks);
		result.append(", FootprintNofVars: ");
		result.append(footprintNofVars);
		result.append(", FootprintNofCons: ");
		result.append(footprintNofCons);
		result.append(", FootprintNofTerms: ");
		result.append(footprintNofTerms);
		result.append(", Code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //GeneratorImpl
