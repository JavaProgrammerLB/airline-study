package com.yitianyigexiangfa.airline.study.design.pattern.iocs.ioc.solution1;

import com.yitianyigexiangfa.airline.study.design.pattern.iocs.ioc.common.PdfReport;
import com.yitianyigexiangfa.airline.study.design.pattern.iocs.ioc.common.ReportGenerator;

public class ReportService {

    private ReportGenerator reportGen = new PdfReport();

    public void printAnnualReport(int year) {
        String[][] statistics = null;
        statistics = new String[1][];
        reportGen.generoter(statistics);
    }

    public void printMonthReport(int year, int month) {
        String[][] statistics = new String[1][];
        reportGen.generoter(statistics);
    }

}
