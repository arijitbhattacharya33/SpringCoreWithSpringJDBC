package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.ApplicationConfig;
import com.example.service.ApplicationService;

public class SpringCoreWithJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		ApplicationService service = ctx.getBean(ApplicationService.class);
		System.out.println("output::"+service.getResourceData("WOMEN_PLUS"));
		System.out.println("output::"+service.getDataFromDao());
		System.out.println("output::"+service.diagnosticTestData("ECG"));
		service.insertData();
		System.out.println("output::"+service.getSingleRowData(1));
	}

}
