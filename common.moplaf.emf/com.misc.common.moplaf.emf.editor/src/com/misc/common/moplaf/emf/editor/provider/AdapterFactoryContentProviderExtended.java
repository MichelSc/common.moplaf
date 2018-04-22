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
package com.misc.common.moplaf.emf.editor.provider;



import java.util.Date;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

import com.misc.common.moplaf.emf.ui.CellEditorFactory;


/**
 * <!-- begin-user-doc -->
 * This AdapterFactoryContentProvider provides a specialized PropertySource and PropertyDescriptor, allowing
 * for a selection of fields
 * <ul>
 *   <li>to edit date or time with a calendar dialog</li>
 *   <li>to select a color with a color selector</li>
 *   <li>to select a file path with qn object selecter</li>
 * </ul>
 * 
 * Usage, in an emf editor project
 * <ul>
 *   <li>1) add com.misc.common.moplaf.emf.editor in the plugin dependencies</li>
 *   <li>2) in the the method getPropertySheetPage, use this ContentProvider as PropertySourceProvider</li>
 *   <li>3) add appropriate feature selectors to the editDates, e.g. call AddSelectorAll</li>
 * </ul>
 * 
 * <!-- end-user-doc -->
 * @generated
 */

public class AdapterFactoryContentProviderExtended extends
		AdapterFactoryContentProvider {
	// subclass PropertyDescriptorPrivate
	private class PropertyDescriptorPrivate extends PropertyDescriptor {
		// constructor
		public PropertyDescriptorPrivate(Object object, IItemPropertyDescriptor itemPropertyDescriptor) {
			super(object, itemPropertyDescriptor);
		}
		// create property editor
		public CellEditor createPropertyEditor(Composite composite) {
		   EStructuralFeature eFeature = (EStructuralFeature)itemPropertyDescriptor.getFeature(object);
		   EObject eObject = (EObject)object;
		   Object value = eObject.eGet(eFeature);
		   EClassifier eType = eFeature.getEType();
		   if ( eType instanceof EDataType){
			   EDataType eDataType = (EDataType) eType;
			   if ( AdapterFactoryContentProviderExtended.this.editDates.isFeatureSelected(eFeature)
				 && eDataType.getInstanceClass() == Date.class ){
			  	  	return CellEditorFactory.editDate(composite, getEditLabelProvider(), (Date)value);
			   }  // if class is Date and feature is selected as Date
			   else if ( AdapterFactoryContentProviderExtended.this.editDateTimes.isFeatureSelected(eFeature)
				 && eDataType.getInstanceClass() == Date.class ){
				   return CellEditorFactory.editDateTime(composite, getEditLabelProvider(), (Date)value);
			   }  // if class is Date and feature is selected as DateTime
			   else if ( AdapterFactoryContentProviderExtended.this.editTimes.isFeatureSelected(eFeature)
				 && eDataType.getInstanceClass() == float.class ){
				   return CellEditorFactory.editTime(composite, getEditLabelProvider(), (Float)value);
			   }  // if class is float and feature is selected as time
			   else if ( AdapterFactoryContentProviderExtended.this.editFilePaths.isFeatureSelected(eFeature)
				 && eDataType.getInstanceClass() == String.class ){
				   return CellEditorFactory.editFilePath(composite, getEditLabelProvider(), (String) value);
			   }  // if class is String and feature is selected as file path
			   else if ( AdapterFactoryContentProviderExtended.this.editColors.isFeatureSelected(eFeature)
				 && eDataType.getInstanceClass() == int.class ){
				   return CellEditorFactory.editColor(composite, getEditLabelProvider(), (Integer)value);
			   }  // if class is String and feature is selected as file path
		   }
		   return super.createPropertyEditor(composite);
		}  // create property editor

	}  // class POPropertyDescriptor
	
    abstract class FeatureSelector {
    	boolean isFeatureSelected(EStructuralFeature feature){
    		return false;
    	}
    }
    	
    class FeatureSelectorStructuralFeature extends FeatureSelector{
    	private EStructuralFeature structuralFeature;
    	public FeatureSelectorStructuralFeature(EStructuralFeature structuralFeature){
    		this.structuralFeature = structuralFeature;
    	}
    	@Override
    	boolean isFeatureSelected(EStructuralFeature feature){
    		return feature == this.structuralFeature;
    	}
    }
					
    class FeatureSelectorClass extends FeatureSelector{
    	private EClass eclass;
    	public FeatureSelectorClass(EClass eclass){
    		this.eclass = eclass;
    	}
    	@Override
    	boolean isFeatureSelected(EStructuralFeature feature){
    		return feature.getEContainingClass() == this.eclass;
    	}
    }
					
    class FeatureSelectorPackage extends FeatureSelector{
    	private EPackage epackage;
    	public FeatureSelectorPackage(EPackage epackage){
    		this.epackage = epackage;
    	}
    	@Override
    	boolean isFeatureSelected(EStructuralFeature feature){
    		return feature.getEContainingClass().getEPackage() == this.epackage;
    	}
    }
    
    class FeatureSelectorAll extends FeatureSelector{
    	public FeatureSelectorAll(){
    	}
    	@Override
    	boolean isFeatureSelected(EStructuralFeature feature){
    		return true;
    	}
    }
    
    public class FeatureSelectors extends LinkedList<FeatureSelector>{
    	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public void addSelectorAll(){
    		this.add(new FeatureSelectorAll());
    	}
    	public void addSelector(EStructuralFeature feature){
    		this.add(new FeatureSelectorStructuralFeature(feature));
    	}
    	public void addSelector(EClass eclass){
    		this.add(new FeatureSelectorClass(eclass));
    	}
    	public void addSelector(EPackage epackage){
    		this.add(new FeatureSelectorPackage(epackage));
    	}
    	public boolean isFeatureSelected(EStructuralFeature feature){
    		for ( FeatureSelector selector : this){
    			if ( selector.isFeatureSelected(feature)){return true; }
    		}
    		return false;	
    	}
    }
    					
    public FeatureSelectors editDates     = new FeatureSelectors();
    public FeatureSelectors editTimes     = new FeatureSelectors();
    public FeatureSelectors editDateTimes = new FeatureSelectors();
    public FeatureSelectors editFilePaths = new FeatureSelectors();
    public FeatureSelectors editColors    = new FeatureSelectors();
	
	// subclass PropertySourcePrivate
	private class PropertySourcePrivate extends PropertySource {
		// constructor
		public PropertySourcePrivate(Object object, IItemPropertySource itemPropertySource) {
			super(object, itemPropertySource);
		}
		// create property descriptor
		protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
			return new PropertyDescriptorPrivate(object, itemPropertyDescriptor);
		}		
	}  // subclass POPropertySource

	// constructor
	public AdapterFactoryContentProviderExtended(AdapterFactory adapterFactory){
		super(adapterFactory);
	}
	
	// create property source
	protected IPropertySource createPropertySource(Object object,
			                                       IItemPropertySource itemPropertySource) {
	return new PropertySourcePrivate(object, itemPropertySource);
	}

}
