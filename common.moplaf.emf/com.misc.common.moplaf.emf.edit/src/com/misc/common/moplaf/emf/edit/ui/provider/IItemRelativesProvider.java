package com.misc.common.moplaf.emf.edit.ui.provider;

import java.util.Collection;

public interface IItemRelativesProvider {

	  /**
	   * Get the relatives of the object. This includes typically non-children objects
	   */
	  public Collection<?> getRelatives(Object object);
}
