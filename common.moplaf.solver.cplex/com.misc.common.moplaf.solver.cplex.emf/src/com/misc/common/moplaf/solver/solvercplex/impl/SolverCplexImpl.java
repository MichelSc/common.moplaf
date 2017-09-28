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
package com.misc.common.moplaf.solver.solvercplex.impl;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.job.RunParams;
import com.misc.common.moplaf.solver.EnumLpConsType;
import com.misc.common.moplaf.solver.EnumLpFileFormat;

import ilog.concert.IloException;
import ilog.concert.IloLinearNumExpr;
import ilog.concert.IloNumVar;
import ilog.concert.IloNumVarType;
import ilog.concert.IloRange;
import ilog.cplex.IloCplex;
import ilog.cplex.IloCplex.Status;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import com.misc.common.moplaf.solver.EnumLpVarType;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorElement;
import com.misc.common.moplaf.solver.GeneratorLpLinear;
import com.misc.common.moplaf.solver.GeneratorLpTerm;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.ILpWriter;
import com.misc.common.moplaf.solver.Plugin;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionLp;
import com.misc.common.moplaf.solver.SolutionVar;
import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.common.moplaf.solver.impl.SolverLpImpl;
import com.misc.common.moplaf.solver.solvercplex.SolverCplex;
import com.misc.common.moplaf.solver.solvercplex.SolverCplexFactory;
import com.misc.common.moplaf.solver.solvercplex.SolverCplexPackage;
import com.misc.common.moplaf.solver.solvercplex.SolverCplexParams;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solver Cplex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl#getFileFormat <em>File Format</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl#isFileCompressed <em>File Compressed</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl#getMipCutsCliques <em>Mip Cuts Cliques</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl#getMipCutsCovers <em>Mip Cuts Covers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl#getMipCutsFlowCovers <em>Mip Cuts Flow Covers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl#getMipCutsGomory <em>Mip Cuts Gomory</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl#getMipCutsGUBCovers <em>Mip Cuts GUB Covers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl#getMipCutsImplied <em>Mip Cuts Implied</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl#getMipCutsMIRCut <em>Mip Cuts MIR Cut</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl#getMipCutsPathCut <em>Mip Cuts Path Cut</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl#getMipStrategyBacktrack <em>Mip Strategy Backtrack</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl#getMipStrategyHeuristicFreq <em>Mip Strategy Heuristic Freq</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl#getMipStrategyProbe <em>Mip Strategy Probe</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl#getMipStrategyPresolveNode <em>Mip Strategy Presolve Node</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvercplex.impl.SolverCplexImpl#getMipLimitsCutsFactor <em>Mip Limits Cuts Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverCplexImpl extends SolverLpImpl implements SolverCplex {
	/**
	 * The default value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected String filePath = FILE_PATH_EDEFAULT;
	/**
	 * The default value of the '{@link #getFileFormat() <em>File Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileFormat()
	 * @generated
	 * @ordered
	 */
	protected static final EnumLpFileFormat FILE_FORMAT_EDEFAULT = EnumLpFileFormat.FILE_FORMAT_MPS;
	/**
	 * The cached value of the '{@link #getFileFormat() <em>File Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileFormat()
	 * @generated
	 * @ordered
	 */
	protected EnumLpFileFormat fileFormat = FILE_FORMAT_EDEFAULT;
	/**
	 * The default value of the '{@link #isFileCompressed() <em>File Compressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFileCompressed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILE_COMPRESSED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isFileCompressed() <em>File Compressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFileCompressed()
	 * @generated
	 * @ordered
	 */
	protected boolean fileCompressed = FILE_COMPRESSED_EDEFAULT;
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
	protected static final double MIP_STRATEGY_BACKTRACK_EDEFAULT = 0.9999;
	/**
	 * The cached value of the '{@link #getMipStrategyBacktrack() <em>Mip Strategy Backtrack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipStrategyBacktrack()
	 * @generated
	 * @ordered
	 */
	protected double mipStrategyBacktrack = MIP_STRATEGY_BACKTRACK_EDEFAULT;
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
	protected SolverCplexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverCplexPackage.Literals.SOLVER_CPLEX;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilePath(String newFilePath) {
		String oldFilePath = filePath;
		filePath = newFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverCplexPackage.SOLVER_CPLEX__FILE_PATH, oldFilePath, filePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLpFileFormat getFileFormat() {
		return fileFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileFormat(EnumLpFileFormat newFileFormat) {
		EnumLpFileFormat oldFileFormat = fileFormat;
		fileFormat = newFileFormat == null ? FILE_FORMAT_EDEFAULT : newFileFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverCplexPackage.SOLVER_CPLEX__FILE_FORMAT, oldFileFormat, fileFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFileCompressed() {
		return fileCompressed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileCompressed(boolean newFileCompressed) {
		boolean oldFileCompressed = fileCompressed;
		fileCompressed = newFileCompressed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverCplexPackage.SOLVER_CPLEX__FILE_COMPRESSED, oldFileCompressed, fileCompressed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_CLIQUES, oldMipCutsCliques, mipCutsCliques));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_COVERS, oldMipCutsCovers, mipCutsCovers));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_FLOW_COVERS, oldMipCutsFlowCovers, mipCutsFlowCovers));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_GOMORY, oldMipCutsGomory, mipCutsGomory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_GUB_COVERS, oldMipCutsGUBCovers, mipCutsGUBCovers));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_IMPLIED, oldMipCutsImplied, mipCutsImplied));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_MIR_CUT, oldMipCutsMIRCut, mipCutsMIRCut));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_PATH_CUT, oldMipCutsPathCut, mipCutsPathCut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMipStrategyBacktrack() {
		return mipStrategyBacktrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMipStrategyBacktrack(double newMipStrategyBacktrack) {
		double oldMipStrategyBacktrack = mipStrategyBacktrack;
		mipStrategyBacktrack = newMipStrategyBacktrack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_BACKTRACK, oldMipStrategyBacktrack, mipStrategyBacktrack));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_HEURISTIC_FREQ, oldMipStrategyHeuristicFreq, mipStrategyHeuristicFreq));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_PROBE, oldMipStrategyProbe, mipStrategyProbe));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_PRESOLVE_NODE, oldMipStrategyPresolveNode, mipStrategyPresolveNode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverCplexPackage.SOLVER_CPLEX__MIP_LIMITS_CUTS_FACTOR, oldMipLimitsCutsFactor, mipLimitsCutsFactor));
	}

	// private declarations
	private IloCplex lp;
	private Map<GeneratorLpVar, IloNumVar> vars;
	private Map<GeneratorElement, IloRange> cons;
	private IloLinearNumExpr objective;

	 
	private void releaseLp(){
		this.lp = null;
		this.vars = null;
		this.cons = null;
		this.objective = null;
	}
	
	private void initSolution(){
		try {
			//this.lp.addMIPStart();
			Solution initialSolution = this.getInitialSolution();
			EList<SolutionVar> vars = initialSolution.getVars();
			int nofVars = vars.size();
			IloNumVar[] varsArray   = new IloNumVar[nofVars];
			double[]    valuesArray = new double[nofVars];
			int i = 0;
			for ( SolutionVar varSol : vars){
				double optimalValue = varSol.getOptimalValue();
			    IloNumVar cplexvar = this.vars.get(varSol.getVar());
			    varsArray[i] = cplexvar;
			    valuesArray[i] = optimalValue;
			    i++;
			}
			this.lp.addMIPStart(varsArray, valuesArray);
		} catch (IloException e) {
			Plugin.INSTANCE.logError("SolverCplex: init mip start failed, ilog exception "+e.getMessage());
			this.releaseLp();
		} catch (Exception e) {
			Plugin.INSTANCE.logError("SolverCplex: init mip start failed, java exception "+e.getMessage());
			this.releaseLp();
		}
	}

	
	/**
     * Build the lp var
	 */
	@Override
	protected void buildLpVarImpl(GeneratorLpVar var, double lowerBound, double upperBound, EnumLpVarType type) throws Exception {
		IloNumVarType vartypetobe = IloNumVarType.Float; 
		if ( !this.isSolverLinearRelaxation() && type==EnumLpVarType.ENUM_LITERAL_LP_VAR_INTEGER){
			vartypetobe = IloNumVarType.Int; 
		}
		String name = var.getCode();
		// create the var
		IloNumVar cplexvar = SolverCplexImpl.this.lp.numVar(lowerBound, upperBound, vartypetobe, name);
		SolverCplexImpl.this.vars.put(var, cplexvar);
	}

	/**
     * Build the lp cons
	 */
	@Override
	protected void buildLpConsImpl(GeneratorElement element, GeneratorLpLinear linear, double rhs, EnumLpConsType type) throws Exception {
		IloLinearNumExpr expr = this.lp.linearNumExpr();
	    for ( GeneratorLpTerm lpterm : linear.getLpTerm())	{
		    GeneratorLpVar lpvar = lpterm.getLpVar();
		    IloNumVar cplexvar = vars.get(lpvar);
		    double coefficient = lpterm.getCoeff();
		    expr.addTerm(coefficient, cplexvar);;
	    } // traverse the terms
	    IloRange range = null;
		switch (type ) {
	    case ENUM_LITERAL_LP_CONS_EQUAL:
	    	range = SolverCplexImpl.this.lp.addEq(expr, rhs);
	        break;
	    case ENUM_LITERAL_LP_CONS_BIGGER_OR_EQUAL:
	    	range = SolverCplexImpl.this.lp.addGe(expr, rhs);
	        break;
	    case ENUM_LITERAL_LP_CONS_SMALLER_OR_EQUAL:
	    	range = SolverCplexImpl.this.lp.addLe(expr, rhs);
	        break;
	    };  // switch on constraint type
	    range.setName(element.getCode());
		this.cons.put(element, range);
	}

	/**
     * Build an lp goal term
	 */
	@Override
	protected void buildLpGoalTermImpl(GeneratorLpVar var, double coefficient) throws Exception {
		IloNumVar cplexvar = vars.get(var);
		this.objective.addTerm(coefficient, cplexvar);
	}

	/**
	*   Load the lp
    */
	private void loadLp() {
		this.releaseLp(); // release the current model, if any
		Generator generator = this.getGenerator();
		if ( generator == null) { return; }
		try {
			this.lp = new IloCplex();
			
			Plugin.INSTANCE.logInfo("SolverCplex: instantiated, version "+ this.lp.getVersion());
			
			this.vars = new HashMap<GeneratorLpVar, IloNumVar>();
			this.cons = new HashMap<GeneratorElement, IloRange>();
			this.objective = this.lp.linearNumExpr();
			this.buildVars();
			this.buildCons();
			this.buildGoals();
			this.lp.addMinimize(objective);
		} 
		catch (IloException e) {
			e.printStackTrace();
			Plugin.INSTANCE.logError("SolverCplex: load failed, ilog exception "+e.getMessage());
			this.releaseLp();
		} catch (Exception e) {
			e.printStackTrace();
			Plugin.INSTANCE.logError("SolverCplex: load failed, general exception "+e.getMessage());
		}
	} // method lp load
	
	/**
	*   Writes the active model to the file specified by filename.
	*	The file format is determined by the extension of the filename. 
	*	The following extensions are recognized on most platforms:
	*	<ul>
    *     <li>.mps </li>
    *     <li>.lp </li>
    *     <li>.sav.gz (if gzip is properly installed) </li>
    *     <li>.mps.gz (if gzip is properly installed) </li>
    *     <li>.lp.gz (if gzip is properly installed)</li>
    *     <li>.bz2 (if bzip2 is properly installed) </li>
	*	</ul>
    */
	public void writeLpToFile() {
		this.loadLp();
		this.writeLpToFilePrivate();
		this.releaseLp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	private void writeLpToFilePrivate() {
		String filePathToUse = this.getFilePath();
		if ( filePathToUse==null){
			Plugin.INSTANCE.logWarning("SolverCplex: no file path, write aborted");
			return;
		}
		
		EnumLpFileFormat fileFormat = this.getFileFormat();
		if ( fileFormat!=null ){
			filePathToUse = fileFormat.extendFilePath(filePathToUse, this.isFileCompressed());
		}

		try {
			Plugin.INSTANCE.logInfo("SolverCplex: write to file "+filePathToUse);
			this.lp.exportModel(filePathToUse);
		} catch (IloException e) {
			Plugin.INSTANCE.logError("SolverCplex: write failed, "+e.getMessage());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLpAsString() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverCplexPackage.SOLVER_CPLEX__FILE_PATH:
				return getFilePath();
			case SolverCplexPackage.SOLVER_CPLEX__FILE_FORMAT:
				return getFileFormat();
			case SolverCplexPackage.SOLVER_CPLEX__FILE_COMPRESSED:
				return isFileCompressed();
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_CLIQUES:
				return getMipCutsCliques();
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_COVERS:
				return getMipCutsCovers();
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_FLOW_COVERS:
				return getMipCutsFlowCovers();
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_GOMORY:
				return getMipCutsGomory();
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_GUB_COVERS:
				return getMipCutsGUBCovers();
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_IMPLIED:
				return getMipCutsImplied();
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_MIR_CUT:
				return getMipCutsMIRCut();
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_PATH_CUT:
				return getMipCutsPathCut();
			case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_BACKTRACK:
				return getMipStrategyBacktrack();
			case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_HEURISTIC_FREQ:
				return getMipStrategyHeuristicFreq();
			case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_PROBE:
				return getMipStrategyProbe();
			case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_PRESOLVE_NODE:
				return getMipStrategyPresolveNode();
			case SolverCplexPackage.SOLVER_CPLEX__MIP_LIMITS_CUTS_FACTOR:
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
			case SolverCplexPackage.SOLVER_CPLEX__FILE_PATH:
				setFilePath((String)newValue);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__FILE_FORMAT:
				setFileFormat((EnumLpFileFormat)newValue);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__FILE_COMPRESSED:
				setFileCompressed((Boolean)newValue);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_CLIQUES:
				setMipCutsCliques((Integer)newValue);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_COVERS:
				setMipCutsCovers((Integer)newValue);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_FLOW_COVERS:
				setMipCutsFlowCovers((Integer)newValue);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_GOMORY:
				setMipCutsGomory((Integer)newValue);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_GUB_COVERS:
				setMipCutsGUBCovers((Integer)newValue);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_IMPLIED:
				setMipCutsImplied((Integer)newValue);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_MIR_CUT:
				setMipCutsMIRCut((Integer)newValue);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_PATH_CUT:
				setMipCutsPathCut((Integer)newValue);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_BACKTRACK:
				setMipStrategyBacktrack((Double)newValue);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_HEURISTIC_FREQ:
				setMipStrategyHeuristicFreq((Integer)newValue);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_PROBE:
				setMipStrategyProbe((Integer)newValue);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_PRESOLVE_NODE:
				setMipStrategyPresolveNode((Integer)newValue);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_LIMITS_CUTS_FACTOR:
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
			case SolverCplexPackage.SOLVER_CPLEX__FILE_PATH:
				setFilePath(FILE_PATH_EDEFAULT);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__FILE_FORMAT:
				setFileFormat(FILE_FORMAT_EDEFAULT);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__FILE_COMPRESSED:
				setFileCompressed(FILE_COMPRESSED_EDEFAULT);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_CLIQUES:
				setMipCutsCliques(MIP_CUTS_CLIQUES_EDEFAULT);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_COVERS:
				setMipCutsCovers(MIP_CUTS_COVERS_EDEFAULT);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_FLOW_COVERS:
				setMipCutsFlowCovers(MIP_CUTS_FLOW_COVERS_EDEFAULT);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_GOMORY:
				setMipCutsGomory(MIP_CUTS_GOMORY_EDEFAULT);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_GUB_COVERS:
				setMipCutsGUBCovers(MIP_CUTS_GUB_COVERS_EDEFAULT);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_IMPLIED:
				setMipCutsImplied(MIP_CUTS_IMPLIED_EDEFAULT);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_MIR_CUT:
				setMipCutsMIRCut(MIP_CUTS_MIR_CUT_EDEFAULT);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_PATH_CUT:
				setMipCutsPathCut(MIP_CUTS_PATH_CUT_EDEFAULT);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_BACKTRACK:
				setMipStrategyBacktrack(MIP_STRATEGY_BACKTRACK_EDEFAULT);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_HEURISTIC_FREQ:
				setMipStrategyHeuristicFreq(MIP_STRATEGY_HEURISTIC_FREQ_EDEFAULT);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_PROBE:
				setMipStrategyProbe(MIP_STRATEGY_PROBE_EDEFAULT);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_PRESOLVE_NODE:
				setMipStrategyPresolveNode(MIP_STRATEGY_PRESOLVE_NODE_EDEFAULT);
				return;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_LIMITS_CUTS_FACTOR:
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
			case SolverCplexPackage.SOLVER_CPLEX__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
			case SolverCplexPackage.SOLVER_CPLEX__FILE_FORMAT:
				return fileFormat != FILE_FORMAT_EDEFAULT;
			case SolverCplexPackage.SOLVER_CPLEX__FILE_COMPRESSED:
				return fileCompressed != FILE_COMPRESSED_EDEFAULT;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_CLIQUES:
				return mipCutsCliques != MIP_CUTS_CLIQUES_EDEFAULT;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_COVERS:
				return mipCutsCovers != MIP_CUTS_COVERS_EDEFAULT;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_FLOW_COVERS:
				return mipCutsFlowCovers != MIP_CUTS_FLOW_COVERS_EDEFAULT;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_GOMORY:
				return mipCutsGomory != MIP_CUTS_GOMORY_EDEFAULT;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_GUB_COVERS:
				return mipCutsGUBCovers != MIP_CUTS_GUB_COVERS_EDEFAULT;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_IMPLIED:
				return mipCutsImplied != MIP_CUTS_IMPLIED_EDEFAULT;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_MIR_CUT:
				return mipCutsMIRCut != MIP_CUTS_MIR_CUT_EDEFAULT;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_PATH_CUT:
				return mipCutsPathCut != MIP_CUTS_PATH_CUT_EDEFAULT;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_BACKTRACK:
				return mipStrategyBacktrack != MIP_STRATEGY_BACKTRACK_EDEFAULT;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_HEURISTIC_FREQ:
				return mipStrategyHeuristicFreq != MIP_STRATEGY_HEURISTIC_FREQ_EDEFAULT;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_PROBE:
				return mipStrategyProbe != MIP_STRATEGY_PROBE_EDEFAULT;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_PRESOLVE_NODE:
				return mipStrategyPresolveNode != MIP_STRATEGY_PRESOLVE_NODE_EDEFAULT;
			case SolverCplexPackage.SOLVER_CPLEX__MIP_LIMITS_CUTS_FACTOR:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ILpWriter.class) {
			switch (derivedFeatureID) {
				case SolverCplexPackage.SOLVER_CPLEX__FILE_PATH: return SolverPackage.ILP_WRITER__FILE_PATH;
				case SolverCplexPackage.SOLVER_CPLEX__FILE_FORMAT: return SolverPackage.ILP_WRITER__FILE_FORMAT;
				case SolverCplexPackage.SOLVER_CPLEX__FILE_COMPRESSED: return SolverPackage.ILP_WRITER__FILE_COMPRESSED;
				default: return -1;
			}
		}
		if (baseClass == SolverCplexParams.class) {
			switch (derivedFeatureID) {
				case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_CLIQUES: return SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_CLIQUES;
				case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_COVERS: return SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_COVERS;
				case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_FLOW_COVERS: return SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_FLOW_COVERS;
				case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_GOMORY: return SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_GOMORY;
				case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_GUB_COVERS: return SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_GUB_COVERS;
				case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_IMPLIED: return SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_IMPLIED;
				case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_MIR_CUT: return SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_MIR_CUT;
				case SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_PATH_CUT: return SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_PATH_CUT;
				case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_BACKTRACK: return SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_BACKTRACK;
				case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_HEURISTIC_FREQ: return SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_HEURISTIC_FREQ;
				case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_PROBE: return SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PROBE;
				case SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_PRESOLVE_NODE: return SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PRESOLVE_NODE;
				case SolverCplexPackage.SOLVER_CPLEX__MIP_LIMITS_CUTS_FACTOR: return SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_LIMITS_CUTS_FACTOR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ILpWriter.class) {
			switch (baseFeatureID) {
				case SolverPackage.ILP_WRITER__FILE_PATH: return SolverCplexPackage.SOLVER_CPLEX__FILE_PATH;
				case SolverPackage.ILP_WRITER__FILE_FORMAT: return SolverCplexPackage.SOLVER_CPLEX__FILE_FORMAT;
				case SolverPackage.ILP_WRITER__FILE_COMPRESSED: return SolverCplexPackage.SOLVER_CPLEX__FILE_COMPRESSED;
				default: return -1;
			}
		}
		if (baseClass == SolverCplexParams.class) {
			switch (baseFeatureID) {
				case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_CLIQUES: return SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_CLIQUES;
				case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_COVERS: return SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_COVERS;
				case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_FLOW_COVERS: return SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_FLOW_COVERS;
				case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_GOMORY: return SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_GOMORY;
				case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_GUB_COVERS: return SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_GUB_COVERS;
				case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_IMPLIED: return SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_IMPLIED;
				case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_MIR_CUT: return SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_MIR_CUT;
				case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_CUTS_PATH_CUT: return SolverCplexPackage.SOLVER_CPLEX__MIP_CUTS_PATH_CUT;
				case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_BACKTRACK: return SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_BACKTRACK;
				case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_HEURISTIC_FREQ: return SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_HEURISTIC_FREQ;
				case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PROBE: return SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_PROBE;
				case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_STRATEGY_PRESOLVE_NODE: return SolverCplexPackage.SOLVER_CPLEX__MIP_STRATEGY_PRESOLVE_NODE;
				case SolverCplexPackage.SOLVER_CPLEX_PARAMS__MIP_LIMITS_CUTS_FACTOR: return SolverCplexPackage.SOLVER_CPLEX__MIP_LIMITS_CUTS_FACTOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ILpWriter.class) {
			switch (baseOperationID) {
				case SolverPackage.ILP_WRITER___WRITE_LP_TO_FILE: return SolverCplexPackage.SOLVER_CPLEX___WRITE_LP_TO_FILE;
				case SolverPackage.ILP_WRITER___GET_LP_AS_STRING: return SolverCplexPackage.SOLVER_CPLEX___GET_LP_AS_STRING;
				default: return -1;
			}
		}
		if (baseClass == SolverCplexParams.class) {
			switch (baseOperationID) {
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
			case SolverCplexPackage.SOLVER_CPLEX___WRITE_LP_TO_FILE:
				writeLpToFile();
				return null;
			case SolverCplexPackage.SOLVER_CPLEX___GET_LP_AS_STRING:
				return getLpAsString();
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
		result.append(" (FilePath: ");
		result.append(filePath);
		result.append(", FileFormat: ");
		result.append(fileFormat);
		result.append(", FileCompressed: ");
		result.append(fileCompressed);
		result.append(", MipCutsCliques: ");
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
	
	private void setParams() throws IloException{
		this.lp.setParam(IloCplex.Param.MIP.Cuts.Cliques,    this.getMipCutsCliques());
		this.lp.setParam(IloCplex.Param.MIP.Cuts.Covers,     this.getMipCutsCovers());
		this.lp.setParam(IloCplex.Param.MIP.Cuts.FlowCovers, this.getMipCutsFlowCovers());
		this.lp.setParam(IloCplex.Param.MIP.Cuts.Gomory,     this.getMipCutsGomory());
		this.lp.setParam(IloCplex.Param.MIP.Cuts.GUBCovers,  this.getMipCutsGUBCovers());
		this.lp.setParam(IloCplex.Param.MIP.Cuts.Implied,    this.getMipCutsImplied());
		this.lp.setParam(IloCplex.Param.MIP.Cuts.MIRCut,     this.getMipCutsMIRCut());
		this.lp.setParam(IloCplex.Param.MIP.Cuts.PathCut,    this.getMipCutsPathCut());
		
		this.lp.setParam(IloCplex.Param.MIP.Limits.CutsFactor, this.getMipLimitsCutsFactor());
		
		this.lp.setParam(IloCplex.Param.MIP.Strategy.Backtrack,     this.getMipStrategyBacktrack());
		this.lp.setParam(IloCplex.Param.MIP.Strategy.HeuristicFreq, this.getMipStrategyHeuristicFreq());
		this.lp.setParam(IloCplex.Param.MIP.Strategy.PresolveNode,  this.getMipStrategyPresolveNode());
		this.lp.setParam(IloCplex.Param.MIP.Strategy.Probe,         this.getMipStrategyProbe());
		
		// mip tolerance
		this.lp.setParam(IloCplex.Param.MIP.Tolerances.MIPGap, this.getSolverOptimalityTolerance());
		
		// max duration
		this.lp.setParam(IloCplex.Param.TimeLimit, this.getSolverMaxDuration());
		
		// log level
		// Java IloCplex.Param.MIP.Display MIPDisplay (int) 
		// Description
		//Decides what CPLEX reports to the screen and records in a log during mixed integer optimization (MIP). 
		//The amount of information displayed increases with increasing values of this parameter.
		//  A setting of 0 (zero) causes no node log to be displayed until the optimal solution is found.
		//  A setting of 1 (one) displays an entry for each integer feasible solution found.
		//    Each entry contains:
		//      the value of the objective function;
		//      the node count;
		//      the number of unexplored nodes in the tree;
		//      the current optimality gap.
		// A setting of 2 also generates an entry at a frequency determined by the MIP node log interval parameter. At a lower frequency, the log additionally displays elapsed time in seconds and deterministic time in ticks.
		// A setting of 3 gives all the information of option 2 plus additional information:
		//   At the same frequency as option 2, the node log adds a line specifying the number of cutting planes added to the problem since the last node log line was displayed; this additional line is omitted if the number of cuts added since the last log line is 0 (zero).
		//   Whenever a MIP start was successfully used to find a new incumbent solution, that success is recorded in the node log. (This information about MIP starts is independent of the MIP interval frequency in option 2.)
		//   For each new incumbent that is found, the node log displays how much time in seconds and how many deterministic ticks elapsed since the beginning of optimization. (This information about elapsed time between new incumbents is independent of the MIP interval frequency in option 2.)
		//  A setting of 4 additionally generates entries for the LP root relaxation according to the setting of the parameter to control the simplex iteration information display (SimDisplay, CPX_PARAM_SIMDISPLAY).
		//  A setting of 5 additionally generates entries for the LP subproblems, also according to the setting of the parameter to control the simplex iteration information display (SimDisplay, CPX_PARAM_SIMDISPLAY).
		
		//0 No display until optimal solution has been found 
		//1 Display integer feasible solutions 
		//2 Display integer feasible solutions plus an entry at a frequency set by MIP node log interval; default 
		//3 Display the number of cuts added since previous display; information about the processing of each successful MIP start; elapsed time in seconds and elapsed time in deterministic ticks for integer feasible solutions 
		//4 Display information available from previous options and information about the LP subproblem at root 
		//5 Display information available from previous options and information about the LP subproblems at root and at nodes
		int paramLogLevelSelected = 2;
		switch ( this.getSolverLogLevel()){
		case ENUM_NONE:
			paramLogLevelSelected = 0;
			break;
		case ENUM_MIN:
			paramLogLevelSelected = 1;
			break;
		case ENUM_NORMAL:
			paramLogLevelSelected = 2;
			break;
		case ENUM_FULL:
			paramLogLevelSelected = 5;
			break;
		}
		Plugin.INSTANCE.logInfo("SolverCplex: param IloCplex.Param.MIP.Display set "+paramLogLevelSelected);
		this.lp.setParam(IloCplex.Param.MIP.Display, paramLogLevelSelected);
	}

	@Override
	protected ReturnFeedback solveImpl() {
		
		// load the lp
		this.loadLp();
		if ( this.lp==null ) { 
			return new ReturnFeedback(false, "SolverCplex.solve: no lp"); 
			}
		
		if ( this.getInitialSolution()!=null ){
			this.initSolution();
		}

		this.onInitializationEnd();
		
		if ( this.isSolverDump()){
			this.writeLpToFilePrivate();
		}
		
		// solve
		Status status = null;
		boolean feasible   = false;
		try  {
			this.setParams();

			if ( this.isSolverLinearRelaxation() ) {
				Plugin.INSTANCE.logInfo("SolverCplex: continuous solve returned ");
			} // if linear relaxed
			else {
				Plugin.INSTANCE.logInfo("SolverCplex: mip solver started");
				SolverCplexCallbackMIPInfo callback = new SolverCplexCallbackMIPInfo();
				this.lp.use(callback);
				feasible = this.lp.solve(); 
				status = this.lp.getStatus();
				Plugin.INSTANCE.logInfo("SolverCplex: mip solver returned");
			} // if mip
		}
		catch (Exception e)		{
			Plugin.INSTANCE.logError("SolverCplex: solve failed "+e);
			return new ReturnFeedback("SolverCplex.solve", e);
		}
		
		this.onSolvingEnd();
		
		// do something with the solution
		boolean unfeasible = false;
		boolean optimal    = false;
		double   goalvalue  = 0.0d;
		double   mipgap     = 0.0d;
		

		// handle the return status of cplex
		if  ( status == Status.Optimal ) { 
			//	The Optimal solution status reports that the IloCplex optimizer has found an optimal solution that can be queried with the method getValue.
			Plugin.INSTANCE.logInfo("SolverCplex: status Optimal");
			optimal = true; 
		} else if ( status == Status.Infeasible) { 
			//	The Infeasible solution status reports that the IloCplex optimizer has determined that the model is infeasible.
			Plugin.INSTANCE.logInfo("SolverCplex: status Infeasible");
			unfeasible = true; 
		} else if ( status == Status.Bounded){
			//	The Bounded solution status reports that the IloCplex optimizer has determined that the model is not unbounded.
			Plugin.INSTANCE.logInfo("SolverCplex: status Bounded");
		} else if ( status == Status.Error){
			//	The Error solution status reports that an error has occurred.
			Plugin.INSTANCE.logInfo("SolverCplex: status Error");
		} else if ( status == Status.Feasible){
			//	The Feasible solution status reports that the IloCplex optimizer has found a feasible solution that can be queried with the method getValue.
			Plugin.INSTANCE.logInfo("SolverCplex: status Feasible");
		} else if ( status == Status.InfeasibleOrUnbounded){
			//	The InfeasibleOrUnbounded solution status reports that the IloCplex optimizer has determined that the model is infeasible or unbounded.
			Plugin.INSTANCE.logInfo("SolverCplex: status InfeasibleOrUnbounded");
			unfeasible = true; 
		} else if ( status == Status.Unbounded){
			//	The Unbounded solution status reports that the IloCplex optimizer has determined that the model is unbounded.
			Plugin.INSTANCE.logInfo("SolverCplex: status Unbounded");
		} else if ( status == Status.Unknown){
			//	The Unknown solution status reports that the optimizer has not gathered any information about the active model.   
			Plugin.INSTANCE.logInfo("SolverCplex: status Unknown");
		}
		if ( feasible ) {
			try {
				goalvalue = this.lp.getObjValue();
			} catch (IloException e) {
				Plugin.INSTANCE.logError("SolverCplex: getObjValue, exception "+e);
				return new ReturnFeedback("SolverCplex.getObjValue", e);
			}
			try {
				mipgap    = this.lp.getMIPRelativeGap();
			} catch (IloException e) {
				Plugin.INSTANCE.logError("SolverCplex: getMIPRelativeGap, exception "+e);
				return new ReturnFeedback("SolverCplex.getMIPRelativeGap", e);
			}
			SolutionLp newSolution = (SolutionLp) this.constructSolution();
			newSolution.setValue(goalvalue);
			for ( Map.Entry<GeneratorLpVar, IloNumVar> varentry : vars.entrySet())	{
				IloNumVar cplexvar = varentry.getValue();
				GeneratorLpVar lpvar = varentry.getKey();
				double optimalvalue = 0.0f;
				try {
					optimalvalue = this.lp.getValue(cplexvar);
				} catch (IloException e) {
					Plugin.INSTANCE.logInfo("SolverCplex: getValue, exception "+e+ ", object "+cplexvar.getName());
					// michel 20161209: 
					//    cplex returns an exception for variable not used by the solver
					//    actually the value of the variable does not matter
					//    what should be done, set an optimal value or nothing or mark it as unbound?
					//    this is an open questions
//					return new ReturnFeedback("SolverCplex.getMIPRelativeGap", e);
				}
				if ( Math.abs(optimalvalue)>0.00001d){
					SolutionVar solvervar = newSolution.constructSolutionVar(lpvar);
					solvervar.setOptimalValue(optimalvalue);
				}
			} // traverse the vars
			this.makeSolutionGoals(newSolution);
		}
		this.setSolFeasible(feasible);
		this.setSolUnfeasible(unfeasible);
		this.setSolOptimal(optimal);
		this.setSolValue(goalvalue);
		this.setSolOptimalityGap(mipgap);
		
		// release the lp
		this.releaseLp();
		
		return ReturnFeedback.SUCCESS;
		
	} // method SolveLp


	class SolverCplexCallbackMIPInfo extends  IloCplex.MIPInfoCallback {
		
		@Override
		protected void main() throws IloException {
			
	        // Progress
			String progress = "solving";
			
			// depth
			int nofActiveNodes  = this.getNnodes();
			int nofNodesCurrent = this.getNremainingNodes();
			int nofNodesTotal   = nofActiveNodes+nofNodesCurrent;
	        String depth = String.format("actives %1$d, current %2$d, total: %3$d", nofActiveNodes, nofNodesCurrent, nofNodesTotal); 
			
			// value
			double mipvalue = 0.0;
			double mipgap = 0.0;
			boolean feasible = this.hasIncumbent();
			if  (  feasible )  {
				feasible = true;
				mipvalue = this.getIncumbentObjValue();
				mipgap   = this.getMIPRelativeGap();
			}
			
			SolverCplexImpl.this.onSolverFeedback(depth, progress, mipgap, mipvalue, feasible);
			SolverCplexImpl.this.setSolOptimalityGap(mipgap);
			
			if ( SolverCplexImpl.this.isRunRequestTerminate() ) {
				// terminate
				Plugin.INSTANCE.logInfo("SolverCplex Request for terminate");
				this.abort();
				SolverCplexImpl.this.setRunInterrupted(true);
			}
		} // main
	}; // class call back
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public RunParams constructParams() {
		return SolverCplexFactory.eINSTANCE.createSolverCplexParams();
	}

} //SolverCplexImpl


