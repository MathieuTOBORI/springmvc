package org.formation.spring.report;

public class PDFReportGenerator extends ReportGenerator implements IReportGenerator {

	@Override
	public void generate() {
		System.out.println(this.getClass().getName());
	}

	@Override
	public void generate(String auteur) {
		this.generate();
		System.out.println("-> Auteur : " + auteur);
	}

}
