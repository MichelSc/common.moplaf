/**
 */
package com.misc.common.moplaf.analysis.provider;


import com.misc.common.moplaf.analysis.AnalysisPackage;

import com.misc.common.moplaf.analysis.DocAnalysis;
import com.misc.common.moplaf.datatools.DataTool;
import com.misc.common.moplaf.datatools.DataToolType;
import com.misc.common.moplaf.datatools.DatatoolsFactory;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import com.misc.common.moplaf.emf.edit.command.BaseCommand;
import com.misc.common.moplaf.emf.edit.command.RefreshCommand;
import com.misc.common.moplaf.job.provider.DocRefItemProvider;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.analysis.DocAnalysis} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocAnalysisItemProvider extends DocRefItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocAnalysisItemProvider(AdapterFactory adapterFactory) {
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

			addExtractorPropertyDescriptor(object);
			addCompletePropertyDescriptor(object);
			addMaxElementsPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addDataToolsPropertyDescriptor(object);
			addRefreshFeedbackPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addRemarksPropertyDescriptor(object);
			addCategoriesPropertyDescriptor(object);
			addElementsPropertyDescriptor(object);
			addNbElementsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Extractor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtractorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocAnalysis_Extractor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocAnalysis_Extractor_feature", "_UI_DocAnalysis_type"),
				 AnalysisPackage.Literals.DOC_ANALYSIS__EXTRACTOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Complete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompletePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocAnalysis_Complete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocAnalysis_Complete_feature", "_UI_DocAnalysis_type"),
				 AnalysisPackage.Literals.DOC_ANALYSIS__COMPLETE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocAnalysis_MaxElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocAnalysis_MaxElements_feature", "_UI_DocAnalysis_type"),
				 AnalysisPackage.Literals.DOC_ANALYSIS__MAX_ELEMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocAnalysis_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocAnalysis_Description_feature", "_UI_DocAnalysis_type"),
				 AnalysisPackage.Literals.DOC_ANALYSIS__DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Tools feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataToolsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocAnalysis_DataTools_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocAnalysis_DataTools_feature", "_UI_DocAnalysis_type"),
				 AnalysisPackage.Literals.DOC_ANALYSIS__DATA_TOOLS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refresh Feedback feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefreshFeedbackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocAnalysis_RefreshFeedback_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocAnalysis_RefreshFeedback_feature", "_UI_DocAnalysis_type"),
				 AnalysisPackage.Literals.DOC_ANALYSIS__REFRESH_FEEDBACK,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocAnalysis_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocAnalysis_Name_feature", "_UI_DocAnalysis_type"),
				 AnalysisPackage.Literals.DOC_ANALYSIS__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remarks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemarksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocAnalysis_Remarks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocAnalysis_Remarks_feature", "_UI_DocAnalysis_type"),
				 AnalysisPackage.Literals.DOC_ANALYSIS__REMARKS,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Categories feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocAnalysis_Categories_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocAnalysis_Categories_feature", "_UI_DocAnalysis_type"),
				 AnalysisPackage.Literals.DOC_ANALYSIS__CATEGORIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocAnalysis_Elements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocAnalysis_Elements_feature", "_UI_DocAnalysis_type"),
				 AnalysisPackage.Literals.DOC_ANALYSIS__ELEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nb Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNbElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocAnalysis_NbElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocAnalysis_NbElements_feature", "_UI_DocAnalysis_type"),
				 AnalysisPackage.Literals.DOC_ANALYSIS__NB_ELEMENTS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(DatatoolsPackage.Literals.COLUMNIZERS__COLUMNIZERS);
			childrenFeatures.add(AnalysisPackage.Literals.DOC_ANALYSIS__EXTRACTOR);
			childrenFeatures.add(AnalysisPackage.Literals.DOC_ANALYSIS__CATEGORIZERS);
			childrenFeatures.add(AnalysisPackage.Literals.DOC_ANALYSIS__CATEGORIES);
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
	 * This returns DocAnalysis.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/moplaf_analysis.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DocAnalysis)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_DocAnalysis_type") :
			getString("_UI_DocAnalysis_type") + " " + label;
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

		switch (notification.getFeatureID(DocAnalysis.class)) {
			case AnalysisPackage.DOC_ANALYSIS__COMPLETE:
			case AnalysisPackage.DOC_ANALYSIS__MAX_ELEMENTS:
			case AnalysisPackage.DOC_ANALYSIS__DESCRIPTION:
			case AnalysisPackage.DOC_ANALYSIS__REFRESH_FEEDBACK:
			case AnalysisPackage.DOC_ANALYSIS__NAME:
			case AnalysisPackage.DOC_ANALYSIS__REMARKS:
			case AnalysisPackage.DOC_ANALYSIS__NB_ELEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AnalysisPackage.DOC_ANALYSIS__COLUMNIZERS:
			case AnalysisPackage.DOC_ANALYSIS__EXTRACTOR:
			case AnalysisPackage.DOC_ANALYSIS__CATEGORIZERS:
			case AnalysisPackage.DOC_ANALYSIS__CATEGORIES:
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
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_ANALYSIS__EXTRACTOR,
				 DatatoolsFactory.eINSTANCE.createExtractorType()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_ANALYSIS__EXTRACTOR,
				 DatatoolsFactory.eINSTANCE.createExtractorPath()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_ANALYSIS__EXTRACTOR,
				 DatatoolsFactory.eINSTANCE.createFilterRegex()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_ANALYSIS__EXTRACTOR,
				 DatatoolsFactory.eINSTANCE.createFilterAttributeIntRange()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_ANALYSIS__EXTRACTOR,
				 DatatoolsFactory.eINSTANCE.createFilterAND()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_ANALYSIS__EXTRACTOR,
				 DatatoolsFactory.eINSTANCE.createFilterOR()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_ANALYSIS__EXTRACTOR,
				 DatatoolsFactory.eINSTANCE.createExtractorCompound()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_ANALYSIS__EXTRACTOR,
				 DatatoolsFactory.eINSTANCE.createExtractorPipe()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_ANALYSIS__EXTRACTOR,
				 DatatoolsFactory.eINSTANCE.createExtractorUnion()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_ANALYSIS__EXTRACTOR,
				 DatatoolsFactory.eINSTANCE.createExtractorIntersection()));

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.COLUMNIZERS__COLUMNIZERS,
				 DatatoolsFactory.eINSTANCE.createColumnizer()));

		newChildDescriptors.add
			(createChildParameter
				(AnalysisPackage.Literals.DOC_ANALYSIS__CATEGORIZERS,
				 DatatoolsFactory.eINSTANCE.createCategorizerStructuralFeature()));

		Util.collectNewChildRunDescriptors2(newChildDescriptors, object, AnalysisPackage.Literals.DOC_ANALYSIS__EXTRACTOR,    DataToolType.EXTRACTOR);
		Util.collectNewChildRunDescriptors2(newChildDescriptors, object, AnalysisPackage.Literals.DOC_ANALYSIS__CATEGORIZERS, DataToolType.CATEGORIZER);
		Util.collectNewChildRunDescriptors2(newChildDescriptors, object, DatatoolsPackage.Literals.COLUMNIZERS__COLUMNIZERS,  DataToolType.COLUMNIZER);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AnalysisEditPlugin.INSTANCE;
	}

	public class DocAnalysisRefreshCommand extends RefreshCommand{
		private DocAnalysis analysis;
		
		public DocAnalysisRefreshCommand(DocAnalysis analysis)	{
			super();
			this.analysis = analysis;
			
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = this.analysis.getRefreshFeedback().isEnabled();
			return isExecutable;
			}

		@Override
		public void execute() {
			this.analysis.refresh();
		}
	} // class TotalDemandRefreshCommand

	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if  ( commandClass == RefreshCommand.class){
			return new DocAnalysisRefreshCommand((DocAnalysis) object); 
		}

		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand

	/*
	 * AddDataToolCommand
	 */
	public class AddDataToolCommand extends BaseCommand{
		private DocAnalysis analysis;
		private DataTool datatool;
		
		// constructor
		public AddDataToolCommand(DocAnalysis analysis, DataTool datatool)	{
			super("AddDataTool", "Add the DataTool");
			this.analysis = analysis;
			this.datatool = datatool;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			return isExecutable;
		}

		@Override
		public void execute() {
			this.analysis.addTool(this.datatool.clone());
		}
	} // class AddDataToolCommand
	
	protected Command createDropCommandSingle(EditingDomain domain, DocAnalysis owner, Object droppedObject){ 
		if ( droppedObject instanceof DataTool){
			DataTool dropped_tool = (DataTool) droppedObject;
  	   		AddDataToolCommand cmd = new AddDataToolCommand(owner, dropped_tool);
		   	return cmd;
		} 
		return null;
	}
	
	protected Command createDropCommandMulti(EditingDomain domain, DocAnalysis owner, Collection<?> droppedObjects) {
    	CompoundCommand compound = new CompoundCommand();
		for (Object droppedObject : droppedObjects){
			Command cmd = DocAnalysisItemProvider.this.createDropCommandSingle(domain, owner, droppedObject);
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
			Command cmd = DocAnalysisItemProvider.this.createDropCommandMulti(this.domain, (DocAnalysis) this.owner, this.collection);
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
