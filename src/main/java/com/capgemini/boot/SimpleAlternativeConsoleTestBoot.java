package com.capgemini.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.capgemini.config.DomainAndPersistenceConfig;
import com.capgemini.service.IServiceCompte;


public class SimpleAlternativeConsoleTestBoot {
	// le boot en mode console/text .
	
	
	
	
	public static void main(String[] args) {
		// on prépare la configuration de l'application en mode spring-boot
		
	     SpringApplication app = new SpringApplication(DomainAndPersistenceConfig.class);
	     
		
		
		app.setWebEnvironment(false);
		//app.setLogStartupInfo(false);
		
		//setting profile (context.getEnvironment().setActiveProfiles("...") ) :
		//app.setAdditionalProfiles( "p1"); 
		 
		
		// on lance l'application spring
		ConfigurableApplicationContext context =  app.run(args);
		
		try {
			
		// appels specifiques:
			IServiceCompte gestionComptes = context.getBean(IServiceCompte.class);
			display("comptes du client 1",gestionComptes.rechercherComptesDuClient(1L) );
			
		 
		} catch (Exception ex) {
			System.err.println("Exception : " + ex.getMessage());
		}finally{
		// fermeture du contexte Spring
		context.close();
		}
	}

	// méthode utilitaire - affiche les éléments d'une collection
	private static <T> void display(String message, Iterable<T> elements) {
		System.out.println(message);
		for (T e : elements) {
			System.out.println("\t"+e);
		}
	}

}
