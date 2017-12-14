/**
 */
package com.misc.common.moplaf.job.jobxmlrpc;

import com.misc.common.moplaf.job.jobclient.JobClientPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.common.moplaf.job.jobxmlrpc.JobXmlRpcFactory
 * @model kind="package"
 * @generated
 */
public interface JobXmlRpcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jobxmlrpc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "//www.misc.com/common/moplaf/job/client/xmlrpc/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jbx";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobXmlRpcPackage eINSTANCE = com.misc.common.moplaf.job.jobxmlrpc.impl.JobXmlRpcPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobxmlrpc.impl.JobEngineClientImpl <em>Job Engine Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobxmlrpc.impl.JobEngineClientImpl
	 * @see com.misc.common.moplaf.job.jobxmlrpc.impl.JobXmlRpcPackageImpl#getJobEngineClient()
	 * @generated
	 */
	int JOB_ENGINE_CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_CLIENT__NAME = JobClientPackage.JOB_ENGINE_PROXY__NAME;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_CLIENT__HOST = JobClientPackage.JOB_ENGINE_PROXY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_CLIENT__PORT = JobClientPackage.JOB_ENGINE_PROXY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_CLIENT__PATH = JobClientPackage.JOB_ENGINE_PROXY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Job Engine Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_CLIENT_FEATURE_COUNT = JobClientPackage.JOB_ENGINE_PROXY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Submit Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_CLIENT___SUBMIT_JOB__JOBREMOTE = JobClientPackage.JOB_ENGINE_PROXY___SUBMIT_JOB__JOBREMOTE;

	/**
	 * The operation id for the '<em>Get Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_CLIENT___GET_JOB__INT = JobClientPackage.JOB_ENGINE_PROXY___GET_JOB__INT;

	/**
	 * The number of operations of the '<em>Job Engine Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_CLIENT_OPERATION_COUNT = JobClientPackage.JOB_ENGINE_PROXY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.common.moplaf.job.jobxmlrpc.impl.JobEngineServerImpl <em>Job Engine Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.common.moplaf.job.jobxmlrpc.impl.JobEngineServerImpl
	 * @see com.misc.common.moplaf.job.jobxmlrpc.impl.JobXmlRpcPackageImpl#getJobEngineServer()
	 * @generated
	 */
	int JOB_ENGINE_SERVER = 1;

	/**
	 * The feature id for the '<em><b>Job Scheduled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_SERVER__JOB_SCHEDULED = JobClientPackage.JOB_ENGINE__JOB_SCHEDULED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_SERVER__NAME = JobClientPackage.JOB_ENGINE__NAME;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_SERVER__SCHEDULER = JobClientPackage.JOB_ENGINE__SCHEDULER;

	/**
	 * The feature id for the '<em><b>Execute Enabled Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_SERVER__EXECUTE_ENABLED_FEEDBACK = JobClientPackage.JOB_ENGINE__EXECUTE_ENABLED_FEEDBACK;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_SERVER__PORT = JobClientPackage.JOB_ENGINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_SERVER__PATH = JobClientPackage.JOB_ENGINE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Job Engine Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_SERVER_FEATURE_COUNT = JobClientPackage.JOB_ENGINE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Execute Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_SERVER___EXECUTE_JOB__JOBSCHEDULED = JobClientPackage.JOB_ENGINE___EXECUTE_JOB__JOBSCHEDULED;

	/**
	 * The number of operations of the '<em>Job Engine Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_ENGINE_SERVER_OPERATION_COUNT = JobClientPackage.JOB_ENGINE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobxmlrpc.JobEngineClient <em>Job Engine Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Engine Client</em>'.
	 * @see com.misc.common.moplaf.job.jobxmlrpc.JobEngineClient
	 * @generated
	 */
	EClass getJobEngineClient();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobxmlrpc.JobEngineClient#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see com.misc.common.moplaf.job.jobxmlrpc.JobEngineClient#getHost()
	 * @see #getJobEngineClient()
	 * @generated
	 */
	EAttribute getJobEngineClient_Host();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobxmlrpc.JobEngineClient#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see com.misc.common.moplaf.job.jobxmlrpc.JobEngineClient#getPort()
	 * @see #getJobEngineClient()
	 * @generated
	 */
	EAttribute getJobEngineClient_Port();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobxmlrpc.JobEngineClient#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.misc.common.moplaf.job.jobxmlrpc.JobEngineClient#getPath()
	 * @see #getJobEngineClient()
	 * @generated
	 */
	EAttribute getJobEngineClient_Path();

	/**
	 * Returns the meta object for class '{@link com.misc.common.moplaf.job.jobxmlrpc.JobEngineServer <em>Job Engine Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Engine Server</em>'.
	 * @see com.misc.common.moplaf.job.jobxmlrpc.JobEngineServer
	 * @generated
	 */
	EClass getJobEngineServer();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobxmlrpc.JobEngineServer#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see com.misc.common.moplaf.job.jobxmlrpc.JobEngineServer#getPort()
	 * @see #getJobEngineServer()
	 * @generated
	 */
	EAttribute getJobEngineServer_Port();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.common.moplaf.job.jobxmlrpc.JobEngineServer#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.misc.common.moplaf.job.jobxmlrpc.JobEngineServer#getPath()
	 * @see #getJobEngineServer()
	 * @generated
	 */
	EAttribute getJobEngineServer_Path();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JobXmlRpcFactory getJobXmlRpcFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobxmlrpc.impl.JobEngineClientImpl <em>Job Engine Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobxmlrpc.impl.JobEngineClientImpl
		 * @see com.misc.common.moplaf.job.jobxmlrpc.impl.JobXmlRpcPackageImpl#getJobEngineClient()
		 * @generated
		 */
		EClass JOB_ENGINE_CLIENT = eINSTANCE.getJobEngineClient();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE_CLIENT__HOST = eINSTANCE.getJobEngineClient_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE_CLIENT__PORT = eINSTANCE.getJobEngineClient_Port();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE_CLIENT__PATH = eINSTANCE.getJobEngineClient_Path();

		/**
		 * The meta object literal for the '{@link com.misc.common.moplaf.job.jobxmlrpc.impl.JobEngineServerImpl <em>Job Engine Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.common.moplaf.job.jobxmlrpc.impl.JobEngineServerImpl
		 * @see com.misc.common.moplaf.job.jobxmlrpc.impl.JobXmlRpcPackageImpl#getJobEngineServer()
		 * @generated
		 */
		EClass JOB_ENGINE_SERVER = eINSTANCE.getJobEngineServer();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE_SERVER__PORT = eINSTANCE.getJobEngineServer_Port();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_ENGINE_SERVER__PATH = eINSTANCE.getJobEngineServer_Path();

	}

} //JobXmlRpcPackage