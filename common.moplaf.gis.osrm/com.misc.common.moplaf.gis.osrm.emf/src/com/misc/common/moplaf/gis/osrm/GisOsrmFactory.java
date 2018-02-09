/**
 */
package com.misc.common.moplaf.gis.osrm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.gis.osrm.GisOsrmPackage
 * @generated
 */
public interface GisOsrmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GisOsrmFactory eINSTANCE = com.misc.common.moplaf.gis.osrm.impl.GisOsrmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gis Distance Matrix Calculator Osrm One To One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gis Distance Matrix Calculator Osrm One To One</em>'.
	 * @generated
	 */
	GisDistanceMatrixCalculatorOsrmOneToOne createGisDistanceMatrixCalculatorOsrmOneToOne();

	/**
	 * Returns a new object of class '<em>Gis Distance Matrix Calculator Osrm Many To Many</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gis Distance Matrix Calculator Osrm Many To Many</em>'.
	 * @generated
	 */
	GisDistanceMatrixCalculatorOsrmManyToMany createGisDistanceMatrixCalculatorOsrmManyToMany();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GisOsrmPackage getGisOsrmPackage();

} //GisOsrmFactory
