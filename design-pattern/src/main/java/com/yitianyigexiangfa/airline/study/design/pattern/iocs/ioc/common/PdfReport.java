package com.yitianyigexiangfa.airline.study.design.pattern.iocs.ioc.common;

public class PdfReport implements ReportGenerator{
    @Override
    public void generoter(String[][] table) {
        System.out.println("This is pdf report!");
    }
}
