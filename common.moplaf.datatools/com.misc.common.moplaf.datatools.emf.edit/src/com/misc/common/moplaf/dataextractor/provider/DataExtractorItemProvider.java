/**
 */
package com.misc.common.moplaf.dataextractor.provider;


import com.misc.common.moplaf.dataextractor.DataExtractor;
import com.misc.common.moplaf.dataextractor.DataextractorFactory;
import com.misc.common.moplaf.dataextractor.DataextractorPackage;
import com.misc.common.moplaf.emf.edit.command.RefreshCommand;
import com.misc.common.moplaf.emf.edit.command.SaveCommand;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.dataextractor.DataExtractor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataExtractorItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExtractorItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addSourceObjectPropertyDescriptor(object);
			addNumberOfSelectedPropertyDescriptor(object);
			addMaxNumberOfSelectedPropertyDescriptor(object);
			addMaxNumberOfSelectedReachedPropertyDescriptor(object);
			addNumberOfExtractedPropertyDescriptor(object);
			addURISavePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_DataExtractor_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataExtractor_Name_feature", "_UI_DataExtractor_type"),
				 DataextractorPackage.Literals.DATA_EXTRACTOR__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__0ExtractorPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Object feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceObjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataExtractor_SourceObject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataExtractor_SourceObject_feature", "_UI_DataExtractor_type"),
				 DataextractorPackage.Literals.DATA_EXTRACTOR__SOURCE_OBJECT,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI__0ExtractorPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Selected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfSelectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataExtractor_NumberOfSelected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataExtractor_NumberOfSelected_feature", "_UI_DataExtractor_type"),
				 DataextractorPackage.Literals.DATA_EXTRACTOR__NUMBER_OF_SELECTED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__1ExtractedPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Number Of Selected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxNumberOfSelectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataExtractor_MaxNumberOfSelected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataExtractor_MaxNumberOfSelected_feature", "_UI_DataExtractor_type"),
				 DataextractorPackage.Literals.DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__0ExtractorPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Number Of Selected Reached feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxNumberOfSelectedReachedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataExtractor_MaxNumberOfSelectedReached_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataExtractor_MaxNumberOfSelectedReached_feature", "_UI_DataExtractor_type"),
				 DataextractorPackage.Literals.DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED_REACHED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__1ExtractedPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Extracted feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfExtractedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataExtractor_NumberOfExtracted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataExtractor_NumberOfExtracted_feature", "_UI_DataExtractor_type"),
				 DataextractorPackage.Literals.DATA_EXTRACTOR__NUMBER_OF_EXTRACTED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__1ExtractedPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the URI Save feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addURISavePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataExtractor_URISave_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataExtractor_URISave_feature", "_UI_DataExtractor_type"),
				 DataextractorPackage.Literals.DATA_EXTRACTOR__URI_SAVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__2SavePropertyCategory"),
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DataextractorPackage.Literals.DATA_EXTRACTOR__EXTRACTORS);
			childrenFeatures.add(DataextractorPackage.Literals.DATA_EXTRACTOR__SORTERS);
			childrenFeatures.add(DataextractorPackage.Literals.DATA_EXTRACTOR__TARGET_OBJECTS);
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
	 * This returns DataExtractor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataExtractor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataExtractor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DataExtractor_type") :
			getString("_UI_DataExtractor_type") + " " + label;
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

		switch (notification.getFeatureID(DataExtractor.class)) {
			case DataextractorPackage.DATA_EXTRACTOR__NAME:
			case DataextractorPackage.DATA_EXTRACTOR__NUMBER_OF_SELECTED:
			case DataextractorPackage.DATA_EXTRACTOR__MAX_NUMBER_OF_SELECTED:
			case DataextractorPackage.DATA_EXTRACTOR__NUMBER_OF_EXTRACTED:
			case DataextractorPackage.DATA_EXTRACTOR__URI_SAVE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DataextractorPackage.DATA_EXTRACTOR__TARGET_OBJECTS:
			case DataextractorPackage.DATA_EXTRACTOR__SORTERS:
			case DataextractorPackage.DATA_EXTRACTOR__EXTRACTORS:
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
				(DataextractorPackage.Literals.DATA_EXTRACTOR__SORTERS,
				 DataextractorFactory.eINSTANCE.createDataSorterFeature()));

		newChildDescriptors.add
			(createChildParameter
				(DataextractorPackage.Literals.DATA_EXTRACTOR__EXTRACTORS,
				 DataextractorFactory.eINSTANCE.createDataExtractorReference()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DataextractorEditPlugin.INSTANCE;
	}

	/**
	 * 
	 * @author MiSc
	 *
	 */
	public class ExtractorRefreshCommand extends RefreshCommand{
		private DataExtractor extractor;
		
		// constructor
		public ExtractorRefreshCommand(DataExtractor anExtractor)	{
			super();
			this.extractor = anExtractor;
		}

		@Override
		public void execute() {
			this.extractor.refresh();
		}
	} // class ExtractorRefreshCommand

	public class ExtractorSaveCommand extends SaveCommand{
		private DataExtractor extractor;
		
		// constructor
		public ExtractorSaveCommand(DataExtractor anExtractor)	{
			super();
			this.extractor = anExtractor;
		}

		@Override
		public void execute() {
			this.extractor.save();
		}
	} // class ExtractorSaveCommand

	/**
	 * Create a drag and drop command for this Solver
	 */
	public class ExtractorDragAndDropCommand extends DragAndDropCommand{
		// constructor
	   	public ExtractorDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
				int operation, Collection<?> collection) {
			super(domain, owner, location, operations, operation, collection);
		}
	   	
	    /**
	     * This implementation of prepare is called again to implement {@link #validate validate}.
	     * The method {@link #reset} will have been called before doing so.
	     */
	    @Override
	    protected boolean prepare(){
	    	CompoundCommand compound = new CompoundCommand();
			DataExtractor thisDataExtractor = (DataExtractor) this.owner;
			for (Object element : collection){
				if ( element instanceof EObject){
		  	   		EObject droppedObject = (EObject) element;
				   	SetCommand cmd = new SetCommand(this.domain, 
				   			                        thisDataExtractor, 
				   			                        DataextractorPackage.Literals.DATA_EXTRACTOR__SOURCE_OBJECT,
				   			                        droppedObject);
				   	compound.append(cmd);
				} 
			}
	    	this.dragCommand = null;
			this.dropCommand = compound;
	    	return true;
	    } // prepare
	};

	/*
	public class SelectionSortCommand extends SortCommand{
		private FPOForecastBucketsSelection selection;
		
		// constructor
		public SelectionSortCommand(FPOForecastBucketsSelection aSelection)	{
			super();
			this.selection = aSelection;
			String tmp = "Sort the selection";
			String label = "label:"+tmp;
			String description = "desc:"+tmp;
			this.setDescription(description);
			this.setLabel(label);
		}

		@Override
		public void execute() {
			this.selection.sortSelectedBuckets();
		}
	} //
	*/

	/**
	 * 
	 */
	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == RefreshCommand.class){
			return new ExtractorRefreshCommand((DataExtractor) object); 
		}
		else if ( commandClass == SaveCommand.class){
			return new ExtractorSaveCommand((DataExtractor) object); 
		}

		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand
	
	/**
	 * Create a command for a drag and drop on this Solver
	 */
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain, Object owner, float location, int operations,
			int operation, Collection<?> collection) {
		return new ExtractorDragAndDropCommand(domain, owner, location, operations, operation, collection);
	}
}
