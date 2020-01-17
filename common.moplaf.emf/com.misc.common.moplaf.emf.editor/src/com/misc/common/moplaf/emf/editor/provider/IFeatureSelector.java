package com.misc.common.moplaf.emf.editor.provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IFeatureSelector {
	boolean isFeatureSelected(EStructuralFeature feature, EObject object);
}