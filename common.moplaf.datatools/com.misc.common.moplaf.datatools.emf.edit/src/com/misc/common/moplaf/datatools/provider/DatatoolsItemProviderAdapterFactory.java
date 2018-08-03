/**
 */
package com.misc.common.moplaf.datatools.provider;

import com.misc.common.moplaf.datatools.util.DatatoolsAdapterFactory;
import com.misc.common.moplaf.gridview.emf.edit.IItemGridsProvider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatoolsItemProviderAdapterFactory extends DatatoolsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public DatatoolsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(IItemGridsProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.Category} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryItemProvider categoryItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCategoryAdapter() {
		if (categoryItemProvider == null) {
			categoryItemProvider = new CategoryItemProvider(this);
		}

		return categoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.CategorizerStructuralFeature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategorizerStructuralFeatureItemProvider categorizerStructuralFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.CategorizerStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCategorizerStructuralFeatureAdapter() {
		if (categorizerStructuralFeatureItemProvider == null) {
			categorizerStructuralFeatureItemProvider = new CategorizerStructuralFeatureItemProvider(this);
		}

		return categorizerStructuralFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.CategorizerOcl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategorizerOclItemProvider categorizerOclItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.CategorizerOcl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCategorizerOclAdapter() {
		if (categorizerOclItemProvider == null) {
			categorizerOclItemProvider = new CategorizerOclItemProvider(this);
		}

		return categorizerOclItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.ExtractorType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorTypeItemProvider extractorTypeItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.ExtractorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtractorTypeAdapter() {
		if (extractorTypeItemProvider == null) {
			extractorTypeItemProvider = new ExtractorTypeItemProvider(this);
		}

		return extractorTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.ExtractorCompound} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorCompoundItemProvider extractorCompoundItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.ExtractorCompound}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtractorCompoundAdapter() {
		if (extractorCompoundItemProvider == null) {
			extractorCompoundItemProvider = new ExtractorCompoundItemProvider(this);
		}

		return extractorCompoundItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.ExtractorPipe} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorPipeItemProvider extractorPipeItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.ExtractorPipe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtractorPipeAdapter() {
		if (extractorPipeItemProvider == null) {
			extractorPipeItemProvider = new ExtractorPipeItemProvider(this);
		}

		return extractorPipeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.ExtractorUnion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorUnionItemProvider extractorUnionItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.ExtractorUnion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtractorUnionAdapter() {
		if (extractorUnionItemProvider == null) {
			extractorUnionItemProvider = new ExtractorUnionItemProvider(this);
		}

		return extractorUnionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.ExtractorIntersection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorIntersectionItemProvider extractorIntersectionItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.ExtractorIntersection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtractorIntersectionAdapter() {
		if (extractorIntersectionItemProvider == null) {
			extractorIntersectionItemProvider = new ExtractorIntersectionItemProvider(this);
		}

		return extractorIntersectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.Columnizer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnizerItemProvider columnizerItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.Columnizer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColumnizerAdapter() {
		if (columnizerItemProvider == null) {
			columnizerItemProvider = new ColumnizerItemProvider(this);
		}

		return columnizerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.ExtractorPath} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorPathItemProvider extractorPathItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.ExtractorPath}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtractorPathAdapter() {
		if (extractorPathItemProvider == null) {
			extractorPathItemProvider = new ExtractorPathItemProvider(this);
		}

		return extractorPathItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.ExtractorOcl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorOclItemProvider extractorOclItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.ExtractorOcl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtractorOclAdapter() {
		if (extractorOclItemProvider == null) {
			extractorOclItemProvider = new ExtractorOclItemProvider(this);
		}

		return extractorOclItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.ExtractorFilterOcl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorFilterOclItemProvider extractorFilterOclItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.ExtractorFilterOcl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtractorFilterOclAdapter() {
		if (extractorFilterOclItemProvider == null) {
			extractorFilterOclItemProvider = new ExtractorFilterOclItemProvider(this);
		}

		return extractorFilterOclItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.ColumnizerColumnAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnizerColumnAttributeItemProvider columnizerColumnAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.ColumnizerColumnAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColumnizerColumnAttributeAdapter() {
		if (columnizerColumnAttributeItemProvider == null) {
			columnizerColumnAttributeItemProvider = new ColumnizerColumnAttributeItemProvider(this);
		}

		return columnizerColumnAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.ColumnizerColumnOcl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnizerColumnOclItemProvider columnizerColumnOclItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.ColumnizerColumnOcl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColumnizerColumnOclAdapter() {
		if (columnizerColumnOclItemProvider == null) {
			columnizerColumnOclItemProvider = new ColumnizerColumnOclItemProvider(this);
		}

		return columnizerColumnOclItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.SuperCategory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperCategoryItemProvider superCategoryItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.SuperCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSuperCategoryAdapter() {
		if (superCategoryItemProvider == null) {
			superCategoryItemProvider = new SuperCategoryItemProvider(this);
		}

		return superCategoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.NavigationReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationReferenceItemProvider navigationReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.NavigationReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNavigationReferenceAdapter() {
		if (navigationReferenceItemProvider == null) {
			navigationReferenceItemProvider = new NavigationReferenceItemProvider(this);
		}

		return navigationReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.NavigationDowncast} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationDowncastItemProvider navigationDowncastItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.NavigationDowncast}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNavigationDowncastAdapter() {
		if (navigationDowncastItemProvider == null) {
			navigationDowncastItemProvider = new NavigationDowncastItemProvider(this);
		}

		return navigationDowncastItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.DataToolContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataToolContextItemProvider dataToolContextItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.DataToolContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataToolContextAdapter() {
		if (dataToolContextItemProvider == null) {
			dataToolContextItemProvider = new DataToolContextItemProvider(this);
		}

		return dataToolContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.Matcher} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatcherItemProvider matcherItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.Matcher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatcherAdapter() {
		if (matcherItemProvider == null) {
			matcherItemProvider = new MatcherItemProvider(this);
		}

		return matcherItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.Match} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchItemProvider matchItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatchAdapter() {
		if (matchItemProvider == null) {
			matchItemProvider = new MatchItemProvider(this);
		}

		return matchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.ExtractorFilterAND} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorFilterANDItemProvider extractorFilterANDItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.ExtractorFilterAND}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtractorFilterANDAdapter() {
		if (extractorFilterANDItemProvider == null) {
			extractorFilterANDItemProvider = new ExtractorFilterANDItemProvider(this);
		}

		return extractorFilterANDItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.ExtractorFilterOR} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorFilterORItemProvider extractorFilterORItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.ExtractorFilterOR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtractorFilterORAdapter() {
		if (extractorFilterORItemProvider == null) {
			extractorFilterORItemProvider = new ExtractorFilterORItemProvider(this);
		}

		return extractorFilterORItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.ExtractorFilterRegex} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorFilterRegexItemProvider extractorFilterRegexItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.ExtractorFilterRegex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtractorFilterRegexAdapter() {
		if (extractorFilterRegexItemProvider == null) {
			extractorFilterRegexItemProvider = new ExtractorFilterRegexItemProvider(this);
		}

		return extractorFilterRegexItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.ExtractorFilterAttributeIntRange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtractorFilterAttributeIntRangeItemProvider extractorFilterAttributeIntRangeItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.ExtractorFilterAttributeIntRange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtractorFilterAttributeIntRangeAdapter() {
		if (extractorFilterAttributeIntRangeItemProvider == null) {
			extractorFilterAttributeIntRangeItemProvider = new ExtractorFilterAttributeIntRangeItemProvider(this);
		}

		return extractorFilterAttributeIntRangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.ColumnizerGrid} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnizerGridItemProvider columnizerGridItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.ColumnizerGrid}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColumnizerGridAdapter() {
		if (columnizerGridItemProvider == null) {
			columnizerGridItemProvider = new ColumnizerGridItemProvider(this);
		}

		return columnizerGridItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.common.moplaf.datatools.DataTools} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataToolsItemProvider dataToolsItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.common.moplaf.datatools.DataTools}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataToolsAdapter() {
		if (dataToolsItemProvider == null) {
			dataToolsItemProvider = new DataToolsItemProvider(this);
		}

		return dataToolsItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (navigationReferenceItemProvider != null) navigationReferenceItemProvider.dispose();
		if (navigationDowncastItemProvider != null) navigationDowncastItemProvider.dispose();
		if (dataToolContextItemProvider != null) dataToolContextItemProvider.dispose();
		if (dataToolsItemProvider != null) dataToolsItemProvider.dispose();
		if (extractorTypeItemProvider != null) extractorTypeItemProvider.dispose();
		if (extractorPathItemProvider != null) extractorPathItemProvider.dispose();
		if (extractorOclItemProvider != null) extractorOclItemProvider.dispose();
		if (extractorFilterRegexItemProvider != null) extractorFilterRegexItemProvider.dispose();
		if (extractorFilterAttributeIntRangeItemProvider != null) extractorFilterAttributeIntRangeItemProvider.dispose();
		if (extractorFilterOclItemProvider != null) extractorFilterOclItemProvider.dispose();
		if (extractorFilterANDItemProvider != null) extractorFilterANDItemProvider.dispose();
		if (extractorFilterORItemProvider != null) extractorFilterORItemProvider.dispose();
		if (extractorCompoundItemProvider != null) extractorCompoundItemProvider.dispose();
		if (extractorPipeItemProvider != null) extractorPipeItemProvider.dispose();
		if (extractorUnionItemProvider != null) extractorUnionItemProvider.dispose();
		if (extractorIntersectionItemProvider != null) extractorIntersectionItemProvider.dispose();
		if (columnizerItemProvider != null) columnizerItemProvider.dispose();
		if (columnizerGridItemProvider != null) columnizerGridItemProvider.dispose();
		if (columnizerColumnAttributeItemProvider != null) columnizerColumnAttributeItemProvider.dispose();
		if (columnizerColumnOclItemProvider != null) columnizerColumnOclItemProvider.dispose();
		if (superCategoryItemProvider != null) superCategoryItemProvider.dispose();
		if (categoryItemProvider != null) categoryItemProvider.dispose();
		if (categorizerStructuralFeatureItemProvider != null) categorizerStructuralFeatureItemProvider.dispose();
		if (categorizerOclItemProvider != null) categorizerOclItemProvider.dispose();
		if (matcherItemProvider != null) matcherItemProvider.dispose();
		if (matchItemProvider != null) matchItemProvider.dispose();
	}

}
