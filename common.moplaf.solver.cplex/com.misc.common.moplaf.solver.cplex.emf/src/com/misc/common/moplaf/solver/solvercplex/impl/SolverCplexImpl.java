/**
 */
package com.misc.common.moplaf.solver.solvercplex.impl;

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
import com.misc.common.moplaf.solver.GeneratorCons;
import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpGoal;
import com.misc.common.moplaf.solver.GeneratorLpGoalTerm;
import com.misc.common.moplaf.solver.GeneratorLpTerm;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.GeneratorTuple;
import com.misc.common.moplaf.solver.GeneratorVar;
import com.misc.common.moplaf.solver.ILpWriter;
import com.misc.common.moplaf.solver.ITupleVisitor;
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
	private Map<GeneratorLpCons, IloRange> cons;
//	private String actualfilepath = null;
	 
	private void releaseLp(){
		this.lp = null;
		this.vars = null;
		this.cons = null;
	}
	
	private void initSolution(){
		try {
			//this.lp.addMIPStart();
			Solution initialSolution = this.getInitialSolution();
			int nofVars = initialSolution.getVar().size();
			IloNumVar[] varsArray   = new IloNumVar[nofVars];
			double[]    valuesArray = new double[nofVars];
			int i = 0;
			for ( SolutionVar varSol : this.getInitialSolution().getVar()){
				float optimalValue = varSol.getOptimalValue();
			    IloNumVar cplexvar = vars.get(varSol.getVar());
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


	private void loadLp(){
		this.releaseLp(); // release the current model, if any
		Generator generator = this.getGenerator();
		if ( generator == null) { return; }
		try {
			this.lp = new IloCplex();
			
			// map the variables
			this.vars = new HashMap<GeneratorLpVar, IloNumVar>();
			class VarMapper implements ITupleVisitor{
				@Override
				public void visitTuple(GeneratorTuple tuple) throws IloException {
					for ( GeneratorVar var : tuple.getVar()){
						if ( !(var  instanceof GeneratorLpVar)){
							throw new UnsupportedOperationException("Variable type not supported by solver: "+var.eClass().getName());
						}
						GeneratorLpVar lpvar = (GeneratorLpVar)var;
						IloNumVarType vartypetobe = IloNumVarType.Float; 
						if ( !SolverCplexImpl.this.isSolverLinearRelaxation() && lpvar.getType()==EnumLpVarType.ENUM_LITERAL_LP_VAR_INTEGER){
							vartypetobe = IloNumVarType.Int; 
						}
						float lb = lpvar.getLowerBound();
						float ub = lpvar.getUpperBound();
						String name = lpvar.getCode();
						// create the var
						IloNumVar cplexvar = SolverCplexImpl.this.lp.numVar(lb, ub, vartypetobe, name);
						SolverCplexImpl.this.vars.put(lpvar, cplexvar);
					}  // traverse the vars of the tuple
				}  // method visitTuple
			}; // VarMapper
			VarMapper varmapper = new VarMapper();
			generator.visitTuples(varmapper);
			
			// objective expression
			final IloLinearNumExpr objective = this.lp.linearNumExpr();
			
			GeneratorLpGoal goal = (GeneratorLpGoal) this.getGoalToSolve();
			if ( goal != null) {
				for ( GeneratorLpGoalTerm goalTerm : goal.getLpGoalTerm()){
					// create the objective coefficient
					GeneratorLpVar lpvar = goalTerm.getLpVar();
					float coefficient = goalTerm.getCoeff();
					if ( coefficient!=0.0f){
					    IloNumVar cplexvar = vars.get(lpvar);
						objective.addTerm(coefficient, cplexvar);
					}
				}
				if ( goal.getObjectiveType()==EnumObjectiveType.MINIMUM){
					this.lp.addMinimize(objective);
				} else if ( goal.getObjectiveType()==EnumObjectiveType.MAXIMUM){
					this.lp.addMaximize(objective);
				}
			}
				
			// map the constraints
			this.cons = new HashMap<GeneratorLpCons, IloRange>();
			class ConsMapper implements ITupleVisitor{
				@Override
				public void visitTuple(GeneratorTuple tuple) throws IloException {
					for ( GeneratorCons cons : tuple.getCons()){
						if ( !(cons instanceof GeneratorLpCons)){
							throw new UnsupportedOperationException("Constraint type not supported by solver: "+cons.eClass().getName());
						}
						GeneratorLpCons lpcons = (GeneratorLpCons)cons;
						IloLinearNumExpr expr = SolverCplexImpl.this.lp.linearNumExpr();
					    for ( GeneratorLpTerm lpterm : lpcons.getLpTerm())			{
						    GeneratorLpVar lpvar = lpterm.getLpVar();
						    IloNumVar cplexvar = vars.get(lpvar);
						    float coefficient = lpterm.getCoeff();
						    expr.addTerm(coefficient, cplexvar);;
					    } // traverse the terms
					    IloRange range = null;
					    float rhs = lpcons.getRighHandSide();
						switch (lpcons.getType() ) {
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
					    range.setName(lpcons.getCode());
						SolverCplexImpl.this.cons.put(lpcons, range);
					}
				}
			}; // class ConsMapper
			ConsMapper consmapper = new ConsMapper();
			generator.visitTuples(consmapper);

			// create the problem in Cplex
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
	
	/*
	 * Writes the active model to the file specified by filename.
		The file format is determined by the extension of the filename. 
		The following extensions are recognized on most platforms:
			.sav
			.mps
			.lp
			.sav.gz (if gzip is properly installed)
			.mps.gz (if gzip is properly installed)
			.lp.gz (if gzip is properly installed)
			.bz2 (if bzip2 is properly installed)
	 */
	public void writeLpToFile() {
		this.loadLp();
		this.writeLpToFilePrivate();
		this.releaseLp();
	}

	private void writeLpToFilePrivate() {
		String filepath = this.getFilePath();
		if ( filepath==null){
			Plugin.INSTANCE.logWarning("SolverCplex: no file path, write aborted");
			return;
		}
		
		// get the extension as is
		int lastdot = filepath.lastIndexOf('.');
		int lastslash = filepath.lastIndexOf('/');
		String extension = "";
		if ( lastdot>=0 && lastdot>lastslash ){
			extension = filepath.substring(lastdot+1);
		}
		
		// augment file path with extension, if no extension present
		if ( extension.length()==0){
			switch (this.getFileFormat() ) {
		    case FILE_FORMAT_MPS:
				filepath = filepath+".mps";
		        break;
		    case FILE_FORMAT_GAMS:
		    	break;
		    case FILE_FORMAT_LP:
				filepath = filepath+".lp";
		        break;
		    case FILE_FORMAT_SAV:
		    default:
				filepath = filepath+".sav";
		        break;
		    }  // switch on format type
		}
		
		// augment the file path with ".gz", if compressed and the extension is not already this
		if ( this.isFileCompressed() ){
			if ( !extension.equals(".gz")){
				filepath = filepath+".gz";
			}
		}
		try {
			Plugin.INSTANCE.logInfo("SolverCplex: write to file "+filepath);
			this.lp.exportModel(filepath);
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
	public void solveSolver() {

		// load the lp
		this.loadLp();
		if ( this.lp==null ) { return; }
		
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
			if ( this.isSolverLinearRelaxation() ) {
				Plugin.INSTANCE.logInfo("SolverCplex: continuous solve returned ");
			} // if linear relaxed
			else {
				Plugin.INSTANCE.logInfo("SolverCplex: mip solver returned");
				SolverCplexCallbackMIPInfo callback = new SolverCplexCallbackMIPInfo();
				this.lp.use(callback);
				feasible = this.lp.solve(); 
				status = this.lp.getStatus();
			} // if mip
		}
		catch (Exception e)		{
			Plugin.INSTANCE.logError("SolverCplex: solve failed "+e);
		}
		
		this.onSolvingEnd();
		
		// do something with the solution
		boolean unfeasible = false;
		boolean optimal    = false;
		float   goalvalue  = 0.0f;
		float   mipgap     = 0.0f;
		
		if      ( status == Status.Optimal)    { optimal = true; }
		else if ( status == Status.Infeasible) { unfeasible = true; }
		if ( feasible ) {
			try {
				goalvalue = (float) this.lp.getObjValue();
				SolutionLp newSolution = (SolutionLp) this.constructSolution();
				newSolution.setGoalValue(goalvalue);
				mipgap    = (float) this.lp.getMIPRelativeGap();
				for ( Map.Entry<GeneratorLpVar, IloNumVar> varentry : vars.entrySet())	{
					IloNumVar cplexvar = varentry.getValue();
					GeneratorLpVar lpvar = varentry.getKey();
					float optimalvalue;
						optimalvalue = (float) this.lp.getValue(cplexvar);
					if ( Math.abs(optimalvalue)>0.00001){
						SolutionVar solvervar = newSolution.constructSolutionVar(lpvar);
						solvervar.setOptimalValue(optimalvalue);
					}
				} // traverse the vars
			} 
			catch (IloException e) {
			}
			if ( optimal) {
				mipgap = 0.0f; // michel 20160415: not sure this is correct
			}
		}
		this.setSolFeasible(feasible);
		this.setSolUnfeasible(unfeasible);
		this.setSolOptimal(optimal);
		this.setSolValue(goalvalue);
		this.setSolOptimalityGap(mipgap);
		
		// release the lp
		this.releaseLp();
		
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


