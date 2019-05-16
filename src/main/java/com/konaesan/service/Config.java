package com.konaesan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

@Configuration
public class Config
{
    @Autowired
    TaskService taskServiceImpl;

    @Bean
    RemoteExporter registerRMIExporter() {

        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("ToDoPersistence");
        exporter.setServiceInterface(TaskService.class);
        exporter.setService(taskServiceImpl);
        exporter.setRegistryPort(1099);

        return exporter;
    }
}
