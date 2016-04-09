/**
 */
package com.misc.common.moplaf.solver.solverjavailp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Solver Java ILP Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.solver.solverjavailp.SolverjavailpPackage#getSolverJavaILPType()
 * @model
 * @generated
 */
public enum SolverJavaILPType implements Enumerator {
	/**
	 * The '<em><b>GLPK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLPK_VALUE
	 * @generated
	 * @ordered
	 */
	GLPK(0, "GLPK", "GLPK"),

	/**
	 * The '<em><b>Lp Solve</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LP_SOLVE_VALUE
	 * @generated
	 * @ordered
	 */
	LP_SOLVE(1, "LpSolve", "LpSolve"),

	/**
	 * The '<em><b>Cplex</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CPLEX_VALUE
	 * @generated
	 * @ordered
	 */
	CPLEX(2, "Cplex", "CPlex"),

	/**
	 * The '<em><b>Gurobi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUROBI_VALUE
	 * @generated
	 * @ordered
	 */
	GUROBI(3, "Gurobi", "Gurobi"),

	/**
	 * The '<em><b>Mini Sat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINI_SAT_VALUE
	 * @generated
	 * @ordered
	 */
	MINI_SAT(4, "MiniSat", "MiniSat"),

	/**
	 * The '<em><b>Mosek</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOSEK_VALUE
	 * @generated
	 * @ordered
	 */
	MOSEK(5, "Mosek", "Mosek"),

	/**
	 * The '<em><b>SAT4J</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAT4J_VALUE
	 * @generated
	 * @ordered
	 */
	SAT4J(6, "SAT4J", "SAT4J");

	/**
	 * The '<em><b>GLPK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GLPK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GLPK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GLPK_VALUE = 0;

	/**
	 * The '<em><b>Lp Solve</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lp Solve</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LP_SOLVE
	 * @model name="LpSolve"
	 * @generated
	 * @ordered
	 */
	public static final int LP_SOLVE_VALUE = 1;

	/**
	 * The '<em><b>Cplex</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cplex</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CPLEX
	 * @model name="Cplex" literal="CPlex"
	 * @generated
	 * @ordered
	 */
	public static final int CPLEX_VALUE = 2;

	/**
	 * The '<em><b>Gurobi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gurobi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUROBI
	 * @model name="Gurobi"
	 * @generated
	 * @ordered
	 */
	public static final int GUROBI_VALUE = 3;

	/**
	 * The '<em><b>Mini Sat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mini Sat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINI_SAT
	 * @model name="MiniSat"
	 * @generated
	 * @ordered
	 */
	public static final int MINI_SAT_VALUE = 4;

	/**
	 * The '<em><b>Mosek</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mosek</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOSEK
	 * @model name="Mosek"
	 * @generated
	 * @ordered
	 */
	public static final int MOSEK_VALUE = 5;

	/**
	 * The '<em><b>SAT4J</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAT4J</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAT4J
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAT4J_VALUE = 6;

	/**
	 * An array of all the '<em><b>Solver Java ILP Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SolverJavaILPType[] VALUES_ARRAY =
		new SolverJavaILPType[] {
			GLPK,
			LP_SOLVE,
			CPLEX,
			GUROBI,
			MINI_SAT,
			MOSEK,
			SAT4J,
		};

	/**
	 * A public read-only list of all the '<em><b>Solver Java ILP Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SolverJavaILPType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Solver Java ILP Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SolverJavaILPType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SolverJavaILPType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Solver Java ILP Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SolverJavaILPType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SolverJavaILPType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Solver Java ILP Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SolverJavaILPType get(int value) {
		switch (value) {
			case GLPK_VALUE: return GLPK;
			case LP_SOLVE_VALUE: return LP_SOLVE;
			case CPLEX_VALUE: return CPLEX;
			case GUROBI_VALUE: return GUROBI;
			case MINI_SAT_VALUE: return MINI_SAT;
			case MOSEK_VALUE: return MOSEK;
			case SAT4J_VALUE: return SAT4J;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SolverJavaILPType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SolverJavaILPType
