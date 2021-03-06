package de.gtarc.auvegos.embeddedwebagent.webapp.rest.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

@Provider
public class JerseyCORSResponseFilter implements ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
		MultivaluedMap<String, Object> headers = responseContext.getHeaders();
		 
		/*
		headers.add("Access-Control-Allow-Origin", "http://localhost"); //allows CORS requests only coming from example.org		
		headers.add("Access-Control-Allow-Headers", "X-Requested-With, Content-Type, X-Codingpedia");
		*/
		
		headers.add("Access-Control-Allow-Origin", "*");
		headers.add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
		headers.add("Access-Control-Allow-Credentials", "true");
		headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
		headers.add("Access-Control-Max-Age", "1209600");
	}

}
