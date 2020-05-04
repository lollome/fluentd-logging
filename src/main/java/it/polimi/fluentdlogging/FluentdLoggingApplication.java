package it.polimi.fluentdlogging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FluentdLoggingApplication {

	private static final org.slf4j.Logger logger =  org.slf4j.LoggerFactory.getLogger(FluentdLoggingApplication.class);
	
	public static void main(String[] args) 
	{
		logger.info(" ************* Sono un log info Slf4j *************** ");


		SpringApplication.run(FluentdLoggingApplication.class, args);
	}

}
