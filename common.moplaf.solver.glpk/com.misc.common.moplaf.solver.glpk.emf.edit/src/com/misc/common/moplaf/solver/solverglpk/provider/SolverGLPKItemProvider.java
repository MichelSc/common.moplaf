/**
 */
package com.misc.common.moplaf.solver.solverglpk.provider;


import com.misc.common.moplaf.solver.SolverPackage;
import com.misc.common.moplaf.solver.provider.SolverLpItemProvider;
import com.misc.common.moplaf.solver.solverglpk.SolverGLPK;
import com.misc.common.moplaf.solver.solverglpk.SolverglpkPackage;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.misc.common.moplaf.solver.solverglpk.SolverGLPK} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverGLPKItemProvider
	extends SolverLpItemProvider
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
	public SolverGLPKItemProvider(AdapterFactory adapterFactory) {
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

			addFilePathPropertyDescriptor(object);
			addFileFormatPropertyDescriptor(object);
			addFileCompressedPropertyDescriptor(object);
			addEnableFeasibilityPumpPropertyDescriptor(object);
			addEnableGomoryCutsPropertyDescriptor(object);
			addEnableGeneratingMixedCoverCutsPropertyDescriptor(object);
			addEnableGeneratingCliqueCutsPropertyDescriptor(object);
			addEnableMixedIntegerRoundingCutsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the File Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ILpWriter_FilePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ILpWriter_FilePath_feature", "_UI_ILpWriter_type"),
				 SolverPackage.Literals.ILP_WRITER__FILE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__15FileWriterPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the File Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ILpWriter_FileFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ILpWriter_FileFormat_feature", "_UI_ILpWriter_type"),
				 SolverPackage.Literals.ILP_WRITER__FILE_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI__15FileWriterPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the File Compressed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileCompressedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ILpWriter_FileCompressed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ILpWriter_FileCompressed_feature", "_UI_ILpWriter_type"),
				 SolverPackage.Literals.ILP_WRITER__FILE_COMPRESSED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__15FileWriterPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Feasibility Pump feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableFeasibilityPumpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverGLPK_EnableFeasibilityPump_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverGLPK_EnableFeasibilityPump_feature", "_UI_SolverGLPK_type"),
				 SolverglpkPackage.Literals.SOLVER_GLPK__ENABLE_FEASIBILITY_PUMP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__21SolverGLPKPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Gomory Cuts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableGomoryCutsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverGLPK_EnableGomoryCuts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverGLPK_EnableGomoryCuts_feature", "_UI_SolverGLPK_type"),
				 SolverglpkPackage.Literals.SOLVER_GLPK__ENABLE_GOMORY_CUTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__21SolverGLPKPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Generating Mixed Cover Cuts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableGeneratingMixedCoverCutsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverGLPK_EnableGeneratingMixedCoverCuts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverGLPK_EnableGeneratingMixedCoverCuts_feature", "_UI_SolverGLPK_type"),
				 SolverglpkPackage.Literals.SOLVER_GLPK__ENABLE_GENERATING_MIXED_COVER_CUTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__21SolverGLPKPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Generating Clique Cuts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableGeneratingCliqueCutsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverGLPK_EnableGeneratingCliqueCuts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverGLPK_EnableGeneratingCliqueCuts_feature", "_UI_SolverGLPK_type"),
				 SolverglpkPackage.Literals.SOLVER_GLPK__ENABLE_GENERATING_CLIQUE_CUTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__21SolverGLPKPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Mixed Integer Rounding Cuts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableMixedIntegerRoundingCutsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverGLPK_EnableMixedIntegerRoundingCuts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverGLPK_EnableMixedIntegerRoundingCuts_feature", "_UI_SolverGLPK_type"),
				 SolverglpkPackage.Literals.SOLVER_GLPK__ENABLE_MIXED_INTEGER_ROUNDING_CUTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI__21SolverGLPKPropertyCategory"),
				 null));
	}

	/**
	 * This returns SolverGLPK.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SolverGLPK"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SolverGLPK)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_SolverGLPK_type") :
			getString("_UI_SolverGLPK_type") + " " + label;
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

		switch (notification.getFeatureID(SolverGLPK.class)) {
			case SolverglpkPackage.SOLVER_GLPK__FILE_PATH:
			case SolverglpkPackage.SOLVER_GLPK__FILE_FORMAT:
			case SolverglpkPackage.SOLVER_GLPK__FILE_COMPRESSED:
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_FEASIBILITY_PUMP:
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_GOMORY_CUTS:
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_GENERATING_MIXED_COVER_CUTS:
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_GENERATING_CLIQUE_CUTS:
			case SolverglpkPackage.SOLVER_GLPK__ENABLE_MIXED_INTEGER_ROUNDING_CUTS:
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
		return SolverglpkEditPlugin.INSTANCE;
	}

}
