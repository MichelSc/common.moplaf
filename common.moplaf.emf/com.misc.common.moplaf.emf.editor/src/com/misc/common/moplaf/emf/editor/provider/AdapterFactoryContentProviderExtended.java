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
import java.util.function.Predicate;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedColorRegistry;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
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
 *   <li>to control the background color of the property</li>
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
 */


public class AdapterFactoryContentProviderExtended extends	AdapterFactoryContentProvider {
	// subclass PropertyDescriptorPrivate
	private class PropertyDescriptorPrivate extends PropertyDescriptor {
		// constructor
		public PropertyDescriptorPrivate(Object object, IItemPropertyDescriptor itemPropertyDescriptor) {
			super(object, itemPropertyDescriptor);
		}
		// create property editor
		//   the very function of AdapterFactoryContentProvider: 
		//     to provide alternative editors for specific data fields
		@Override
		public CellEditor createPropertyEditor(Composite composite) {
			EStructuralFeature eFeature = (EStructuralFeature) this.itemPropertyDescriptor.getFeature(this.object);
			EObject eObject = (EObject)object;
			// get the feature
			if ( eFeature==null ) {
				return super.createPropertyEditor(composite);
			}
			// get the type
			EClassifier eType = eFeature.getEType();
			if ( !(eType  instanceof EDataType)) {
				return super.createPropertyEditor(composite);
			}
			Object value = eObject.eGet(eFeature);
			EDataType eDataType = (EDataType) eType;
			if ( AdapterFactoryContentProviderExtended.this.editDates.isFeatureSelected(eFeature, eObject)
					&& eDataType.getInstanceClass() == Date.class ){
				return CellEditorFactory.editDate(composite, getEditLabelProvider(), (Date)value);
			}  // if class is Date and feature is selected as Date
			else if ( AdapterFactoryContentProviderExtended.this.editDateTimes.isFeatureSelected(eFeature, eObject)
					&& eDataType.getInstanceClass() == Date.class ){
				return CellEditorFactory.editDateTime(composite, getEditLabelProvider(), (Date)value);
			}  // if class is Date and feature is selected as DateTime
			else if ( AdapterFactoryContentProviderExtended.this.editTimes.isFeatureSelected(eFeature, eObject)
					&& eDataType.getInstanceClass() == float.class ){
				return CellEditorFactory.editTime(composite, getEditLabelProvider(), (Float)value);
			}  // if class is float and feature is selected as time
			else if ( AdapterFactoryContentProviderExtended.this.editFilePaths.isFeatureSelected(eFeature, eObject)
					&& eDataType.getInstanceClass() == String.class ){
				return CellEditorFactory.editFilePath(composite, getEditLabelProvider(), (String) value);
			}  // if class is String and feature is selected as file path
			else if ( AdapterFactoryContentProviderExtended.this.editColors.isFeatureSelected(eFeature, eObject)
					&& eDataType.getInstanceClass() == int.class ){
				return CellEditorFactory.editColor(composite, getEditLabelProvider(), (Integer)value);
			}  // if class is String and feature is selected as file path
			return super.createPropertyEditor(composite);
		}  // create property editor
		// the returned object, with its ILabelProvider, for a given property value
		//    provides a label for the property value
		//    provides an image for the property value
		// if the returned object support IColorProvider
		//    provides a color for the Background of the property
		@Override
		public ILabelProvider getLabelProvider() {
			
			EStructuralFeature eFeature = (EStructuralFeature) this.itemPropertyDescriptor.getFeature(this.object);
			Object bg_color = null;
			for ( FeatureBackgroundColor background : featureColors) {
				if ( background.isFeatureSelected(eFeature, (EObject)this.object) ) {
					bg_color = background.getBackgroundColor();
					break;
				}
			}
			return new LabelProvider2(bg_color);
		}

		private class LabelProvider2 extends LabelProvider implements IColorProvider {
			final IItemLabelProvider itemLabelProvider = itemPropertyDescriptor.getLabelProvider(object);
			// members
			Object bg_color = null;
			// constructor
			public LabelProvider2(Object bg_color) {
				super();
				this.bg_color = bg_color;
			}

			@Override
			public String getText(Object object)
			{
				return itemLabelProvider.getText(object);
			}

			@Override
			public Image getImage(Object object)
			{
				return ExtendedImageRegistry.getInstance().getImage(itemLabelProvider.getImage(object));
			}

			@Override
			public Color getForeground(Object object) {
				return null;
			}

			@Override
			public Color getBackground(Object object) {
				return ExtendedColorRegistry.INSTANCE.getColor(null, null, this.bg_color);
			}
		}
	}  // class POPropertyDescriptor

	// FeatureSelector implementations
	// the predicate, if present, is a necessary condition
	abstract class FeatureSelector implements IFeatureSelector {
		// predicate to be satisfied by the Object containing the feature
		private Predicate<EObject> predicate = null;
		// constructor
		public FeatureSelector(Predicate<EObject> predicate) {
			super();
			this.predicate = predicate;
		}
		// getter
		public boolean isFeatureSelected(EStructuralFeature feature, EObject object){
			return false;
		}
		protected boolean isObjectSelected(EObject object){
			if ( this.predicate==null ) {
				return true;
			}
			return this.predicate.test(object);
		}
	}

	class FeatureSelectorStructuralFeature extends FeatureSelector{
		private EStructuralFeature structuralFeature;
		public FeatureSelectorStructuralFeature(EStructuralFeature structuralFeature, Predicate<EObject> predicate){
			super(predicate);
			this.structuralFeature = structuralFeature;
		}
		@Override
		public boolean isFeatureSelected(EStructuralFeature feature, EObject object){
			if ( !this.isObjectSelected(object)) { return false; }
			return feature == this.structuralFeature;
		}
	}

	class FeatureSelectorStructuralFeatureName extends FeatureSelector{
		private String structuralFeature_name;
		public FeatureSelectorStructuralFeatureName(String structuralFeature, Predicate<EObject> predicate){
			super(predicate);
			this.structuralFeature_name = structuralFeature;
		}
		@Override
		public boolean isFeatureSelected(EStructuralFeature feature, EObject object){
			if ( !this.isObjectSelected(object)) { return false; }
			return feature.getName().equals(this.structuralFeature_name);
		}
	}

	class FeatureSelectorClass extends FeatureSelector{
		private EClass eclass;
		public FeatureSelectorClass(EClass eclass, Predicate<EObject> predicate){
			super(predicate);
			this.eclass = eclass;
		}
		@Override
		public boolean isFeatureSelected(EStructuralFeature feature, EObject object){
			if ( !this.isObjectSelected(object)) { return false; }
			return feature.getEContainingClass() == this.eclass;
		}
	}

	class FeatureSelectorPackage extends FeatureSelector{
		private EPackage epackage;
		public FeatureSelectorPackage(EPackage epackage, Predicate<EObject> predicate){
			super(predicate);
			this.epackage = epackage;
		}
		@Override
		public boolean isFeatureSelected(EStructuralFeature feature, EObject object){
			if ( !this.isObjectSelected(object)) { return false; }
			return feature.getEContainingClass().getEPackage() == this.epackage;
		}
	}

	class FeatureSelectorAll extends FeatureSelector{
		public FeatureSelectorAll( Predicate<EObject> predicate){
			super(predicate);
		}
		@Override
		public boolean isFeatureSelected(EStructuralFeature feature, EObject object){
			if ( !this.isObjectSelected(object)) { return false; }
			return true;
		}
	}

	public class FeatureSelectors extends LinkedList<IFeatureSelector>{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public void addSelectorAll(){
			this.add(new FeatureSelectorAll(null));
		}
		public void addSelectorAll(Predicate<EObject> predicate){
			this.add(new FeatureSelectorAll(predicate));
		}
		public void addSelector(EStructuralFeature feature){
			this.add(new FeatureSelectorStructuralFeature(feature, null));
		}
		public void addSelector(EStructuralFeature feature, Predicate<EObject> predicate){
			this.add(new FeatureSelectorStructuralFeature(feature, predicate));
		}
		public void addSelector(String feature){
			this.add(new FeatureSelectorStructuralFeatureName(feature, null));
		}
		public void addSelector(String feature, Predicate<EObject> predicate){
			this.add(new FeatureSelectorStructuralFeatureName(feature, predicate));
		}
		public void addSelector(EClass eclass){
			this.add(new FeatureSelectorClass(eclass, null));
		}
		public void addSelector(EClass eclass, Predicate<EObject> predicate){
			this.add(new FeatureSelectorClass(eclass, predicate));
		}
		public void addSelector(EPackage epackage){
			this.add(new FeatureSelectorPackage(epackage, null));
		}
		public void addSelector(EPackage epackage, Predicate<EObject> predicate){
			this.add(new FeatureSelectorPackage(epackage, predicate));
		}
		public boolean isFeatureSelected(EStructuralFeature feature, EObject object){
			for ( IFeatureSelector selector : this){
				if ( selector.isFeatureSelected(feature, object)){
					return true; 
				}
			}
			return false;	
		}
	}

	public class FeatureBackgroundColor extends FeatureSelectors {
		private Object background = null;
		public FeatureBackgroundColor(Object a_color) {
			super();
			this.background = a_color;
		}
		public Object getBackgroundColor() {
			return background;
		}
	}

	public FeatureSelectors editDates     = new FeatureSelectors();
	public FeatureSelectors editTimes     = new FeatureSelectors();
	public FeatureSelectors editDateTimes = new FeatureSelectors();
	public FeatureSelectors editFilePaths = new FeatureSelectors();
	public FeatureSelectors editColors    = new FeatureSelectors();

	private LinkedList<FeatureBackgroundColor> featureColors = new LinkedList<>();
	public FeatureBackgroundColor addFeatureBackgroundColor(Object color) {
		FeatureBackgroundColor new_color = new FeatureBackgroundColor(color);
		featureColors.add(new_color);
		return new_color;
	}

	// subclass PropertySourcePrivate
	private class PropertySourcePrivate extends PropertySource {
		// constructor
		public PropertySourcePrivate(Object object, IItemPropertySource itemPropertySource) {
			super(object, itemPropertySource);
		}
		// create property descriptor
		@Override
		protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
			return new PropertyDescriptorPrivate(object, itemPropertyDescriptor);
		}		
	}  // subclass PropertySourcePrivate

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
