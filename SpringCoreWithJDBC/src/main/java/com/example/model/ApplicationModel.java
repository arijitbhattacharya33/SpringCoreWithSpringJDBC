package com.example.model;

import java.util.Date;

public class ApplicationModel {

	private int patientId; // DO NOT MODIFY THIS CLASS
	private String testName;
	private float testCost;
	private Date testDate;

	public ApplicationModel() {}
	public ApplicationModel(int patientId,String testName,float testCost,Date testDate) {
		this.patientId = patientId;
		this.testName = testName;
		this.testCost = testCost;
		this.testDate = testDate;
	}
	/**
	 * @return the patientId
	 */
	public int getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	/**
	 * @return the testName
	 */
	public String getTestName() {
		return testName;
	}

	/**
	 * @param testName the testName to set
	 */
	public void setTestName(String testName) {
		this.testName = testName;
	}

	/**
	 * @return the testCost
	 */
	public float getTestCost() {
		return testCost;
	}

	/**
	 * @param testCost the testCost to set
	 */
	public void setTestCost(float testCost) {
		this.testCost = testCost;
	}

	/**
	 * @return the testDate
	 */
	public Date getTestDate() {
		return testDate;
	}

	/**
	 * @param testDate the testDate to set
	 */
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}
	
	@Override
	public String toString() {
		return "patientId="+patientId+" ,testName="+testName+",testCost="+testCost+" ,testDate"+testDate;
	}
}
