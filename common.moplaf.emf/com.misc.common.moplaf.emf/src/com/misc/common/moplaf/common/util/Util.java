/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
package com.misc.common.moplaf.common.util;

import java.lang.reflect.Constructor;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import com.misc.common.moplaf.common.Constants;


public class Util implements Constants {

	/** logic object has resource
	 * 
	 * @param target
	 * @return
	 */
	public static boolean hasResource(EObject object){
	
		Resource resource = object.eResource();
		if ( resource == null ) { return false; }
		
		return true;
	}

	/**
	 * 
	 * @param notifier
	 * @return
	 */
	public static boolean isLoading(Notifier notifier){
		if ( notifier instanceof Resource) { return isLoading((Resource)notifier); }
		else if ( notifier instanceof EObject) { return isLoading((EObject)notifier); }
		return false;
	}

	/**
	 * 
	 * @param resource
	 * @return
	 */
	public static boolean isLoading(Resource resource){
		if ( !(resource instanceof ResourceImpl)){ return false; }

		ResourceImpl resourceImpl = (ResourceImpl)resource;
		if ( !resourceImpl.isLoading()){ return false; }
		
		return true;
	}

	/** logic is object loading
	 * 
	 * @param object
	 * @return 
	 */
	public static boolean isLoading(EObject object){
		if ( !hasResource(object) ) { return false; }
		Resource resource = object.eResource();
		return isLoading(resource);
	}
	

	/**
	 * 
	 * @param notifier
	 * @return
	 */
	public static boolean isUnoading(Notifier notifier){
		if ( notifier instanceof Resource) { return isUnloading((Resource)notifier); }
		else if ( notifier instanceof EObject) { return isUnloading((EObject)notifier); }
		return false;
	}

	/**
	 * 
	 * @param resource
	 * @return
	 */
	public static boolean isUnloading(Resource resource){
		if ( !(resource instanceof ResourceImpl)){ return false; }

		ResourceImpl resourceImpl = (ResourceImpl)resource;
		if ( resourceImpl.isLoaded()){ return false; }
		
		return true;
	}

	/** logic is object loading
	 * 
	 * @param object
	 * @return 
	 */
	public static boolean isUnloading(EObject object){
		if ( !hasResource(object) ) { return false; }
		Resource resource = object.eResource();
		return isUnloading(resource);
	}
	

	/**
	 * 
	 * @param target
	 * @param type
	 * @return
	 */
	static public Adapter adapt(Object target, Object type, boolean create) {
		if ( !(target instanceof Notifier)){ return null;	  }
		Notifier notifier = (Notifier)target;

		if ( !(type instanceof Class<?>) ) { return null; }
		Class<?>theClass = (Class<?>)type;

		for (Adapter adapter : notifier.eAdapters()){
			if ( theClass.isInstance(adapter) ){
				return adapter;
			}
		} // traverse the adapater asis
		
		if ( !create) { return null; }
		
		// create
		try {
			Constructor<?> constructor = theClass.getDeclaredConstructor();
			Adapter newAdapter = (Adapter)constructor.newInstance();
			notifier.eAdapters().add(newAdapter);
			return newAdapter;
		} catch (Exception e) {
			CommonPlugin.INSTANCE.log("com.misc.common.moplaf.emf.util.adapt: no constructor for "+theClass.getName());
			return null;
		}
	}
	
	/**
	 * 
	 * @param target
	 * @param type
	 * @return
	 */
	static public Adapter adapt(Object target, Object type) {
		return adapt(target, type, false);
	}

	static public double getDoubleValue(Object cellValue, int cellType) {
		switch ( cellType ) {
		case DATA_TYPE_FLOAT:
			return (Float)cellValue;
		case DATA_TYPE_DOUBLE:
			return (Double)cellValue;
		case DATA_TYPE_INT:
			return (Integer)cellValue;
		case DATA_TYPE_LONG:
			return (Long)cellValue;
		case DATA_TYPE_BOOLEAN:
			boolean value_boolean = (Boolean)cellValue;
			return value_boolean ? 1.0d : 0.0d;
		case DATA_TYPE_STRING: 
		case DATA_TYPE_DATE: 
		default: 
			return 0.0;
		}
	}

	static public float getFloatValue(Object cellValue, int cellType) {
		return (float)getDoubleValue(cellValue, cellType);
	}

	static public String getTextFromValue(Object cellValue, int cellType, String format) {
		if ( cellValue==null ) {
			return null;
		} else if ( format!=null) {
			return String.format(format, cellValue);
		} else {
			switch ( cellType ) {
			case DATA_TYPE_STRING: 
				return (String)cellValue;
			case DATA_TYPE_DATE: 
				return String.format("%1$tF %1$tT", cellValue);
			case DATA_TYPE_FLOAT:
			case DATA_TYPE_DOUBLE:
				return String.format("%1$.2f", cellValue);
			case DATA_TYPE_INT:
			case DATA_TYPE_LONG:
				return String.format("%1$d", cellValue);
			case DATA_TYPE_BOOLEAN:
				return String.format("%1$b", cellValue);
			case DATA_TYPE_EMF_ENUM:
				EEnumLiteral literal = (EEnumLiteral) cellValue;
				return literal.getLiteral();
			default: 
				return "";
			}
		}
	}

	static public Object getTypeCellValue(Number cellValue, int cellType) {
		switch ( cellType ) {
		case DATA_TYPE_FLOAT:
			return cellValue.floatValue();
		case DATA_TYPE_DOUBLE:
			return cellValue.doubleValue();
		case DATA_TYPE_INT:
			return cellValue.intValue();
		case DATA_TYPE_LONG:
			return cellValue.longValue();
		case DATA_TYPE_BOOLEAN:
		case DATA_TYPE_STRING: 
		case DATA_TYPE_DATE: 
		default: 
			return null;
		}
	}
	
	static public int toPropertyType(EDataType data_type) {
		if ( data_type==EcorePackage.Literals.ESTRING )         { return DATA_TYPE_STRING; }
		if ( data_type==EcorePackage.Literals.EDATE )           { return DATA_TYPE_DATE; }
		if ( data_type==EcorePackage.Literals.EFLOAT )          { return DATA_TYPE_FLOAT; }
		if ( data_type==EcorePackage.Literals.EDOUBLE)          { return DATA_TYPE_DOUBLE; }
		if ( data_type==EcorePackage.Literals.ELONG )           { return DATA_TYPE_LONG; }
		if ( data_type==EcorePackage.Literals.EINT )            { return DATA_TYPE_INT; }
		if ( data_type==EcorePackage.Literals.EBOOLEAN )        { return DATA_TYPE_BOOLEAN; }
		if ( data_type==EcorePackage.Literals.EBOOLEAN_OBJECT ) { return DATA_TYPE_BOOLEAN; }
		if ( data_type instanceof EEnum )                       { return DATA_TYPE_EMF_ENUM; }
		return DATA_TYPE_UNKOWN;
	}
}
