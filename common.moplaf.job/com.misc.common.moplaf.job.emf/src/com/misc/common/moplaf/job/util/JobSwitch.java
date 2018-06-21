/*******************************************************************************
 * Copyright (c) 2017, 2018 Michel Schaffers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michel Schaffers - initial API and implementation
 *******************************************************************************/
/**
 */
package com.misc.common.moplaf.job.util;

import com.misc.common.moplaf.file.FileHandler;
import com.misc.common.moplaf.file.FileOwner;
import com.misc.common.moplaf.job.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.job.JobPackage
 * @generated
 */
public class JobSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JobPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobSwitch() {
		if (modelPackage == null) {
			modelPackage = JobPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JobPackage.JOB_PARAMETER: {
				JobParameter jobParameter = (JobParameter)theEObject;
				T result = caseJobParameter(jobParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.RUN_PARAMS: {
				RunParams runParams = (RunParams)theEObject;
				T result = caseRunParams(runParams);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.RUN: {
				Run run = (Run)theEObject;
				T result = caseRun(run);
				if (result == null) result = caseRunParams(run);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.JOB: {
				Job job = (Job)theEObject;
				T result = caseJob(job);
				if (result == null) result = caseRun(job);
				if (result == null) result = caseRunParams(job);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.JOB_CONSOLE: {
				JobConsole jobConsole = (JobConsole)theEObject;
				T result = caseJobConsole(jobConsole);
				if (result == null) result = caseJob(jobConsole);
				if (result == null) result = caseRun(jobConsole);
				if (result == null) result = caseRunParams(jobConsole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.SETTER: {
				Setter setter = (Setter)theEObject;
				T result = caseSetter(setter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.SETTER_STRUCTURAL_FEATURE: {
				SetterStructuralFeature setterStructuralFeature = (SetterStructuralFeature)theEObject;
				T result = caseSetterStructuralFeature(setterStructuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.SETTER_ATTRIBUTE: {
				SetterAttribute setterAttribute = (SetterAttribute)theEObject;
				T result = caseSetterAttribute(setterAttribute);
				if (result == null) result = caseSetterStructuralFeature(setterAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.SETTER_ATTRIBUTE_INT: {
				SetterAttributeInt setterAttributeInt = (SetterAttributeInt)theEObject;
				T result = caseSetterAttributeInt(setterAttributeInt);
				if (result == null) result = caseSetterAttribute(setterAttributeInt);
				if (result == null) result = caseSetterStructuralFeature(setterAttributeInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.SETTER_ATTRIBUTE_FLOAT: {
				SetterAttributeFloat setterAttributeFloat = (SetterAttributeFloat)theEObject;
				T result = caseSetterAttributeFloat(setterAttributeFloat);
				if (result == null) result = caseSetterAttribute(setterAttributeFloat);
				if (result == null) result = caseSetterStructuralFeature(setterAttributeFloat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.PARAMS_HOLDER: {
				ParamsHolder paramsHolder = (ParamsHolder)theEObject;
				T result = caseParamsHolder(paramsHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.JOB_FILE_HANDLER: {
				JobFileHandler jobFileHandler = (JobFileHandler)theEObject;
				T result = caseJobFileHandler(jobFileHandler);
				if (result == null) result = caseJob(jobFileHandler);
				if (result == null) result = caseFileHandler(jobFileHandler);
				if (result == null) result = caseRun(jobFileHandler);
				if (result == null) result = caseFileOwner(jobFileHandler);
				if (result == null) result = caseRunParams(jobFileHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.RUNS: {
				Runs runs = (Runs)theEObject;
				T result = caseRuns(runs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.DOC: {
				Doc doc = (Doc)theEObject;
				T result = caseDoc(doc);
				if (result == null) result = caseKeyIndicators(doc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.DOC_REF: {
				DocRef docRef = (DocRef)theEObject;
				T result = caseDocRef(docRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.DOCS_HOLDER: {
				DocsHolder docsHolder = (DocsHolder)theEObject;
				T result = caseDocsHolder(docsHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.COMPOUND_DOC: {
				CompoundDoc compoundDoc = (CompoundDoc)theEObject;
				T result = caseCompoundDoc(compoundDoc);
				if (result == null) result = caseDoc(compoundDoc);
				if (result == null) result = caseDocsHolder(compoundDoc);
				if (result == null) result = caseKeyIndicators(compoundDoc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.DOC_IN_DOCS_HOLDER: {
				DocInDocsHolder docInDocsHolder = (DocInDocsHolder)theEObject;
				T result = caseDocInDocsHolder(docInDocsHolder);
				if (result == null) result = caseDocRef(docInDocsHolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseJob(task);
				if (result == null) result = caseKeyIndicators(task);
				if (result == null) result = caseRun(task);
				if (result == null) result = caseRunParams(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.DOMAIN_TASK: {
				DomainTask domainTask = (DomainTask)theEObject;
				T result = caseDomainTask(domainTask);
				if (result == null) result = caseTask(domainTask);
				if (result == null) result = caseJob(domainTask);
				if (result == null) result = caseKeyIndicators(domainTask);
				if (result == null) result = caseRun(domainTask);
				if (result == null) result = caseRunParams(domainTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.TASK_DOC: {
				TaskDoc taskDoc = (TaskDoc)theEObject;
				T result = caseTaskDoc(taskDoc);
				if (result == null) result = caseDocRef(taskDoc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.TASK_INPUT: {
				TaskInput taskInput = (TaskInput)theEObject;
				T result = caseTaskInput(taskInput);
				if (result == null) result = caseTaskDoc(taskInput);
				if (result == null) result = caseDocRef(taskInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.TASK_OUTPUT: {
				TaskOutput taskOutput = (TaskOutput)theEObject;
				T result = caseTaskOutput(taskOutput);
				if (result == null) result = caseTaskDoc(taskOutput);
				if (result == null) result = caseDocRef(taskOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.TASKS: {
				Tasks tasks = (Tasks)theEObject;
				T result = caseTasks(tasks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.DOCS: {
				Docs docs = (Docs)theEObject;
				T result = caseDocs(docs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.TASK_DOMAIN: {
				TaskDomain taskDomain = (TaskDomain)theEObject;
				T result = caseTaskDomain(taskDomain);
				if (result == null) result = caseDocs(taskDomain);
				if (result == null) result = caseTasks(taskDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.KEY_INDICATORS: {
				KeyIndicators keyIndicators = (KeyIndicators)theEObject;
				T result = caseKeyIndicators(keyIndicators);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.KEY_INDICATOR: {
				KeyIndicator keyIndicator = (KeyIndicator)theEObject;
				T result = caseKeyIndicator(keyIndicator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.KEY_INDICATOR_DOUBLE: {
				KeyIndicatorDouble keyIndicatorDouble = (KeyIndicatorDouble)theEObject;
				T result = caseKeyIndicatorDouble(keyIndicatorDouble);
				if (result == null) result = caseKeyIndicator(keyIndicatorDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.KEY_INDICATOR_INT: {
				KeyIndicatorInt keyIndicatorInt = (KeyIndicatorInt)theEObject;
				T result = caseKeyIndicatorInt(keyIndicatorInt);
				if (result == null) result = caseKeyIndicator(keyIndicatorInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.KEY_INDICATOR_DATE: {
				KeyIndicatorDate keyIndicatorDate = (KeyIndicatorDate)theEObject;
				T result = caseKeyIndicatorDate(keyIndicatorDate);
				if (result == null) result = caseKeyIndicator(keyIndicatorDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JobPackage.KEY_INDICATOR_STRING: {
				KeyIndicatorString keyIndicatorString = (KeyIndicatorString)theEObject;
				T result = caseKeyIndicatorString(keyIndicatorString);
				if (result == null) result = caseKeyIndicator(keyIndicatorString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJobParameter(JobParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Run Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunParams(RunParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Run</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRun(Run object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJob(Job object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Console</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Console</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJobConsole(JobConsole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJobFileHandler(JobFileHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuns(Runs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainTask(DomainTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Doc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Doc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskDoc(TaskDoc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskInput(TaskInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskOutput(TaskOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoc(Doc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doc Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocRef(DocRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tasks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tasks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTasks(Tasks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocs(Docs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskDomain(TaskDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Indicators</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Indicators</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyIndicators(KeyIndicators object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Indicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyIndicator(KeyIndicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Indicator Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Indicator Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyIndicatorDouble(KeyIndicatorDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Indicator Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Indicator Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyIndicatorInt(KeyIndicatorInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Indicator Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Indicator Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyIndicatorDate(KeyIndicatorDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Indicator String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Indicator String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyIndicatorString(KeyIndicatorString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docs Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docs Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocsHolder(DocsHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Doc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Doc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundDoc(CompoundDoc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doc In Docs Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc In Docs Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocInDocsHolder(DocInDocsHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileOwner(FileOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileHandler(FileHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetter(Setter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setter Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setter Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetterStructuralFeature(SetterStructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setter Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setter Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetterAttribute(SetterAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setter Attribute Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setter Attribute Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetterAttributeInt(SetterAttributeInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setter Attribute Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setter Attribute Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetterAttributeFloat(SetterAttributeFloat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Params Holder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Params Holder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamsHolder(ParamsHolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JobSwitch
