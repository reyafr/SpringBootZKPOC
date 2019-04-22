package com.example.demo;

import javax.servlet.http.HttpSessionListener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.zkoss.zk.au.http.DHtmlUpdateServlet;
import org.zkoss.zk.ui.http.DHtmlLayoutServlet; 

@SpringBootApplication
public class ZkMvvmJpasPringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZkMvvmJpasPringBootApplication.class, args);
	}
	
	@Bean
	public ServletRegistrationBean zkLoader() {
		ServletRegistrationBean zkLoader = new ServletRegistrationBean(new DHtmlLayoutServlet(), "*.zul", "*.zhtml");
		zkLoader.getInitParameters().put("update-uri", "/zkau");
		return zkLoader;
	}
	

	@Bean
	public ServletRegistrationBean auEngine() {
		ServletRegistrationBean auEngine = new ServletRegistrationBean(new DHtmlUpdateServlet(), "/zkau/*");
		return auEngine;
	}

	@Bean
	public HttpSessionListener httpSessionListener() {
		return new org.zkoss.zk.ui.http.HttpSessionListener();
	}

}
