package com.example.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import com.example.dao.ApplicationDao;
import com.example.model.ApplicationModel;

@Component
public class ApplicationService {

	@Resource
	MessageSource ms;
	
	@Autowired
	ApplicationDao dao;
	
	@Resource
	private Map<String, Float> diagnosticTest;
	
	
	
	public String getResourceData(String policyName) {
		return ms.getMessage(policyName, null, null);
	}
	
	public String getDataFromDao() {
		return dao.saveData();
	}
	
	public void insertData() {
		dao.insertData();
	}
	
	public Float diagnosticTestData(String testName) {
		if (diagnosticTest.containsKey(testName)) {
			return diagnosticTest.get(testName);
		}
		return 0.0f;
	}
	
	public ApplicationModel getSingleRowData(int patientId) {
		return dao.getSingleRowData(patientId);
	}
}

