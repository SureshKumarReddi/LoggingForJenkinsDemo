package com.Suresh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Suresh.Controller.FirstController;

@SpringBootApplication
public class SpringBootLoggingExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootLoggingExampleApplication.class, args);
		FirstController bean = (FirstController)context.getBean("firstController");
		bean.getMessage();
		
	}

}
