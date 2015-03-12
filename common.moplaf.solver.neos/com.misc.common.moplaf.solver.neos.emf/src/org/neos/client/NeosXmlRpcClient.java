package org.neos.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Vector;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.XmlRpcRequest;
import org.apache.xmlrpc.client.AsyncCallback;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;


/**
 * XMLRPC client
 * @author Thawan Kooburat
 *
 */
public class NeosXmlRpcClient implements AsyncCallback {
	private boolean connected = false;
	private boolean waiting;

	private String host;
	private String port;

	private Object response;

	private XmlRpcClient server;
	private Throwable exception;
	private Date startTime;

	final static int sleepInterval = 100; // milliseconds

	public NeosXmlRpcClient(String neosHost, String neosPort) {
		this.host = neosHost;
		this.port = neosPort;

	}

	public boolean connect() throws XmlRpcException {

		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
		try {
			config.setServerURL(new URL("http://" + host + ":" + port));
		} catch (MalformedURLException e) {
			throw new XmlRpcException(0, "Malformed URL");
		}

		server = new XmlRpcClient();
		server.setConfig(config);
		connected = true;

		return connected;

	}

	public Object execute(String method, Vector params) throws XmlRpcException {
		try {
			return server.execute(method, params);
		} catch (Exception e) {
			throw new XmlRpcException(0, e.getMessage());
		}
	}

	public Object execute(String method, Vector params, long timeout)
			throws XmlRpcException {
		if (timeout < 0) {
			timeout = 1000000000L; // ~300 hrs
		}
		waiting = true;

		response = null;
		exception = null;
		startTime = new Date();
		server.executeAsync(method, params, this);
		while (waiting
				&& (new Date().getTime() - startTime.getTime() < timeout)) {
			try {
				Thread.sleep(sleepInterval);
			} catch (InterruptedException e) {
				throw new XmlRpcException(0, "Interrupted");
			}
		}

		if (exception != null)
			throw new XmlRpcException(0, exception.getMessage());
		if (response == null) {
			throw new XmlRpcException(0, "Error communicating with server.");
		}
		return response;
	}

	@Override
	public void handleError(XmlRpcRequest arg0, Throwable error) {

		if (waiting) {
			waiting = false;
			exception = error;
			response = null;
		}
	}

	@Override
	public void handleResult(XmlRpcRequest arg0, Object result) {

		if (waiting) {
			waiting = false;
			response = result;
		}
	}

}
