/*******************************************************************************
 * Copyright (c) 2017 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.time.discrete.provider;



import com.misc.common.moplaf.emf.edit.command.RefreshCommand;
import com.misc.common.moplaf.time.discrete.TimeBucket;
import com.misc.common.moplaf.time.discrete.TimeDiscreteFactory;
import com.misc.common.moplaf.time.discrete.TimeDiscretePackage;
import com.misc.common.moplaf.time.discrete.TimeLine;
import com.misc.common.moplaf.timeview.emf.edit.IItemTimeLinesProvider;

import java.util.Collection;
import java.util.Date;
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
 * This is the item provider adapter for a {@link com.misc.common.moplaf.time.discrete.TimeLine} object.
 * <!-- begin-user-doc -->
 * @implements IItemTimeLinesProvider
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeLineItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IItemTimeLinesProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeLineItemProvider(AdapterFactory adapterFactory) {
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

			addBucketTypePropertyDescriptor(object);
			addBucketTypeRefreshedPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addTimeZoneIDPropertyDescriptor(object);
			addLocaleLanguagePropertyDescriptor(object);
			addLocaleCountryPropertyDescriptor(object);
			addHorizonStartPropertyDescriptor(object);
			addHorizonEndPropertyDescriptor(object);
			addFirstBucketPropertyDescriptor(object);
			addLastBucketPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bucket Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBucketTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeLine_BucketType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeLine_BucketType_feature", "_UI_TimeLine_type"),
				 TimeDiscretePackage.Literals.TIME_LINE__BUCKET_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bucket Type Refreshed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBucketTypeRefreshedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeLine_BucketTypeRefreshed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeLine_BucketTypeRefreshed_feature", "_UI_TimeLine_type"),
				 TimeDiscretePackage.Literals.TIME_LINE__BUCKET_TYPE_REFRESHED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_TimeLine_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeLine_Description_feature", "_UI_TimeLine_type"),
				 TimeDiscretePackage.Literals.TIME_LINE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Zone ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeZoneIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeLine_TimeZoneID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeLine_TimeZoneID_feature", "_UI_TimeLine_type"),
				 TimeDiscretePackage.Literals.TIME_LINE__TIME_ZONE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Locale Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocaleLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeLine_LocaleLanguage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeLine_LocaleLanguage_feature", "_UI_TimeLine_type"),
				 TimeDiscretePackage.Literals.TIME_LINE__LOCALE_LANGUAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Locale Country feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocaleCountryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeLine_LocaleCountry_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeLine_LocaleCountry_feature", "_UI_TimeLine_type"),
				 TimeDiscretePackage.Literals.TIME_LINE__LOCALE_COUNTRY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizon Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizonStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeLine_HorizonStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeLine_HorizonStart_feature", "_UI_TimeLine_type"),
				 TimeDiscretePackage.Literals.TIME_LINE__HORIZON_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizon End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizonEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeLine_HorizonEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeLine_HorizonEnd_feature", "_UI_TimeLine_type"),
				 TimeDiscretePackage.Literals.TIME_LINE__HORIZON_END,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Bucket feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstBucketPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeLine_FirstBucket_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeLine_FirstBucket_feature", "_UI_TimeLine_type"),
				 TimeDiscretePackage.Literals.TIME_LINE__FIRST_BUCKET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Bucket feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastBucketPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeLine_LastBucket_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeLine_LastBucket_feature", "_UI_TimeLine_type"),
				 TimeDiscretePackage.Literals.TIME_LINE__LAST_BUCKET,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(TimeDiscretePackage.Literals.TIME_LINE__BUCKETS);
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
	 * This returns TimeLine.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/timeline.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TimeLine)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_TimeLine_type") :
			getString("_UI_TimeLine_type") + " " + label;
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

		switch (notification.getFeatureID(TimeLine.class)) {
			case TimeDiscretePackage.TIME_LINE__BUCKET_TYPE:
			case TimeDiscretePackage.TIME_LINE__BUCKET_TYPE_REFRESHED:
			case TimeDiscretePackage.TIME_LINE__DESCRIPTION:
			case TimeDiscretePackage.TIME_LINE__TIME_ZONE_ID:
			case TimeDiscretePackage.TIME_LINE__LOCALE_LANGUAGE:
			case TimeDiscretePackage.TIME_LINE__LOCALE_COUNTRY:
			case TimeDiscretePackage.TIME_LINE__HORIZON_START:
			case TimeDiscretePackage.TIME_LINE__HORIZON_END:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TimeDiscretePackage.TIME_LINE__BUCKETS:
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
				(TimeDiscretePackage.Literals.TIME_LINE__BUCKETS,
				 TimeDiscreteFactory.eINSTANCE.createTimeBucket()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TimeDiscreteEditPlugin.INSTANCE;
	}

	/**
	 * Command class Refresh
	 */
	public class TimeLineRefreshCommand extends RefreshCommand {
		private TimeLine timeline;
		
		// constructor
		public TimeLineRefreshCommand(TimeLine atimeline)	{
			super();
			this.timeline= atimeline;
		}

		@Override
		public void execute() {
			this.timeline.refreshHorizon();
		}
	} // class RefreshCommand

	/**
	 * Specified by EditingDomainProvider.createCommande
	 */
	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		if ( commandClass == RefreshCommand.class){
			return new TimeLineRefreshCommand((TimeLine) object); 
		}
		return super.createCommand(object, domain, commandClass, commandParameter);
	} //method createCommand

	/**
	 * Specified by IItemTimeLinesEventsProvider
	 */

	@Override
	public Collection<?> getTimeLines(Object element) {
		return null;
	}

	@Override
	public String getText(Object element, Object timeline) {
		return this.getText(element);
	}

	@Override
	public Collection<?> getEvents(Object element, Object timeline) {
		TimeLine timeLine = (TimeLine)element;
		return timeLine.getBuckets();
	}

	@Override
	public Date getStart(Object element, Object timeline, Object event, Object interval) {
		TimeBucket bucket = (TimeBucket)event;
		Date start = bucket.getBucketStart();
		return start;
	}

	@Override
	public Date getEnd(Object element, Object timeline, Object event, Object interval) {
		TimeBucket bucket = (TimeBucket)event;
		Date end = bucket.getBucketEnd();
		return end;
	}

	@Override
	public Object getForeground(Object element, Object timeline, Object event, Object interval) {
		return null;
	}

	@Override
	public Object getBackground(Object element, Object timeline, Object event, Object interval) {
		return null;
	}

	@Override
	public String getText(Object element, Object timeline, Object event, Object interval) {
		TimeBucket bucket = (TimeBucket)event;
		return bucket.getDescription();
	}
}
