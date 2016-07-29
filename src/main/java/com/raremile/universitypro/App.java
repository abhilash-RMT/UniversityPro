package com.raremile.universitypro;

import com.raremile.universitypro.service.ReportGeneratorImpl;
import com.raremile.universitypro.utils.DBConfig;

public class App {

	public static void main(String[] args) {
		DBConfig dbConfig = new DBConfig();

		ReportGeneratorImpl reportGeneratorImpl = new ReportGeneratorImpl();
		reportGeneratorImpl.generateReport(3001);
	}

}
