package com.yitianyigexiangfa.airline.study.design.pattern.iocs.ioc.common;

public class HtmlReport implements ReportGenerator{

    @Override
    public void generoter(String[][] table) {
        System.out.println("This is Html report!");
    }
}
