package com.yitianyigexiangfa.airline.study.design.pattern.iocs.ioc.solution2;

import com.yitianyigexiangfa.airline.study.design.pattern.iocs.ioc.common.PdfReport;
import com.yitianyigexiangfa.airline.study.design.pattern.iocs.ioc.common.ReportGenerator;
import com.yitianyigexiangfa.airline.study.design.pattern.iocs.ioc.solution2.ReportService;

import java.util.HashMap;
import java.util.Map;

public class Container {
    private static Container instance;

    private Map<String, Object> components;

    public Container(){
        components = new HashMap<String, Object>();
        instance = this;
        ReportGenerator reportGen = new PdfReport();
        components.put("reportGenerator", reportGen);
        ReportService reportSer = new ReportService();
        components.put("reportService", reportSer);
    }

    public Object getComponent(String id){
        return components.get(id);
    }

    public static Container getInstance() {
        return instance;
    }
}
