/**
 */
package com.misc.common.moplaf.solver.solverglpk.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gnu.glpk.GLPK;
import org.gnu.glpk.GLPKConstants;
import org.gnu.glpk.GlpkCallback;
import org.gnu.glpk.GlpkCallbackListener;
import org.gnu.glpk.SWIGTYPE_p_double;
import org.gnu.glpk.SWIGTYPE_p_int;
import org.gnu.glpk.glp_iocp;
import org.gnu.glpk.glp_prob;
import org.gnu.glpk.glp_smcp;
import org.gnu.glpk.glp_tree;

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
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionLp;
import com.misc.common.moplaf.solver.SolutionVar;
import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.common.moplaf.solver.impl.SolverLpImpl;
import com.misc.common.moplaf.solver.solverglpk.SolverGLPK;
import com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solver GLPK</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKImpl#getFileFormat <em>File Format</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKImpl#isFileCompressed <em>File Compressed</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKImpl#isEnableFeasibilityPump <em>Enable Feasibility Pump</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKImpl#isEnableGomoryCuts <em>Enable Gomory Cuts</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKImpl#isEnableGeneratingMixedCoverCuts <em>Enable Generating Mixed Cover Cuts</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKImpl#isEnableGeneratingCliqueCuts <em>Enable Generating Clique Cuts</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.solverglpk.impl.SolverGLPKImpl#isEnableMixedIntegerRoundingCuts <em>Enable Mixed Integer Rounding Cuts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolverGLPKImpl extends SolverLpImpl implements SolverGLPK {
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
	 * The default value of the '{@link #isEnableFeasibilityPump() <em>Enable Feasibility Pump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableFeasibilityPump()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_FEASIBILITY_PUMP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableFeasibilityPump() <em>Enable Feasibility Pump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableFeasibilityPump()
	 * @generated
	 * @ordered
	 */
	protected boolean enableFeasibilityPump = ENABLE_FEASIBILITY_PUMP_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableGomoryCuts() <em>Enable Gomory Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableGomoryCuts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_GOMORY_CUTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableGomoryCuts() <em>Enable Gomory Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableGomoryCuts()
	 * @generated
	 * @ordered
	 */
	protected boolean enableGomoryCuts = ENABLE_GOMORY_CUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableGeneratingMixedCoverCuts() <em>Enable Generating Mixed Cover Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableGeneratingMixedCoverCuts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_GENERATING_MIXED_COVER_CUTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableGeneratingMixedCoverCuts() <em>Enable Generating Mixed Cover Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableGeneratingMixedCoverCuts()
	 * @generated
	 * @ordered
	 */
	protected boolean enableGeneratingMixedCoverCuts = ENABLE_GENERATING_MIXED_COVER_CUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableGeneratingCliqueCuts() <em>Enable Generating Clique Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableGeneratingCliqueCuts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_GENERATING_CLIQUE_CUTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableGeneratingCliqueCuts() <em>Enable Generating Clique Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableGeneratingCliqueCuts()
	 * @generated
	 * @ordered
	 */
	protected boolean enableGeneratingCliqueCuts = ENABLE_GENERATING_CLIQUE_CUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableMixedIntegerRoundingCuts() <em>Enable Mixed Integer Rounding Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableMixedIntegerRoundingCuts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_MIXED_INTEGER_ROUNDING_CUTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableMixedIntegerRoundingCuts() <em>Enable Mixed Integer Rounding Cuts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableMixedIntegerRoundingCuts()
	 * @generated
	 * @ordered
	 */
	protected boolean enableMixedIntegerRoundingCuts = ENABLE_MIXED_INTEGER_ROUNDING_CUTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolverGLPKImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverglpkPackage.Literals.SOLVER_GLPK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverglpkPackage.SOLVER_GLPK__FILE_PATH, oldFilePath, filePath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverglpkPackage.SOLVER_GLPK__FILE_FORMAT, oldFileFormat, fileFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolverglpkPackage.SOLVER_GLPK__FILE_COMPRESSED, oldFileCompressed, fileCompressed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableFeasibilityPump() {
		return enableFeasibilityPump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableFeasibilityPump(boolean newEnableFeasibilityPump) {
		boolean oldEnableFeasibilityPump = enableFeasibilityPump;
		enableFeasibilityPump = newEnableFeasibilityPump;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverglpkPackage.SOLVER_GLPK__ENABLE_FEASIBILITY_PUMP, oldEnableFeasibilityPump, enableFeasibilityPump));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableGomoryCuts() {
		return enableGomoryCuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableGomoryCuts(boolean newEnableGomoryCuts) {
		boolean oldEnableGomoryCuts = enableGomoryCuts;
		enableGomoryCuts = newEnableGomoryCuts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverglpkPackage.SOLVER_GLPK__ENABLE_GOMORY_CUTS, oldEnableGomoryCuts, enableGomoryCuts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableGeneratingMixedCoverCuts() {
		return enableGeneratingMixedCoverCuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableGeneratingMixedCoverCuts(boolean newEnableGeneratingMixedCoverCuts) {
		boolean oldEnableGeneratingMixedCoverCuts = enableGeneratingMixedCoverCuts;
		enableGeneratingMixedCoverCuts = newEnableGeneratingMixedCoverCuts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverglpkPackage.SOLVER_GLPK__ENABLE_GENERATING_MIXED_COVER_CUTS, oldEnableGeneratingMixedCoverCuts, enableGeneratingMixedCoverCuts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableGeneratingCliqueCuts() {
		return enableGeneratingCliqueCuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableGeneratingCliqueCuts(boolean newEnableGeneratingCliqueCuts) {
		boolean oldEnableGeneratingCliqueCuts = enableGeneratingCliqueCuts;
		enableGeneratingCliqueCuts = newEnableGeneratingCliqueCuts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverglpkPackage.SOLVER_GLPK__ENABLE_GENERATING_CLIQUE_CUTS, oldEnableGeneratingCliqueCuts, enableGeneratingCliqueCuts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableMixedIntegerRoundingCuts() {
		return enableMixedIntegerRoundingCuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableMixedIntegerRoundingCuts(boolean newEnableMixedIntegerRoundingCuts) {
		boolean oldEnableMixedIntegerRoundingCuts = enableMixedIntegerRoundingCuts;
		enableMixedIntegerRoundingCuts = newEnableMixedIntegerRoundingCuts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverglpkPackage.SOLVER_GLPK__ENABLE_MIXED_INTEGER_ROUNDING_CUTS, oldEnableMixedIntegerRoundingCuts, enableMixedIntegerRoundingCuts));
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
		
		String filepath = this.getFilePath();
		if ( filepath==null){
			Plugin.INSTANCE.logWarning("SolverGLPK: no file path, write aborted");
			return;
		}
		int lastdot = filepath.lastIndexOf('.');
		int lastslash = filepath.lastIndexOf('/');
		String extension = "";
		if ( lastdot>=0 && lastdot>lastslash ){
			extension = filepath.substring(lastdot+1);
		}
		if ( this.isFileCompressed() ){
			if ( !extension.equals(".gz")){
				filepath = filepath+".gz";
			}
		}
		else if ( extension.length()==0){
			switch (this.getFileFormat() ) {
		    case FILE_FORMAT_MPS:
				filepath = filepath+".mps";
		        break;
		    case FILE_FORMAT_GAMS:
		    	break;
		    case FILE_FORMAT_LP:
				filepath = filepath+".lp";
		        break;
		    case FILE_FORMAT_GLPK:
		    default:
				filepath = filepath+".prob";
		        break;
		    }  // switch on constraint type
		}
		
		this.actualfilepath = filepath;
		switch (this.getFileFormat() ) {
		    case FILE_FORMAT_MPS:
				GLPK.glp_write_mps(lp, GLPKConstants.GLP_MPS_FILE,  null, filepath); 
		        break;
		    case FILE_FORMAT_GAMS:
				throw new UnsupportedOperationException();
		    case FILE_FORMAT_LP:
				GLPK.glp_write_lp(lp, null, filepath); 
		        break;
		    case FILE_FORMAT_GLPK:
		    default:
				GLPK.glp_write_prob(lp, 0, filepath); 
		        break;
	    }  // switch on constraint type
		
		if( owningmodel ){
			this.releaseLp();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getLpAsString() {
		this.writeLpToFile();
		String toreturn = null;
		try {
			FileReader     filereader = new FileReader (this.actualfilepath);
			BufferedReader reader = new BufferedReader( filereader);
		    String         line = null;
		    StringBuilder  stringBuilder = new StringBuilder();
		    String         ls = System.getProperty("line.separator");
		    while( ( line = reader.readLine() ) != null ) {
		        stringBuilder.append( line );
		        stringBuilder.append( ls );
		    }
		    toreturn = stringBuilder.toString();
		    reader.close();
		} catch (FileNotFoundException e) {
			Plugin.INSTANCE.logError("SolverGLPK: file not found");
			e.printStackTrace();
		} catch (IOException e) {
			Plugin.INSTANCE.logError("SolverGLPK: io exception");
			e.printStackTrace();
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
			case SolverglpkPackage.SOLVER_GLPK__FILE_PATH:
				return getFilePath();
			case SolverglpkPackage.SOLVER_GLPK__FILE_FORMAT:
				return getFileFormat();
			case SolverglpkPackage.SOLVER_GLPK__FILE_COMPRESSED:
				return isFileCompressed();
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_FEASIBILITY_PUMP:
				return isEnableFeasibilityPump();
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_GOMORY_CUTS:
				return isEnableGomoryCuts();
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_GENERATING_MIXED_COVER_CUTS:
				return isEnableGeneratingMixedCoverCuts();
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_GENERATING_CLIQUE_CUTS:
				return isEnableGeneratingCliqueCuts();
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_MIXED_INTEGER_ROUNDING_CUTS:
				return isEnableMixedIntegerRoundingCuts();
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
			case SolverglpkPackage.SOLVER_GLPK__FILE_PATH:
				setFilePath((String)newValue);
				return;
			case SolverglpkPackage.SOLVER_GLPK__FILE_FORMAT:
				setFileFormat((EnumLpFileFormat)newValue);
				return;
			case SolverglpkPackage.SOLVER_GLPK__FILE_COMPRESSED:
				setFileCompressed((Boolean)newValue);
				return;
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_FEASIBILITY_PUMP:
				setEnableFeasibilityPump((Boolean)newValue);
				return;
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_GOMORY_CUTS:
				setEnableGomoryCuts((Boolean)newValue);
				return;
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_GENERATING_MIXED_COVER_CUTS:
				setEnableGeneratingMixedCoverCuts((Boolean)newValue);
				return;
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_GENERATING_CLIQUE_CUTS:
				setEnableGeneratingCliqueCuts((Boolean)newValue);
				return;
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_MIXED_INTEGER_ROUNDING_CUTS:
				setEnableMixedIntegerRoundingCuts((Boolean)newValue);
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
			case SolverglpkPackage.SOLVER_GLPK__FILE_PATH:
				setFilePath(FILE_PATH_EDEFAULT);
				return;
			case SolverglpkPackage.SOLVER_GLPK__FILE_FORMAT:
				setFileFormat(FILE_FORMAT_EDEFAULT);
				return;
			case SolverglpkPackage.SOLVER_GLPK__FILE_COMPRESSED:
				setFileCompressed(FILE_COMPRESSED_EDEFAULT);
				return;
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_FEASIBILITY_PUMP:
				setEnableFeasibilityPump(ENABLE_FEASIBILITY_PUMP_EDEFAULT);
				return;
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_GOMORY_CUTS:
				setEnableGomoryCuts(ENABLE_GOMORY_CUTS_EDEFAULT);
				return;
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_GENERATING_MIXED_COVER_CUTS:
				setEnableGeneratingMixedCoverCuts(ENABLE_GENERATING_MIXED_COVER_CUTS_EDEFAULT);
				return;
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_GENERATING_CLIQUE_CUTS:
				setEnableGeneratingCliqueCuts(ENABLE_GENERATING_CLIQUE_CUTS_EDEFAULT);
				return;
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_MIXED_INTEGER_ROUNDING_CUTS:
				setEnableMixedIntegerRoundingCuts(ENABLE_MIXED_INTEGER_ROUNDING_CUTS_EDEFAULT);
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
			case SolverglpkPackage.SOLVER_GLPK__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
			case SolverglpkPackage.SOLVER_GLPK__FILE_FORMAT:
				return fileFormat != FILE_FORMAT_EDEFAULT;
			case SolverglpkPackage.SOLVER_GLPK__FILE_COMPRESSED:
				return fileCompressed != FILE_COMPRESSED_EDEFAULT;
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_FEASIBILITY_PUMP:
				return enableFeasibilityPump != ENABLE_FEASIBILITY_PUMP_EDEFAULT;
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_GOMORY_CUTS:
				return enableGomoryCuts != ENABLE_GOMORY_CUTS_EDEFAULT;
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_GENERATING_MIXED_COVER_CUTS:
				return enableGeneratingMixedCoverCuts != ENABLE_GENERATING_MIXED_COVER_CUTS_EDEFAULT;
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_GENERATING_CLIQUE_CUTS:
				return enableGeneratingCliqueCuts != ENABLE_GENERATING_CLIQUE_CUTS_EDEFAULT;
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_MIXED_INTEGER_ROUNDING_CUTS:
				return enableMixedIntegerRoundingCuts != ENABLE_MIXED_INTEGER_ROUNDING_CUTS_EDEFAULT;
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
				case SolverglpkPackage.SOLVER_GLPK__FILE_PATH: return SolverPackage.ILP_WRITER__FILE_PATH;
				case SolverglpkPackage.SOLVER_GLPK__FILE_FORMAT: return SolverPackage.ILP_WRITER__FILE_FORMAT;
				case SolverglpkPackage.SOLVER_GLPK__FILE_COMPRESSED: return SolverPackage.ILP_WRITER__FILE_COMPRESSED;
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
				case SolverPackage.ILP_WRITER__FILE_PATH: return SolverglpkPackage.SOLVER_GLPK__FILE_PATH;
				case SolverPackage.ILP_WRITER__FILE_FORMAT: return SolverglpkPackage.SOLVER_GLPK__FILE_FORMAT;
				case SolverPackage.ILP_WRITER__FILE_COMPRESSED: return SolverglpkPackage.SOLVER_GLPK__FILE_COMPRESSED;
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
				case SolverPackage.ILP_WRITER___WRITE_LP_TO_FILE: return SolverglpkPackage.SOLVER_GLPK___WRITE_LP_TO_FILE;
				case SolverPackage.ILP_WRITER___GET_LP_AS_STRING: return SolverglpkPackage.SOLVER_GLPK___GET_LP_AS_STRING;
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
			case SolverglpkPackage.SOLVER_GLPK___WRITE_LP_TO_FILE:
				writeLpToFile();
				return null;
			case SolverglpkPackage.SOLVER_GLPK___GET_LP_AS_STRING:
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
		result.append(", EnableFeasibilityPump: ");
		result.append(enableFeasibilityPump);
		result.append(", EnableGomoryCuts: ");
		result.append(enableGomoryCuts);
		result.append(", EnableGeneratingMixedCoverCuts: ");
		result.append(enableGeneratingMixedCoverCuts);
		result.append(", EnableGeneratingCliqueCuts: ");
		result.append(enableGeneratingCliqueCuts);
		result.append(", EnableMixedIntegerRoundingCuts: ");
		result.append(enableMixedIntegerRoundingCuts);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Integrates GLPK in the framework
	 * <!-- end-user-doc -->
	 */
    // private declarations
	private glp_prob lp;
	private Map<GeneratorLpVar, Number> vars;
	private Map<GeneratorElement, Number> cons;
	private String actualfilepath = null;
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
			GLPK.glp_delete_prob(this.lp);
			this.lp = null;
		}
		this.vars = null;
		this.cons = null;
		this.var_counter  = 1;
		this.cons_counter = 1;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Return an array of the initial solution to be used in the presolve
	 * <!-- end-user-doc -->
	 */
	private int initSolution(glp_tree tree){
		try {
			Solution initialSolution = this.getInitialSolution();
			if ( initialSolution != null) {
				Plugin.INSTANCE.logInfo("SolverGLPK: presolve");
				int nofVars = this.vars.size();
				SWIGTYPE_p_double array = GLPK.new_doubleArray(nofVars);
				for ( int i=0; i<nofVars; i++){
				    GLPK.doubleArray_setitem(array, i, 0.0);
				}
				for ( SolutionVar varSol : this.getInitialSolution().getVar()){
					double optimalValue = varSol.getOptimalValue();
				    int varindex = vars.get(varSol.getVar()).intValue();
				    GLPK.doubleArray_setitem(array, varindex, optimalValue);
				}
				int rc = GLPK.glp_ios_heur_sol(tree, array); 
				Plugin.INSTANCE.logInfo("SolverGLPK: presolve returned (0=accepted) "+rc);
				GLPK.delete_doubleArray(array);
				return rc;
     		}
		} catch (Exception e) {
			Plugin.INSTANCE.logError("SolverGlpk: init mip start failed, exception "+e.getMessage());
			this.releaseLp();
		}
		return 0;
	}

	
	/**
     * Build the lp var
	 */
	@Override
	public void buildLpVar(GeneratorLpVar var) throws Exception {
		// map
		int varnumber = this.var_counter;
		this.var_counter++;
		this.vars.put((GeneratorLpVar)var, varnumber);
		
		// make the var
		float lb = var.getLowerBound();
		float ub = var.getUpperBound();
		int kind = GLPKConstants.GLP_CV;
		if ( !this.isSolverLinearRelaxation() && var.getType()==EnumLpVarType.ENUM_LITERAL_LP_VAR_INTEGER)	{
			kind = GLPKConstants.GLP_IV;
		}
		String varname = var.getCode();
		GLPK.glp_set_col_name(this.lp, varnumber, varname);
		GLPK.glp_set_col_kind(this.lp, varnumber, kind);
		GLPK.glp_set_col_bnds(this.lp, varnumber, GLPKConstants.GLP_DB, lb, ub); 
	}

	/**
     * Build the lp cons
	 */
	@Override
	protected void buildLpCons(GeneratorElement element, GeneratorLpLinear linear, float rhs, EnumLpConsType type) throws Exception {
		// map the constraint
		int consnumber = this.cons_counter;
		this.cons_counter++;
		this.cons.put(element, consnumber);

		// make the constraint
		String rowname = element.getCode();
		int nofterms = linear.getLpTerm().size();
		float lb = rhs;
		float ub = rhs;
		int kind = GLPKConstants.GLP_DB;
		switch (type ) {
		    case ENUM_LITERAL_LP_CONS_EQUAL:
				kind = GLPKConstants.GLP_FX;
		        break;
		    case ENUM_LITERAL_LP_CONS_BIGGER_OR_EQUAL:
				kind = GLPKConstants.GLP_LO;
		        break;
		    case ENUM_LITERAL_LP_CONS_SMALLER_OR_EQUAL:
				kind = GLPKConstants.GLP_UP;
		        break;
		    };  // switch on constraint type
	    SWIGTYPE_p_int ind = GLPK.new_intArray(nofterms+1);
	    SWIGTYPE_p_double val = GLPK.new_doubleArray(nofterms+1);
	    GLPK.glp_set_row_name(this.lp, consnumber, rowname);
	    GLPK.glp_set_row_bnds(this.lp, consnumber, kind, lb, ub);
	    int termindex = 0;
	    for ( GeneratorLpTerm lpterm : linear.getLpTerm())			{
	    	termindex++;
		    GeneratorLpVar lpvar = lpterm.getLpVar();
		    int lpvarindex = this.vars.get(lpvar).intValue();
		    float coefficient = lpterm.getCoeff();
		    GLPK.intArray_setitem   (ind, termindex, lpvarindex);
		    GLPK.doubleArray_setitem(val, termindex, coefficient);
	    } // traverse the terms
	    GLPK.glp_set_mat_row(this.lp, consnumber, nofterms, ind, val);
	}

	/**
     * Build the lp goal
	 */
	@Override
	public void buildLpGoal(GeneratorLpGoal goal) throws Exception {
		// direction
		int direction = 0;
		if ( goal.getObjectiveType()==EnumObjectiveType.MINIMUM){
			direction = GLPKConstants.GLP_MIN;
		} else if ( goal.getObjectiveType()==EnumObjectiveType.MAXIMUM){
			direction = GLPKConstants.GLP_MAX;
		}
		GLPK.glp_set_obj_dir(this.lp, direction);
		// terms
		for ( GeneratorLpTerm goalTerm : goal.getLpTerm()){
			// create the objective coefficient
			GeneratorLpVar lpvar = goalTerm.getLpVar();
			float coefficient = goalTerm.getCoeff();
			if ( coefficient!=0.0f){
			    int varindex = this.vars.get(lpvar).intValue();
				GLPK.glp_set_obj_coef(this.lp, varindex, coefficient);
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
		if ( generator == null) { return; }
		try {
			this.vars = new HashMap<GeneratorLpVar, Number>();
			this.cons = new HashMap<GeneratorElement, Number>();

			// create the problem in GLPK
			this.lp = GLPK.glp_create_prob();
			GLPK.glp_add_cols(this.lp, generator.getFootprintNofVars());
			GLPK.glp_add_rows(this.lp, generator.getFootprintNofCons());
			GLPK.glp_set_prob_name(this.lp, this.getCode());
			GLPK.glp_set_obj_name(this.lp, "z");
			this.build();
		}
		catch (Exception e) {
			Plugin.INSTANCE.logError("SolverGLPK: load failed, "+e.getMessage());
			this.releaseLp();
		}
	} // method lp load
	
	/**
	 * <!-- begin-user-doc -->
	 * Solve the lp with GLPK the linear formulation provided by the Generator
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
		
		GlpkCallbackListener listener = new CallBackListener(); 
		int rc = 1;
		GlpkCallback.addListener(listener);
		try  {
			if ( this.isSolverLinearRelaxation() ) {
				glp_smcp parm = new glp_smcp();
				GLPK.glp_init_smcp(parm);
				rc = GLPK.glp_simplex(lp, parm);
				Plugin.INSTANCE.logInfo("SolverGLPK: smcp returned "+rc);
			}
			else {
				glp_iocp parm = new glp_iocp();
				int messagelevel = GLPKConstants.GLP_MSG_ERR;
				switch ( this.getSolverLogLevel()) {
			    case ENUM_NONE:
					messagelevel = GLPKConstants.GLP_MSG_OFF;
			        break;
			    case ENUM_MIN:
					messagelevel = GLPKConstants.GLP_MSG_ERR;
			        break;
			    case ENUM_NORMAL:
					messagelevel = GLPKConstants.GLP_MSG_ON;
			        break;
			    case ENUM_FULL:
					messagelevel = GLPKConstants.GLP_MSG_ALL;
			        break;
			    }  // switch on constraint type
				GLPK.glp_init_iocp(parm);
				parm.setPresolve(GLPKConstants.GLP_ON);
				parm.setMip_gap(this.getSolverOptimalityTolerance());
				parm.setMsg_lev(messagelevel);
				parm.setTm_lim((int)(this.getSolverMaxDuration()*1000));
				if ( this.isEnableFeasibilityPump())         {parm.setFp_heur (GLPKConstants.GLP_ON);}
				if ( this.isEnableGomoryCuts())              {parm.setGmi_cuts(GLPKConstants.GLP_ON);}
				if ( this.isEnableGeneratingCliqueCuts())    {parm.setClq_cuts(GLPKConstants.GLP_ON);}
				if ( this.isEnableGeneratingMixedCoverCuts()){parm.setCov_cuts(GLPKConstants.GLP_ON);}
				if ( this.isEnableMixedIntegerRoundingCuts()){parm.setMir_cuts(GLPKConstants.GLP_ON);}
				//parm.setTol_int(0.001);
				rc = GLPK.glp_intopt(lp, parm);
				String rcstring = format_intopt_rc(rc);
				Plugin.INSTANCE.logInfo("SolverGLPK: intopt returned "+rcstring);
			} // if mip
		}
		catch (Exception e)		{
			Plugin.INSTANCE.logError("SolverGLPK: solve failed "+e);
		}
		GlpkCallback.removeListener(listener);
		//Number objective = result.getObjective();
		
		this.onSolvingEnd();
		
		// do something with the solution
		boolean feasible   = false;
		boolean unfeasible = false;
		boolean optimal    = false;
		float   mipvalue = 0.0f;
		int mipstatus = GLPK.glp_mip_status(lp);
		if      ( mipstatus == GLPKConstants.GLP_OPT)    { optimal = true; feasible = true; }
		else if ( mipstatus == GLPKConstants.GLP_FEAS)   { feasible = true; }
		else if ( mipstatus == GLPKConstants.GLP_NOFEAS) { unfeasible = true; }
		if ( feasible || this.isSolverLinearRelaxation()) {
			mipvalue = (float)GLPK.glp_mip_obj_val(lp);
			SolutionLp newSolution = (SolutionLp) this.constructSolution();
			newSolution.setGoalValue(mipvalue);
			for ( Map.Entry<GeneratorLpVar, Number> varentry : vars.entrySet())	{
				int varindex = varentry.getValue().intValue();
				GeneratorLpVar lpvar = varentry.getKey();
				float optimalvalue = 0f;
				if ( this.isSolverLinearRelaxation() )	{
					optimalvalue = (float) GLPK.glp_get_col_prim(lp, varindex);
				}
				else {
					optimalvalue = (float)GLPK.glp_mip_col_val(lp, varindex);
				}
				if ( Math.abs(optimalvalue)>0.00001){
					SolutionVar solvervar = newSolution.constructSolutionVar(lpvar);
					solvervar.setOptimalValue(optimalvalue);
				}
			} // traverse the vars
			if ( optimal) {
				this.setSolOptimalityGap(0.0f);
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
	private class CallBackListener implements GlpkCallbackListener{
		private SWIGTYPE_p_int nofActiveNodesS  = GLPK.new_intArray(1);
		private SWIGTYPE_p_int nofNodesCurrentS = GLPK.new_intArray(1);
		private SWIGTYPE_p_int nofNodesTotalS   = GLPK.new_intArray(1);
		
		@Override
		public void callback(glp_tree tree) {
			
			int reason = GLPK.glp_ios_reason(tree);
			/*
			int node = GLPK.glp_ios_curr_node(tree);
			String logline = String.format("CallBack, reason=%s, node=%d", format_callback_reason(reason), node);
			Plugin.INSTANCE.logInfo("SolverGLPK: "+logline);
			*/

			if ( reason == GLPKConstants.GLP_IROWGEN ) {
//				Request for row generation
//				
//				The callback routine is called with the reason code GLP_IROWGEN if LP relaxation of the current
//				subproblem has just been solved to optimality and its objective value is better than the best known
//				integer feasible solution.
//				In response the callback routine may add one or more constraints (rows), which are
//				violated by the current optimal solution of LP relaxation, using API routines glp_add_rows,
//				glp_set_row_name, glp_set_row_bnds, and glp_set_mat_row, in which case the solver will per-
//				form re-optimization of LP relaxation. If there are no violated constraints, the callback routine
//				should just return.
//				Note that components of optimal solution to LP relaxation can be obtained with API
//				routines glp_get_obj_val, glp_get_row_prim, glp_get_row_dual, glp_get_col_prim, and
//				glp_get_col_dual.
			} else if ( reason == GLPKConstants.GLP_IHEUR ) {
//				Request for heuristic solution
//				
//				The callback routine is called with the reason code GLP_IHEUR if LP relaxation of the current
//				subproblem being solved to optimality is integer infeasible (i.e. values of some structural variables
//				of integer kind are fractional), though its objective value is better than the best known integer
//				feasible solution.
//				In response the callback routine may try applying a primal heuristic to find an integer feasible
//				solution,3 which is better than the best known one. In case of success the callback routine may
//				store such better solution in the problem object using the routine glp_ios_heur_sol.
				if (GLPK.glp_ios_curr_node(tree) == 1 ){
					SolverGLPKImpl.this.initSolution(tree);
				}
				
			} else if ( reason == GLPKConstants.GLP_ICUTGEN ) {
//				Request for cut generation
//				
//				The callback routine is called with the reason code GLP_ICUTGEN if LP relaxation of the current
//				subproblem being solved to optimality is integer infeasible (i.e. values of some structural variables
//				of integer kind are fractional), though its objective value is better than the best known integer
//				feasible solution.
//				In response the callback routine may reformulate the current subproblem (before it will be
//				splitted up due to branching) by adding to the problem object one or more cutting plane constraints,
//				which cut off the fractional optimal point from the MIP polytope.4
//				Adding cutting plane constraints may be performed in two ways. One way is the same as
//				for the reason code GLP_IROWGEN (see above), in which case the callback routine adds new rows
//				corresponding to cutting plane constraints directly to the current subproblem.
//				The other way is to add cutting plane constraints to the cut pool, a set of cutting plane con-
//				straints maintained by the solver, rather than directly to the current subproblem. In this case
//				after return from the callback routine the solver looks through the cut pool, selects efficient cutting
//				plane constraints, adds them to the current subproblem, drops other constraints, and then performs
//				re-optimization.
			} else if ( reason == GLPKConstants.GLP_IBRANCH ) {
//			    Request for branching
//				
//				The callback routine is called with the reason code GLP_IBRANCH if LP relaxation of the current
//				subproblem being solved to optimality is integer infeasible (i.e. values of some structural variables
//				of integer kind are fractional), though its objective value is better than the best known integer
//				feasible solution.
//				In response the callback routine may choose some variable suitable for branching (i.e. integer
//				variable, whose value in optimal solution to LP relaxation of the current subproblem is fractional)
//				and pass its ordinal number to the solver using the routine glp_ios_branch_upon, in which case
//				the solver splits the current subproblem in two new subproblems and continues the search. If no
//				Integer feasible to the original MIP problem, not to the current subproblem.
//				Since these constraints are added to the current subproblem, they may be globally as well as locally valid.
//				choice is made by the callback routine, the solver uses a branching technique specified by the control
//				parameter br_tech.
			} else if ( reason == GLPKConstants.GLP_IBINGO ) {
//   			Better integer solution found
//				
//				The callback routine is called with the reason code GLP_IBINGO if LP relaxation of the current
//				subproblem being solved to optimality is integer feasible (i.e. values of all structural variables of
//				integer kind are integral within the working precision) and its objective value is better than the
//				best known integer feasible solution.
//				Optimal solution components for LP relaxation can be obtained in the same way as for the
//				reason code GLP_IROWGEN (see above).
//				Components of the new MIP solution can be obtained with API routines glp_mip_obj_val,
//				glp_mip_row_val, and glp_mip_col_val. Note, however, that due to row/cut generation there
//				may be additional rows in the problem object.
//				The difference between optimal solution to LP relaxation and corresponding MIP solution is
//				that in the former case some structural variables of integer kind (namely, basic variables) may have
//				values, which are close to nearest integers within the working precision, while in the latter case all
//				such variables have exact integral values.
//				The reason GLP_IBINGO is intended only for informational purposes, so the callback routine
//				should not modify the problem object in this case.
			} else if ( reason == GLPKConstants.GLP_ISELECT ) {
//	            Request for subproblem selection
//				
//				The callback routine is called with the reason code GLP_ISELECT if the current subproblem has
//				been fathomed and therefore there is no current subproblem.
//				In response the callback routine may select some subproblem from the active list and pass its
//				reference number to the solver using the routine glp_ios_select_node, in which case the solver
//				continues the search from the specified active subproblem. If no selection is made by the callback
//				routine, the solver uses a backtracking technique specified by the control parameter bt_tech.
//				To explore the active list (i.e. active nodes of the branch-and-bound tree) the callback routine
//				may use the routines glp_ios_next_node and glp_ios_prev_node.
//				Request for preprocessing
			} else if ( reason == GLPKConstants.GLP_IPREPRO ) {
//				Request for preprocessing
//				
//				The callback routine is called with the reason code GLP_IPREPRO if the current subproblem has
//				just been selected from the active list and its LP relaxation is not solved yet.
//				In response the callback routine may perform some preprocessing of the current subproblem like
//				tightening bounds of some variables or removing bounds of some redundant constraints.
			} else {
				 /* ignore call for other reasons */
			}

			glp_prob problem = GLPK.glp_ios_get_prob(tree);
			// gap
			float mipgap = (float)GLPK.glp_ios_mip_gap(tree);
	        
	        // Progress
			//int reason = GLPK.glp_ios_reason(tree);
			String progress = "solving";
			
			// depth
			GLPK.glp_ios_tree_size(tree, nofActiveNodesS, nofNodesCurrentS, nofNodesTotalS);
			int nofActiveNodes  = GLPK.intArray_getitem(nofActiveNodesS,  0);
			int nofNodesCurrent = GLPK.intArray_getitem(nofNodesCurrentS, 0);
			int nofNodesTotal   = GLPK.intArray_getitem(nofNodesTotalS,   0);
	        String depth = String.format("actives %1$d, current %2$d, total: %3$d", nofActiveNodes, nofNodesCurrent, nofNodesTotal); 
			
			// value
			int mipstatus = GLPK.glp_mip_status(problem);
			float mipvalue = 0.0f;
			boolean feasible = false;
			if      (  mipstatus == GLPKConstants.GLP_OPT
	                || mipstatus == GLPKConstants.GLP_FEAS)  {
				feasible = true;
				mipvalue = (float)GLPK.glp_mip_obj_val(problem);
			}
			
			SolverGLPKImpl.this.onSolverFeedback(depth, progress, mipgap, mipvalue, feasible);
			SolverGLPKImpl.this.setSolOptimalityGap(mipgap);
			
			if ( SolverGLPKImpl.this.isRunRequestTerminate() ) {
				// terminate
				Plugin.INSTANCE.logWarning("SolverGLPK: Request for terminate");
				GLPK.glp_ios_terminate(tree);
				SolverGLPKImpl.this.setRunInterrupted(true);
			}
		} // method call back
	}; // class listener

	
	static String format_intopt_rc(int rc){
		String rcstring = "";
		if      ( rc == 0                        )  { rcstring = "IntOpt_RC_Zero" ; } 
		else if ( rc == GLPKConstants.GLP_EBOUND )  { rcstring = "IntOpt_RC_GLP_EBOUND"; }
		else if ( rc == GLPKConstants.GLP_EROOT )   { rcstring = "IntOpt_RC_GLP_EROOT"; }
		else if ( rc == GLPKConstants.GLP_ENOPFS )  { rcstring = "IntOpt_RC_GLP_ENOPFS"; }
		else if ( rc == GLPKConstants.GLP_ENODFS )  { rcstring = "IntOpt_RC_GLP_ENODFS"; }
		else if ( rc == GLPKConstants.GLP_EFAIL )   { rcstring = "IntOpt_RC_GLP_EFAIL"; }
		else if ( rc == GLPKConstants.GLP_EMIPGAP ) { rcstring = "IntOpt_RC_GLP_EMIPGAP"; }
		else if ( rc == GLPKConstants.GLP_ETMLIM )  { rcstring = "IntOpt_RC_GLP_ETMLIM"; }
		else if ( rc == GLPKConstants.GLP_ESTOP )   { rcstring = "IntOpt_RC_GLP_ESTOP"; }
        else                                        { rcstring = "IntOpt_RC_Unknown"; }
		return rcstring;
	}
	
	
	static String format_callback_reason(int reason){
		String reasonstring = "";
		if      ( reason == GLPKConstants.GLP_IROWGEN ) { reasonstring = "glp_ios_reason_GLP_IROWGEN"; }
		else if ( reason == GLPKConstants.GLP_IHEUR )   { reasonstring = "glp_ios_reason_GLP_IHEUR"; }
		else if ( reason == GLPKConstants.GLP_ICUTGEN ) { reasonstring = "glp_ios_reason_GLP_ICUTGEN"; }
		else if ( reason == GLPKConstants.GLP_IBRANCH ) { reasonstring = "glp_ios_reason_GLP_IBRANCH"; }
		else if ( reason == GLPKConstants.GLP_IBINGO )  { reasonstring = "glp_ios_reason_GLP_IBINGO"; }
		else if ( reason == GLPKConstants.GLP_ISELECT ) { reasonstring = "glp_ios_reason_GLP_ISELECT"; }
		else if ( reason == GLPKConstants.GLP_IPREPRO ) { reasonstring = "glp_ios_reason_GLP_IPREPRO"; }
		return reasonstring; 
	}
	
	static void write_lp_solution(glp_prob lp) {
		int i;
		int n;
		String name;
		double val;

		name = GLPK.glp_get_obj_name(lp);
		val = GLPK.glp_get_obj_val(lp);
		System.out.print(name);
		System.out.print(" = ");
		System.out.println(val);
		n = GLPK.glp_get_num_cols(lp);
		for (i = 1; i <= n; i++) {
		name = GLPK.glp_get_col_name(lp, i);
		val = GLPK.glp_get_col_prim(lp, i);
		System.out.print(name);
		System.out.print(" = ");
		System.out.println(val);
		} // for i
	} // write lp solution
	

} //SolverGLPKImpl
