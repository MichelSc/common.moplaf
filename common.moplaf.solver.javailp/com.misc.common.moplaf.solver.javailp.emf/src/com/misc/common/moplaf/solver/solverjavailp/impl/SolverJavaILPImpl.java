/**
 */
package com.misc.common.moplaf.solver.solverjavailp.impl;


import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;

import com.misc.common.moplaf.common.ReturnFeedback;
import com.misc.common.moplaf.solver.EnumLpConsType;
import com.misc.common.moplaf.solver.EnumLpFileFormat;
import com.misc.common.moplaf.solver.EnumLpVarType;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorElement;
import com.misc.common.moplaf.solver.GeneratorLpLinear;
import com.misc.common.moplaf.solver.GeneratorLpTerm;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.GeneratorTuple;
import com.misc.common.moplaf.solver.GeneratorVar;
import com.misc.common.moplaf.solver.ILpWriter;
import com.misc.common.moplaf.solver.ITupleVisitor;
import com.misc.common.moplaf.solver.Plugin;
import com.misc.common.moplaf.solver.SolutionLp;
import com.misc.common.moplaf.solver.SolutionVar;
import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.common.moplaf.solver.impl.SolverLpImpl;
import com.misc.common.moplaf.solver.solverjavailp.SolverJavaILP;
import com.misc.common.moplaf.solver.solverjavailp.SolverJavaILPType;
import com.misc.common.moplaf.solver.solverjavailp.SolverjavailpPackage;

import net.sf.javailp.Linear;
import net.sf.javailp.OptType;
import net.sf.javailp.Problem;
import net.sf.javailp.Result;
import net.sf.javailp.Solver;
import net.sf.javailp.SolverFactory;
import net.sf.javailp.SolverFactoryCPLEX;
import net.sf.javailp.SolverFactoryGLPK;
import net.sf.javailp.SolverFactoryGurobi;
import net.sf.javailp.SolverFactoryLpSolve;
import net.sf.javailp.SolverFactoryMiniSat;
import net.sf.javailp.SolverFactoryMosek;
import net.sf.javailp.SolverFactorySAT4J;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solver Java ILP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.solverjavailp.impl.SolverJavaILPImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverjavailp.impl.SolverJavaILPImpl#getFileFormat <em>File Format</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverjavailp.impl.SolverJavaILPImpl#isFileCompressed <em>File Compressed</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverjavailp.impl.SolverJavaILPImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverJavaILPImpl extends SolverLpImpl implements SolverJavaILP {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SolverJavaILPType TYPE_EDEFAULT = SolverJavaILPType.GLPK;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SolverJavaILPType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverJavaILPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverjavailpPackage.Literals.SOLVER_JAVA_ILP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_PATH, oldFilePath, filePath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_FORMAT, oldFileFormat, fileFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_COMPRESSED, oldFileCompressed, fileCompressed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverJavaILPType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SolverJavaILPType newType) {
		SolverJavaILPType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverjavailpPackage.SOLVER_JAVA_ILP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void writeLpToFile() {
		String modelasstring = this.getLpAsString();
		String filepath      = this.getFilePath();
		try {
			FileOutputStream output = new FileOutputStream(filepath);
			output.write(modelasstring.getBytes());
			output.flush();
			output.close();
		} catch (Exception e) {
			Plugin.INSTANCE.logError("Solver: error dump lp"+e.toString());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getLpAsString() {
		boolean owningmodel = false;
		if ( this.problem==null){
			this.loadLp();
			owningmodel = true;
		}
		
		String toreturn = this.problem.toString();
		
		if( owningmodel ){
			this.releaseLp();
		}
		
		return toreturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_PATH:
				return getFilePath();
			case SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_FORMAT:
				return getFileFormat();
			case SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_COMPRESSED:
				return isFileCompressed();
			case SolverjavailpPackage.SOLVER_JAVA_ILP__TYPE:
				return getType();
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
			case SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_PATH:
				setFilePath((String)newValue);
				return;
			case SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_FORMAT:
				setFileFormat((EnumLpFileFormat)newValue);
				return;
			case SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_COMPRESSED:
				setFileCompressed((Boolean)newValue);
				return;
			case SolverjavailpPackage.SOLVER_JAVA_ILP__TYPE:
				setType((SolverJavaILPType)newValue);
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
			case SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_PATH:
				setFilePath(FILE_PATH_EDEFAULT);
				return;
			case SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_FORMAT:
				setFileFormat(FILE_FORMAT_EDEFAULT);
				return;
			case SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_COMPRESSED:
				setFileCompressed(FILE_COMPRESSED_EDEFAULT);
				return;
			case SolverjavailpPackage.SOLVER_JAVA_ILP__TYPE:
				setType(TYPE_EDEFAULT);
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
			case SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
			case SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_FORMAT:
				return fileFormat != FILE_FORMAT_EDEFAULT;
			case SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_COMPRESSED:
				return fileCompressed != FILE_COMPRESSED_EDEFAULT;
			case SolverjavailpPackage.SOLVER_JAVA_ILP__TYPE:
				return type != TYPE_EDEFAULT;
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
				case SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_PATH: return SolverPackage.ILP_WRITER__FILE_PATH;
				case SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_FORMAT: return SolverPackage.ILP_WRITER__FILE_FORMAT;
				case SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_COMPRESSED: return SolverPackage.ILP_WRITER__FILE_COMPRESSED;
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
				case SolverPackage.ILP_WRITER__FILE_PATH: return SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_PATH;
				case SolverPackage.ILP_WRITER__FILE_FORMAT: return SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_FORMAT;
				case SolverPackage.ILP_WRITER__FILE_COMPRESSED: return SolverjavailpPackage.SOLVER_JAVA_ILP__FILE_COMPRESSED;
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
				case SolverPackage.ILP_WRITER___WRITE_LP_TO_FILE: return SolverjavailpPackage.SOLVER_JAVA_ILP___WRITE_LP_TO_FILE;
				case SolverPackage.ILP_WRITER___GET_LP_AS_STRING: return SolverjavailpPackage.SOLVER_JAVA_ILP___GET_LP_AS_STRING;
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
			case SolverjavailpPackage.SOLVER_JAVA_ILP___WRITE_LP_TO_FILE:
				writeLpToFile();
				return null;
			case SolverjavailpPackage.SOLVER_JAVA_ILP___GET_LP_AS_STRING:
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
		result.append(", Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Integrates GLPK in the framework
	 * <!-- end-user-doc -->
	 */
    // private declarations
	private Problem problem = null;
	SolverFactory factory = null;
	 
	private void releaseLp(){
		// Free memory
		this.problem = null;
		this.factory = null;
	}
	
	
	/**
     * Build the lp var
	 */
	@Override
	protected void buildLpVarImpl(GeneratorLpVar var) throws Exception {
		if ( !SolverJavaILPImpl.this.isSolverLinearRelaxation() 
		 && var.getType()==EnumLpVarType.ENUM_LITERAL_LP_VAR_INTEGER)	{
			problem.setVarType(var.getCode(), Integer.class);
		}
		float lowerbound = var.getLowerBound();
		if ( lowerbound>=0 ) {
			problem.setVarLowerBound(var.getCode(), lowerbound);
		}
		float upperbound = var.getUpperBound();
		problem.setVarUpperBound(var.getCode(), upperbound);
	}

	/**
     * Build the lp cons
	 */
	@Override
	protected void buildLpConsImpl(GeneratorElement element, GeneratorLpLinear linear, float rhs, EnumLpConsType type) throws Exception {
		Linear linearconstraint = new Linear();
	    for ( GeneratorLpTerm lpterm : linear.getLpTerm())			{
		    GeneratorLpVar lpvar = lpterm.getLpVar();
			linearconstraint.add(lpterm.getCoeff(), lpterm.getLpVar().getCode());
	    } // traverse the terms
		String sense = "<=";
		switch ( type ) {
	    case ENUM_LITERAL_LP_CONS_EQUAL:
	        sense = "=";
	        break;
	    case ENUM_LITERAL_LP_CONS_BIGGER_OR_EQUAL:
	        sense = ">=";
	        break;
	    case ENUM_LITERAL_LP_CONS_SMALLER_OR_EQUAL:
	        sense = "<=";
	        break;
	    }  // switch on constraint type
		problem.add(element.getCode(), linearconstraint, sense, rhs);
	}

	/**
     * Build the lp goal term
	 */
	@Override
	protected void buildLpGoalTermImpl(GeneratorLpVar var, float coefficient) throws Exception {
		this.problem.getObjective().add(coefficient, var.getCode());
	}

	/**
     * Load the lp
	 */
	private void loadLp(){
		this.releaseLp(); // release the current model, if any

		Generator generator = this.getGenerator();
		if ( generator == null) { return; }
		
		try {
		    // solver initialization
			this.factory = null;
			switch (this.getType() ) {
		    case GLPK:
				this.factory = new SolverFactoryGLPK();
				break;
		    case CPLEX:
				this.factory = new SolverFactoryCPLEX();
		        break;
		    case GUROBI:
				this.factory = new SolverFactoryGurobi();
		        break;
		    case LP_SOLVE:
				this.factory = new SolverFactoryLpSolve(); 
		        break;
		    case MINI_SAT:
				this.factory = new SolverFactoryMiniSat(); 
		        break;
		    case MOSEK:
				this.factory = new SolverFactoryMosek(); 
		        break;
		    case SAT4J:
				this.factory = new SolverFactorySAT4J(); 
		        break;
		    }  // switch on solver type
			
			this.factory.setParameter(Solver.VERBOSE, 1); 
			this.factory.setParameter(Solver.TIMEOUT, this.getSolverMaxDuration()); 
	
			// problem initialization
			this.problem = new Problem();
			
			Linear linearobjective = new Linear();
			this.problem.setObjective(linearobjective, OptType.MIN);
			
			this.buildCons();
			this.buildGoals();
			this.buildVars();
			
		} 
		catch (Exception e) {
			Plugin.INSTANCE.logError("SolverJavaILP: load failed "+e);
		} 
	} // method lp load
	
	@Override
	public ReturnFeedback solveImpl() {
		
		Generator generator = this.getGenerator();

		// load the lp
		this.loadLp();
		if ( this.problem==null ) { 
		return new ReturnFeedback(false, "SolverJavaILP.solve: no lp"); 
	}

		this.onInitializationEnd();
		
		if ( this.isSolverDump()) {
			this.writeLpToFile();
		}

		// solve
		try {
			Solver solver = this.factory.get();
			final Result result = solver.solve(this.problem);
			
			this.onSolvingEnd();
			
			boolean feasible   = false;
			boolean unfeasible = false;
			boolean optimal    = false;
			float   objective  = 0.0f;

			// do something with the solution
			if ( result != null ) {
				feasible = true; 
				optimal  = true;
				objective = result.getObjective().floatValue();
				
				class VarSolProvider implements ITupleVisitor{
					private SolutionLp solution;
					public VarSolProvider(SolutionLp asolution){
						this.solution = asolution;
					} // constructor
					@Override
					public void visitTuple(GeneratorTuple tuple) {
						for ( GeneratorVar var : tuple.getVar()){
							Number optimalvalue = result.getPrimalValue(var.getCode());
							if ( optimalvalue == null ){
							}
							else {
								SolutionVar solvervar = this.solution.constructSolutionVar(var);
								float floatoptimalvalue = optimalvalue.floatValue();
								if ( floatoptimalvalue!=0.0f) {
									solvervar.setOptimalValue(floatoptimalvalue);
								}
							}
						} // traverse the vars in the tuple
					}  // visit the tuple
				}; // class visitor
				SolutionLp newSolution = (SolutionLp)this.constructSolution();
				VarSolProvider varsolprovider = new VarSolProvider(newSolution);
				generator.visitTuples(varsolprovider);
				newSolution.setValue(objective);
				this.makeSolutionGoals(newSolution);
			}  // there is a result
		
		this.setSolFeasible(feasible);
		this.setSolUnfeasible(unfeasible);
		this.setSolOptimal(optimal);
		this.setSolValue(objective);
		}
		catch (Exception e) {
			e.printStackTrace();
			Plugin.INSTANCE.logError("SolverJavaILP: load failed "+e);
			return new ReturnFeedback("SolverJavaILP.solve", e);
		}
		
		// release the lp
		this.releaseLp();
		
		return ReturnFeedback.SUCCESS;
		
	} // method SolveLp
	
	
} //SolverJavaILPImpl
