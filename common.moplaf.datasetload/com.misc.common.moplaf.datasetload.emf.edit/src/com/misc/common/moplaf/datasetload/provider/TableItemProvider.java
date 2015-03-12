/**
 */
package com.misc.common.moplaf.datasetload.provider;


import com.misc.common.moplaf.datasetload.DatasetloadPackage;
import com.misc.common.moplaf.datasetload.Table;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.command.CommandParameter;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.datasetload.Table} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TableItemProvider 
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
	public TableItemProvider(AdapterFactory adapterFactory) {
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
			addParamTableGroupAttributesPropertyDescriptor(object);
			addSQLStatementPropertyDescriptor(object);
			addColumnTableRowAttributesPropertyDescriptor(object);
			addKeyColumnsPropertyDescriptor(object);
			addLastLoadPropertyDescriptor(object);
			addNumberOfRowsPropertyDescriptor(object);
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
				 getString("_UI_Table_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Table_Name_feature", "_UI_Table_type"),
				 DatasetloadPackage.Literals.TABLE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Column Table Row Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnTableRowAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Table_ColumnTableRowAttributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Table_ColumnTableRowAttributes_feature", "_UI_Table_type"),
				 DatasetloadPackage.Literals.TABLE__COLUMN_TABLE_ROW_ATTRIBUTES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SQL Statement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSQLStatementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Table_SQLStatement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Table_SQLStatement_feature", "_UI_Table_type"),
				 DatasetloadPackage.Literals.TABLE__SQL_STATEMENT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Param Table Group Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParamTableGroupAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Table_ParamTableGroupAttributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Table_ParamTableGroupAttributes_feature", "_UI_Table_type"),
				 DatasetloadPackage.Literals.TABLE__PARAM_TABLE_GROUP_ATTRIBUTES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key Columns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyColumnsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Table_KeyColumns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Table_KeyColumns_feature", "_UI_Table_type"),
				 DatasetloadPackage.Literals.TABLE__KEY_COLUMNS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Load feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastLoadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Table_LastLoad_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Table_LastLoad_feature", "_UI_Table_type"),
				 DatasetloadPackage.Literals.TABLE__LAST_LOAD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Rows feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfRowsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Table_NumberOfRows_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Table_NumberOfRows_feature", "_UI_Table_type"),
				 DatasetloadPackage.Literals.TABLE__NUMBER_OF_ROWS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Table.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Table"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Table)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Table_type") :
			getString("_UI_Table_type") + " " + label;
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

		switch (notification.getFeatureID(Table.class)) {
			case DatasetloadPackage.TABLE__NAME:
			case DatasetloadPackage.TABLE__ROWS:
			case DatasetloadPackage.TABLE__PARAM_TABLE_GROUP_ATTRIBUTES:
			case DatasetloadPackage.TABLE__SQL_STATEMENT:
			case DatasetloadPackage.TABLE__COLUMN_TABLE_ROW_ATTRIBUTES:
			case DatasetloadPackage.TABLE__KEY_COLUMNS:
			case DatasetloadPackage.TABLE__LAST_LOAD:
			case DatasetloadPackage.TABLE__NUMBER_OF_ROWS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DatasetloadEditPlugin.INSTANCE;
	}

	public class TableLoadCommand extends LoadCommand{
		private Table table;
		
		// constructor
		public TableLoadCommand(Table aTable)	{
			super();
			this.table = aTable;
			String tmp = "Load the table ";
			String label = "label:"+tmp;
			String description = "desc:"+tmp;
			this.setDescription(description);
			this.setLabel(label);
		}

		@Override
		public void execute() {
			this.table.load();
		}
	} // class DataSourceConnectCommand

	public class TableRefreshCommand extends RefreshCommand{
		private Table table;
		
		// constructor
		public TableRefreshCommand(Table aTable)	{
			super();
			this.table = aTable;
			String tmp = "Refresh the table ";
			String label = "label:"+tmp;
			String description = "desc:"+tmp;
			this.setDescription(description);
			this.setLabel(label);
		}

		@Override
		public void execute() {
			this.table.refresh();
		}
	} // class DataSourceConnectCommand

	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == LoadCommand.class){
			return new TableLoadCommand((Table) object); 
		} else if ( commandClass == RefreshCommand.class){
			return new TableRefreshCommand((Table) object);
		}

		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand
}
