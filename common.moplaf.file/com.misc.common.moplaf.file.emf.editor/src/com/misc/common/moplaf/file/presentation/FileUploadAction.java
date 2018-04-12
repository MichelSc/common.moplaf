package com.misc.common.moplaf.file.presentation;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import com.misc.common.moplaf.emf.editor.action.BaseAction;
import com.misc.common.moplaf.file.FileFactory;
import com.misc.common.moplaf.file.FileLocal;
import com.misc.common.moplaf.file.FileOwner;

public class FileUploadAction extends BaseAction {

	/**
	 * 
	 */
	public final static String ID = "com.misc.common.moplaf.file.emf.editor.action.FileUpload";
	
	private FileOwner selected;
	private ILabelProvider labelProvider;

	public FileUploadAction(IWorkbenchPart workbenchPart, ISelection selection, ILabelProvider labelProvider) {
		super(workbenchPart, selection);  // calls configureAction
		this.labelProvider = labelProvider;
		setId(ID);
	}
	
	/**
	 * This configures the action.
	 * Should be overriden by the concrete class
	 */
	@Override
	protected void configureAction(){
		// retrieve the selection object
		FileOwner file_owner = null;
		if ( this.selection instanceof IStructuredSelection) {
			IStructuredSelection structured_selection = (IStructuredSelection) this.selection;
			if ( !structured_selection.isEmpty()) {
				Object selected_object = structured_selection.getFirstElement();
				if ( selected_object instanceof FileOwner  ) {
					file_owner = (FileOwner)selected_object;
				}
			}
		}
		this.selected = file_owner;
		
		// set action properties
		if ( file_owner==null ) {
			this.disable();
		} else {
			this.setEnabled(true);
			setImageDescriptor(getDefaultImageDescriptor());
			setText       ("File Upload");
			setDescription("Upload files");
			setToolTipText("Upload files");
		}
	}
	
	@Override
	public void run() {
		// open the file dialog
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		FileDialog d = new FileDialog (shell, SWT.OPEN | SWT.MULTI);
	    String label = "...";
	    if ( this.labelProvider!=null ) {
	    	label = this.labelProvider.getText(this.selected);
	    }
		d.setText("Files upload to "+label);
        d.open();  
		
		// add the uploaded files
        for (String filepath : d.getFileNames()) {
        	FileLocal new_file = FileFactory.eINSTANCE.createFileLocal();
        	new_file.setFilePath(filepath);
        	Path p = Paths.get(filepath);
        	String name = p.getFileName().toString();
        	new_file.setName(name);
			this.selected.getFiles().add(new_file);
        }
	}
}
