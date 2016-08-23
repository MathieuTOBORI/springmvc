package org.formation.spring.test;

import org.formation.spring.service.ReportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_TP2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ReportService reportService1 = (ReportService) context.getBean("reportService");
		ReportService reportService2 = (ReportService) context.getBean("reportService");
		reportService1.setAuteur("A");
		reportService2.setAuteur("B");
		reportService1.generate();
		reportService2.generate();
	}

}
