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
package com.misc.common.moplaf.emf.editor.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class AdapterFactoryArrayLabelProvider extends AdapterFactoryLabelProvider implements IColorProvider {

	public AdapterFactoryArrayLabelProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	// ILabelProvider methods -----------------------------------------------------
	private Image getImageCollection(){
		// TODO
		return null;
	}

	@Override
	public String getText(Object object) {
        if (object instanceof Object[]) {
			return "collection";
		}
        if (object instanceof Collection) {
			return "collection";
		}
		return super.getText(object);
	}

	@Override
	public Image getImage(Object object) {
        if (object instanceof Object[]) {
			return this.getImageCollection();
		}
        if (object instanceof Collection) {
			return this.getImageCollection();
		}
		return super.getImage(object);
	}
	
	// IColorProvider methods -----------------------------------------------------
	private Color getBackgroundCollection(){
		Color transparent = Display.getCurrent ().getSystemColor(SWT.COLOR_TRANSPARENT);
		return transparent;
	}

	private Color getForegroundCollection(){
		Color foreground = Display.getCurrent ().getSystemColor(SWT.COLOR_LIST_FOREGROUND);
		return foreground;
	}

	@Override
	public Color getBackground(Object object) {
        if (object instanceof Object[]) {
			return this.getBackgroundCollection();
		}
        if (object instanceof Collection) {
			return this.getBackgroundCollection();
		}
		return super.getBackground(object);
	}

	@Override
	public Color getForeground(Object object) {
        if (object instanceof Object[]) {
			return this.getForegroundCollection();
		}
        if (object instanceof Collection) {
			return this.getForegroundCollection();
		}
		return super.getForeground(object);
	}

}
