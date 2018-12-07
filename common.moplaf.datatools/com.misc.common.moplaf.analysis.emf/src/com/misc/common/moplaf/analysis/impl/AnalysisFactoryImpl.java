/**
 */
package com.misc.common.moplaf.analysis.impl;

import com.misc.common.moplaf.analysis.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisFactoryImpl extends EFactoryImpl implements AnalysisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnalysisFactory init() {
		try {
			AnalysisFactory theAnalysisFactory = (AnalysisFactory)EPackage.Registry.INSTANCE.getEFactory(AnalysisPackage.eNS_URI);
			if (theAnalysisFactory != null) {
				return theAnalysisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnalysisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AnalysisPackage.ANALYSIS: return createAnalysis();
			case AnalysisPackage.ANALYSIS_DOMAIN: return createAnalysisDomain();
			case AnalysisPackage.DATA_TOOLS: return createDataTools();
			case AnalysisPackage.ANALYSIS_DOC: return createAnalysisDoc();
			case AnalysisPackage.ANALYSIS_ELEMENT: return createAnalysisElement();
			case AnalysisPackage.ANALYSIS_ELEMENT_KEY: return createAnalysisElementKey();
			case AnalysisPackage.ANALYSIS_COLUMNIZER: return createAnalysisColumnizer();
			case AnalysisPackage.ANALYSIS_CATEGORY: return createAnalysisCategory();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analysis createAnalysis() {
		AnalysisImpl analysis = new AnalysisImpl();
		return analysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisDomain createAnalysisDomain() {
		AnalysisDomainImpl analysisDomain = new AnalysisDomainImpl();
		return analysisDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTools createDataTools() {
		DataToolsImpl dataTools = new DataToolsImpl();
		return dataTools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisDoc createAnalysisDoc() {
		AnalysisDocImpl analysisDoc = new AnalysisDocImpl();
		return analysisDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisElement createAnalysisElement() {
		AnalysisElementImpl analysisElement = new AnalysisElementImpl();
		return analysisElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisElementKey createAnalysisElementKey() {
		AnalysisElementKeyImpl analysisElementKey = new AnalysisElementKeyImpl();
		return analysisElementKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisColumnizer createAnalysisColumnizer() {
		AnalysisColumnizerImpl analysisColumnizer = new AnalysisColumnizerImpl();
		return analysisColumnizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisCategory createAnalysisCategory() {
		AnalysisCategoryImpl analysisCategory = new AnalysisCategoryImpl();
		return analysisCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisPackage getAnalysisPackage() {
		return (AnalysisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnalysisPackage getPackage() {
		return AnalysisPackage.eINSTANCE;
	}

} //AnalysisFactoryImpl
