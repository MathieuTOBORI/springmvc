package org.formation.spring.test;

import org.formation.spring.service.ReportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_TP1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ReportService reportService = (ReportService) context.getBean("reportService");
		reportService.generate();

	}

}
