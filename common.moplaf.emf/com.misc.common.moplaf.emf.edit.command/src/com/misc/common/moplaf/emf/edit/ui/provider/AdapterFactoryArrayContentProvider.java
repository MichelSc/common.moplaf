package com.misc.common.moplaf.emf.edit.ui.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;

public class AdapterFactoryArrayContentProvider extends AdapterFactoryContentProvider {

	public AdapterFactoryArrayContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object[] getElements(Object object) {
        if (object instanceof Object[]) {
			return (Object[]) object;
		}
        if (object instanceof Collection) {
			return ((Collection) object).toArray();
		}
		return super.getElements(object);
	}

	@Override
	public Object[] getChildren(Object object) {
        if (object instanceof Object[]) {
			return (Object[]) object;
		}
        if (object instanceof Collection) {
			return ((Collection) object).toArray();
		}
		return super.getChildren(object);
	}

	@Override
	public boolean hasChildren(Object object) {
        if (object instanceof Object[]) {
        	return ((Object[]) object).length>0;
		}
        if (object instanceof Collection) {
			return ((Collection) object).size()>0;
		}
		return super.hasChildren(object);
	}

	@Override
	public Object getParent(Object object) {
		return super.getParent(object);
	}

}
