/**
 */
package com.misc.common.moplaf.datatools.impl;

import com.misc.common.moplaf.datatools.ColumnizerColumn;
import com.misc.common.moplaf.datatools.ColumnizerExplicit;
import com.misc.common.moplaf.datatools.ColumnizerGrid;
import com.misc.common.moplaf.datatools.DatatoolsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Columnizer Explicit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerExplicitImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.misc.common.moplaf.datatools.impl.ColumnizerExplicitImpl#getGrids <em>Grids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnizerExplicitImpl extends ColumnizerImpl implements ColumnizerExplicit {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnizerColumn> columns;

	/**
	 * The cached value of the '{@link #getGrids() <em>Grids</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrids()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnizerGrid> grids;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnizerExplicitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatoolsPackage.Literals.COLUMNIZER_EXPLICIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnizerColumn> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentWithInverseEList<ColumnizerColumn>(ColumnizerColumn.class, this, DatatoolsPackage.COLUMNIZER_EXPLICIT__COLUMNS, DatatoolsPackage.COLUMNIZER_COLUMN__COLUMNIZER);
		}
		return columns;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnizerGrid> getGrids() {
		if (grids == null) {
			grids = new EObjectContainmentEList<ColumnizerGrid>(ColumnizerGrid.class, this, DatatoolsPackage.COLUMNIZER_EXPLICIT__GRIDS);
		}
		return grids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatoolsPackage.COLUMNIZER_EXPLICIT__COLUMNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColumns()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	@Override
	public String getDescription() {
		return String.format("columnizer %s", this.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatoolsPackage.COLUMNIZER_EXPLICIT__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case DatatoolsPackage.COLUMNIZER_EXPLICIT__GRIDS:
				return ((InternalEList<?>)getGrids()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatoolsPackage.COLUMNIZER_EXPLICIT__COLUMNS:
				return getColumns();
			case DatatoolsPackage.COLUMNIZER_EXPLICIT__GRIDS:
				return getGrids();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatatoolsPackage.COLUMNIZER_EXPLICIT__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends ColumnizerColumn>)newValue);
				return;
			case DatatoolsPackage.COLUMNIZER_EXPLICIT__GRIDS:
				getGrids().clear();
				getGrids().addAll((Collection<? extends ColumnizerGrid>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatatoolsPackage.COLUMNIZER_EXPLICIT__COLUMNS:
				getColumns().clear();
				return;
			case DatatoolsPackage.COLUMNIZER_EXPLICIT__GRIDS:
				getGrids().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatatoolsPackage.COLUMNIZER_EXPLICIT__COLUMNS:
				return columns != null && !columns.isEmpty();
			case DatatoolsPackage.COLUMNIZER_EXPLICIT__GRIDS:
				return grids != null && !grids.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ColumnizerExplicitImpl
