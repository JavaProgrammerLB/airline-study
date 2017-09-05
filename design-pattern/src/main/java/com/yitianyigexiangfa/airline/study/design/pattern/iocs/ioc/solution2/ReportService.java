package com.yitianyigexiangfa.airline.study.design.pattern.iocs.ioc.solution2;

import com.yitianyigexiangfa.airline.study.design.pattern.iocs.ioc.common.ReportGenerator;

public class ReportService {
    ReportGenerator reportGene = (ReportGenerator) Container.getInstance().getComponent("reportGenerator");

    public void printAnnualReport(int year){
        String [][] statistics = null;
        reportGene.generoter(statistics);
    }

    public void printMonthReport(int year, int month){
        String[][] statistic = null;
        reportGene.generoter(statistic);
    }
}
