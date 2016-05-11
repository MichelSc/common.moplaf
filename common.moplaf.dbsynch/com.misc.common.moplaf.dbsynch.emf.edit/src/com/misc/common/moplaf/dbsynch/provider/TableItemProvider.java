/**
 */
package com.misc.common.moplaf.dbsynch.provider;


import com.misc.common.moplaf.dbsynch.DbSynchFactory;
import com.misc.common.moplaf.dbsynch.DbSynchPackage;
import com.misc.common.moplaf.dbsynch.DbSynchUnitAbstract;
import com.misc.common.moplaf.dbsynch.Table;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.dbsynch.Table} object.
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

			addTableNamePropertyDescriptor(object);
			addWhereClausePropertyDescriptor(object);
			addParamDbSynchUnitAttributesPropertyDescriptor(object);
			addSelectSqlStatementPropertyDescriptor(object);
			addInsertSqlStatementPropertyDescriptor(object);
			addUpdateSqlStatementPropertyDescriptor(object);
			addDeleteSqlStatementPropertyDescriptor(object);
			addNumberOfRowsPropertyDescriptor(object);
			addLastSynchDownPropertyDescriptor(object);
			addLastSynchUpPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Table Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTableNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Table_TableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Table_TableName_feature", "_UI_Table_type"),
				 DbSynchPackage.Literals.TABLE__TABLE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__12MetadataPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Where Clause feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhereClausePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Table_WhereClause_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Table_WhereClause_feature", "_UI_Table_type"),
				 DbSynchPackage.Literals.TABLE__WHERE_CLAUSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__12MetadataPropertyCategory"),
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
				 DbSynchPackage.Literals.TABLE__NUMBER_OF_ROWS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI__16ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Synch Down feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastSynchDownPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Table_LastSynchDown_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Table_LastSynchDown_feature", "_UI_Table_type"),
				 DbSynchPackage.Literals.TABLE__LAST_SYNCH_DOWN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__16ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Synch Up feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastSynchUpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Table_LastSynchUp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Table_LastSynchUp_feature", "_UI_Table_type"),
				 DbSynchPackage.Literals.TABLE__LAST_SYNCH_UP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__16ExecutionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Select Sql Statement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectSqlStatementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Table_SelectSqlStatement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Table_SelectSqlStatement_feature", "_UI_Table_type"),
				 DbSynchPackage.Literals.TABLE__SELECT_SQL_STATEMENT,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__14QueriesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Insert Sql Statement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInsertSqlStatementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Table_InsertSqlStatement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Table_InsertSqlStatement_feature", "_UI_Table_type"),
				 DbSynchPackage.Literals.TABLE__INSERT_SQL_STATEMENT,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__14QueriesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Update Sql Statement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdateSqlStatementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Table_UpdateSqlStatement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Table_UpdateSqlStatement_feature", "_UI_Table_type"),
				 DbSynchPackage.Literals.TABLE__UPDATE_SQL_STATEMENT,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__14QueriesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Delete Sql Statement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeleteSqlStatementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Table_DeleteSqlStatement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Table_DeleteSqlStatement_feature", "_UI_Table_type"),
				 DbSynchPackage.Literals.TABLE__DELETE_SQL_STATEMENT,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__14QueriesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Param Db Synch Unit Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected void addParamDbSynchUnitAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(new ItemPropertyDescriptor
			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
					 getResourceLocator(),
					 getString("_UI_Table_ParamDbSynchUnitAttributes_feature"),
					 getString("_UI_PropertyDescriptor_description", "_UI_Table_ParamDbSynchUnitAttributes_feature", "_UI_Table_type"),
					 DbSynchPackage.Literals.TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES,
					 true,
					 false,
					 true,
					 null,
					 getString("_UI__12MetadataPropertyCategory"),
					 null){
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Table thisTable = (Table)object;
				DbSynchUnitAbstract thisDbSynchUnit = thisTable.getSynchUnit();
				return thisDbSynchUnit.getParamAttributes();
				/*
				Collection<?> collection = super.getChoiceOfValues(object);
				return collection;
				*/
			}
			@Override
			public Collection<?> getComboBoxObjects(Object object) {
				/*
				Table thisTable = (Table)object;
				DbSynchUnitAbstract thisDbSynchUnit = thisTable.getSynchUnit();
				return thisDbSynchUnit.getParamAttributes();
				*/
				Collection<?> collection = super.getComboBoxObjects(object);
				return collection;
			}
		});
/*		
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Table_ParamDbSynchUnitAttributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Table_ParamDbSynchUnitAttributes_feature", "_UI_Table_type"),
				 DbSynchPackage.Literals.TABLE__PARAM_DB_SYNCH_UNIT_ATTRIBUTES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
*/				 
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
			childrenFeatures.add(DbSynchPackage.Literals.TABLE__KEY_COLUMNS);
			childrenFeatures.add(DbSynchPackage.Literals.TABLE__DATA_COLUMNS);
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
	 * This returns Table.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/table.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Table)object).getTableName();
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
			case DbSynchPackage.TABLE__COLUMNS:
			case DbSynchPackage.TABLE__TABLE_NAME:
			case DbSynchPackage.TABLE__WHERE_CLAUSE:
			case DbSynchPackage.TABLE__ROWS:
			case DbSynchPackage.TABLE__SELECT_SQL_STATEMENT:
			case DbSynchPackage.TABLE__INSERT_SQL_STATEMENT:
			case DbSynchPackage.TABLE__UPDATE_SQL_STATEMENT:
			case DbSynchPackage.TABLE__DELETE_SQL_STATEMENT:
			case DbSynchPackage.TABLE__NUMBER_OF_ROWS:
			case DbSynchPackage.TABLE__LAST_SYNCH_DOWN:
			case DbSynchPackage.TABLE__LAST_SYNCH_UP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DbSynchPackage.TABLE__KEY_COLUMNS:
			case DbSynchPackage.TABLE__DATA_COLUMNS:
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
				(DbSynchPackage.Literals.TABLE__KEY_COLUMNS,
				 DbSynchFactory.eINSTANCE.createTableColumn()));

		newChildDescriptors.add
			(createChildParameter
				(DbSynchPackage.Literals.TABLE__DATA_COLUMNS,
				 DbSynchFactory.eINSTANCE.createTableColumn()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == DbSynchPackage.Literals.TABLE__KEY_COLUMNS ||
			childFeature == DbSynchPackage.Literals.TABLE__DATA_COLUMNS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return dbsynchEditPlugin.INSTANCE;
	}

	public class TableSynchUpCommand extends SynchUpCommand{
		private Table table;
		
		// constructor
		public TableSynchUpCommand(Table aTable)	{
			super();
			this.table = aTable;
			String tmp = "SynchUp the table ";
			String label = "label:"+tmp;
			String description = "desc:"+tmp;
			this.setDescription(description);
			this.setLabel(label);
		}

		@Override
		public void execute() {
			this.table.synchUp();
		}
	} // class TableSynchUpCommand

	public class TableSynchDownCommand extends SynchDownCommand{
		private Table table;
		
		// constructor
		public TableSynchDownCommand(Table aTable)	{
			super();
			this.table = aTable;
			String tmp = "SynchDown the table ";
			String label = "label:"+tmp;
			String description = "desc:"+tmp;
			this.setDescription(description);
			this.setLabel(label);
		}

		@Override
		public void execute() {
			this.table.synchDown();
		}
	} // class TableSynchUpCommand

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
	} // class TableRefreshCommand

	public class TableRefreshMetaDataCommand extends RefreshCommand{
		private Table table;
		
		// constructor
		public TableRefreshMetaDataCommand(Table aTable)	{
			super();
			this.table = aTable;
			String tmp = "Refresh the MetaData of the table ";
			String label = "label:"+tmp;
			String description = "desc:"+tmp;
			this.setDescription(description);
			this.setLabel(label);
		}

		@Override
		public void execute() {
			this.table.refreshMetaData();
		}
	} // class TableRefreshMetaDataCommand

	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == SynchUpCommand.class){
			return new TableSynchUpCommand((Table) object);
		} else if ( commandClass == SynchDownCommand.class){
				return new TableSynchDownCommand((Table) object); 
		} else if ( commandClass == RefreshCommand.class){
			return new TableRefreshCommand((Table) object);
		} else if ( commandClass == RefreshMetaDataCommand.class){
			return new TableRefreshMetaDataCommand((Table) object);
		}

		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand
}
