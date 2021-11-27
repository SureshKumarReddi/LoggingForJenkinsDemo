package com.Suresh.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class FirstController {

	private static final Logger  logger = LoggerFactory.getLogger(FirstController.class); 
	
	public String getMessage() {
		
		System.out.println(" Now i am going to call Logging Messages and we are testing for jenkins build ");
		logger.trace(" Trace messge goes here ");
		logger.debug(" Debugging messsgae ");
		logger.info(" info getMessage () ");
		logger.warn(" warning message goes here ");
		logger.error(" error message goes here  ");
		return "hello world example ";
	}
}
