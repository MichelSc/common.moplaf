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

/**
 * <p>
 * Manage intermediary nodes in the tree of objects provided by the interface ITreeItemContentProvider. 
 * This allows to implement nodes giving as children a subset of the children of the concrete parent object.
 * <p>
 * Say we have a 'Parent' object, and that we want a 'Children' node, having himself as children a subset 
 * of the children of 'Parent'. TransientItemProviderAdapter allows us to implement this node 'Children' as follows
 * <ul>
 * <li>Extends TransientItemProviderAdapter as for instance ChildrenItemAdapter, in this new class
 *   <ul>
 *   <li>Add this ChildrenItemAdapter to the adapters of 'Parent', e.g. in the constructor of this ChildrenItemAdapter </li>
 *   <li>Override getResourceLocator and return the instance of the Plugin of 'Parent'</li>
 *   <li>Override getChildrenFeatures and return the children features to be used for the children of this ChildrenItemAdapter</li>
 *   <li>Override getText and return the label of node 'Children'</li>
 *   </ul> 
 * </li>
 * <li>In the Parent class
 *   <ul>
 *   <li>Override getChildren and return an instance of this ChildrenItemAdapter</li>
 *   <li>Implement a getter for this ChildrenItemAdapter</li>
 *   <li>Make this adapter stateful</li>
  *  </ul> 
 * </li>
 * <li>In the Child class
 *   <ul>
 *   <li>Override getParent and return this ChildrenItemAdapter, accessed via the gette in the Parent class</li>
 *   </ul> 
 * </li>
 * </ul> 
 * <p>
 * @author michel
 */

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
