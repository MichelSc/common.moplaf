/**
 */
package com.misc.common.moplaf.job.jobhttp.impl;

import com.misc.common.moplaf.job.jobclient.impl.JobSourceImpl;

import com.misc.common.moplaf.job.jobhttp.JobEngineServer;
import com.misc.common.moplaf.job.jobhttp.JobHttpPackage;
import com.misc.common.moplaf.job.jobhttp.JobServer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Engine Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.impl.JobEngineServerImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.impl.JobEngineServerImpl#getSelectedServer <em>Selected Server</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.impl.JobEngineServerImpl#getOwnerServer <em>Owner Server</em>}</li>
 *   <li>{@link com.misc.common.moplaf.job.jobhttp.impl.JobEngineServerImpl#getServer <em>Server</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobEngineServerImpl extends JobSourceImpl implements JobEngineServer {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = "default_path";

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelectedServer() <em>Selected Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedServer()
	 * @generated
	 * @ordered
	 */
	protected JobServer selectedServer;

	/**
	 * The cached value of the '{@link #getOwnerServer() <em>Owner Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerServer()
	 * @generated
	 * @ordered
	 */
	protected JobServer ownerServer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobEngineServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JobHttpPackage.Literals.JOB_ENGINE_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_ENGINE_SERVER__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobServer getSelectedServer() {
		if (selectedServer != null && selectedServer.eIsProxy()) {
			InternalEObject oldSelectedServer = (InternalEObject)selectedServer;
			selectedServer = (JobServer)eResolveProxy(oldSelectedServer);
			if (selectedServer != oldSelectedServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER, oldSelectedServer, selectedServer));
			}
		}
		return selectedServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobServer basicGetSelectedServer() {
		return selectedServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectedServer(JobServer newSelectedServer, NotificationChain msgs) {
		JobServer oldSelectedServer = selectedServer;
		selectedServer = newSelectedServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER, oldSelectedServer, newSelectedServer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedServer(JobServer newSelectedServer) {
		if (newSelectedServer != selectedServer) {
			NotificationChain msgs = null;
			if (selectedServer != null)
				msgs = ((InternalEObject)selectedServer).eInverseRemove(this, JobHttpPackage.JOB_SERVER__HANDLERS_AS_SELECTED, JobServer.class, msgs);
			if (newSelectedServer != null)
				msgs = ((InternalEObject)newSelectedServer).eInverseAdd(this, JobHttpPackage.JOB_SERVER__HANDLERS_AS_SELECTED, JobServer.class, msgs);
			msgs = basicSetSelectedServer(newSelectedServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER, newSelectedServer, newSelectedServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobServer getOwnerServer() {
		return ownerServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerServer(JobServer newOwnerServer, NotificationChain msgs) {
		JobServer oldOwnerServer = ownerServer;
		ownerServer = newOwnerServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER, oldOwnerServer, newOwnerServer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerServer(JobServer newOwnerServer) {
		if (newOwnerServer != ownerServer) {
			NotificationChain msgs = null;
			if (ownerServer != null)
				msgs = ((InternalEObject)ownerServer).eInverseRemove(this, JobHttpPackage.JOB_SERVER__HANDLER_AS_OWNED, JobServer.class, msgs);
			if (newOwnerServer != null)
				msgs = ((InternalEObject)newOwnerServer).eInverseAdd(this, JobHttpPackage.JOB_SERVER__HANDLER_AS_OWNED, JobServer.class, msgs);
			msgs = basicSetOwnerServer(newOwnerServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER, newOwnerServer, newOwnerServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobServer getServer() {
		JobServer server = basicGetServer();
		return server != null && server.eIsProxy() ? (JobServer)eResolveProxy((InternalEObject)server) : server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public JobServer basicGetServer() {
		JobServer server = this.getOwnerServer();
		if ( server!=null) {
			return server;
		}
		return this.getSelectedServer();
	}
	
	

	@Override
	protected void startImpl() {
		
		JobServer server = this.getServer();
		if ( server == null ) {
			return;
		}
		
		// start the server
		if ( !server.isRunning()) {
			if ( server.isAutoStartStop() && server.getStartFeedback().isEnabled() ) {
				server.start();
			} else {
				// server is not running and may not be started
				return;
			}
		}
		// do things specific for starting this engine
		// ...
	}

	@Override
	protected void stopImpl() {
		// do things specific for starting this engine
		// ...
		
		// stop the server
		JobServer server = this.getServer();
		if ( server!=null ) {
			if ( server.isAutoStartStop() 
				&& server.getStopFeedback().isEnabled() 
				&& server.getHandlers().size()<=1 ) {
				server.stop();
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER:
				if (selectedServer != null)
					msgs = ((InternalEObject)selectedServer).eInverseRemove(this, JobHttpPackage.JOB_SERVER__HANDLERS_AS_SELECTED, JobServer.class, msgs);
				return basicSetSelectedServer((JobServer)otherEnd, msgs);
			case JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER:
				if (ownerServer != null)
					msgs = ((InternalEObject)ownerServer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER, null, msgs);
				return basicSetOwnerServer((JobServer)otherEnd, msgs);
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
			case JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER:
				return basicSetSelectedServer(null, msgs);
			case JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER:
				return basicSetOwnerServer(null, msgs);
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
			case JobHttpPackage.JOB_ENGINE_SERVER__PATH:
				return getPath();
			case JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER:
				if (resolve) return getSelectedServer();
				return basicGetSelectedServer();
			case JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER:
				return getOwnerServer();
			case JobHttpPackage.JOB_ENGINE_SERVER__SERVER:
				if (resolve) return getServer();
				return basicGetServer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JobHttpPackage.JOB_ENGINE_SERVER__PATH:
				setPath((String)newValue);
				return;
			case JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER:
				setSelectedServer((JobServer)newValue);
				return;
			case JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER:
				setOwnerServer((JobServer)newValue);
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
			case JobHttpPackage.JOB_ENGINE_SERVER__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER:
				setSelectedServer((JobServer)null);
				return;
			case JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER:
				setOwnerServer((JobServer)null);
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
			case JobHttpPackage.JOB_ENGINE_SERVER__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case JobHttpPackage.JOB_ENGINE_SERVER__SELECTED_SERVER:
				return selectedServer != null;
			case JobHttpPackage.JOB_ENGINE_SERVER__OWNER_SERVER:
				return ownerServer != null;
			case JobHttpPackage.JOB_ENGINE_SERVER__SERVER:
				return basicGetServer() != null;
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
		result.append(" (Path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //JobEngineServerImpl
