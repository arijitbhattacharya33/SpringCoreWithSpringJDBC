package com.example.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.ApplicationModel;

@Component
public class ApplicationDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public String  saveData() {
		System.out.println("DAO-saveData()");
		return "Data Saved.";
	}
	
	//@Transactional
	public void insertData() {
		String query = "insert into t_patient_health_record (patient_id, test_name,test_cost,test_date)"
				+ " values("+1+", 'ECG',"+200.00f+", '"+ new Date(new java.util.Date().getTime())+"' )";
		int row = jdbcTemplate.update(query);
		System.out.println("row::"+row);
	}
	
	public void updateData() {}
	
	public ApplicationModel getSingleRowData(int id) {
		String query = "select * from t_patient_health_record where patient_id=?";
		return jdbcTemplate.queryForObject(query, new Object[] {id}, (rs, rowNum) -> new ApplicationModel(
				rs.getInt(1),
				rs.getString(2),
				rs.getFloat(3),
				new java.util.Date(rs.getDate(4).getTime())
				));
	}
	
	public List<ApplicationModel> getMultiRowData() {
		String query = "select * from t_patient_health_record";
		return jdbcTemplate.query(query, (rs, rowNum) -> new ApplicationModel(
				rs.getInt(1),
				rs.getString(2),
				rs.getFloat(3),
				new java.util.Date(rs.getDate(4).getTime())
				));
	}
}
