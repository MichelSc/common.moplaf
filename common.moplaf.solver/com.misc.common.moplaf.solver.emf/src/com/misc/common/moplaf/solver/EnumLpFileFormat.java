/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.solver;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Lp File Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.solver.SolverPackage#getEnumLpFileFormat()
 * @model
 * @generated
 */
public enum EnumLpFileFormat implements Enumerator {
	/**
	 * The '<em><b>File Format Mps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_FORMAT_MPS_VALUE
	 * @generated
	 * @ordered
	 */
	FILE_FORMAT_MPS(0, "FileFormatMps", "mps"),

	/**
	 * The '<em><b>File Format Cplex</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_FORMAT_CPLEX_VALUE
	 * @generated
	 * @ordered
	 */
	FILE_FORMAT_CPLEX(1, "FileFormatCplex", "cplex"), /**
	 * The '<em><b>File Format Gams</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_FORMAT_GAMS_VALUE
	 * @generated
	 * @ordered
	 */
	FILE_FORMAT_GAMS(2, "FileFormatGams", "gams"), /**
	 * The '<em><b>File Format GLPK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_FORMAT_GLPK_VALUE
	 * @generated
	 * @ordered
	 */
	FILE_FORMAT_GLPK(4, "FileFormatGLPK", "GLPK"), /**
	 * The '<em><b>File Format Sav</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_FORMAT_SAV_VALUE
	 * @generated
	 * @ordered
	 */
	FILE_FORMAT_SAV(3, "FileFormatSav", "sav"), /**
	 * The '<em><b>File Format Lp Solve</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_FORMAT_LP_SOLVE_VALUE
	 * @generated
	 * @ordered
	 */
	FILE_FORMAT_LP_SOLVE(5, "FileFormatLpSolve", "lpsolve");

	/**
	 * The '<em><b>File Format Mps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>File Format Mps</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILE_FORMAT_MPS
	 * @model name="FileFormatMps" literal="mps"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_FORMAT_MPS_VALUE = 0;

	/**
	 * The '<em><b>File Format Cplex</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>File Format Cplex</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILE_FORMAT_CPLEX
	 * @model name="FileFormatCplex" literal="cplex"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_FORMAT_CPLEX_VALUE = 1;

	/**
	 * The '<em><b>File Format Gams</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>File Format Gams</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILE_FORMAT_GAMS
	 * @model name="FileFormatGams" literal="gams"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_FORMAT_GAMS_VALUE = 2;

	/**
	 * The '<em><b>File Format GLPK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>File Format GLPK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILE_FORMAT_GLPK
	 * @model name="FileFormatGLPK" literal="GLPK"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_FORMAT_GLPK_VALUE = 4;

	/**
	 * The '<em><b>File Format Sav</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>File Format Sav</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILE_FORMAT_SAV
	 * @model name="FileFormatSav" literal="sav"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_FORMAT_SAV_VALUE = 3;

	/**
	 * The '<em><b>File Format Lp Solve</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>File Format Lp Solve</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILE_FORMAT_LP_SOLVE
	 * @model name="FileFormatLpSolve" literal="lpsolve"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_FORMAT_LP_SOLVE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Enum Lp File Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumLpFileFormat[] VALUES_ARRAY =
		new EnumLpFileFormat[] {
			FILE_FORMAT_MPS,
			FILE_FORMAT_CPLEX,
			FILE_FORMAT_GAMS,
			FILE_FORMAT_GLPK,
			FILE_FORMAT_SAV,
			FILE_FORMAT_LP_SOLVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Lp File Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumLpFileFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Lp File Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumLpFileFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumLpFileFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Lp File Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumLpFileFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumLpFileFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Lp File Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnumLpFileFormat get(int value) {
		switch (value) {
			case FILE_FORMAT_MPS_VALUE: return FILE_FORMAT_MPS;
			case FILE_FORMAT_CPLEX_VALUE: return FILE_FORMAT_CPLEX;
			case FILE_FORMAT_GAMS_VALUE: return FILE_FORMAT_GAMS;
			case FILE_FORMAT_GLPK_VALUE: return FILE_FORMAT_GLPK;
			case FILE_FORMAT_SAV_VALUE: return FILE_FORMAT_SAV;
			case FILE_FORMAT_LP_SOLVE_VALUE: return FILE_FORMAT_LP_SOLVE;
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
	private EnumLpFileFormat(int value, String name, String literal) {
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
	
	public String getFileExtension(){
		switch ( this.value){
		case FILE_FORMAT_CPLEX_VALUE: return "lp";
		case FILE_FORMAT_GLPK_VALUE: return "prob";
		case FILE_FORMAT_MPS_VALUE: return "mps";
		}
		return null;
	}
	
	public String extendFilePath(String filePath, boolean compressed){

		// retrieve the extension
		int lastdot = filePath.lastIndexOf('.');
		int lastslash = filePath.lastIndexOf('/');
		String extension = "";
		if ( lastdot>=0 && lastdot>lastslash ){
			extension = filePath.substring(lastdot+1);
		}
		
		// augment file path with extension, if no extension present
		String fileToReturn = filePath;
		if ( extension.length()==0){
			String thisExtension = this.getFileExtension();
			if ( thisExtension!=null){
				fileToReturn = filePath+"."+thisExtension;
		    } 
		}
		
		// augment the file path with ".gz", if compressed and the extension is not already this
		if ( compressed ){
			if ( !extension.equals(".gz")){
				fileToReturn = fileToReturn+".gz";
			}
		}
		return fileToReturn;
	}

} //EnumLpFileFormat
