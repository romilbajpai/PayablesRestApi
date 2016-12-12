package com.api.hackathon.service.impl;

import javax.ws.rs.core.Response;

import com.api.hackathon.RestRequest;
import com.api.hackathon.RestResponse;
import com.api.hackathon.service.HackathonService;

public class HackathonServiceImpl implements HackathonService
{
	public Response fetchUserById(RestRequest request)
	{
		RestResponse response = new RestResponse();
		
		if(request.getTin()!= null && request.getTin().equals("1"))
		{
			response.setName("TestUser");
			return Response.ok(response).build();
		}
		else
		{
			response.setFault("InvalidUserId");
			return Response.status(400).entity(response).build();
		}
	}
}
