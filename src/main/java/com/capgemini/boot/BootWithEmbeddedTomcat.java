package com.capgemini.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.capgemini.config.WithAutoConfiguration;


public class BootWithEmbeddedTomcat {
	// le boot complet avec webApp prise en charge par tomcat embarqué .
	
	
	
	
	public static void main(String[] args) {
			
		// on prépare la configuration de l'application en mode spring-boot
		
	     SpringApplication app = new SpringApplication(WithAutoConfiguration.class);
		
		
		app.setWebEnvironment(true);
		//app.setLogStartupInfo(false);
		
		//setting profile (context.getEnvironment().setActiveProfiles("...") ) :
		//app.setAdditionalProfiles( "p1" , "with-thymeleaf"); 
		
		// on lance l'application spring
		ConfigurableApplicationContext context =  app.run(args);
		
		System.out.println("localhost:8080_ou_8888/tpSpringBootAutoConfig");
		
	}

}
