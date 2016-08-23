package org.formation.spring.service;

import org.formation.spring.report.IReportGenerator;

public class ReportService {
	IReportGenerator reportGenerator;
	private String auteur;

	
	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void setReportGenerator(IReportGenerator reportGenerator) {
		this.reportGenerator = reportGenerator;
	}

	public ReportService(IReportGenerator reportGenerator) {
		super();
		this.reportGenerator = reportGenerator;
	}

	public void generate(){
		reportGenerator.generate(getAuteur());
	}
}
