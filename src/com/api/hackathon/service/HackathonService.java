package com.api.hackathon.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import com.api.hackathon.RestRequest;
import com.api.hackathon.RestResponse;
import org.apache.cxf.jaxrs.model.wadl.ElementClass;

@Produces({"application/xml","application/json"})
@Consumes({"application/xml","application/json","application/x-www-form-urlencoded"})
public interface HackathonService 
{
	@POST
	@Path("/fetchUserById")
	@ElementClass(request = RestRequest.class, response = RestResponse.class)
	public Response fetchUserById(RestRequest request);
}
