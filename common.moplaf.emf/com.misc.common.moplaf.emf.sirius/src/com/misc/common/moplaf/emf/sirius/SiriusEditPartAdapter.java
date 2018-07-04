package com.misc.common.moplaf.emf.sirius;

import com.misc.common.moplaf.common.IMoplafObject;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.ui.edit.api.part.IDiagramElementEditPart;

public class SiriusEditPartAdapter implements IAdapterFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
		IDiagramElementEditPart editPart = (IDiagramElementEditPart) adaptableObject;
		if ( adapterType == IMoplafObject.class ){
			EObject model_object = editPart.resolveTargetSemanticElement();
			if ( model_object instanceof IMoplafObject ) {
				return (T) model_object;
			}
		}
		return null;
	}


	@Override
	public Class<?>[] getAdapterList() {
		Class<?>[] classes = { IMoplafObject.class };
		return classes;
	}
}
