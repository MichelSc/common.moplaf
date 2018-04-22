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
package com.misc.common.moplaf.emf.ui;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.FileDialog;

import com.misc.common.moplaf.common.Color;


public class CellEditorFactory {
	// Edit a field FilePath as String
	public static CellEditor editFilePath(Composite composite, ILabelProvider label_provider, String path){
    	final String filePathAsIs= path;
    	ExtendedDialogCellEditor result = new ExtendedDialogCellEditor(composite, label_provider){
            	protected Object openDialogBox(Control cellEditorWindow) {
                FileDialog d = new FileDialog (cellEditorWindow.getShell(), SWT.OPEN | SWT.SAVE);
	                d.setFileName(filePathAsIs);
	                //d.setFilterPath(filePathAsString);
                String filePathToBe = d.open();  // open the dialog
                return filePathToBe;
            	} // opendialogBox
         };  // class ExtendedDialogCellEditor
         return result;  // return from EditDate
	}  // method EditDate
	
	// Edit a field Color as Integer
	public static CellEditor editColor(Composite composite, ILabelProvider label_provider, Integer color){
    	Color colorAsIs = new Color(color);
    	final RGB rgbAsIs = new RGB(colorAsIs.getR(), colorAsIs.getG(), colorAsIs.getB());
    	ExtendedDialogCellEditor result = new ExtendedDialogCellEditor(composite, label_provider){
            	protected Object openDialogBox(Control cellEditorWindow) {
                ColorDialog d = new ColorDialog (cellEditorWindow.getShell(), SWT.OPEN);
	                d.setRGB(rgbAsIs);
                RGB rgbToBe = d.open();  // open the dialog
                if ( rgbToBe == null){
                	return null;
                }
                Color colorToBe = new Color(rgbToBe.red, rgbToBe.green, rgbToBe.blue);
                return colorToBe.toInt();
            	} // opendialogBox
         };  // class ExtendedDialogCellEditor
         return result;  // return from EditDate
	}  // method EditDate

	// Edit a field EDate
	public static CellEditor editDate(Composite composite, ILabelProvider label_provider, Date date)
	{
    	ExtendedDialogCellEditor result = null;
    	final Date dateasis = date;
        result = new ExtendedDialogCellEditor(composite, label_provider){
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
	public static CellEditor editDateTime(Composite composite, ILabelProvider label_provider, Date value){
    	ExtendedDialogCellEditor result = null;
    	final Date dateasis = value;
        result = new ExtendedDialogCellEditor(composite, label_provider){
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
	public static CellEditor editTime(Composite composite, ILabelProvider label_provider, Float value)
	{
    	CellEditor result = null;
    	final Float timeasis = value;  // in hours
        result = new ExtendedDialogCellEditor(composite, label_provider){
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

}
