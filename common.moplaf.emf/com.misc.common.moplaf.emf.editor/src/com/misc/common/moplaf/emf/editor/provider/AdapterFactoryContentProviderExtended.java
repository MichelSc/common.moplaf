package com.misc.common.moplaf.emf.editor.provider;

import com.misc.common.moplaf.emf.edit.Util;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;


import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;

/**
 * <!-- begin-user-doc -->
 * This AdapterFactoryContentProvider provides a specialized PropertySource and PropertyDescriptior, allowing
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
		   EClassifier eType = eFeature.getEType();
		   if ( eType instanceof EDataType){
			   EDataType eDataType = (EDataType) eType;
			   if ( AdapterFactoryContentProviderExtended.this.editDates.isFeatureSelected(eFeature)
				 && eDataType.getInstanceClass() == Date.class ){
			  	  	return editDate(composite, object, eFeature);
			   }  // if class is Date and feature is selected as Date
			   else if ( AdapterFactoryContentProviderExtended.this.editDateTimes.isFeatureSelected(eFeature)
				 && eDataType.getInstanceClass() == Date.class ){
			  	  	return editDateTime(composite, object, eFeature);
			   }  // if class is Date and feature is selected as DateTime
			   else if ( AdapterFactoryContentProviderExtended.this.editTimes.isFeatureSelected(eFeature)
				 && eDataType.getInstanceClass() == float.class ){
			  	  	return editTime(composite, object, eFeature);
			   }  // if class is float and feature is selected as time
			   else if ( AdapterFactoryContentProviderExtended.this.editFilePaths.isFeatureSelected(eFeature)
				 && eDataType.getInstanceClass() == String.class ){
			  	  	return editFilePath(composite, object, eFeature);
			   }  // if class is String and feature is selected as file path
			   else if ( AdapterFactoryContentProviderExtended.this.editColors.isFeatureSelected(eFeature)
				 && eDataType.getInstanceClass() == int.class ){
			  	  	return editColor(composite, object, eFeature);
			   }  // if class is String and feature is selected as file path
		   }
		   return super.createPropertyEditor(composite);
		}  // create property editor

		// Edit a field FilePath as String
		CellEditor editFilePath(Composite composite, Object object, EStructuralFeature feature){
			EObject eObject = (EObject)object;
	    	final String filePathAsIs= (String)eObject.eGet(feature);
	    	//final Path filePath = Paths.get(filePathAsIs);
	    	//final String filePathAsString = filePath.getParent().toString();
	    	ExtendedDialogCellEditor result = new ExtendedDialogCellEditor(composite, getEditLabelProvider()){
	            	protected Object openDialogBox(Control cellEditorWindow) {
	                FileDialog d = new FileDialog (cellEditorWindow.getShell(), SWT.OPEN);
  	                d.setFileName(filePathAsIs);
  	                //d.setFilterPath(filePathAsString);
	                String filePathToBe = d.open();  // open the dialog
	                return filePathToBe;
	            	} // opendialogBox
	         };  // class ExtendedDialogCellEditor
	         return result;  // return from EditDate
		}  // method EditDate
		
		// Edit a field Color as Integer
		CellEditor editColor(Composite composite, Object object, EStructuralFeature feature){
			EObject eObject = (EObject)object;
	    	final int colorAsIs= (Integer)eObject.eGet(feature);
	    	final RGB rgbAsIs = Util.integerToRgb(colorAsIs);
	    	ExtendedDialogCellEditor result = new ExtendedDialogCellEditor(composite, getEditLabelProvider()){
	            	protected Object openDialogBox(Control cellEditorWindow) {
	                ColorDialog d = new ColorDialog (cellEditorWindow.getShell(), SWT.OPEN);
  	                d.setRGB(rgbAsIs);
	                RGB rgbToBe = d.open();  // open the dialog
	                Integer toReturn = Util.rgbToInt(rgbToBe);
	                return toReturn;
	            	} // opendialogBox
	         };  // class ExtendedDialogCellEditor
	         return result;  // return from EditDate
		}  // method EditDate

		// Edit a field EDate
		CellEditor editDate(Composite composite, Object object, EStructuralFeature feature)
		{
	    	ExtendedDialogCellEditor result = null;
			EObject eObject = (EObject)object;
	    	final Date dateasis = (Date)eObject.eGet(feature);
	        result = new ExtendedDialogCellEditor(composite, getEditLabelProvider()){
	             protected Object openDialogBox(Control cellEditorWindow) {
	                final DateTime dateTime[] = new DateTime[1];
	                final int[] fields = new int[3];
	                Dialog d = new Dialog(cellEditorWindow.getShell()){
	                   protected Control createDialogArea(Composite parent) {
	                	  // create the dialogarea
	                      Composite dialogArea = (Composite) super.createDialogArea(parent);
	                      // create the widget
	                      dateTime[0] = new DateTime(dialogArea, SWT.CALENDAR | SWT.LONG);
	                      // initialize the widget
   	          	    	  final GregorianCalendar calendarasis = new GregorianCalendar();
   	          	    	  Date initialDate = dateasis == null ? new Date() : dateasis;
   	       	    	      calendarasis.setTime(initialDate);
	                      fields[0] = calendarasis.get(Calendar.YEAR);
	                      fields[1] = calendarasis.get(Calendar.MONTH);
	                      fields[2] = calendarasis.get(Calendar.DAY_OF_MONTH);
	                      dateTime[0].setYear   (fields[0]);
	                      dateTime[0].setMonth  (fields[1]);
	                      dateTime[0].setDay    (fields[2]);
	                      // add the selection listener
	                      dateTime[0].addSelectionListener(new SelectionAdapter(){
	                          public void widgetSelected(SelectionEvent e) {
	                              fields[0] = dateTime[0].getYear();
	                              fields[1] = dateTime[0].getMonth();
	                              fields[2] = dateTime[0].getDay();
	                              super.widgetSelected(e);
	                           } // method widgetSelected
	                      }  // class SelectionAdapter 
	                      );  // call addSelectionListener
	                      return dialogArea;
	                   } // method createDialogArea
	                };  // class dialog
	               d.setBlockOnOpen(true);
	               d.open();  // open the dialog
	               if(d.getReturnCode() == Dialog.OK){ 
		            	  GregorianCalendar calendar = new GregorianCalendar(fields[0], fields[1], fields[2]); 
		                  return calendar.getTime();  // return from OpenDialogBox
	               }
	               return null;
	            } // opendialogBox
	         };  // class ExtendedDialogCellEditor
	         return result;  // return from EditDate
		}  // method EditDate

		// Edit a field EDateTime
		CellEditor editDateTime(Composite composite, Object object, EStructuralFeature feature)		{
	    	ExtendedDialogCellEditor result = null;
			EObject eObject = (EObject)object;
	    	final Date dateasis = (Date)eObject.eGet(feature);
	        result = new ExtendedDialogCellEditor(composite, getEditLabelProvider()){
	             protected Object openDialogBox(Control cellEditorWindow) {
	                final DateTime dateTime[] = new DateTime[2];
	                final int[] fields = new int[6];
	                Dialog d = new Dialog(cellEditorWindow.getShell()){
	                   protected Control createDialogArea(Composite parent) {
	                	  // create the dialogarea
	                      Composite dialogArea = (Composite) super.createDialogArea(parent);
	                      // create the widget
	                      dateTime[0] = new DateTime(dialogArea, SWT.CALENDAR | SWT.LONG);
	                      dateTime[1] = new DateTime(dialogArea, SWT.TIME | SWT.LONG);
	                      // initialize the widget
   	          	    	  final GregorianCalendar calendarasis = new GregorianCalendar();
   	          	    	  Date initialDate = dateasis==null ? new Date() : dateasis;
   	       	    	      calendarasis.setTime(initialDate);
	                      fields[0] = calendarasis.get(Calendar.YEAR);
	                      fields[1] = calendarasis.get(Calendar.MONTH);
	                      fields[2] = calendarasis.get(Calendar.DAY_OF_MONTH);
	                      fields[3] = calendarasis.get(Calendar.HOUR);
	                      fields[4] = calendarasis.get(Calendar.MINUTE);
	                      fields[5] = calendarasis.get(Calendar.SECOND);
	                      dateTime[0].setYear   (fields[0]);
	                      dateTime[0].setMonth  (fields[1]);
	                      dateTime[0].setDay    (fields[2]);
	                      dateTime[1].setHours  (fields[3]);
	                      dateTime[1].setMinutes(fields[4]);
	                      dateTime[1].setSeconds(fields[5]);
	                      // add the selection listener
	                      dateTime[0].addSelectionListener(new SelectionAdapter(){
	                          public void widgetSelected(SelectionEvent e) {
	                              fields[0] = dateTime[0].getYear();
	                              fields[1] = dateTime[0].getMonth();
	                              fields[2] = dateTime[0].getDay();
	                              super.widgetSelected(e);
	                           } // method widgetSelected
	                      }  // class SelectionAdapter 
   	                      );  // call addSelectionListener
	                      dateTime[1].addSelectionListener(new SelectionAdapter(){
	                          public void widgetSelected(SelectionEvent e) {
	                        	  fields[3] = dateTime[1].getHours();
	                        	  fields[4] = dateTime[1].getMinutes();
	                        	  fields[5] = dateTime[1].getSeconds();
	                              super.widgetSelected(e);
	                           } // method widgetSelected
	                      }  // class SelectionAdapter 
	                      );  // call addSelectionListener
	                      return dialogArea;
	                   } // method createDialogArea
	                };  // class dialog
	               d.setBlockOnOpen(true);
	               d.open();  // open the dialog
	               if(d.getReturnCode() == Dialog.OK){
	            	  GregorianCalendar calendar = new GregorianCalendar(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5]); 
	                  return calendar.getTime();  // return from OpenDialogBox
	               }
	               return null;
	            } // opendialogBox
	         };  // class ExtendedDialogCellEditor
	         return result;  // return from EditDateTime
		}  // method EditDateTime

		// Edit a field Time as float
		CellEditor editTime(Composite composite, Object object, EStructuralFeature feature)
		{
	    	CellEditor result = null;
			EObject eObject = (EObject)object;
	    	final Float timeasis = (Float)eObject.eGet(feature);  // in hours
	        result = new ExtendedDialogCellEditor(composite, getEditLabelProvider()){
	             protected Object openDialogBox(Control cellEditorWindow) {
	                final DateTime dateTime[] = new DateTime[1];
	                final int[] fields = new int[3];
	                Dialog d = new Dialog(cellEditorWindow.getShell()){
	                   protected Control createDialogArea(Composite parent) {
	                	  // create the dialogarea
	                      Composite dialogArea = (Composite) super.createDialogArea(parent);
	                      // create the widget
	                      dateTime[0] = new DateTime(dialogArea, SWT.TIME | SWT.LONG);
	                      // initialize the widget
	                      Float intialTime = timeasis == null ? 0.0f : timeasis;
          	    		  int hours = (int) Math.floor(intialTime);
          	    		  double minutesnotrounded = (timeasis-hours)*60.0;
          	    		  int minutes = (int) Math.floor(minutesnotrounded);
          	    		  int seconds = (int) Math.round((minutesnotrounded-minutes)*60.0);
	                      dateTime[0].setHours  (hours);
	                      dateTime[0].setMinutes(minutes);
	                      dateTime[0].setSeconds(seconds);
	                      // add the selection listener
	                      dateTime[0].addSelectionListener(new SelectionAdapter(){
	                          public void widgetSelected(SelectionEvent e) {
	                        	  fields[0] = dateTime[0].getHours();
	                        	  fields[1] = dateTime[0].getMinutes();
	                        	  fields[2] = dateTime[0].getSeconds();
	                              super.widgetSelected(e);
	                           } // method widgetSelected
	                      }  // class SelectionAdapter 
	                      );  // call addSelectionListener
	                      return dialogArea;
	                   } // method createDialogArea
	                };  // class dialog
	               d.setBlockOnOpen(true);
	               d.open();  // open the dialog
	               if(d.getReturnCode() == Dialog.OK){ 
                 	  Float hoursnotrounded = fields[0]+fields[1]/60.0f+fields[2]/3600.0f;
                      return hoursnotrounded;
	               }
	               return null;
	            } // opendialogBox
	         };  // class ExtendedDialogCellEditor
	         return result;  // return from EditTime
		}  // method EditTime
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