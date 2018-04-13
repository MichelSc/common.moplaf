/**
 */
package com.misc.common.moplaf.job.jobhttp.impl;

import com.misc.common.moplaf.common.util.EObjectListDerived;
import com.misc.common.moplaf.job.Plugin;
import com.misc.common.moplaf.job.jobclient.impl.ServiceImpl;

import com.misc.common.moplaf.job.jobhttp.JobEngineServer;
import com.misc.common.moplaf.job.jobhttp.JobHttpPackage;
import com.misc.common.moplaf.job.jobhttp.JobServer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.impl.JobServerImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.impl.JobServerImpl#getHandlersAsSelected <em>Handlers As Selected</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.impl.JobServerImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.impl.JobServerImpl#getHandlerAsOwned <em>Handler As Owned</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobServerImpl extends ServiceImpl implements JobServer {
	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 8080;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHandlersAsSelected() <em>Handlers As Selected</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlersAsSelected()
	 * @generated
	 * @ordered
	 */
	protected EList<JobEngineServer> handlersAsSelected;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobHttpPackage.Literals.JOB_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_SERVER__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JobEngineServer> getHandlersAsSelected() {
		if (handlersAsSelected == null) {
			handlersAsSelected = new EObjectWithInverseResolvingEList<JobEngineServer>(JobEngineServer.class, this, JobHttpPackage.JOB_SERVER__HANDLERS_AS_SELECTED, JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER);
		}
		return handlersAsSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<JobEngineServer> getHandlers() {
		EList<JobEngineServer> list = new EObjectListDerived<JobEngineServer>
		(	JobEngineServer.class, 
			this, 
			JobHttpPackage.JOB_SERVER__HANDLERS, 
			true);
		for ( JobEngineServer handler: this.getHandlersAsSelected()) {
			list.add(handler);
		}
		JobEngineServer handler = this.getHandlerAsOwned();
		if ( handler!=null) {
			list.add(handler);
		}
	return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobEngineServer getHandlerAsOwned() {
		if (eContainerFeatureID() != JobHttpPackage.JOB_SERVER__HANDLER_AS_OWNED) return null;
		return (JobEngineServer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHandlerAsOwned(JobEngineServer newHandlerAsOwned, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHandlerAsOwned, JobHttpPackage.JOB_SERVER__HANDLER_AS_OWNED, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerAsOwned(JobEngineServer newHandlerAsOwned) {
		if (newHandlerAsOwned != eInternalContainer() || (eContainerFeatureID() != JobHttpPackage.JOB_SERVER__HANDLER_AS_OWNED && newHandlerAsOwned != null)) {
			if (EcoreUtil.isAncestor(this, newHandlerAsOwned))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHandlerAsOwned != null)
				msgs = ((InternalEObject)newHandlerAsOwned).eInverseAdd(this, JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER, JobEngineServer.class, msgs);
			msgs = basicSetHandlerAsOwned(newHandlerAsOwned, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_SERVER__HANDLER_AS_OWNED, newHandlerAsOwned, newHandlerAsOwned));
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
			case JobHttpPackage.JOB_SERVER__HANDLERS_AS_SELECTED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHandlersAsSelected()).basicAdd(otherEnd, msgs);
			case JobHttpPackage.JOB_SERVER__HANDLER_AS_OWNED:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHandlerAsOwned((JobEngineServer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobHttpPackage.JOB_SERVER__HANDLERS_AS_SELECTED:
				return ((InternalEList<?>)getHandlersAsSelected()).basicRemove(otherEnd, msgs);
			case JobHttpPackage.JOB_SERVER__HANDLER_AS_OWNED:
				return basicSetHandlerAsOwned(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JobHttpPackage.JOB_SERVER__HANDLER_AS_OWNED:
				return eInternalContainer().eInverseRemove(this, JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER, JobEngineServer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JobHttpPackage.JOB_SERVER__PORT:
				return getPort();
			case JobHttpPackage.JOB_SERVER__HANDLERS_AS_SELECTED:
				return getHandlersAsSelected();
			case JobHttpPackage.JOB_SERVER__HANDLERS:
				return getHandlers();
			case JobHttpPackage.JOB_SERVER__HANDLER_AS_OWNED:
				return getHandlerAsOwned();
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
			case JobHttpPackage.JOB_SERVER__PORT:
				setPort((Integer)newValue);
				return;
			case JobHttpPackage.JOB_SERVER__HANDLERS_AS_SELECTED:
				getHandlersAsSelected().clear();
				getHandlersAsSelected().addAll((Collection<? extends JobEngineServer>)newValue);
				return;
			case JobHttpPackage.JOB_SERVER__HANDLER_AS_OWNED:
				setHandlerAsOwned((JobEngineServer)newValue);
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
			case JobHttpPackage.JOB_SERVER__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case JobHttpPackage.JOB_SERVER__HANDLERS_AS_SELECTED:
				getHandlersAsSelected().clear();
				return;
			case JobHttpPackage.JOB_SERVER__HANDLER_AS_OWNED:
				setHandlerAsOwned((JobEngineServer)null);
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
			case JobHttpPackage.JOB_SERVER__PORT:
				return port != PORT_EDEFAULT;
			case JobHttpPackage.JOB_SERVER__HANDLERS_AS_SELECTED:
				return handlersAsSelected != null && !handlersAsSelected.isEmpty();
			case JobHttpPackage.JOB_SERVER__HANDLERS:
				return !getHandlers().isEmpty();
			case JobHttpPackage.JOB_SERVER__HANDLER_AS_OWNED:
				return getHandlerAsOwned() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Port: ");
		result.append(port);
		result.append(')');
		return result.toString();
	}

//    private HttpServer server = null;

    private Server server = null;
    
    static private void helperAddContextHandler(ContextHandlerCollection collection_handler, String path, AbstractHandler handler) {
    	ContextHandler context = new ContextHandler(path);
    	context.setHandler(handler);
        context.setResourceBase(".");
        context.setClassLoader(Thread.currentThread().getContextClassLoader());
        // otherwise the POST becomes a GET
        // By default a Jetty ContextHandler with a context of "/app" will actually redirect any request to "/app" to "/app/", have a look at setAllowNullPathInfo.
        context.setAllowNullPathInfo(true); 
    	collection_handler.addHandler(context);
    }

	@Override
	protected void startImpl() {
   		super.startImpl();
        try {
        	// create the server
            this.server = new Server(this.getPort());
            
            // create the handlers
            ContextHandlerCollection collection_handler = new ContextHandlerCollection();
            for ( JobEngineServer handler : this.getHandlers()) {
            	String path = handler.getPath();
            	
            	helperAddContextHandler(collection_handler, path+"/submitjob",     handler.constructSubmitJobHandler());
            	helperAddContextHandler(collection_handler, path+"/submitfile",    handler.constructSubmitFileHandler());
            	helperAddContextHandler(collection_handler, path+"/getjobstatus",  handler.constructGetJobStatusHandler());
            	helperAddContextHandler(collection_handler, path+"/getjobresult",  handler.constructGetJobResultHandler());
            	helperAddContextHandler(collection_handler, path+"/getfileresult", handler.constructGetFileResultHandler());
            	
                this.server.setHandler(collection_handler);
            }
            // start the server
			this.server.start();
		} catch (Exception e) {
			Plugin.INSTANCE.logError("jetty.JobServer: could not start");
			e.printStackTrace();
		}
        server.dumpStdErr();
        //server.join();

	}
	

	@Override
	protected void stopImpl() {
//		int delay = 5; // seconds
//		this.server.stop(delay);
//		this.server = null;
		try {
			this.server.stop();
		} catch (Exception e) {
			Plugin.INSTANCE.logError("jetty.JobServer: could not stop");
			e.printStackTrace();
		}
		super.stopImpl();
	}
} //JobServerImpl
