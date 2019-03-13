package com.csi.DyApiOperation.dto;

import java.io.Serializable;

public class StoreDataRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9208713974341471004L;

	private String apiId;
	private String apiName;
	private String apiResponse;

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getApiResponse() {
		return apiResponse;
	}

	public void setApiResponse(String apiResponse) {
		this.apiResponse = apiResponse;
	}

}
