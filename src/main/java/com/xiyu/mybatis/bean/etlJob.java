package com.xiyu.mybatis.bean;

import java.io.Serializable;

public class etlJob implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String jobId;
	String masterId;
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getMasterId() {
		return masterId;
	}
	public void setMasterId(String masterId) {
		this.masterId = masterId;
	}
	
}
