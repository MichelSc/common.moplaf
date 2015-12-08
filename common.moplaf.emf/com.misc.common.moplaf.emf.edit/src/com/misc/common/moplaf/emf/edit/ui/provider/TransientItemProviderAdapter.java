package com.misc.common.moplaf.emf.edit.ui.provider;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;


public class TransientItemProviderAdapter extends ItemProviderAdapter
		implements IEditingDomainItemProvider, 
		           IStructuredItemContentProvider,
		           ITreeItemContentProvider, 
		           IItemLabelProvider, 
		           IItemPropertySource {


	public TransientItemProviderAdapter(AdapterFactory adapterFactory) {
		super(adapterFactory);
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
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getFeatureValue(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature)
	 */
	@Override
	protected Object getFeatureValue(EObject object, EStructuralFeature feature) {
		return super.getFeatureValue((EObject) this.target, feature);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getNewChildDescriptors(java.lang.Object, org.eclipse.emf.edit.domain.EditingDomain, java.lang.Object)
	 */
	@Override
	public Collection<?> getNewChildDescriptors(Object object,
			EditingDomain editingDomain, Object sibling) {
		return super.getNewChildDescriptors(this.target, editingDomain, sibling);
	}
	
	@Override
	public Command createCommand(Object object, EditingDomain domain, Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		commandParameter.owner=this.target;
		return super.createCommand(this.target, domain, commandClass, commandParameter);
	}

}
