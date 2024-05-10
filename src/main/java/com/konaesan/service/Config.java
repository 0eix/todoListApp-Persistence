package com.konaesan.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

@Configuration
public class Config
{
    private final TaskService taskServiceImpl;

    public Config(TaskService taskServiceImpl) {
        this.taskServiceImpl = taskServiceImpl;
    }

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
