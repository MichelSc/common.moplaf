/**
 */
package com.misc.common.moplaf.datatools.provider;


import com.misc.common.moplaf.datatools.Columnizer;
import com.misc.common.moplaf.datatools.ColumnizerColumn;
import com.misc.common.moplaf.datatools.ColumnizerGrid;
import com.misc.common.moplaf.datatools.DatatoolsFactory;
import com.misc.common.moplaf.datatools.DatatoolsPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.datatools.Columnizer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ColumnizerItemProvider 
	extends ColumnizerAbstractItemProvider  {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnizerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(DatatoolsPackage.Literals.COLUMNIZER__COLUMNS);
			childrenFeatures.add(DatatoolsPackage.Literals.COLUMNIZER__GRIDS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Columnizer)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_Columnizer_type") :
			getString("_UI_Columnizer_type") + " " + label;
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

		switch (notification.getFeatureID(Columnizer.class)) {
			case DatatoolsPackage.COLUMNIZER__COLUMNS:
			case DatatoolsPackage.COLUMNIZER__GRIDS:
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
				(DatatoolsPackage.Literals.COLUMNIZER__COLUMNS,
				 DatatoolsFactory.eINSTANCE.createColumnizerColumnAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.COLUMNIZER__COLUMNS,
				 DatatoolsFactory.eINSTANCE.createColumnizerColumnOcl()));

		newChildDescriptors.add
			(createChildParameter
				(DatatoolsPackage.Literals.COLUMNIZER__GRIDS,
				 DatatoolsFactory.eINSTANCE.createColumnizerGrid()));
	}
	// specified by IItemGridsProvider
	@Override
	public Object getGrids(Object element) {
		Columnizer columnizer = (Columnizer)element;
		return columnizer.getGrids();
	}

	
	@Override
	public String getGridText(Object element, Object grid) {
		ColumnizerGrid grid_columnizer = (ColumnizerGrid)grid;
		return grid_columnizer.getName();
	}

	@Override
	public Collection<?> getColumns(Object element, Object grid) {
		ColumnizerGrid grid_columnizer = (ColumnizerGrid)grid;
		return grid_columnizer.getColumns();
	}

	@Override
	public String getColumnText(Object element, Object grid, Object column) {
		ColumnizerColumn column_columnizer = (ColumnizerColumn)column;
		return column_columnizer.getName();
	}

	@Override
	public Object getCellValue(Object element, Object grid, Object row, Object column) {
		ColumnizerColumn column_columnizer = (ColumnizerColumn)column;
		return column_columnizer.getValue((EObject)row);
	}
}
