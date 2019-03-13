package com.csi.DyApiOperation.dao.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="apiResponseData")
public class ApiResponseData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3961886622883509797L;
	
	@Id
	@GeneratedValue(generator = "idSequence")
	@SequenceGenerator(name = "idSequence", sequenceName = "csiregapis.apimetadata_id_seq", allocationSize = 1)
	private int id;

	@Column(name="apiId")
	private int apiId;

	@Column(name="response")
	private String response;

	@Column(name="createdDate")
	private Timestamp createdDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getApiId() {
		return apiId;
	}

	public void setApiId(int apiId) {
		this.apiId = apiId;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

}
