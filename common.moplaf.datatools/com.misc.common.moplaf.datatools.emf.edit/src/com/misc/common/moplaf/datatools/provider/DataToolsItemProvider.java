/**
 */
package com.misc.common.moplaf.datatools.provider;


import com.misc.common.moplaf.datatools.DataTool;
import com.misc.common.moplaf.datatools.DataTools;
import com.misc.common.moplaf.datatools.DatatoolsFactory;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.emf.edit.command.BaseCommand;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.datatools.DataTools} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataToolsItemProvider 
	extends DataToolContextItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataToolsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DatatoolsPackage.Literals.DATA_TOOLS__DATA_TOOLS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DataTools.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataTools"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DataTools_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DataTools.class)) {
			case DatatoolsPackage.DATA_TOOLS__DATA_TOOLS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createExtractorType()));

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createExtractorPath()));

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createExtractorOcl()));

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createExtractorFilterRegex()));

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createExtractorFilterAttributeIntRange()));

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createExtractorFilterOcl()));

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createExtractorFilterAND()));

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createExtractorFilterOR()));

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createExtractorCompound()));

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createExtractorPipe()));

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createExtractorUnion()));

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createExtractorIntersection()));

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createColumnizer()));

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createCategorizerStructuralFeature()));

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.DATA_TOOLS__DATA_TOOLS,
				 DatatoolsFactory.eINSTANCE.createCategorizerOcl()));
	}

	/*
	 * AddDataToolCommand
	 */
	public class AddDataToolCommand extends BaseCommand{
		private DataTools datatools;
		private DataTool datatool;
		
		// constructor
		public AddDataToolCommand(DataTools tools, DataTool tool)	{
			super("AddDataTool", "Add the DataTool");
			this.datatools = tools;
			this.datatool = tool;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			return isExecutable;
		}

		@Override
		public void execute() {
			this.datatools.getDataTools().add(this.datatool.clone());
		}
	} // class AddDataToolCommand
	
	protected Command createDropCommandSingle(EditingDomain domain, DataTools owner, Object droppedObject){ 
		if ( droppedObject instanceof DataTool){
			DataTool dropped_tool = (DataTool) droppedObject;
  	   		AddDataToolCommand cmd = new AddDataToolCommand(owner, dropped_tool);
		   	return cmd;
		} 
		return null;
	}
	
	protected Command createDropCommandMulti(EditingDomain domain, DataTools owner, Collection<?> droppedObjects) {
    	CompoundCommand compound = new CompoundCommand();
		for (Object droppedObject : droppedObjects){
			Command cmd = DataToolsItemProvider.this.createDropCommandSingle(domain, owner, droppedObject);
			if ( cmd !=null ) {
				compound.append(cmd);
			}
		}
		if ( !compound.isEmpty() ) {
			return compound;
		}
		return null;
	}

	
	/**
	 * Create a drag and drop command for this Run
	 */
	private class DataToolsDropCommand extends DragAndDropCommand {

		public DataToolsDropCommand(EditingDomain domain, Object owner, float location, int operations,
				int operation, Collection<?> collection) {
			super(domain, owner, location, operations, operation, collection);
		}
	   	
	    /**
	     * This implementation of prepare is called again to implement {@link #validate validate}.
	     * The method {@link #reset} will have been called before doing so.
	     */
	    @Override
	    protected boolean prepare(){
			Command cmd = DataToolsItemProvider.this.createDropCommandMulti(this.domain, (DataTools) this.owner, this.collection);
			if ( cmd == null ){
				return super.prepare();
			}
	    	this.dragCommand = null;
			this.dropCommand = cmd;
	    	return true;
	    } // prepare
	};
	
	/**
	 * Create a command for a drag and drop on this Run
	 */
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
			int operation, Collection<?> collection) {
		return new DataToolsDropCommand(domain, owner, location, operations, operation, collection);
	}

}
