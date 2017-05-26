/**
 */
package com.misc.common.moplaf.solver.solvercplex.impl;

import com.misc.common.moplaf.solver.impl.SolverLpParamsImpl;

import com.misc.common.moplaf.solver.solvercplex.SolverCplexParams;
import com.misc.common.moplaf.solver.solvercplex.SolvercplexPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solver Cplex Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexParamsImpl#getMipCutsCliques <em>Mip Cuts Cliques</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexParamsImpl#getMipCutsCovers <em>Mip Cuts Covers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexParamsImpl#getMipCutsFlowCovers <em>Mip Cuts Flow Covers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexParamsImpl#getMipCutsGomory <em>Mip Cuts Gomory</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexParamsImpl#getMipCutsGUBCovers <em>Mip Cuts GUB Covers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexParamsImpl#getMipCutsImplied <em>Mip Cuts Implied</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexParamsImpl#getMipCutsMIRCut <em>Mip Cuts MIR Cut</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexParamsImpl#getMipCutsPathCut <em>Mip Cuts Path Cut</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexParamsImpl#getMipStrategyBacktrack <em>Mip Strategy Backtrack</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexParamsImpl#getMipStrategyHeuristicFreq <em>Mip Strategy Heuristic Freq</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexParamsImpl#getMipStrategyProbe <em>Mip Strategy Probe</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexParamsImpl#getMipStrategyPresolveNode <em>Mip Strategy Presolve Node</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexParamsImpl#getMipLimitsCutsFactor <em>Mip Limits Cuts Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverCplexParamsImpl extends SolverLpParamsImpl implements SolverCplexParams {
	/**
	 * The default value of the '{@link #getMipCutsCliques() <em>Mip Cuts Cliques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipCutsCliques()
	 * @generated
	 * @ordered
	 */
	protected static final int MIP_CUTS_CLIQUES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMipCutsCliques() <em>Mip Cuts Cliques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipCutsCliques()
	 * @generated
	 * @ordered
	 */
	protected int mipCutsCliques = MIP_CUTS_CLIQUES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMipCutsCovers() <em>Mip Cuts Covers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipCutsCovers()
	 * @generated
	 * @ordered
	 */
	protected static final int MIP_CUTS_COVERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMipCutsCovers() <em>Mip Cuts Covers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipCutsCovers()
	 * @generated
	 * @ordered
	 */
	protected int mipCutsCovers = MIP_CUTS_COVERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMipCutsFlowCovers() <em>Mip Cuts Flow Covers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipCutsFlowCovers()
	 * @generated
	 * @ordered
	 */
	protected static final int MIP_CUTS_FLOW_COVERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMipCutsFlowCovers() <em>Mip Cuts Flow Covers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipCutsFlowCovers()
	 * @generated
	 * @ordered
	 */
	protected int mipCutsFlowCovers = MIP_CUTS_FLOW_COVERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMipCutsGomory() <em>Mip Cuts Gomory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipCutsGomory()
	 * @generated
	 * @ordered
	 */
	protected static final int MIP_CUTS_GOMORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMipCutsGomory() <em>Mip Cuts Gomory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipCutsGomory()
	 * @generated
	 * @ordered
	 */
	protected int mipCutsGomory = MIP_CUTS_GOMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMipCutsGUBCovers() <em>Mip Cuts GUB Covers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipCutsGUBCovers()
	 * @generated
	 * @ordered
	 */
	protected static final int MIP_CUTS_GUB_COVERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMipCutsGUBCovers() <em>Mip Cuts GUB Covers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipCutsGUBCovers()
	 * @generated
	 * @ordered
	 */
	protected int mipCutsGUBCovers = MIP_CUTS_GUB_COVERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMipCutsImplied() <em>Mip Cuts Implied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipCutsImplied()
	 * @generated
	 * @ordered
	 */
	protected static final int MIP_CUTS_IMPLIED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMipCutsImplied() <em>Mip Cuts Implied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipCutsImplied()
	 * @generated
	 * @ordered
	 */
	protected int mipCutsImplied = MIP_CUTS_IMPLIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMipCutsMIRCut() <em>Mip Cuts MIR Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipCutsMIRCut()
	 * @generated
	 * @ordered
	 */
	protected static final int MIP_CUTS_MIR_CUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMipCutsMIRCut() <em>Mip Cuts MIR Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipCutsMIRCut()
	 * @generated
	 * @ordered
	 */
	protected int mipCutsMIRCut = MIP_CUTS_MIR_CUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMipCutsPathCut() <em>Mip Cuts Path Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipCutsPathCut()
	 * @generated
	 * @ordered
	 */
	protected static final int MIP_CUTS_PATH_CUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMipCutsPathCut() <em>Mip Cuts Path Cut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipCutsPathCut()
	 * @generated
	 * @ordered
	 */
	protected int mipCutsPathCut = MIP_CUTS_PATH_CUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMipStrategyBacktrack() <em>Mip Strategy Backtrack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipStrategyBacktrack()
	 * @generated
	 * @ordered
	 */
	protected static final float MIP_STRATEGY_BACKTRACK_EDEFAULT = 0.9999F;

	/**
	 * The cached value of the '{@link #getMipStrategyBacktrack() <em>Mip Strategy Backtrack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipStrategyBacktrack()
	 * @generated
	 * @ordered
	 */
	protected float mipStrategyBacktrack = MIP_STRATEGY_BACKTRACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMipStrategyHeuristicFreq() <em>Mip Strategy Heuristic Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipStrategyHeuristicFreq()
	 * @generated
	 * @ordered
	 */
	protected static final int MIP_STRATEGY_HEURISTIC_FREQ_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMipStrategyHeuristicFreq() <em>Mip Strategy Heuristic Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipStrategyHeuristicFreq()
	 * @generated
	 * @ordered
	 */
	protected int mipStrategyHeuristicFreq = MIP_STRATEGY_HEURISTIC_FREQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getMipStrategyProbe() <em>Mip Strategy Probe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipStrategyProbe()
	 * @generated
	 * @ordered
	 */
	protected static final int MIP_STRATEGY_PROBE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMipStrategyProbe() <em>Mip Strategy Probe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipStrategyProbe()
	 * @generated
	 * @ordered
	 */
	protected int mipStrategyProbe = MIP_STRATEGY_PROBE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMipStrategyPresolveNode() <em>Mip Strategy Presolve Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipStrategyPresolveNode()
	 * @generated
	 * @ordered
	 */
	protected static final int MIP_STRATEGY_PRESOLVE_NODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMipStrategyPresolveNode() <em>Mip Strategy Presolve Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipStrategyPresolveNode()
	 * @generated
	 * @ordered
	 */
	protected int mipStrategyPresolveNode = MIP_STRATEGY_PRESOLVE_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMipLimitsCutsFactor() <em>Mip Limits Cuts Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipLimitsCutsFactor()
	 * @generated
	 * @ordered
	 */
	protected static final int MIP_LIMITS_CUTS_FACTOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMipLimitsCutsFactor() <em>Mip Limits Cuts Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipLimitsCutsFactor()
	 * @generated
	 * @ordered
	 */
	protected int mipLimitsCutsFactor = MIP_LIMITS_CUTS_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverCplexParamsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolvercplexPackage.Literals.SOLVER_CPLEX_PARAMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMipCutsCliques() {
		return mipCutsCliques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMipCutsCliques(int newMipCutsCliques) {
		int oldMipCutsCliques = mipCutsCliques;
		mipCutsCliques = newMipCutsCliques;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_CLIQUES, oldMipCutsCliques, mipCutsCliques));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMipCutsCovers() {
		return mipCutsCovers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMipCutsCovers(int newMipCutsCovers) {
		int oldMipCutsCovers = mipCutsCovers;
		mipCutsCovers = newMipCutsCovers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_COVERS, oldMipCutsCovers, mipCutsCovers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMipCutsFlowCovers() {
		return mipCutsFlowCovers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMipCutsFlowCovers(int newMipCutsFlowCovers) {
		int oldMipCutsFlowCovers = mipCutsFlowCovers;
		mipCutsFlowCovers = newMipCutsFlowCovers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_FLOW_COVERS, oldMipCutsFlowCovers, mipCutsFlowCovers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMipCutsGomory() {
		return mipCutsGomory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMipCutsGomory(int newMipCutsGomory) {
		int oldMipCutsGomory = mipCutsGomory;
		mipCutsGomory = newMipCutsGomory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_GOMORY, oldMipCutsGomory, mipCutsGomory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMipCutsGUBCovers() {
		return mipCutsGUBCovers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMipCutsGUBCovers(int newMipCutsGUBCovers) {
		int oldMipCutsGUBCovers = mipCutsGUBCovers;
		mipCutsGUBCovers = newMipCutsGUBCovers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_GUB_COVERS, oldMipCutsGUBCovers, mipCutsGUBCovers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMipCutsImplied() {
		return mipCutsImplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMipCutsImplied(int newMipCutsImplied) {
		int oldMipCutsImplied = mipCutsImplied;
		mipCutsImplied = newMipCutsImplied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_IMPLIED, oldMipCutsImplied, mipCutsImplied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMipCutsMIRCut() {
		return mipCutsMIRCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMipCutsMIRCut(int newMipCutsMIRCut) {
		int oldMipCutsMIRCut = mipCutsMIRCut;
		mipCutsMIRCut = newMipCutsMIRCut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_MIR_CUT, oldMipCutsMIRCut, mipCutsMIRCut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMipCutsPathCut() {
		return mipCutsPathCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMipCutsPathCut(int newMipCutsPathCut) {
		int oldMipCutsPathCut = mipCutsPathCut;
		mipCutsPathCut = newMipCutsPathCut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_PATH_CUT, oldMipCutsPathCut, mipCutsPathCut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMipStrategyBacktrack() {
		return mipStrategyBacktrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMipStrategyBacktrack(float newMipStrategyBacktrack) {
		float oldMipStrategyBacktrack = mipStrategyBacktrack;
		mipStrategyBacktrack = newMipStrategyBacktrack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_BACKTRACK, oldMipStrategyBacktrack, mipStrategyBacktrack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMipStrategyHeuristicFreq() {
		return mipStrategyHeuristicFreq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMipStrategyHeuristicFreq(int newMipStrategyHeuristicFreq) {
		int oldMipStrategyHeuristicFreq = mipStrategyHeuristicFreq;
		mipStrategyHeuristicFreq = newMipStrategyHeuristicFreq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_HEURISTIC_FREQ, oldMipStrategyHeuristicFreq, mipStrategyHeuristicFreq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMipStrategyProbe() {
		return mipStrategyProbe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMipStrategyProbe(int newMipStrategyProbe) {
		int oldMipStrategyProbe = mipStrategyProbe;
		mipStrategyProbe = newMipStrategyProbe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PROBE, oldMipStrategyProbe, mipStrategyProbe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMipStrategyPresolveNode() {
		return mipStrategyPresolveNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMipStrategyPresolveNode(int newMipStrategyPresolveNode) {
		int oldMipStrategyPresolveNode = mipStrategyPresolveNode;
		mipStrategyPresolveNode = newMipStrategyPresolveNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PRESOLVE_NODE, oldMipStrategyPresolveNode, mipStrategyPresolveNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMipLimitsCutsFactor() {
		return mipLimitsCutsFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMipLimitsCutsFactor(int newMipLimitsCutsFactor) {
		int oldMipLimitsCutsFactor = mipLimitsCutsFactor;
		mipLimitsCutsFactor = newMipLimitsCutsFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_LIMITS_CUTS_FACTOR, oldMipLimitsCutsFactor, mipLimitsCutsFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_CLIQUES:
				return getMipCutsCliques();
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_COVERS:
				return getMipCutsCovers();
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_FLOW_COVERS:
				return getMipCutsFlowCovers();
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_GOMORY:
				return getMipCutsGomory();
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_GUB_COVERS:
				return getMipCutsGUBCovers();
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_IMPLIED:
				return getMipCutsImplied();
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_MIR_CUT:
				return getMipCutsMIRCut();
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_PATH_CUT:
				return getMipCutsPathCut();
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_BACKTRACK:
				return getMipStrategyBacktrack();
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_HEURISTIC_FREQ:
				return getMipStrategyHeuristicFreq();
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PROBE:
				return getMipStrategyProbe();
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PRESOLVE_NODE:
				return getMipStrategyPresolveNode();
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_LIMITS_CUTS_FACTOR:
				return getMipLimitsCutsFactor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_CLIQUES:
				setMipCutsCliques((Integer)newValue);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_COVERS:
				setMipCutsCovers((Integer)newValue);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_FLOW_COVERS:
				setMipCutsFlowCovers((Integer)newValue);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_GOMORY:
				setMipCutsGomory((Integer)newValue);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_GUB_COVERS:
				setMipCutsGUBCovers((Integer)newValue);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_IMPLIED:
				setMipCutsImplied((Integer)newValue);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_MIR_CUT:
				setMipCutsMIRCut((Integer)newValue);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_PATH_CUT:
				setMipCutsPathCut((Integer)newValue);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_BACKTRACK:
				setMipStrategyBacktrack((Float)newValue);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_HEURISTIC_FREQ:
				setMipStrategyHeuristicFreq((Integer)newValue);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PROBE:
				setMipStrategyProbe((Integer)newValue);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PRESOLVE_NODE:
				setMipStrategyPresolveNode((Integer)newValue);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_LIMITS_CUTS_FACTOR:
				setMipLimitsCutsFactor((Integer)newValue);
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
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_CLIQUES:
				setMipCutsCliques(MIP_CUTS_CLIQUES_EDEFAULT);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_COVERS:
				setMipCutsCovers(MIP_CUTS_COVERS_EDEFAULT);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_FLOW_COVERS:
				setMipCutsFlowCovers(MIP_CUTS_FLOW_COVERS_EDEFAULT);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_GOMORY:
				setMipCutsGomory(MIP_CUTS_GOMORY_EDEFAULT);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_GUB_COVERS:
				setMipCutsGUBCovers(MIP_CUTS_GUB_COVERS_EDEFAULT);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_IMPLIED:
				setMipCutsImplied(MIP_CUTS_IMPLIED_EDEFAULT);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_MIR_CUT:
				setMipCutsMIRCut(MIP_CUTS_MIR_CUT_EDEFAULT);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_PATH_CUT:
				setMipCutsPathCut(MIP_CUTS_PATH_CUT_EDEFAULT);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_BACKTRACK:
				setMipStrategyBacktrack(MIP_STRATEGY_BACKTRACK_EDEFAULT);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_HEURISTIC_FREQ:
				setMipStrategyHeuristicFreq(MIP_STRATEGY_HEURISTIC_FREQ_EDEFAULT);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PROBE:
				setMipStrategyProbe(MIP_STRATEGY_PROBE_EDEFAULT);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PRESOLVE_NODE:
				setMipStrategyPresolveNode(MIP_STRATEGY_PRESOLVE_NODE_EDEFAULT);
				return;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_LIMITS_CUTS_FACTOR:
				setMipLimitsCutsFactor(MIP_LIMITS_CUTS_FACTOR_EDEFAULT);
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
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_CLIQUES:
				return mipCutsCliques != MIP_CUTS_CLIQUES_EDEFAULT;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_COVERS:
				return mipCutsCovers != MIP_CUTS_COVERS_EDEFAULT;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_FLOW_COVERS:
				return mipCutsFlowCovers != MIP_CUTS_FLOW_COVERS_EDEFAULT;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_GOMORY:
				return mipCutsGomory != MIP_CUTS_GOMORY_EDEFAULT;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_GUB_COVERS:
				return mipCutsGUBCovers != MIP_CUTS_GUB_COVERS_EDEFAULT;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_IMPLIED:
				return mipCutsImplied != MIP_CUTS_IMPLIED_EDEFAULT;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_MIR_CUT:
				return mipCutsMIRCut != MIP_CUTS_MIR_CUT_EDEFAULT;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_PATH_CUT:
				return mipCutsPathCut != MIP_CUTS_PATH_CUT_EDEFAULT;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_BACKTRACK:
				return mipStrategyBacktrack != MIP_STRATEGY_BACKTRACK_EDEFAULT;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_HEURISTIC_FREQ:
				return mipStrategyHeuristicFreq != MIP_STRATEGY_HEURISTIC_FREQ_EDEFAULT;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PROBE:
				return mipStrategyProbe != MIP_STRATEGY_PROBE_EDEFAULT;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PRESOLVE_NODE:
				return mipStrategyPresolveNode != MIP_STRATEGY_PRESOLVE_NODE_EDEFAULT;
			case SolvercplexPackage.SOLVER_CPLEX_PARAMS__MIP_LIMITS_CUTS_FACTOR:
				return mipLimitsCutsFactor != MIP_LIMITS_CUTS_FACTOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (MipCutsCliques: ");
		result.append(mipCutsCliques);
		result.append(", MipCutsCovers: ");
		result.append(mipCutsCovers);
		result.append(", MipCutsFlowCovers: ");
		result.append(mipCutsFlowCovers);
		result.append(", MipCutsGomory: ");
		result.append(mipCutsGomory);
		result.append(", MipCutsGUBCovers: ");
		result.append(mipCutsGUBCovers);
		result.append(", MipCutsImplied: ");
		result.append(mipCutsImplied);
		result.append(", MipCutsMIRCut: ");
		result.append(mipCutsMIRCut);
		result.append(", MipCutsPathCut: ");
		result.append(mipCutsPathCut);
		result.append(", MipStrategyBacktrack: ");
		result.append(mipStrategyBacktrack);
		result.append(", MipStrategyHeuristicFreq: ");
		result.append(mipStrategyHeuristicFreq);
		result.append(", MipStrategyProbe: ");
		result.append(mipStrategyProbe);
		result.append(", MipStrategyPresolveNode: ");
		result.append(mipStrategyPresolveNode);
		result.append(", MipLimitsCutsFactor: ");
		result.append(mipLimitsCutsFactor);
		result.append(')');
		return result.toString();
	}

} //SolverCplexParamsImpl
