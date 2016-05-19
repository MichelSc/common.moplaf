/**
 */
package com.misc.common.moplaf.solver.solverscip.impl;

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
import com.misc.common.moplaf.solver.solverscip.SolverScip;
import com.misc.common.moplaf.solver.solverscip.SolverscipPackage;

import de.zib.jscip.nativ.NativeScipException;
import de.zib.jscip.nativ.jni.JniScip;
import de.zib.jscip.nativ.jni.JniScipConsLinear;
import de.zib.jscip.nativ.jni.JniScipRetcode;
import de.zib.jscip.nativ.jni.JniScipStatus;
import de.zib.jscip.nativ.jni.JniScipVartype;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solver Scip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.solverscip.impl.SolverScipImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverscip.impl.SolverScipImpl#getFileFormat <em>File Format</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverscip.impl.SolverScipImpl#isFileCompressed <em>File Compressed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverScipImpl extends SolverLpImpl implements SolverScip {
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
	protected SolverScipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverscipPackage.Literals.SOLVER_SCIP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverscipPackage.SOLVER_SCIP__FILE_PATH, oldFilePath, filePath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverscipPackage.SOLVER_SCIP__FILE_FORMAT, oldFileFormat, fileFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverscipPackage.SOLVER_SCIP__FILE_COMPRESSED, oldFileCompressed, fileCompressed));
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
			case SolverscipPackage.SOLVER_SCIP__FILE_PATH:
				return getFilePath();
			case SolverscipPackage.SOLVER_SCIP__FILE_FORMAT:
				return getFileFormat();
			case SolverscipPackage.SOLVER_SCIP__FILE_COMPRESSED:
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
			case SolverscipPackage.SOLVER_SCIP__FILE_PATH:
				setFilePath((String)newValue);
				return;
			case SolverscipPackage.SOLVER_SCIP__FILE_FORMAT:
				setFileFormat((EnumLpFileFormat)newValue);
				return;
			case SolverscipPackage.SOLVER_SCIP__FILE_COMPRESSED:
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
			case SolverscipPackage.SOLVER_SCIP__FILE_PATH:
				setFilePath(FILE_PATH_EDEFAULT);
				return;
			case SolverscipPackage.SOLVER_SCIP__FILE_FORMAT:
				setFileFormat(FILE_FORMAT_EDEFAULT);
				return;
			case SolverscipPackage.SOLVER_SCIP__FILE_COMPRESSED:
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
			case SolverscipPackage.SOLVER_SCIP__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
			case SolverscipPackage.SOLVER_SCIP__FILE_FORMAT:
				return fileFormat != FILE_FORMAT_EDEFAULT;
			case SolverscipPackage.SOLVER_SCIP__FILE_COMPRESSED:
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
				case SolverscipPackage.SOLVER_SCIP__FILE_PATH: return SolverPackage.ILP_WRITER__FILE_PATH;
				case SolverscipPackage.SOLVER_SCIP__FILE_FORMAT: return SolverPackage.ILP_WRITER__FILE_FORMAT;
				case SolverscipPackage.SOLVER_SCIP__FILE_COMPRESSED: return SolverPackage.ILP_WRITER__FILE_COMPRESSED;
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
				case SolverPackage.ILP_WRITER__FILE_PATH: return SolverscipPackage.SOLVER_SCIP__FILE_PATH;
				case SolverPackage.ILP_WRITER__FILE_FORMAT: return SolverscipPackage.SOLVER_SCIP__FILE_FORMAT;
				case SolverPackage.ILP_WRITER__FILE_COMPRESSED: return SolverscipPackage.SOLVER_SCIP__FILE_COMPRESSED;
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
				case SolverPackage.ILP_WRITER___WRITE_LP_TO_FILE: return SolverscipPackage.SOLVER_SCIP___WRITE_LP_TO_FILE;
				case SolverPackage.ILP_WRITER___GET_LP_AS_STRING: return SolverscipPackage.SOLVER_SCIP___GET_LP_AS_STRING;
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
			case SolverscipPackage.SOLVER_SCIP___WRITE_LP_TO_FILE:
				writeLpToFile();
				return null;
			case SolverscipPackage.SOLVER_SCIP___GET_LP_AS_STRING:
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

	// private declarations
	// moplaf
	private Map<GeneratorLpVar, Long> vars;
	private Map<GeneratorElement, Long> cons;

	// scip
	private JniScip           envScip = null;
//	private JniScipVar        envScipVar = null; //new JniScipVar();
	private JniScipConsLinear envScipConsLinear = null; //new JniScipConsLinear();
	private long consScip = 0;
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void writeLpToFile() {
		boolean owningmodel = false;
		if ( this.envScip==null){
			this.loadLp();
			owningmodel = true;
		}
		
		String filePathToUse = this.getFilePath();
		if ( filePathToUse==null){
			Plugin.INSTANCE.logWarning("SolverScip: no file path, write aborted");
			return;
		}
		EnumLpFileFormat fileFormat = this.getFileFormat();
		String extensionToUse = null;
		if ( fileFormat!=null ){
			extensionToUse = fileFormat.getFileExtension();
			filePathToUse = fileFormat.extendFilePath(filePathToUse, false);
		}

		try {
			String temp = extensionToUse==null ? "null" : extensionToUse;
			Plugin.INSTANCE.logError("SolverScip: writeLpToFile entensionUsed "+ temp);
			this.envScip.writeOrigProblem(this.consScip, filePathToUse, extensionToUse, false);
		}
		catch ( Exception e ){
			Plugin.INSTANCE.logError("SolverScip: writeLpToFile failed "+e);
		}
		
		if( owningmodel ){
			this.releaseLp();
		}
	}
	 
	/**
	 * <!-- begin-user-doc -->
	 * Release Scip structure
	 * <!-- end-user-doc -->
	 */
	private void releaseLp(){
		// Free memory
		if ( this.envScip!=null){
			try {
				this.envScip.free(this.consScip);
			} catch (NativeScipException e) {
				e.printStackTrace();
				Plugin.INSTANCE.logError("SolverScip: releaseLp failed, native scip exception "+e.getMessage());
			}

		}
		this.envScip = null;
//		this.envScipVar = null;
		this.envScipConsLinear = null;
		this.consScip = 0;
		this.vars = null;
		this.cons = null;
	}
	
	/**
     * Build the lp var
	 */
	@Override
	protected void buildLpVarImpl(GeneratorLpVar var) throws Exception {
		// get the var attributes
		float lb = var.getLowerBound();
		float ub = var.getUpperBound();
		int vartype = JniScipVartype.SCIP_VARTYPE_CONTINUOUS;
		if ( !this.isSolverLinearRelaxation() && var.getType()==EnumLpVarType.ENUM_LITERAL_LP_VAR_INTEGER)	{
			vartype = JniScipVartype.SCIP_VARTYPE_INTEGER;
		}
		String varname = var.getCode();
		// make the var
        long varNumber = this.envScip.createVarBasic(this.consScip, varname, lb, ub, 0.0, vartype);
        this.envScip.addVar(this.consScip, varNumber);
		this.vars.put((GeneratorLpVar)var, varNumber);
	}

	/**
     * Build the lp cons
	 */
	@Override
	protected void buildLpConsImpl(GeneratorElement element, GeneratorLpLinear linear, float rhs, EnumLpConsType type) throws Exception {
		// get the constraint attributes
		String rowname = element.getCode();
		float lb = rhs;
		float ub = rhs;
		switch (type ) {
		    case ENUM_LITERAL_LP_CONS_EQUAL:
		        break;
		    case ENUM_LITERAL_LP_CONS_BIGGER_OR_EQUAL:
		    	ub = Long.MAX_VALUE;
		        break;
		    case ENUM_LITERAL_LP_CONS_SMALLER_OR_EQUAL:
		    	lb = Long.MIN_VALUE;
		        break;
		    };  // switch on constraint type
		// get the terms
		int nofterms    = linear.getLpTerm().size();
		long vars[]     = new long[nofterms];
		double coeffs[] = new double[nofterms];
		int termindex = 0;
	    for ( GeneratorLpTerm lpterm : linear.getLpTerm())			{
		    GeneratorLpVar lpvar = lpterm.getLpVar();
		    vars  [termindex] = this.vars.get(lpvar);
		    coeffs[termindex] = lpterm.getCoeff();
	    	termindex++;
	    } // traverse the terms
	    
	    // makes the constraint
		long consnumber = this.envScipConsLinear.createConsBasicLinear(this.consScip, 
				                                                       rowname, 
				                                                       nofterms, 
				                                                       vars, 
				                                                       coeffs, 
				                                                       lb, 
				                                                       ub);
		this.cons.put(element, consnumber);
		this.envScip.addCons(this.consScip, consnumber); 
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
			    long varindex = this.vars.get(lpvar);
			    this.envScip.chgVarObj(this.consScip, varindex, coefficient);
			}
		}
	}
	
	private static  int SCIP_VERBLEVEL_NONE    = 0;          /**< only error and warning messages are displayed */
	private static  int SCIP_VERBLEVEL_DIALOG  = 1;          /**< only interactive dialogs, errors, and warnings are displayed */
	private static  int SCIP_VERBLEVEL_MINIMAL = 2;          /**< only important messages are displayed */
	private static  int SCIP_VERBLEVEL_NORMAL  = 3;          /**< standard messages are displayed */
	private static  int SCIP_VERBLEVEL_HIGH    = 4;          /**< a lot of information is displayed */
	private static  int SCIP_VERBLEVEL_FULL    = 5;          /**< all messages are displayed */

	/**
	 * <!-- begin-user-doc -->
	 * Load the lp from the generator into the Scip structure
	 * <!-- end-user-doc -->
	 */
	private void loadLp(){
		this.releaseLp(); // release the current model, if any
		
		Generator generator = this.getGenerator();
		int nofVars = generator.getFootprintNofVars();
		int nofCons = generator.getFootprintNofCons();
		if ( generator == null || nofVars==0 || nofCons==0 ) { return; }
		this.vars = new HashMap<GeneratorLpVar, Long>();
		this.cons = new HashMap<GeneratorElement, Long>();
		
		try {
			this.envScip = new JniScip();
//			this.envScipVar = new JniScipVar();
			this.envScipConsLinear = new JniScipConsLinear();
			
			this.consScip = this.envScip.create();
			
			this.envScip.printVersion(this.consScip, 0);
			
			// set message handler of SCIP quiet (as a result SCIP does not produce any output to stdout and stderr)
			this.envScip.setMessagehdlrQuiet(this.consScip, false);
//			long messageHandler = 0;
//			this.envScip.setMessagehdlr(this.consScip, messageHandler);
			/* write all SCIP output to log file */
//			this.envScip.setMessagehdlrLogfile(this.consScip, null);

			// set logging level
//			# verbosity level of output
//			# [type: int, range: [0,5], default: 4]
//			display/verblevel = 4
			int messagelevel = SCIP_VERBLEVEL_HIGH;
			switch ( this.getSolverLogLevel()) {
		    case ENUM_NONE:   messagelevel = SCIP_VERBLEVEL_NONE; break;
		    case ENUM_MIN:    messagelevel = SCIP_VERBLEVEL_MINIMAL; break;
		    case ENUM_NORMAL: messagelevel = SCIP_VERBLEVEL_NORMAL;  break;
		    case ENUM_FULL:   messagelevel = SCIP_VERBLEVEL_FULL; break;
		    }  
			this.envScip.setIntParam(this.consScip, "display/verblevel", messagelevel);

			/* include default plugins od f SCIP */
			this.envScip.includeDefaultPlugins(this.consScip);

			// create the problem
			this.envScip.createProbBasic(this.consScip, generator.getCode());

			this.buildVars();
			this.buildCons();
			this.buildGoals();
			
			// should happen somewhere
			for ( long consNumber : this.cons.values()){
				// decreases usage counter of constraint, if the usage pointer reaches zero the constraint gets freed
				this.envScip.releaseCons(this.consScip, consNumber); // why is this necessary?
			}
			Plugin.INSTANCE.logInfo("SolverScip: lp built ");

		}
		catch (Exception e) {
			e.printStackTrace();
			Plugin.INSTANCE.logError("SolverScip: load failed, exception "+e.getMessage());
			this.releaseLp();
		}
		catch (Throwable t) {
			t.printStackTrace();
			Plugin.INSTANCE.logError("SolverScip: load failed, throwable "+t.getMessage());
			this.releaseLp();
		}
	} // method lp load
	
	/**
	 * <!-- begin-user-doc -->
	 * Solve the lp with Scip the linear formulation provided by the Generator
	 * <!-- end-user-doc -->
	 */
	@Override
	protected void solveSolver() {

		this.loadLp();
		if ( this.envScip==null ) { return; }

		this.onInitializationEnd();
		
		if ( this.isSolverDump()){
			this.writeLpToFile();
		}
		
		int solveStatus = JniScipStatus.SCIP_STATUS_UNKNOWN;
		try  {
			// set the optimality tolerance
//			# solving stops, if the relative gap = |primal - dual|/MIN(|dual|,|primal|) is below the given value
//			# [type: real, range: [0,1.79769313486232e+308], default: 0]
//			limits/gap = 0			
			this.envScip.setRealParam(this.consScip, "limits/gap", this.getSolverOptimalityTolerance());
			// time limit
//			# maximal time in seconds to run
//			# [type: real, range: [0,1e+20], default: 1e+20]
//			limits/time = 1e+20
			this.envScip.setRealParam(this.consScip, "limits/time", this.getSolverMaxDuration());

			// do the solving
			this.envScip.presolve(this.consScip); // necessary?
			Plugin.INSTANCE.logInfo("SolverScip: presolved ");

			this.envScip.solve(this.consScip);
			solveStatus   = this.envScip.getStatus(this.consScip);
			Plugin.INSTANCE.logInfo("SolverScip: intopt returned "+getSolveStatusDescription(solveStatus));
		}
		catch (Exception e)		{
			Plugin.INSTANCE.logError("SolverScip: solve failed "+e);
		}
		this.onSolvingEnd();
		
		// do something with the solution, if any
		boolean feasible   = false;
		boolean unfeasible = false;
		boolean optimal    = false;
		double  mipvalue = 0.0;
		double  mipgap   = 0.0;

		try  {
			switch( solveStatus){
			case JniScipStatus.SCIP_STATUS_OPTIMAL:
				feasible = true;
				optimal = true;
				break;
			case JniScipStatus.SCIP_STATUS_INFEASIBLE:
				unfeasible = true;
				break;
			case JniScipStatus.SCIP_STATUS_USERINTERRUPT:
			case JniScipStatus.SCIP_STATUS_NODELIMIT:
			case JniScipStatus.SCIP_STATUS_TOTALNODELIMIT:
			case JniScipStatus.SCIP_STATUS_STALLNODELIMIT:
			case JniScipStatus.SCIP_STATUS_TIMELIMIT:
			case JniScipStatus.SCIP_STATUS_MEMLIMIT:
			case JniScipStatus.SCIP_STATUS_GAPLIMIT:
			case JniScipStatus.SCIP_STATUS_SOLLIMIT:
			case JniScipStatus.SCIP_STATUS_BESTSOLLIMIT:
			case JniScipStatus.SCIP_STATUS_RESTARTLIMIT:
				feasible = this.envScip.getNSols(this.consScip)>0;
				break;
			case JniScipStatus.SCIP_STATUS_UNKNOWN:
			case JniScipStatus.SCIP_STATUS_UNBOUNDED:
			case JniScipStatus.SCIP_STATUS_INFORUNBD:
			}

			if ( feasible || this.isSolverLinearRelaxation()) {
				// get the solution values
				long solveSolution = this.envScip.getBestSol(this.consScip);
				mipvalue = this.envScip.getSolOrigObj(this.consScip, solveSolution);
				mipgap   = this.envScip.getGap(	this.consScip);	
				if ( optimal) { mipgap = 0.0; }
				// construct a solution
				SolutionLp newSolution = (SolutionLp) this.constructSolution();
				newSolution.setValue((float)mipvalue);
				for ( Map.Entry<GeneratorLpVar, Long> varentry : vars.entrySet())	{
					long varindex = varentry.getValue();
					GeneratorLpVar lpvar = varentry.getKey();
					double optimalvalue = this.envScip.getSolVal(this.consScip, solveSolution, varindex);
					if ( Math.abs(optimalvalue)>0.00001){
						SolutionVar solvervar = newSolution.constructSolutionVar(lpvar);
						solvervar.setOptimalValue((float)optimalvalue);
					}
				} // traverse the vars
				this.makeSolutionGoals(newSolution);
			}
		}
		catch (Exception e)		{
			Plugin.INSTANCE.logError("SolverScip: get/makeSolution failed "+e);
		}
		this.setSolFeasible(feasible);
		this.setSolUnfeasible(unfeasible);
		this.setSolOptimal(optimal);
		this.setSolValue((float)mipvalue);
		this.setSolOptimalityGap((float)mipgap);
		
		// release the lp
		this.releaseLp();
		
	} // method SolveLp

	/**
	 * Return the description of a given scip return code
	 * @param rc
	 * @return
	 */
	static private String getSolveRcDescription(int rc){
		switch (rc){
	    case JniScipRetcode.SCIP_OKAY:    
	    	return "normal termination";
		case JniScipRetcode.SCIP_ERROR:
			return "unspecified error";
		case JniScipRetcode.SCIP_NOMEMORY:
			return "insufficient memory error";
		case JniScipRetcode.SCIP_READERROR:
			return "read error";
		case JniScipRetcode.SCIP_WRITEERROR:
			return "write error";
		case JniScipRetcode.SCIP_NOFILE:
			return "file not found error";
		case JniScipRetcode.SCIP_FILECREATEERROR:
			return "cannot create file";
		case JniScipRetcode.SCIP_LPERROR:
			return "error in LP solver";
		case JniScipRetcode.SCIP_NOPROBLEM:
			return "no problem exists";
		case JniScipRetcode.SCIP_INVALIDCALL:
			return "method cannot be called at this time in solution process";
		case JniScipRetcode.SCIP_INVALIDDATA:
			return "error in input data";
		case JniScipRetcode.SCIP_INVALIDRESULT:
			return "method returned an invalid result code";
		case JniScipRetcode.SCIP_PLUGINNOTFOUND:
			return "a required plugin was not found";
		case JniScipRetcode.SCIP_PARAMETERUNKNOWN:
			return "the parameter with the given name was not found";
		case JniScipRetcode.SCIP_PARAMETERWRONGTYPE:
			return "the parameter is not of the expected type";
		case JniScipRetcode.SCIP_PARAMETERWRONGVAL:
			return "the value is invalid for the given parameter";
		case JniScipRetcode.SCIP_KEYALREADYEXISTING:
			return "the given key is already existing in table";
		case JniScipRetcode.SCIP_MAXDEPTHLEVEL:
			return "maximal branching depth level exceeded";
		case JniScipRetcode.SCIP_BRANCHERROR:
			return "no branching could be created";
		default:
			return "unknown return code "+rc;
		}
	}

	/**
	 * Returs the description of a given status code
	 * @param rc
	 * @return
	 */
	static private String getSolveStatusDescription(int rc){
		switch (rc){
		case JniScipStatus.SCIP_STATUS_UNKNOWN: 	
			return "the solving status is not yet known";
		case JniScipStatus.SCIP_STATUS_USERINTERRUPT: 	
			return "the user interrupted the solving process (by pressing CTRL-C)";
		case JniScipStatus.SCIP_STATUS_NODELIMIT: 	
			return "the solving process was interrupted because the node limit was reached";
		case JniScipStatus.SCIP_STATUS_TOTALNODELIMIT: 	
			return "the solving process was interrupted because the total node limit was reached (incl. restarts)";
		case JniScipStatus.SCIP_STATUS_STALLNODELIMIT: 	
			return "the solving process was interrupted because the stalling node limit was reached (no inprovement w.r.t. primal bound)";
		case JniScipStatus.SCIP_STATUS_TIMELIMIT: 	
			return "the solving process was interrupted because the time limit was reached";
		case JniScipStatus.SCIP_STATUS_MEMLIMIT: 	
			return "the solving process was interrupted because the memory limit was reached";
		case JniScipStatus.SCIP_STATUS_GAPLIMIT: 	
			return "the solving process was interrupted because the gap limit was reached";
		case JniScipStatus.SCIP_STATUS_SOLLIMIT: 	
			return "the solving process was interrupted because the solution limit was reached";
		case JniScipStatus.SCIP_STATUS_BESTSOLLIMIT: 	
			return "the solving process was interrupted because the solution improvement limit was reached";
		case JniScipStatus.SCIP_STATUS_RESTARTLIMIT: 	
			return "the solving process was interrupted because the restart limit was reached";
		case JniScipStatus.SCIP_STATUS_OPTIMAL: 	
			return "the problem was solved to optimality, an optimal solution is available";
		case JniScipStatus.SCIP_STATUS_INFEASIBLE: 	
			return "the problem was proven to be infeasible";
		case JniScipStatus.SCIP_STATUS_UNBOUNDED: 	
			return "the problem was proven to be unbounded";
		case JniScipStatus.SCIP_STATUS_INFORUNBD: 	
			return "the problem was proven to be either infeasible or unbounded";
		default:
			return "unknown status code "+rc;
		}
	}
} //SolverScipImpl
