package com.chandra.rest;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;

import com.sun.jersey.client.apache.ApacheHttpClient;
import com.sun.jersey.client.apache.ApacheHttpClientHandler;
import com.sun.jersey.client.apache.config.DefaultApacheHttpClientConfig;

public final class ClientFactory {
	public static ApacheHttpClient getClient() {
	    MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager(); 
	    connectionManager.getParams().setDefaultMaxConnectionsPerHost(MultiThreadedHttpConnectionManager.DEFAULT_MAX_HOST_CONNECTIONS); 
	    connectionManager.getParams().setMaxTotalConnections(MultiThreadedHttpConnectionManager.DEFAULT_MAX_TOTAL_CONNECTIONS); 
	    DefaultApacheHttpClientConfig clientConfig = new  DefaultApacheHttpClientConfig();
	    
	    return new ApacheHttpClient(new ApacheHttpClientHandler(new HttpClient(connectionManager), clientConfig));
	}

}
