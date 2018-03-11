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
	protected static final String PATH_EDEFAULT = "xmlrpc";

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
	 * The cached value of the '{@link #getServer() <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected JobServer server;

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
	public JobServer getServer() {
		if (server != null && server.eIsProxy()) {
			InternalEObject oldServer = (InternalEObject)server;
			server = (JobServer)eResolveProxy(oldServer);
			if (server != oldServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JobHttpPackage.JOB_ENGINE_SERVER__SERVER, oldServer, server));
			}
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobServer basicGetServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServer(JobServer newServer, NotificationChain msgs) {
		JobServer oldServer = server;
		server = newServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_ENGINE_SERVER__SERVER, oldServer, newServer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(JobServer newServer) {
		if (newServer != server) {
			NotificationChain msgs = null;
			if (server != null)
				msgs = ((InternalEObject)server).eInverseRemove(this, JobHttpPackage.JOB_SERVER__HANDLERS, JobServer.class, msgs);
			if (newServer != null)
				msgs = ((InternalEObject)newServer).eInverseAdd(this, JobHttpPackage.JOB_SERVER__HANDLERS, JobServer.class, msgs);
			msgs = basicSetServer(newServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JobHttpPackage.JOB_ENGINE_SERVER__SERVER, newServer, newServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JobHttpPackage.JOB_ENGINE_SERVER__SERVER:
				if (server != null)
					msgs = ((InternalEObject)server).eInverseRemove(this, JobHttpPackage.JOB_SERVER__HANDLERS, JobServer.class, msgs);
				return basicSetServer((JobServer)otherEnd, msgs);
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
			case JobHttpPackage.JOB_ENGINE_SERVER__SERVER:
				return basicSetServer(null, msgs);
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
			case JobHttpPackage.JOB_ENGINE_SERVER__SERVER:
				setServer((JobServer)newValue);
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
			case JobHttpPackage.JOB_ENGINE_SERVER__SERVER:
				setServer((JobServer)null);
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
			case JobHttpPackage.JOB_ENGINE_SERVER__SERVER:
				return server != null;
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
