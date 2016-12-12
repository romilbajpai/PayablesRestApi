package com.api.hackathon;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "restRequest")
public class RestRequest 
{
	private String tin;

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	
	
	
}
