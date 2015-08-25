/**
 */
package com.misc.common.moplaf.solver.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.misc.common.moplaf.solver.Generator;
import com.misc.common.moplaf.solver.GeneratorTuple;
import com.misc.common.moplaf.solver.GeneratorVar;
import com.misc.common.moplaf.solver.IGeneratorTool;
import com.misc.common.moplaf.solver.ITupleVisitor;
import com.misc.common.moplaf.solver.Solution;
import com.misc.common.moplaf.solver.SolutionReaderPattern;
import com.misc.common.moplaf.solver.SolutionVar;
import com.misc.common.moplaf.solver.SolverPackage;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution Reader Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionReaderPatternImpl#getLinePattern <em>Line Pattern</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionReaderPatternImpl#getVarNameGroup <em>Var Name Group</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionReaderPatternImpl#getVarOptimalValueGroup <em>Var Optimal Value Group</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionReaderPatternImpl#getVarObjectiveCoefGroup <em>Var Objective Coef Group</em>}</li>
 *   <li>{@link com.misc.common.moplaf.solver.impl.SolutionReaderPatternImpl#getFirstLine <em>First Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionReaderPatternImpl extends SolutionReaderImpl implements SolutionReaderPattern {
	/**
	 * The default value of the '{@link #getLinePattern() <em>Line Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_PATTERN_EDEFAULT = "(\\S+)\\s+(\\S+)\\s+\\(obj:(\\S+)\\)";

	/**
	 * The cached value of the '{@link #getLinePattern() <em>Line Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinePattern()
	 * @generated
	 * @ordered
	 */
	protected String linePattern = LINE_PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarNameGroup() <em>Var Name Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarNameGroup()
	 * @generated
	 * @ordered
	 */
	protected static final int VAR_NAME_GROUP_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getVarNameGroup() <em>Var Name Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarNameGroup()
	 * @generated
	 * @ordered
	 */
	protected int varNameGroup = VAR_NAME_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarOptimalValueGroup() <em>Var Optimal Value Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarOptimalValueGroup()
	 * @generated
	 * @ordered
	 */
	protected static final int VAR_OPTIMAL_VALUE_GROUP_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getVarOptimalValueGroup() <em>Var Optimal Value Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarOptimalValueGroup()
	 * @generated
	 * @ordered
	 */
	protected int varOptimalValueGroup = VAR_OPTIMAL_VALUE_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarObjectiveCoefGroup() <em>Var Objective Coef Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarObjectiveCoefGroup()
	 * @generated
	 * @ordered
	 */
	protected static final int VAR_OBJECTIVE_COEF_GROUP_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getVarObjectiveCoefGroup() <em>Var Objective Coef Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarObjectiveCoefGroup()
	 * @generated
	 * @ordered
	 */
	protected int varObjectiveCoefGroup = VAR_OBJECTIVE_COEF_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstLine() <em>First Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstLine()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRST_LINE_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getFirstLine() <em>First Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstLine()
	 * @generated
	 * @ordered
	 */
	protected int firstLine = FIRST_LINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionReaderPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolverPackage.Literals.SOLUTION_READER_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinePattern() {
		return linePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinePattern(String newLinePattern) {
		String oldLinePattern = linePattern;
		linePattern = newLinePattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_READER_PATTERN__LINE_PATTERN, oldLinePattern, linePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVarNameGroup() {
		return varNameGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarNameGroup(int newVarNameGroup) {
		int oldVarNameGroup = varNameGroup;
		varNameGroup = newVarNameGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_READER_PATTERN__VAR_NAME_GROUP, oldVarNameGroup, varNameGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVarOptimalValueGroup() {
		return varOptimalValueGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarOptimalValueGroup(int newVarOptimalValueGroup) {
		int oldVarOptimalValueGroup = varOptimalValueGroup;
		varOptimalValueGroup = newVarOptimalValueGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_READER_PATTERN__VAR_OPTIMAL_VALUE_GROUP, oldVarOptimalValueGroup, varOptimalValueGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVarObjectiveCoefGroup() {
		return varObjectiveCoefGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarObjectiveCoefGroup(int newVarObjectiveCoefGroup) {
		int oldVarObjectiveCoefGroup = varObjectiveCoefGroup;
		varObjectiveCoefGroup = newVarObjectiveCoefGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_READER_PATTERN__VAR_OBJECTIVE_COEF_GROUP, oldVarObjectiveCoefGroup, varObjectiveCoefGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFirstLine() {
		return firstLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstLine(int newFirstLine) {
		int oldFirstLine = firstLine;
		firstLine = newFirstLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolverPackage.SOLUTION_READER_PATTERN__FIRST_LINE, oldFirstLine, firstLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolverPackage.SOLUTION_READER_PATTERN__LINE_PATTERN:
				return getLinePattern();
			case SolverPackage.SOLUTION_READER_PATTERN__VAR_NAME_GROUP:
				return getVarNameGroup();
			case SolverPackage.SOLUTION_READER_PATTERN__VAR_OPTIMAL_VALUE_GROUP:
				return getVarOptimalValueGroup();
			case SolverPackage.SOLUTION_READER_PATTERN__VAR_OBJECTIVE_COEF_GROUP:
				return getVarObjectiveCoefGroup();
			case SolverPackage.SOLUTION_READER_PATTERN__FIRST_LINE:
				return getFirstLine();
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
			case SolverPackage.SOLUTION_READER_PATTERN__LINE_PATTERN:
				setLinePattern((String)newValue);
				return;
			case SolverPackage.SOLUTION_READER_PATTERN__VAR_NAME_GROUP:
				setVarNameGroup((Integer)newValue);
				return;
			case SolverPackage.SOLUTION_READER_PATTERN__VAR_OPTIMAL_VALUE_GROUP:
				setVarOptimalValueGroup((Integer)newValue);
				return;
			case SolverPackage.SOLUTION_READER_PATTERN__VAR_OBJECTIVE_COEF_GROUP:
				setVarObjectiveCoefGroup((Integer)newValue);
				return;
			case SolverPackage.SOLUTION_READER_PATTERN__FIRST_LINE:
				setFirstLine((Integer)newValue);
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
			case SolverPackage.SOLUTION_READER_PATTERN__LINE_PATTERN:
				setLinePattern(LINE_PATTERN_EDEFAULT);
				return;
			case SolverPackage.SOLUTION_READER_PATTERN__VAR_NAME_GROUP:
				setVarNameGroup(VAR_NAME_GROUP_EDEFAULT);
				return;
			case SolverPackage.SOLUTION_READER_PATTERN__VAR_OPTIMAL_VALUE_GROUP:
				setVarOptimalValueGroup(VAR_OPTIMAL_VALUE_GROUP_EDEFAULT);
				return;
			case SolverPackage.SOLUTION_READER_PATTERN__VAR_OBJECTIVE_COEF_GROUP:
				setVarObjectiveCoefGroup(VAR_OBJECTIVE_COEF_GROUP_EDEFAULT);
				return;
			case SolverPackage.SOLUTION_READER_PATTERN__FIRST_LINE:
				setFirstLine(FIRST_LINE_EDEFAULT);
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
			case SolverPackage.SOLUTION_READER_PATTERN__LINE_PATTERN:
				return LINE_PATTERN_EDEFAULT == null ? linePattern != null : !LINE_PATTERN_EDEFAULT.equals(linePattern);
			case SolverPackage.SOLUTION_READER_PATTERN__VAR_NAME_GROUP:
				return varNameGroup != VAR_NAME_GROUP_EDEFAULT;
			case SolverPackage.SOLUTION_READER_PATTERN__VAR_OPTIMAL_VALUE_GROUP:
				return varOptimalValueGroup != VAR_OPTIMAL_VALUE_GROUP_EDEFAULT;
			case SolverPackage.SOLUTION_READER_PATTERN__VAR_OBJECTIVE_COEF_GROUP:
				return varObjectiveCoefGroup != VAR_OBJECTIVE_COEF_GROUP_EDEFAULT;
			case SolverPackage.SOLUTION_READER_PATTERN__FIRST_LINE:
				return firstLine != FIRST_LINE_EDEFAULT;
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
		result.append(" (LinePattern: ");
		result.append(linePattern);
		result.append(", VarNameGroup: ");
		result.append(varNameGroup);
		result.append(", VarOptimalValueGroup: ");
		result.append(varOptimalValueGroup);
		result.append(", VarObjectiveCoefGroup: ");
		result.append(varObjectiveCoefGroup);
		result.append(", FirstLine: ");
		result.append(firstLine);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void readSolFromFile() {
		Scanner scanner = null;
		try {
			scanner  = new Scanner(new File(this.getFilePath()));
		} catch (FileNotFoundException e) {
			CommonPlugin.INSTANCE.log("SolutionReader: file not found");
			return;
		}
		this.setSolAsScanner(scanner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setSolAsString(String solution) {
		Scanner scanner = new Scanner(solution);
		this.setSolAsScanner(scanner);
	}
	
	public void setSolAsScanner(Scanner scanner){
		CommonPlugin.INSTANCE.log("SolutionReader: SetSolAsScanner called");
		
		Generator generator = this.getGenerator();
		if ( generator == null )		{
			CommonPlugin.INSTANCE.log("SolutionReader: no generator set");
			return;
		}
		
		// this is a good pattern: (\S+)\s+(\S+)\s+\(obj:(\S+)\)
		Pattern linepattern = Pattern.compile(this.getLinePattern());
		
		// parse the files, remember the solution
		final Map<String, Float> varmap = new HashMap<String, Float>();
		float objective = 0.0f;
		int linenbr = 0;
		while (scanner.hasNextLine()){
			String line = scanner.nextLine();
			if ( linenbr>=this.getFirstLine()){
				//CommonPlugin.INSTANCE.log("SolutionReader: line("+linenbr+"):"+line);
				Matcher linematcher = linepattern.matcher(line);
				if ( linematcher.matches() ){
					String varname          = linematcher.group(this.getVarNameGroup());
					String varvalueasstring = linematcher.group(this.getVarOptimalValueGroup());
					String varcoefasstring  = linematcher.group(this.getVarObjectiveCoefGroup());
					float varvalue = Float.parseFloat(varvalueasstring);
					float varcoef  = Float.parseFloat(varcoefasstring);
					if ( varvalue!=0.0f){
						varmap.put(varname, varvalue);
						objective += varvalue*varcoef;
					}
				} else {
					//CommonPlugin.INSTANCE.log("SolutionReader: no match, line "+linenbr);
				} // line matches pattern
			} // line to be considered
			linenbr++;
		} // traverse the lines
		CommonPlugin.INSTANCE.log("SolutionReader: read("+linenbr+"), value "+objective);
		
		
		class VarVisitor implements ITupleVisitor{
			private Solution solution;
			public VarVisitor(Solution solution){
				this.solution = solution;
			}
			@Override
			
			public void visitTuple(GeneratorTuple tuple) throws Exception {
				for ( GeneratorVar var : tuple.getVar()){
					String varname = var.getCode();
					Float varvalue = varmap.get(varname);
					if ( varvalue != null){
						 SolutionVar solvervar = this.solution.constructSolutionVar(var);
						 solvervar.setOptimalValue(varvalue);
					} // non zero optimal value
					//CommonPlugin.INSTANCE.log("..var "+varnumber+","+lpvar.getECode());
				}  // traverse the tuple vars
			}  // visit tuple
		}; // class visitor
		Solution newSolution = this.constructSolution(0.0f);
		VarVisitor varvisitor = new VarVisitor(newSolution);
		try {
			generator.visitTuples(varvisitor);
		} catch (Exception e) {
			e.printStackTrace();
			CommonPlugin.INSTANCE.log("SolutionReader: exception while constructing the solution, "+e.getMessage());
		}
		
		CommonPlugin.INSTANCE.log("SolutionReader: finished");
	}  // method run
	
	
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public IGeneratorTool getParentGeneratorTool() {
		EObject parent = this.eContainer();
		if ( parent instanceof IGeneratorTool ) {
			return (IGeneratorTool)parent;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Generator getGenerator() {
		EObject parent = this.eContainer();
		if ( parent instanceof IGeneratorTool ) {
			return ((IGeneratorTool)parent).getGenerator();
		}
		else if ( parent instanceof Generator){
			return (Generator)parent;
		}
		return null;
	}

} //SolutionReaderPatternImpl
