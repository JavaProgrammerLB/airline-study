package com.yitianyigexiangfa.airline.study.design.pattern.iocs.ioc.solution3;

import com.yitianyigexiangfa.airline.study.design.pattern.iocs.ioc.common.ReportGenerator;

public class ReportService {

    private ReportGenerator reportGen;

    public void setReportGen(ReportGenerator reportGen){
        this.reportGen = reportGen;
    }

    public void printAnnualReport(int year){
        String[][] statistics = null;
        reportGen.generoter(statistics);
    }

    public void printMonthReport(int year, int month){
        String[][] statistics = null;
        reportGen.generoter(statistics);
    }

}
