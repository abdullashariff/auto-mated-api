package com.csi.DyApiOperation.dao.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="apiMetaData")
public class ApiMetaData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4283538783706921853L;
	
	@Id
	@GeneratedValue(generator = "idSequence")
	@SequenceGenerator(name = "idSequence", sequenceName = "csiregapis.apiresponsedata_id_seq", allocationSize = 1)
	private int id;
	
	@Column(name="userid")
	private String userId;
	
	@Column(name="createBy")
	private String createBy;
	
	@Column(name="apiName")
	private String apiName;
	
	@Column(name="createdDate")
	private Timestamp createdDate;
	
	@Column(name="params")
	private String params;
	
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinColumn(name="apiId", referencedColumnName="id")
	private List<ApiResponseData> apiResponseData;
	
	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<ApiResponseData> getApiResponseData() {
		return apiResponseData;
	}

	public void setApiResponseData(List<ApiResponseData> apiResponseData) {
		this.apiResponseData = apiResponseData;
	}



}
