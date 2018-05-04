package com.capgemini.config;



import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {"com.capgemini.dao"})
@EntityScan(basePackages= {"com.capgemini.entity"})
@ComponentScan(basePackages={"com.capgemini"})//with excludeFilters if needed
public class WithAutoConfiguration {
   //la configuration automatique tient compte des éléments
   //présents dans le classpath (selon pom.xml)
   //et du fichier application.properties	
}