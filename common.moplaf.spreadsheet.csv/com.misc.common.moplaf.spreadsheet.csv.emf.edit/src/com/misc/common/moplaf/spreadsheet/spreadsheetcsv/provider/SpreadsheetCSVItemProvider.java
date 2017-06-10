/**
 */
package com.misc.common.moplaf.spreadsheet.spreadsheetcsv.provider;


import com.misc.common.moplaf.spreadsheet.provider.SpreadsheetItemProvider;

import com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV;

import com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSVPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.spreadsheet.spreadsheetcsv.SpreadsheetCSV} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpreadsheetCSVItemProvider extends SpreadsheetItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetCSVItemProvider(AdapterFactory adapterFactory) {
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

			addFormatPropertyDescriptor(object);
			addDelimiterPropertyDescriptor(object);
			addEscapeCharacterPropertyDescriptor(object);
			addRecordSeparatorPropertyDescriptor(object);
			addQuoteCharacterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpreadsheetCSV_Format_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpreadsheetCSV_Format_feature", "_UI_SpreadsheetCSV_type"),
				 SpreadsheetCSVPackage.Literals.SPREADSHEET_CSV__FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delimiter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDelimiterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpreadsheetCSV_Delimiter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpreadsheetCSV_Delimiter_feature", "_UI_SpreadsheetCSV_type"),
				 SpreadsheetCSVPackage.Literals.SPREADSHEET_CSV__DELIMITER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Escape Character feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEscapeCharacterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpreadsheetCSV_EscapeCharacter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpreadsheetCSV_EscapeCharacter_feature", "_UI_SpreadsheetCSV_type"),
				 SpreadsheetCSVPackage.Literals.SPREADSHEET_CSV__ESCAPE_CHARACTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Record Separator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecordSeparatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpreadsheetCSV_RecordSeparator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpreadsheetCSV_RecordSeparator_feature", "_UI_SpreadsheetCSV_type"),
				 SpreadsheetCSVPackage.Literals.SPREADSHEET_CSV__RECORD_SEPARATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Quote Character feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQuoteCharacterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpreadsheetCSV_QuoteCharacter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpreadsheetCSV_QuoteCharacter_feature", "_UI_SpreadsheetCSV_type"),
				 SpreadsheetCSVPackage.Literals.SPREADSHEET_CSV__QUOTE_CHARACTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SpreadsheetCSV)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SpreadsheetCSV_type") :
			getString("_UI_SpreadsheetCSV_type") + " " + label;
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

		switch (notification.getFeatureID(SpreadsheetCSV.class)) {
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__FORMAT:
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__DELIMITER:
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__ESCAPE_CHARACTER:
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__RECORD_SEPARATOR:
			case SpreadsheetCSVPackage.SPREADSHEET_CSV__QUOTE_CHARACTER:
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
		return SpreadsheetcsvEditPlugin.INSTANCE;
	}

}
