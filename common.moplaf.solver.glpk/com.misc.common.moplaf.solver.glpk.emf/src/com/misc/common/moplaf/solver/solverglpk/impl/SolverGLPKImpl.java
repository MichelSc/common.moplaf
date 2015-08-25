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

import org.eclipse.emf.common.CommonPlugin;
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

import com.misc.common.moplaf.solver.EnumLpFileFormat;
import com.misc.common.moplaf.solver.EnumLpVarType;
import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorCons;
import com.misc.common.moplaf.solver.GeneratorLpCons;
import com.misc.common.moplaf.solver.GeneratorLpTerm;
import com.misc.common.moplaf.solver.GeneratorLpVar;
import com.misc.common.moplaf.solver.GeneratorTuple;
import com.misc.common.moplaf.solver.GeneratorVar;
import com.misc.common.moplaf.solver.ILpWriter;
import com.misc.common.moplaf.solver.ITupleVisitor;
import com.misc.common.moplaf.solver.Solution;
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
			CommonPlugin.INSTANCE.log("SolverGLPK: no file path, write aborted");
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
				//CommonPlugin.INSTANCE.log(".. line read: "+line);
		        stringBuilder.append( line );
		        stringBuilder.append( ls );
		    }
		    toreturn = stringBuilder.toString();
		    reader.close();
		} catch (FileNotFoundException e) {
			CommonPlugin.INSTANCE.log("SolverGLPK: file not found");
			e.printStackTrace();
		} catch (IOException e) {
			CommonPlugin.INSTANCE.log("SolverGLPK: io exception");
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
	private Map<GeneratorLpCons, Number> cons;
	private String actualfilepath = null;
	 
	private void releaseLp(){
		// Free memory
		if ( this.lp!=null){
			GLPK.glp_delete_prob(this.lp);
			this.lp = null;
		}
		this.vars = null;
		this.cons = null;
		
	}
	
	private void loadLp(){
		this.releaseLp(); // release the current model, if any
		Generator generator = this.getGenerator();
		if ( generator == null) { return; }
		try {
			// map the variables
			this.vars = new HashMap<GeneratorLpVar, Number>();
			class VarMapper implements ITupleVisitor{
				private int counter =0;
				@Override
				public void visitTuple(GeneratorTuple tuple) {
					for ( GeneratorVar var : tuple.getVar()){
						if ( !(var  instanceof GeneratorLpVar)){
							throw new UnsupportedOperationException("Variable type not supported by solver: "+var.eClass().getName());
						}
						int varnumber = ++counter;
						SolverGLPKImpl.this.vars.put((GeneratorLpVar)var, varnumber);
						//CommonPlugin.INSTANCE.log("..var "+varnumber+","+lpvar.getECode());
					}
				}
			};
			VarMapper varmapper = new VarMapper();
			generator.visitTuples(varmapper);
			
			// map the constraints
			this.cons = new HashMap<GeneratorLpCons, Number>();
			class ConsMapper implements ITupleVisitor{
				private int counter = 0;
				@Override
				public void visitTuple(GeneratorTuple tuple) {
					for ( GeneratorCons cons : tuple.getCons()){
						if ( !(cons instanceof GeneratorLpCons)){
							throw new UnsupportedOperationException("Constraint type not supported by solver: "+cons.eClass().getName());
						}
						int consnumber = ++counter;
						SolverGLPKImpl.this.cons.put((GeneratorLpCons)cons, consnumber);
						//CommonPlugin.INSTANCE.log("..var "+varnumber+","+lpvar.getECode());
					}
				}
			};
			ConsMapper consmapper = new ConsMapper();
			generator.visitTuples(consmapper);

			// create the problem in GLPK

			int direction = 0;
			lp = GLPK.glp_create_prob();
			GLPK.glp_set_prob_name(lp, this.getCode());
			GLPK.glp_set_obj_name(lp, "z");
			switch (generator.getObjectiveType() ) {
		    case MAXIMUM:
				direction = GLPKConstants.GLP_MAX;
		        break;
		    case MINIMUM:
				direction = GLPKConstants.GLP_MIN;
		        break;
		    };  // switch on objective type
			GLPK.glp_set_obj_dir(lp, direction);

			// create the variables in GLPK
			EnumLpVarType integertype = EnumLpVarType.ENUM_LITERAL_LP_VAR_INTEGER;
			GLPK.glp_add_cols(lp, this.vars.size());
			for ( Map.Entry<GeneratorLpVar, Number> varentry : vars.entrySet()){
				int varindex = varentry.getValue().intValue();
				GeneratorLpVar lpvar = varentry.getKey();
				float lb = lpvar.getLowerBound();
				float ub = lpvar.getUpperBound();
				int kind = GLPKConstants.GLP_CV;
				float coefficient = lpvar.getObjectiveCoeff();
				if ( !this.isSolverLinearRelaxation() && lpvar.getType()==integertype)	{
					kind = GLPKConstants.GLP_IV;
				}
				String varname = lpvar.getCode();
				GLPK.glp_set_col_name(lp, varindex, varname);
				GLPK.glp_set_col_kind(lp, varindex, kind);
				GLPK.glp_set_col_bnds(lp, varindex, GLPKConstants.GLP_DB, lb, ub); 
				GLPK.glp_set_obj_coef(lp, varindex, coefficient);
			} // traverse the vars
		
			// create the constraints
			GLPK.glp_add_rows(lp, this.cons.size());
			for ( Map.Entry<GeneratorLpCons, Number> consentry : this.cons.entrySet())
				{
				int consindex = consentry.getValue().intValue();
				GeneratorLpCons lpcons = consentry.getKey();
				String rowname = lpcons.getCode();
				int nofterms = lpcons.getLpTerm().size();
				float lb = lpcons.getRighHandSide();
				float ub = lpcons.getRighHandSide();
				int kind = GLPKConstants.GLP_DB;
				switch (lpcons.getType() ) {
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
			    GLPK.glp_set_row_name(lp, consindex, rowname);
			    GLPK.glp_set_row_bnds(lp, consindex, kind, lb, ub);
			    int termindex = 0;
			    for ( GeneratorLpTerm lpterm : lpcons.getLpTerm())			{
			    	termindex++;
				    GeneratorLpVar lpvar = lpterm.getLpVar();
				    int lpvarindex = vars.get(lpvar).intValue();
				    float coefficient = lpterm.getCoeff();
				    GLPK.intArray_setitem   (ind, termindex, lpvarindex);
				    GLPK.doubleArray_setitem(val, termindex, coefficient);
			    } // traverse the terms
			GLPK.glp_set_mat_row(lp, consindex, nofterms, ind, val);
			} // traverse the constraints
		}
		catch (Exception e)
		{
			e.printStackTrace();
			CommonPlugin.INSTANCE.log("SolverGLPK: load failed");
			this.releaseLp();
		}
	} // method lp load
	
	@Override
	public void solveSolver() {

		// load the lp
		this.loadLp();
		if ( this.lp==null ) { return; }

		this.onInitializationEnd();
		
		if ( this.isSolverDump()){
			this.writeLpToFile();
		}
		
		GlpkCallbackListener listener = new GlpkCallbackListener(){
			@Override
			public void callback(glp_tree tree) {
				glp_prob problem = GLPK.glp_ios_get_prob(tree);
				// gap
				float mipgap = (float)GLPK.glp_ios_mip_gap(tree);
		        
		        // Progress
				//int reason = GLPK.glp_ios_reason(tree);
				String progress = "solving";
				
				// depth
				SWIGTYPE_p_int nofActiveNodesS  = GLPK.new_intArray(1);
				SWIGTYPE_p_int nofNodesCurrentS = GLPK.new_intArray(1);
				SWIGTYPE_p_int nofNodesTotalS   = GLPK.new_intArray(1);
				GLPK.glp_ios_tree_size(tree, nofActiveNodesS, nofNodesCurrentS, nofNodesTotalS);
				int nofActiveNodes  = GLPK.intArray_getitem(nofActiveNodesS, 0);
				int nofNodesCurrent = GLPK.intArray_getitem(nofNodesCurrentS, 0);
				int nofNodesTotal   = GLPK.intArray_getitem(nofNodesTotalS, 0);
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
					CommonPlugin.INSTANCE.log("SolverGLPK Request for terminate");
					GLPK.glp_ios_terminate(tree);
					SolverGLPKImpl.this.setRunInterrupted(true);
				}
			} // method call back
		}; // class listener

		int rc = 1;
		GlpkCallback.addListener(listener);
		try  {
			if ( this.isSolverLinearRelaxation() ) {
				glp_smcp parm = new glp_smcp();
				GLPK.glp_init_smcp(parm);
				rc = GLPK.glp_simplex(lp, parm);
				CommonPlugin.INSTANCE.log("SolverGLPK: smcp returned "+rc);
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
				CommonPlugin.INSTANCE.log("SolverGLPK: intopt returned "+rcstring);
			} // if mip
		}
		catch (Exception e)		{
			CommonPlugin.INSTANCE.log("SolverGLPK: solve failed "+e);
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
			Solution newSolution = this.constructSolution(mipvalue);
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

	static String format_intopt_rc(int rc)
	{
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
