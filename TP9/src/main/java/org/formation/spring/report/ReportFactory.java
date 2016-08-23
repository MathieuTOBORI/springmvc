package org.formation.spring.report;

public class ReportFactory {
	public static ReportGenerator createReport(String reportType){
		System.out.println("in factory");
		if ("htmlReport".equals(reportType)){
			return new HTMLReportGenerator();
		}else if ("pdfReport".equals(reportType)){
			return new PDFReportGenerator();
		}else{
			throw new IllegalArgumentException("mauvais type "+reportType);
		}
	}
	
}
