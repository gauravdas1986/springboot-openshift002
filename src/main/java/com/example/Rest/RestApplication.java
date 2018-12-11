package com.example.Rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}
	
	 @Bean
	    public ServletRegistrationBean servletRegistrationBean() {
	        ServletRegistrationBean registration =
	                new ServletRegistrationBean(new CamelHttpTransportServlet(), CAMEL_URL_MAPPING);
	        registration.setName(CAMEL_SERVLET_NAME);

	        return registration;
	    }
}
