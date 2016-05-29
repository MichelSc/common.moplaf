/**
 */
package com.misc.common.moplaf.dbsynch.provider;


import com.misc.common.moplaf.dbsynch.DataSource;
import com.misc.common.moplaf.dbsynch.DbSynchPackage;
import com.misc.common.moplaf.emf.edit.command.ConnectCommand;
import com.misc.common.moplaf.emf.edit.command.DisconnectCommand;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.dbsynch.DataSource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataSourceItemProvider 
	extends DbSynchUnitAbstractItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceItemProvider(AdapterFactory adapterFactory) {
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

			addConnectedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Connected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSource_Connected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSource_Connected_feature", "_UI_DataSource_type"),
				 DbSynchPackage.Literals.DATA_SOURCE__CONNECTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__10DatabasePropertyCategory"),
				 null));
	}

	/**
	 * This returns DataSource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/connection.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataSource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DataSource_type") :
			getString("_UI_DataSource_type") + " " + label;
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

		switch (notification.getFeatureID(DataSource.class)) {
			case DbSynchPackage.DATA_SOURCE__CONNECTED:
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

	public class DataSourceConnectCommand extends ConnectCommand{
		private DataSource dataSource;
		
		// constructor
		public DataSourceConnectCommand(DataSource aDataSource)	{
			super();
			this.dataSource = aDataSource;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			if ( this.dataSource.isConnected()){
				isExecutable = false;
				this.setDescription("connected");
			}
			return isExecutable;
		}

		@Override
		public void execute() {
			this.dataSource.connect();
		}
	} // class DataSourceConnectCommand

	public class DataSourceDisconnectCommand extends DisconnectCommand{
		private DataSource dataSource;
		
		public DataSourceDisconnectCommand(DataSource aDataSource)	{
			super();
			this.dataSource = aDataSource;
		}

		@Override
		protected boolean prepare(){
			boolean isExecutable = true;
			if ( !this.dataSource.isConnected()){
				isExecutable = false;
				this.setDescription("not connected");
			}
			return isExecutable;
		}

		@Override
		public void execute() {
			this.dataSource.disconnect();
		}
	} // class DataSourceDisconnectCommand

	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == ConnectCommand.class){
			return new DataSourceConnectCommand((DataSource) object); 
		}
		else if ( commandClass == DisconnectCommand.class){
			return new DataSourceDisconnectCommand((DataSource) object); 
		}

		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand
}
