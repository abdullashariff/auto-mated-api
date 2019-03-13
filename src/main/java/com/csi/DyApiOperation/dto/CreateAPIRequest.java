package com.csi.DyApiOperation.dto;

import java.io.Serializable;

public class CreateAPIRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7190053309578919165L;
	
	private String userId;
	private String token;
	private String apiName;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
}
