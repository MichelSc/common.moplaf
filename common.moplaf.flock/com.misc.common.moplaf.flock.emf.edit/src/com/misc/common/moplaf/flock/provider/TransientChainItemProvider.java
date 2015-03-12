package com.misc.common.moplaf.flock.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import com.misc.common.moplaf.flock.Chain;

public class TransientChainItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, 
		IStructuredItemContentProvider,
		ITreeItemContentProvider, 
		IItemLabelProvider, 
		IItemPropertySource {

	public TransientChainItemProvider(AdapterFactory adapterFactory, Chain chain) {
		super(adapterFactory);
		chain.eAdapters().add(this);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	@Override
	public Collection<?> getChildren(Object object) {
		return super.getChildren(this.target);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(Object object) {
		return this.target;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getNewChildDescriptors(java.lang.Object, org.eclipse.emf.edit.domain.EditingDomain, java.lang.Object)
	 */
	@Override
	public Collection<?> getNewChildDescriptors(Object object,
			EditingDomain editingDomain, Object sibling) {
		// TODO Auto-generated method stub
		return super.getNewChildDescriptors(this.target, editingDomain, sibling);
	}
}
