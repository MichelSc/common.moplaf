/**
 */
package com.misc.common.moplaf.solver.solvercplex.impl;

import com.misc.common.moplaf.common.ReturnFeedback;
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
import com.misc.common.moplaf.solver.EnumObjectiveType;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorElement;
import com.misc.common.moplaf.solver.GeneratorLpGoal;
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
import com.misc.common.moplaf.solver.solvercplex.SolvercplexPackage;

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
		return SolvercplexPackage.Literals.SOLVER_CPLEX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolvercplexPackage.SOLVER_CPLEX__FILE_PATH, oldFilePath, filePath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolvercplexPackage.SOLVER_CPLEX__FILE_FORMAT, oldFileFormat, fileFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolvercplexPackage.SOLVER_CPLEX__FILE_COMPRESSED, oldFileCompressed, fileCompressed));
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
				float optimalValue = varSol.getOptimalValue();
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
	protected void buildLpVarImpl(GeneratorLpVar var) throws Exception {
		IloNumVarType vartypetobe = IloNumVarType.Float; 
		if ( !this.isSolverLinearRelaxation() && var.getType()==EnumLpVarType.ENUM_LITERAL_LP_VAR_INTEGER){
			vartypetobe = IloNumVarType.Int; 
		}
		float lb = var.getLowerBound();
		float ub = var.getUpperBound();
		String name = var.getCode();
		// create the var
		IloNumVar cplexvar = SolverCplexImpl.this.lp.numVar(lb, ub, vartypetobe, name);
		SolverCplexImpl.this.vars.put(var, cplexvar);
	}

	/**
     * Build the lp cons
	 */
	@Override
	protected void buildLpConsImpl(GeneratorElement element, GeneratorLpLinear linear, float rhs, EnumLpConsType type) throws Exception {
		IloLinearNumExpr expr = this.lp.linearNumExpr();
	    for ( GeneratorLpTerm lpterm : linear.getLpTerm())	{
		    GeneratorLpVar lpvar = lpterm.getLpVar();
		    IloNumVar cplexvar = vars.get(lpvar);
		    float coefficient = lpterm.getCoeff();
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
	protected void buildLpGoalTermImpl(GeneratorLpVar var, float coefficient) throws Exception {
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
			case SolvercplexPackage.SOLVER_CPLEX__FILE_PATH:
				return getFilePath();
			case SolvercplexPackage.SOLVER_CPLEX__FILE_FORMAT:
				return getFileFormat();
			case SolvercplexPackage.SOLVER_CPLEX__FILE_COMPRESSED:
				return isFileCompressed();
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
			case SolvercplexPackage.SOLVER_CPLEX__FILE_PATH:
				setFilePath((String)newValue);
				return;
			case SolvercplexPackage.SOLVER_CPLEX__FILE_FORMAT:
				setFileFormat((EnumLpFileFormat)newValue);
				return;
			case SolvercplexPackage.SOLVER_CPLEX__FILE_COMPRESSED:
				setFileCompressed((Boolean)newValue);
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
			case SolvercplexPackage.SOLVER_CPLEX__FILE_PATH:
				setFilePath(FILE_PATH_EDEFAULT);
				return;
			case SolvercplexPackage.SOLVER_CPLEX__FILE_FORMAT:
				setFileFormat(FILE_FORMAT_EDEFAULT);
				return;
			case SolvercplexPackage.SOLVER_CPLEX__FILE_COMPRESSED:
				setFileCompressed(FILE_COMPRESSED_EDEFAULT);
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
			case SolvercplexPackage.SOLVER_CPLEX__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
			case SolvercplexPackage.SOLVER_CPLEX__FILE_FORMAT:
				return fileFormat != FILE_FORMAT_EDEFAULT;
			case SolvercplexPackage.SOLVER_CPLEX__FILE_COMPRESSED:
				return fileCompressed != FILE_COMPRESSED_EDEFAULT;
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
				case SolvercplexPackage.SOLVER_CPLEX__FILE_PATH: return SolverPackage.ILP_WRITER__FILE_PATH;
				case SolvercplexPackage.SOLVER_CPLEX__FILE_FORMAT: return SolverPackage.ILP_WRITER__FILE_FORMAT;
				case SolvercplexPackage.SOLVER_CPLEX__FILE_COMPRESSED: return SolverPackage.ILP_WRITER__FILE_COMPRESSED;
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
				case SolverPackage.ILP_WRITER__FILE_PATH: return SolvercplexPackage.SOLVER_CPLEX__FILE_PATH;
				case SolverPackage.ILP_WRITER__FILE_FORMAT: return SolvercplexPackage.SOLVER_CPLEX__FILE_FORMAT;
				case SolverPackage.ILP_WRITER__FILE_COMPRESSED: return SolvercplexPackage.SOLVER_CPLEX__FILE_COMPRESSED;
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
				case SolverPackage.ILP_WRITER___WRITE_LP_TO_FILE: return SolvercplexPackage.SOLVER_CPLEX___WRITE_LP_TO_FILE;
				case SolverPackage.ILP_WRITER___GET_LP_AS_STRING: return SolvercplexPackage.SOLVER_CPLEX___GET_LP_AS_STRING;
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
			case SolvercplexPackage.SOLVER_CPLEX___WRITE_LP_TO_FILE:
				writeLpToFile();
				return null;
			case SolvercplexPackage.SOLVER_CPLEX___GET_LP_AS_STRING:
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
		result.append(')');
		return result.toString();
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
			// set the params
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
		float   goalvalue  = 0.0f;
		float   mipgap     = 0.0f;
		

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
				goalvalue = (float) this.lp.getObjValue();
			} catch (IloException e) {
				Plugin.INSTANCE.logError("SolverCplex: getObjValue, exception "+e);
				return new ReturnFeedback("SolverCplex.getObjValue", e);
			}
			try {
				mipgap    = (float) this.lp.getMIPRelativeGap();
			} catch (IloException e) {
				Plugin.INSTANCE.logError("SolverCplex: getMIPRelativeGap, exception "+e);
				return new ReturnFeedback("SolverCplex.getMIPRelativeGap", e);
			}
			SolutionLp newSolution = (SolutionLp) this.constructSolution();
			newSolution.setValue(goalvalue);
			for ( Map.Entry<GeneratorLpVar, IloNumVar> varentry : vars.entrySet())	{
				IloNumVar cplexvar = varentry.getValue();
				GeneratorLpVar lpvar = varentry.getKey();
				float optimalvalue = 0.0f;
				try {
					optimalvalue = (float) this.lp.getValue(cplexvar);
				} catch (IloException e) {
					Plugin.INSTANCE.logInfo("SolverCplex: getValue, exception "+e+ ", object "+cplexvar.getName());
					// michel 20161209: 
					//    cplex returns an exception for variable not used by the solver
					//    actually the value of the variable does not matter
					//    what should be done, set an optimal value or nothing or mark it as unbound?
					//    this is an open questions
//					return new ReturnFeedback("SolverCplex.getMIPRelativeGap", e);
				}
				if ( Math.abs(optimalvalue)>0.00001){
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
			float mipvalue = 0.0f;
			float mipgap = 0.0f;
			boolean feasible = this.hasIncumbent();
			if  (  feasible )  {
				feasible = true;
				mipvalue = (float) this.getIncumbentObjValue();
				mipgap   = (float) this.getMIPRelativeGap();
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
	
} //SolverCplexImpl


