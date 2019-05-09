package com.xuelei.webservice;

import com.xuelei.webservice.ws.impl.WebServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.Endpoint;

@SpringBootApplication
public class WebserviceApplication {

	public static void main(String[] args) {

		SpringApplication.run(WebserviceApplication.class, args);
		String url = "http://127.0.0.1:8000/ws";
		Endpoint.publish(url,new WebServiceImpl());
		System.out.print("ws发布成功");
	}

}
