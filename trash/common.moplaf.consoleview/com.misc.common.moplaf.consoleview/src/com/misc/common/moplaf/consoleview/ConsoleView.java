package com.misc.common.moplaf.consoleview;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class ConsoleView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.misc.common.moplaf.consoleview.ConsoleView";

	 private Text text;

	/**
	 * The constructor.
	 */
	public ConsoleView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		  this.text = new Text(parent
			  					, SWT.READ_ONLY 
				  				| SWT.MULTI
				  				| SWT.BORDER 
				  				| SWT.WRAP
				  				| SWT.V_SCROLL
				  				);
		  OutputStream out = new OutputStream() {
		   @Override
		   public void write(int b) throws IOException {
		    if (ConsoleView.this.text.isDisposed()) return;
		    ConsoleView.this.text.append(String.valueOf((char) b));
		   }
		  };
		  final PrintStream oldOut = System.out;
		  System.setOut(new PrintStream(out));
		  text.addDisposeListener(new DisposeListener() {
			  @Override
			  public void widgetDisposed(DisposeEvent e) {
				  System.setOut(oldOut);
			  }
		  });	
	} // method createPartControl

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		this.text.setFocus();
	}
}
