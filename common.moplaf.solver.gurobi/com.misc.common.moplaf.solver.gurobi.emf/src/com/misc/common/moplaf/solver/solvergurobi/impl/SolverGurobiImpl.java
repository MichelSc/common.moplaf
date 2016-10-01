/**
 */
package com.misc.common.moplaf.solver.solvergurobi.impl;

import gurobi.GRB;
import gurobi.GRB.DoubleAttr;
import gurobi.GRBConstr;
import gurobi.GRBEnv;
import gurobi.GRBException;
import gurobi.GRBLinExpr;
import gurobi.GRBModel;
import gurobi.GRBVar;
import gurobi.GRBCallback;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.solver.EnumLpConsType;
import com.misc.common.moplaf.solver.EnumLpFileFormat;
import com.misc.common.moplaf.solver.EnumLpVarType;
import com.misc.common.moplaf.solver.EnumObjectiveType;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorElement;
import com.misc.common.moplaf.solver.GeneratorLpGoal;
import com.misc.common.moplaf.solver.GeneratorLpLinear;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.GeneratorLpTerm;
import com.misc.common.moplaf.solver.ILpWriter;
import com.misc.common.moplaf.solver.Plugin;
import com.misc.common.moplaf.solver.SolutionLp;
import com.misc.common.moplaf.solver.SolutionVar;
import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.common.moplaf.solver.impl.SolverLpImpl;
import com.misc.common.moplaf.solver.solvergurobi.SolverGurobi;
import com.misc.common.moplaf.solver.solvergurobi.SolvergurobiPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solver Gurobi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.solvergurobi.impl.SolverGurobiImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvergurobi.impl.SolverGurobiImpl#getFileFormat <em>File Format</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvergurobi.impl.SolverGurobiImpl#isFileCompressed <em>File Compressed</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvergurobi.impl.SolverGurobiImpl#getMaxNofThreads <em>Max Nof Threads</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solvergurobi.impl.SolverGurobiImpl#getSolverLog <em>Solver Log</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverGurobiImpl extends SolverLpImpl implements SolverGurobi {
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
	 * The default value of the '{@link #getMaxNofThreads() <em>Max Nof Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNofThreads()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NOF_THREADS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxNofThreads() <em>Max Nof Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNofThreads()
	 * @generated
	 * @ordered
	 */
	protected int maxNofThreads = MAX_NOF_THREADS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolverLog() <em>Solver Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverLog()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLVER_LOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolverLog() <em>Solver Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverLog()
	 * @generated
	 * @ordered
	 */
	protected String solverLog = SOLVER_LOG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverGurobiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolvergurobiPackage.Literals.SOLVER_GUROBI;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolvergurobiPackage.SOLVER_GUROBI__FILE_PATH, oldFilePath, filePath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolvergurobiPackage.SOLVER_GUROBI__FILE_FORMAT, oldFileFormat, fileFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolvergurobiPackage.SOLVER_GUROBI__FILE_COMPRESSED, oldFileCompressed, fileCompressed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNofThreads() {
		return maxNofThreads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNofThreads(int newMaxNofThreads) {
		int oldMaxNofThreads = maxNofThreads;
		maxNofThreads = newMaxNofThreads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolvergurobiPackage.SOLVER_GUROBI__MAX_NOF_THREADS, oldMaxNofThreads, maxNofThreads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolverLog() {
		return solverLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolverLog(String newSolverLog) {
		String oldSolverLog = solverLog;
		solverLog = newSolverLog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolvergurobiPackage.SOLVER_GUROBI__SOLVER_LOG, oldSolverLog, solverLog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void writeLpToFile() {
		boolean owningmodel = false;
		if ( this.model==null){
			this.loadLp();
			owningmodel = true;
		}
		
		String filepath = this.getFilePath();
		
		try {
			model.write(filepath);
		} catch (GRBException e) {
			Plugin.INSTANCE.logError("SolverGurobi: write failed, "+e.getMessage());
		}
		
		if( owningmodel ){
			this.releaseLp();
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
			case SolvergurobiPackage.SOLVER_GUROBI__FILE_PATH:
				return getFilePath();
			case SolvergurobiPackage.SOLVER_GUROBI__FILE_FORMAT:
				return getFileFormat();
			case SolvergurobiPackage.SOLVER_GUROBI__FILE_COMPRESSED:
				return isFileCompressed();
			case SolvergurobiPackage.SOLVER_GUROBI__MAX_NOF_THREADS:
				return getMaxNofThreads();
			case SolvergurobiPackage.SOLVER_GUROBI__SOLVER_LOG:
				return getSolverLog();
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
			case SolvergurobiPackage.SOLVER_GUROBI__FILE_PATH:
				setFilePath((String)newValue);
				return;
			case SolvergurobiPackage.SOLVER_GUROBI__FILE_FORMAT:
				setFileFormat((EnumLpFileFormat)newValue);
				return;
			case SolvergurobiPackage.SOLVER_GUROBI__FILE_COMPRESSED:
				setFileCompressed((Boolean)newValue);
				return;
			case SolvergurobiPackage.SOLVER_GUROBI__MAX_NOF_THREADS:
				setMaxNofThreads((Integer)newValue);
				return;
			case SolvergurobiPackage.SOLVER_GUROBI__SOLVER_LOG:
				setSolverLog((String)newValue);
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
			case SolvergurobiPackage.SOLVER_GUROBI__FILE_PATH:
				setFilePath(FILE_PATH_EDEFAULT);
				return;
			case SolvergurobiPackage.SOLVER_GUROBI__FILE_FORMAT:
				setFileFormat(FILE_FORMAT_EDEFAULT);
				return;
			case SolvergurobiPackage.SOLVER_GUROBI__FILE_COMPRESSED:
				setFileCompressed(FILE_COMPRESSED_EDEFAULT);
				return;
			case SolvergurobiPackage.SOLVER_GUROBI__MAX_NOF_THREADS:
				setMaxNofThreads(MAX_NOF_THREADS_EDEFAULT);
				return;
			case SolvergurobiPackage.SOLVER_GUROBI__SOLVER_LOG:
				setSolverLog(SOLVER_LOG_EDEFAULT);
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
			case SolvergurobiPackage.SOLVER_GUROBI__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
			case SolvergurobiPackage.SOLVER_GUROBI__FILE_FORMAT:
				return fileFormat != FILE_FORMAT_EDEFAULT;
			case SolvergurobiPackage.SOLVER_GUROBI__FILE_COMPRESSED:
				return fileCompressed != FILE_COMPRESSED_EDEFAULT;
			case SolvergurobiPackage.SOLVER_GUROBI__MAX_NOF_THREADS:
				return maxNofThreads != MAX_NOF_THREADS_EDEFAULT;
			case SolvergurobiPackage.SOLVER_GUROBI__SOLVER_LOG:
				return SOLVER_LOG_EDEFAULT == null ? solverLog != null : !SOLVER_LOG_EDEFAULT.equals(solverLog);
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
				case SolvergurobiPackage.SOLVER_GUROBI__FILE_PATH: return SolverPackage.ILP_WRITER__FILE_PATH;
				case SolvergurobiPackage.SOLVER_GUROBI__FILE_FORMAT: return SolverPackage.ILP_WRITER__FILE_FORMAT;
				case SolvergurobiPackage.SOLVER_GUROBI__FILE_COMPRESSED: return SolverPackage.ILP_WRITER__FILE_COMPRESSED;
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
				case SolverPackage.ILP_WRITER__FILE_PATH: return SolvergurobiPackage.SOLVER_GUROBI__FILE_PATH;
				case SolverPackage.ILP_WRITER__FILE_FORMAT: return SolvergurobiPackage.SOLVER_GUROBI__FILE_FORMAT;
				case SolverPackage.ILP_WRITER__FILE_COMPRESSED: return SolvergurobiPackage.SOLVER_GUROBI__FILE_COMPRESSED;
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
				case SolverPackage.ILP_WRITER___WRITE_LP_TO_FILE: return SolvergurobiPackage.SOLVER_GUROBI___WRITE_LP_TO_FILE;
				case SolverPackage.ILP_WRITER___GET_LP_AS_STRING: return SolvergurobiPackage.SOLVER_GUROBI___GET_LP_AS_STRING;
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
			case SolvergurobiPackage.SOLVER_GUROBI___WRITE_LP_TO_FILE:
				writeLpToFile();
				return null;
			case SolvergurobiPackage.SOLVER_GUROBI___GET_LP_AS_STRING:
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
		result.append(", MaxNofThreads: ");
		result.append(maxNofThreads);
		result.append(", SolverLog: ");
		result.append(solverLog);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Integrates GLPK in the framework
	 * <!-- end-user-doc -->
	 */
    // private declarations
	GRBEnv   env   = null; 
	GRBModel model = null;
	private Map<GeneratorLpVar, GRBVar> vars;
	private Map<GeneratorElement, GRBConstr> cons;
	 
	private void releaseLp(){
		// Free memory
		if ( this.env!=null){
			try {
				env.dispose();
			} catch (GRBException e) {
				Plugin.INSTANCE.logError("SolverGurobi: release failed, "+e.getMessage());
			}
			this.env = null;
		}
		if ( this.model!=null){
			model.dispose();
			this.model = null;
		}
		this.vars = null;
		this.cons = null;
		
	}
	
	/**
     * Build the lp var
	 */
	@Override
	protected void buildLpVarImpl(GeneratorLpVar var) throws Exception {
		float lb = var.getLowerBound();
		float ub = var.getUpperBound();
		char kind = GRB.CONTINUOUS;
		if ( !this.isSolverLinearRelaxation()
				&& var.getType()==EnumLpVarType.ENUM_LITERAL_LP_VAR_INTEGER)	{
			kind = GRB.INTEGER;
		}
		String varname = var.getCode();
		// create the variable
		GRBVar grbvar = this.model.addVar(lb, ub, 0.0, kind, varname);
	    // remember the variable  
		SolverGurobiImpl.this.vars.put(var, grbvar);
	}

	/**
     * Build the lp cons
	 */
	@Override
	protected void buildLpConsImpl(GeneratorElement element, GeneratorLpLinear linear, float rhs, EnumLpConsType type) throws Exception {
		GRBLinExpr expr = new GRBLinExpr();
		for ( GeneratorLpTerm lpterm : linear.getLpTerm())	{
			GeneratorLpVar lpvar = lpterm.getLpVar();
			GRBVar grbvar = vars.get(lpvar);
			float coefficient = lpterm.getCoeff();
		    expr.addTerm(coefficient, grbvar); 
		} // traverse the terms
		// create the constraint
		String rowname = element.getCode();
		char kind = GRB.EQUAL;
		switch ( type ) {
		    case ENUM_LITERAL_LP_CONS_EQUAL:
				kind = GRB.EQUAL;
		        break;
		    case ENUM_LITERAL_LP_CONS_BIGGER_OR_EQUAL:
				kind = GRB.GREATER_EQUAL;
		        break;
		    case ENUM_LITERAL_LP_CONS_SMALLER_OR_EQUAL:
				kind = GRB.LESS_EQUAL;
		        break;
	    }  // switch on constraint type
	    GRBConstr grbcons = model.addConstr(expr, kind, rhs, rowname);				
	    // remember the constraint
		this.cons.put(element, grbcons );
	}

	/**
     * Build the lp goal
	 */
	@Override
	protected void buildLpGoalImpl(GeneratorLpGoal goal, float weight) throws Exception {
		if ( goal != null) {
			for ( GeneratorLpTerm goalTerm : goal.getLpTerm()){
				// create the objective coefficient
				GeneratorLpVar lpvar = goalTerm.getLpVar();
				float coefficient = goalTerm.getCoeff();
				if ( coefficient!=0.0f){
					if ( goal.getObjectiveType()==EnumObjectiveType.MAXIMUM){
						coefficient = - coefficient;
					}
					GRBVar grbvar = vars.get(lpvar);
					grbvar.set(DoubleAttr.Obj, coefficient);
				}
			}
		}
	}


	
	/**
     * Load the lp
	 */
	private void loadLp(){
		this.releaseLp(); // release the current model, if any
		Generator generator = this.getGenerator();
		try {
			// create the environment
			String solverlog = this.getSolverLog();
			this.env = new GRBEnv(solverlog);
			this.env.set(GRB.DoubleParam.MIPGap,    this.getSolverOptimalityTolerance());
			this.env.set(GRB.DoubleParam.TimeLimit, this.getSolverMaxDuration());
			this.env.set(GRB.IntParam.Threads,      this.getMaxNofThreads());

			// create the model
			this.model = new GRBModel(env);
			this.model.setCallback(new SolverCallback());

			//  create the linear formulation
			this.vars = new HashMap<GeneratorLpVar, GRBVar>();
			this.cons = new HashMap<GeneratorElement, GRBConstr>();

			
			this.buildVars();
			this.model.update(); // done after the vars and before the cons
			this.buildCons();
			this.buildGoals();
		
			this.model.set(GRB.IntAttr.ModelSense, GRB.MINIMIZE);
		}
		catch (Exception e)
		{
			Plugin.INSTANCE.logError("SolverGurobi: load failed "+e.getMessage());
			this.releaseLp();
		}
	} // method lp load
		
	@Override
	public ReturnFeedback solveImpl() {
	
		// load the lp
		this.loadLp();
		if ( this.model==null ) { 
			return new ReturnFeedback(false, "SolverGurobi.solve: no lp");
		}
	
		this.onInitializationEnd();
		
		if ( this.isSolverDump()){
			this.writeLpToFile();
		}
		
		try {
			this.model.optimize();
		}
		catch (Exception e)	{
			Plugin.INSTANCE.logError("SolverGurobi: solve failed, "+e.getMessage());
			return new ReturnFeedback("SolverGurobi.solve", e);
		}
		
	    this.onSolvingEnd();
			
		// do something with the solution
		try {
			int status;
			status = model.get(GRB.IntAttr.Status);
			String statusasstring = format_status(status);
			Plugin.INSTANCE.logInfo("ESolver Gurobi returned with status "+statusasstring);
			boolean optimal    = status==GRB.OPTIMAL;
			boolean feasible   = model.get(GRB.IntAttr.SolCount)>0;
			boolean unfeasible = status==GRB.INFEASIBLE;
			float mipvalue = 0.0f;
			if ( feasible || this.isSolverLinearRelaxation()) {
				SolutionLp newSolution = (SolutionLp) this.constructSolution();
				mipvalue = (float)model.get(GRB.DoubleAttr.ObjVal);
				newSolution.setValue(mipvalue);
				for ( Map.Entry<GeneratorLpVar, GRBVar> varentry : this.vars.entrySet()) {
					GeneratorLpVar lpvar = varentry.getKey();
					SolutionVar solvervar = newSolution.constructSolutionVar(lpvar);
					GRBVar grbvar = varentry.getValue();
					float optimalvalue = (float) grbvar.get(GRB.DoubleAttr.X);
					solvervar.setOptimalValue(optimalvalue);
				} // traverse the vars
				this.makeSolutionGoals(newSolution);
				if ( optimal) {
					this.setSolOptimalityGap(0.0f);			
				}
			}
			this.setSolFeasible(feasible);
			this.setSolUnfeasible(unfeasible);
			this.setSolOptimal(optimal);
			this.setSolValue(mipvalue);
		} catch (GRBException e) {
			Plugin.INSTANCE.logError("SolverGurobi: solution build failed, "+e.getMessage());
			return new ReturnFeedback("SolverGurobi.solve", e);
		}
		
		// release the lp
		this.releaseLp();
		
		return ReturnFeedback.SUCCESS;
		
	} // method SolveLp
	
	static String format_status(int statuscode){
		String formatted = "unknown code";
		switch( statuscode){
	    case GRB.LOADED	         : formatted = "Model is loaded, but no solution information is available"; break; 
	    case GRB.OPTIMAL	     : formatted = "Model was solved to optimality (subject to tolerances), and an optimal solution is available."; break;
	    case GRB.INFEASIBLE	     : formatted = "Model was proven to be infeasible."; break;
	    case GRB.INF_OR_UNBD	 : formatted = "Model was proven to be either infeasible or unbounded. To obtain a more definitive conclusion, set the DualReductions parameter to 0 and reoptimize."; break;
	    case GRB.UNBOUNDED	     : formatted = "Model was proven to be unbounded. Important note: an unbounded status indicates the presence of an unbounded ray that allows the objective to improve without limit. It says nothing about whether the model has a feasible solution. If you require information on feasibility, you should set the objective to zero and reoptimize."; break;
	    case GRB.CUTOFF	         : formatted = "Optimal objective for model was proven to be worse than the value specified in the Cutoff parameter. No solution information is available."; break;
	    case GRB.ITERATION_LIMIT : formatted = "Optimization terminated because the total number of simplex iterations performed exceeded the value specified in the IterationLimit parameter, or because the total number of barrier iterations exceeded the value specified in the BarIterLimit parameter."; break;
	    case GRB.NODE_LIMIT	     : formatted = "Optimization terminated because the total number of branch-and-cut nodes explored exceeded the value specified in the NodeLimit parameter."; break;
	    case GRB.TIME_LIMIT	     : formatted = "Optimization terminated because the time expended exceeded the value specified in the TimeLimit parameter."; break;
	    case GRB.SOLUTION_LIMIT  : formatted = "Optimization terminated because the number of solutions found reached the value specified in the SolutionLimit parameter."; break;
	    case GRB.INTERRUPTED     : formatted = "Optimization was terminated by the user."; break;
	    case GRB.NUMERIC         : formatted = "Optimization was terminated due to unrecoverable numerical difficulties."; break;
	    case GRB.SUBOPTIMAL	     : formatted = "Unable to satisfy optimality tolerances; a sub-optimal solution is available."; break;
		}
		return formatted;
	}
	
	
	public class SolverCallback extends GRBCallback {
		private int lastmsg;
		@Override
		protected void callback() {
			// info fields to set by the callback
			String progress = "Unknown where "+where;
			boolean feedback =  false;
	        String depth = ""; 
			float mipvalue = 0.0f;
			boolean feasible = false;
			float mipgap = 0.0f;
			// set the info fields
			 try {
				 if (where == GRB.CB_MESSAGE ) {
					 /*
			        String st = getStringInfo(GRB.CB_MSG_STRING);
			        if (st != null) {
			        	progress = "Message: "+st;
			        	feedback = true;
			        }
			        */
			     } 
				 else if (where == GRB.CB_PRESOLVE) {
			        int cdels = getIntInfo(GRB.CB_PRE_COLDEL);
			        int rdels = getIntInfo(GRB.CB_PRE_ROWDEL);
			        progress = "Presolve: "+cdels+" columns and "+rdels+" rows are removed";
		        	feedback = true;
			     } 
				 else if (where == GRB.CB_SIMPLEX) {
			        int itcnt = (int) getDoubleInfo(GRB.CB_SPX_ITRCNT);
			        if (itcnt%100 == 0 || true) {
						double obj  = getDoubleInfo(GRB.CB_SPX_OBJVAL);
						double pinf = getDoubleInfo(GRB.CB_SPX_PRIMINF);
						double dinf = getDoubleInfo(GRB.CB_SPX_DUALINF);
						int  ispert = getIntInfo(GRB.CB_SPX_ISPERT);
						char ch;
						if (ispert == 0)      ch = ' ';
						else if (ispert == 1) ch = 'S';
						else                  ch = 'P';
						progress = "Simplex: "+itcnt+"  "+ obj + ch + "  "+pinf + "  " + dinf;
			        	feedback = true;
			        }
				 } 
				 else if (where == GRB.CB_MIP) {
			        int nodecnt = (int) getDoubleInfo(GRB.CB_MIP_NODCNT);
			        if (nodecnt - lastmsg >= 100 || true) {
						lastmsg = nodecnt;
						double objbst = getDoubleInfo(GRB.CB_MIP_OBJBST); // current best objective
						double objbnd = getDoubleInfo(GRB.CB_MIP_OBJBND); // current best bound
						mipgap = (float) (Math.abs(objbst - objbnd) / Math.abs(objbst));
						int actnodes = (int) getDoubleInfo(GRB.CB_MIP_NODLFT); // current unexplored node count
						int countnodes = (int) getDoubleInfo(GRB.CB_MIP_NODCNT); // current count of nodes explored
				        int itcnt    = (int) getDoubleInfo(GRB.CB_MIP_ITRCNT); // simplex iteration count
				        int solcnt   = getIntInfo(GRB.CB_MIP_SOLCNT);  // count of feasible solution
				        //int cutcnt   = getIntInfo(GRB.CB_MIP_CUTCNT);  // count of cutting plans applied
				        depth = String.format("explored %1$d, unexplored %2$d, total: %3$d", actnodes, countnodes, actnodes+countnodes);
				        progress = "MIP: "+itcnt;
			        	feedback = true;
				        mipvalue = (float)objbst;
				        feasible = solcnt>0;
				        SolverGurobiImpl.this.setSolOptimalityGap(mipgap); // update gap
			        }
				 } 
				 else if (where == GRB.CB_MIPSOL ) {
					 /*
				    double obj     = getDoubleInfo(GRB.CB_MIPSOL_OBJ);
				    int    nodecnt = (int) getDoubleInfo(GRB.CB_MIPSOL_NODCNT);
				    progress = "MIPSOL: at "+ nodecnt + "+ obj "+obj;
		        	feedback = true;
		        	*/
				 }
			 } 
			 catch (GRBException e) {
				 Plugin.INSTANCE.logError("SolverGurobi: call back failed, Error code: " + e.getErrorCode() + ". " +e.getMessage());
			 }			
			
			// do the call  back
			if ( feedback ) {
				SolverGurobiImpl.this.onSolverFeedback(depth, progress, mipgap, mipvalue, feasible);
			}
			
			if ( SolverGurobiImpl.this.isRunRequestTerminate() )	{
				// terminate
				this.abort();
				Plugin.INSTANCE.logWarning("ESolver Request for terminate");
			}
	 	}  // method call back
	}  // class SolverCallback
} //SolverGurobiImpl
