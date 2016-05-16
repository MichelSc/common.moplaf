/**
 */
package com.misc.common.moplaf.solver.solverlpsolve.impl;

import com.misc.common.moplaf.solver.EnumLpConsType;
import com.misc.common.moplaf.solver.EnumLpFileFormat;
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
import com.misc.common.moplaf.solver.SolutionLp;
import com.misc.common.moplaf.solver.SolutionVar;
import com.misc.common.moplaf.solver.SolverPackage;

import com.misc.common.moplaf.solver.impl.SolverLpImpl;
import com.misc.common.moplaf.solver.solverlpsolve.SolverLpSolve;
import com.misc.common.moplaf.solver.solverlpsolve.SolverlpsolvePackage;

import lpsolve.LpSolve;
import lpsolve.LpSolveException;
import lpsolve.MsgListener;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solver Lp Solve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.solverlpsolve.impl.SolverLpSolveImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverlpsolve.impl.SolverLpSolveImpl#getFileFormat <em>File Format</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverlpsolve.impl.SolverLpSolveImpl#isFileCompressed <em>File Compressed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverLpSolveImpl extends SolverLpImpl implements SolverLpSolve {
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
	protected SolverLpSolveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverlpsolvePackage.Literals.SOLVER_LP_SOLVE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_PATH, oldFilePath, filePath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_FORMAT, oldFileFormat, fileFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_COMPRESSED, oldFileCompressed, fileCompressed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void writeLpToFile() {
		boolean owningmodel = false;
		if ( this.lp==null){
			this.loadLp();
			owningmodel = true;
		}
		
		String filePathToUse = this.getFilePath();
		if ( filePathToUse==null){
			Plugin.INSTANCE.logWarning("SolverLpSolvze: no file path, write aborted");
			return;
		}
		EnumLpFileFormat fileFormat = this.getFileFormat();
		if ( fileFormat!=null ){
			filePathToUse = fileFormat.extendFilePath(filePathToUse, false);
		}

		try {
			switch (this.getFileFormat() ) {
			    case FILE_FORMAT_MPS:
					this.lp.writeMps(filePathToUse);
			        break;
			    case FILE_FORMAT_LP_SOLVE:
					this.lp.writeLp(filePathToUse);
					break;
			    case FILE_FORMAT_GAMS:
			    case FILE_FORMAT_GLPK:
			    case FILE_FORMAT_SAV:
			    case FILE_FORMAT_CPLEX:
			    default:
					Plugin.INSTANCE.logError("SolverLpSolve: file type not supported, nothing written");
				    break;
		    }  // switch on constraint type
		}
		catch (LpSolveException e) {
			e.printStackTrace();
			Plugin.INSTANCE.logError("SolverLpSolve: write failed, "+e.getMessage());
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
			case SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_PATH:
				return getFilePath();
			case SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_FORMAT:
				return getFileFormat();
			case SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_COMPRESSED:
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
			case SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_PATH:
				setFilePath((String)newValue);
				return;
			case SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_FORMAT:
				setFileFormat((EnumLpFileFormat)newValue);
				return;
			case SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_COMPRESSED:
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
			case SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_PATH:
				setFilePath(FILE_PATH_EDEFAULT);
				return;
			case SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_FORMAT:
				setFileFormat(FILE_FORMAT_EDEFAULT);
				return;
			case SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_COMPRESSED:
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
			case SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
			case SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_FORMAT:
				return fileFormat != FILE_FORMAT_EDEFAULT;
			case SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_COMPRESSED:
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
				case SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_PATH: return SolverPackage.ILP_WRITER__FILE_PATH;
				case SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_FORMAT: return SolverPackage.ILP_WRITER__FILE_FORMAT;
				case SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_COMPRESSED: return SolverPackage.ILP_WRITER__FILE_COMPRESSED;
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
				case SolverPackage.ILP_WRITER__FILE_PATH: return SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_PATH;
				case SolverPackage.ILP_WRITER__FILE_FORMAT: return SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_FORMAT;
				case SolverPackage.ILP_WRITER__FILE_COMPRESSED: return SolverlpsolvePackage.SOLVER_LP_SOLVE__FILE_COMPRESSED;
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
				case SolverPackage.ILP_WRITER___WRITE_LP_TO_FILE: return SolverlpsolvePackage.SOLVER_LP_SOLVE___WRITE_LP_TO_FILE;
				case SolverPackage.ILP_WRITER___GET_LP_AS_STRING: return SolverlpsolvePackage.SOLVER_LP_SOLVE___GET_LP_AS_STRING;
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
			case SolverlpsolvePackage.SOLVER_LP_SOLVE___WRITE_LP_TO_FILE:
				writeLpToFile();
				return null;
			case SolverlpsolvePackage.SOLVER_LP_SOLVE___GET_LP_AS_STRING:
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

	/**
	 * <!-- begin-user-doc -->
	 * Integrates GLPK in the framework
	 * <!-- end-user-doc -->
	 */
    // private declarations
	private LpSolve lp;
	private Map<GeneratorLpVar,   Integer> vars; // 1-based
	private Map<GeneratorElement, Integer> cons; // 1-based
	private int var_counter = 0;
	private int cons_counter = 0;
	 
	/**
	 * <!-- begin-user-doc -->
	 * Release GLPK structure
	 * <!-- end-user-doc -->
	 */
	private void releaseLp(){
		// Free memory
		if ( this.lp!=null){
			//GLPK.glp_delete_prob(this.lp);
			this.lp = null;
		}
		this.vars = null;
		this.cons = null;
		this.var_counter  = 0;  // zero based
		this.cons_counter = 0;  // zero based
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Return an array of the initial solution to be used in the presolve
	 * <!-- end-user-doc -->
	 */
//	private int initSolution(glp_tree tree){
//		try {
//			Solution initialSolution = this.getInitialSolution();
//			if ( initialSolution != null) {
//				Plugin.INSTANCE.logInfo("SolverGLPK: presolve");
//				int nofVars = this.vars.size();
//				SWIGTYPE_p_double array = GLPK.new_doubleArray(nofVars);
//				for ( int i=0; i<nofVars; i++){
//				    GLPK.doubleArray_setitem(array, i, 0.0);
//				}
//				for ( SolutionVar varSol : this.getInitialSolution().getVars()){
//					double optimalValue = varSol.getOptimalValue();
//				    int varindex = vars.get(varSol.getVar()).intValue();
//				    GLPK.doubleArray_setitem(array, varindex, optimalValue);
//				}
//				int rc = GLPK.glp_ios_heur_sol(tree, array); 
//				Plugin.INSTANCE.logInfo("SolverGLPK: presolve returned (0=accepted) "+rc);
//				GLPK.delete_doubleArray(array);
//				return rc;
//     		}
//		} catch (Exception e) {
//			Plugin.INSTANCE.logError("SolverGlpk: init mip start failed, exception "+e.getMessage());
//			this.releaseLp();
//		}
//		return 0;
//	}

	
	/**
     * Build the lp var
	 */
	@Override
	protected void buildLpVarImpl(GeneratorLpVar var) throws Exception {
		this.var_counter++; 
		// map
		int varnumber = this.var_counter; // index of the new variable 1-based
		this.vars.put((GeneratorLpVar)var, varnumber); // 1-based
		
		// the var is made with the lp
		
		// get the vars elements
		String varname = var.getCode();
		float lb = var.getLowerBound();
		float ub = var.getUpperBound();

		boolean mustBeInteger = !this.isSolverLinearRelaxation() 
				             && var.getType()==EnumLpVarType.ENUM_LITERAL_LP_VAR_INTEGER;

		// set the var elements
		this.lp.setColName(varnumber, varname);
		this.lp.setBounds(varnumber, lb, ub);
		this.lp.setInt(varnumber, mustBeInteger);
	}

	/**
     * Build the lp cons
	 */
	@Override
	protected void buildLpConsImpl(GeneratorElement element, GeneratorLpLinear linear, float rhs, EnumLpConsType type) throws Exception {
		this.cons_counter++;  // 1-based
		// map the constraint
		int consnumber = this.cons_counter;
		this.cons.put(element, consnumber);
		
		// constraint name
		String rowname = element.getCode();
		// constraint terms
		int nofterms = linear.getLpTerm().size();
		double[] coeffs = new double[nofterms];
		int[] varnumbers = new int[nofterms];
		int termnumber = 0;
		for ( GeneratorLpTerm term : linear.getLpTerm()){
			GeneratorLpVar var = term.getLpVar();
			int varnumber = this.vars.get(var);
			coeffs[termnumber] = term.getCoeff();
			varnumbers[termnumber] = varnumber;
			termnumber++;
		}
		// constaint sense
		int kind = 0; // unknown
		switch (type ) {
		    case ENUM_LITERAL_LP_CONS_EQUAL:
				kind = 3; 
		        break;
		    case ENUM_LITERAL_LP_CONS_BIGGER_OR_EQUAL:
				kind = 2;
		        break;
		    case ENUM_LITERAL_LP_CONS_SMALLER_OR_EQUAL:
				kind = 1;
		        break;
		    };  // switch on constraint type
		    
		// make the constraint
		this.lp.addConstraintex(nofterms, coeffs, varnumbers, kind, rhs);
		this.lp.setColName(consnumber, rowname);
	}

	/**
     * Build the lp goal
	 */
	@Override
	protected void buildLpGoalImpl(GeneratorLpGoal goal, float weight) throws Exception {
		// direction
		float direction = 1.0f;
		if ( goal.getObjectiveType()==EnumObjectiveType.MAXIMUM){
			direction = -1.0f;
		}
		// terms
		for ( GeneratorLpTerm goalTerm : goal.getLpTerm()){
			// create the objective coefficient
			GeneratorLpVar lpvar = goalTerm.getLpVar();
			float coefficient = goalTerm.getCoeff()*direction*weight;
			if ( coefficient!=0.0f){
				int varnumber = this.vars.get(lpvar);
				this.lp.setObj(varnumber, coefficient);
			}
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * Load the lp from the generator into the GLPK structure
	 * <!-- end-user-doc -->
	 */
	private void loadLp(){
		this.releaseLp(); // release the current model, if any
		Generator generator = this.getGenerator();
		int nofVars = generator.getFootprintNofVars();
		int nofCons = generator.getFootprintNofCons();
		if ( generator == null || nofVars==0 || nofCons==0 ) { return; }
		try {
			this.vars = new HashMap<GeneratorLpVar, Integer>();
			this.cons = new HashMap<GeneratorElement, Integer>();

			// create the problem in GLPK and initialize
			this.lp = LpSolve.makeLp(0, nofVars);

			this.buildVars();
			this.buildCons();
			this.buildGoals();
		}
		catch (Exception e) {
			e.printStackTrace();
			Plugin.INSTANCE.logError("SolverLpSolve: load failed, "+e.getMessage());
			this.releaseLp();
		}
	} // method lp load
	
	/**
	 * <!-- begin-user-doc -->
	 * Solve the lp with LpSolve the linear formulation provided by the Generator
	 * <!-- end-user-doc -->
	 */
	@Override
	protected void solveSolver() {
		//super.solveSolver();

		this.loadLp();
		if ( this.lp==null ) { return; }

		this.onInitializationEnd();
		
		if ( this.isSolverDump()){
			this.writeLpToFile();
		}
		
		CallBackListener listener = new CallBackListener();
		Object userHandle = this;
		int mask = 0; 
		boolean solved = false;
		int rc = 0;
		try {
			this.lp.putMsgfunc(listener, userHandle, mask);
			rc = this.lp.solve();
			solved = true;
			Plugin.INSTANCE.logInfo("SolverLpSolve: solve returned "+getSolveRcDescription(rc));
		}
		catch (LpSolveException e1){
			Plugin.INSTANCE.logError("SolverLpSolve: solve failed, lpsolve exception "+e1);
		}
		catch (Exception e)		{
			Plugin.INSTANCE.logError("SolverLpSolve: solve failed "+e);
		}
		//Number objective = result.getObjective();
		
		this.onSolvingEnd();
		
		boolean feasible   = false;
		boolean unfeasible = false;
		boolean optimal    = false;
		float mipvalue     = 0.0f;
		if ( solved ){
			switch ( rc ) {
			case SOLVE_RC_SUBOPTIMAL:
				feasible = true;
			case SOLVE_RC_OPTIMAL:
				feasible = true;
				optimal = true;
			case SOLVE_RC_INFEASIBLE:
				unfeasible = true;
			}
			if ( feasible || this.isSolverLinearRelaxation()) {
				try {
					double[] lpSolveVars= this.lp.getPtrVariables();
					mipvalue = (float) this.lp.getObjective();
					SolutionLp newSolution = (SolutionLp) this.constructSolution();
					newSolution.setValue(mipvalue);
					for ( Map.Entry<GeneratorLpVar, Integer> varentry : vars.entrySet())	{
						int varindex = varentry.getValue().intValue();
						GeneratorLpVar lpvar = varentry.getKey();
						double optimalvalue = lpSolveVars[varindex-1];
						if ( Math.abs(optimalvalue)>0.00001){
							SolutionVar solvervar = newSolution.constructSolutionVar(lpvar);
							solvervar.setOptimalValue((float) optimalvalue);
						}
					} // traverse the vars
					this.makeSolutionGoals(newSolution);
					if ( optimal) {
						this.setSolOptimalityGap(0.0f);
					}
				} 
				catch (LpSolveException e) {
					Plugin.INSTANCE.logError("SolverLpSolve: error in retrieving the solution "+e);
				}
			}
			
		}
		this.setSolFeasible(feasible);
		this.setSolUnfeasible(unfeasible);
		this.setSolOptimal(optimal);
		this.setSolValue(mipvalue);
		
		// release the lp
		this.releaseLp();
		
	} // method SolveLp


	
	/**
	 * <!-- begin-user-doc -->
	 * Implement the call back from GLPK
	 * <!-- end-user-doc -->
	 */
	private class CallBackListener implements MsgListener{
		@Override
		public void msgfunc(LpSolve arg0, Object arg1, int arg2) throws LpSolveException {
			// TODO Auto-generated method stub
			
		}
	}; // class listener
	
	private static final int SOLVE_RC_NOMEMORY    = -2;
	private static final int SOLVE_RC_OPTIMAL     = 0;
	private static final int SOLVE_RC_SUBOPTIMAL  = 1;
	private static final int SOLVE_RC_INFEASIBLE  = 2;
	private static final int SOLVE_RC_UNBOUNDED   = 3;
	private static final int SOLVE_RC_DEGENERATE  = 4;
	private static final int SOLVE_RC_NUMFAILURE  = 5;
	private static final int SOLVE_RC_USERABORT   = 6;
	private static final int SOLVE_RC_TIMEOUT     = 7;
	private static final int SOLVE_RC_PRESOLVED   = 9;
	private static final int SOLVE_RC_NUMFAILURE2 = 25;
	
	static private String getSolveRcDescription(int rc){
		switch (rc){
		case SOLVE_RC_NOMEMORY:
			return "Out of memory";
		case SOLVE_RC_OPTIMAL:
			return "An optimal solution was obtained";
		case SOLVE_RC_SUBOPTIMAL:
//			A timeout occured (set via set_timeout or with the -timeout option in lp_solve)
//		    set_break_at_first was called so that the first found integer solution is found (-f option in lp_solve)
//		    set_break_at_value was called so that when integer solution is found that is better than the specified value that it stops (-o option in lp_solve)
//		    set_mip_gap was called (-g/-ga/-gr options in lp_solve) to specify a MIP gap
//		    An abort function is installed (put_abortfunc) and this function returned TRUE
//		    At some point not enough memory could not be allocated 		SOVE_RC_ 
			return "The model is sub-optimal. Only happens if there are integer variables and there is already an integer solution found. The solution is not guaranteed the most optimal one.";
		case SOLVE_RC_INFEASIBLE:
			return "The model is infeasible";
		case SOLVE_RC_UNBOUNDED:
			return "The model is unbounded";
		case SOLVE_RC_DEGENERATE:
			return "The model is degenerative";
		case SOLVE_RC_NUMFAILURE:
			return "Numerical failure encountered";
		case SOLVE_RC_USERABORT:
			return "The abort routine returned TRUE. See put_abortfunc";
		case SOLVE_RC_TIMEOUT:
			return "A timeout occurred. A timeout was set via set_timeout";
		case SOLVE_RC_PRESOLVED:
			return "The model could be solved by presolve. This can only happen if presolve is active via set_presolve";
		case SOLVE_RC_NUMFAILURE2:
			return "Accuracy error encountered";
		}
		return "Code unknown";
	}
		
	
} //SolverLpSolveImpl
