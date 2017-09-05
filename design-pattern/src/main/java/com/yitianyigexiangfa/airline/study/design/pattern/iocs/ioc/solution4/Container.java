package com.yitianyigexiangfa.airline.study.design.pattern.iocs.ioc.solution4;

import org.apache.commons.beanutils.PropertyUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Container {

    private Map<String, Object> components;

    public Container(){
        components = new HashMap<String, Object>();

        try {
            Properties proper = new Properties();
            proper.load(new FileInputStream("components.properties"));
            for(Map.Entry entry: proper.entrySet()){
                String key = (String)entry.getKey();
                String value = (String)entry.getValue();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void processEntry(String key, String value) throws Exception{
        String[] parts = value.split("\\.");
        if(parts.length == 1){
            Object comp = Class.forName(value).newInstance();
            components.put(key, comp);
        } else {
            Object obj = components.get(parts[0]);
            Object ref = components.get(value);
            PropertyUtils.setProperty(obj, parts[1], ref);
        }
    }

    public Object getComponent(String id){
        return components.get(id);
    }

}
