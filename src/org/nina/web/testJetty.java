package org.nina.web;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ResourceHandler;

public class testJetty {

	public static void main(String[] args) throws Exception
	{
	  Server server = new Server(8080);
	  
	  ResourceHandler resourceHandler = new ResourceHandler();
	  resourceHandler.setResourceBase("E:/eclipse-workshop");

	  server.setHandler(resourceHandler);
	  
	  server.start();
	}
}
