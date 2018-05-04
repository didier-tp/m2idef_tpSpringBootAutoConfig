package com.capgemini.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@Import(DomainAndPersistenceConfig.class)
@EnableWebMvc() //equivalent de <mvc:annotation-driven />
@ComponentScan(basePackages={"com.capgemini.web.rest"}) //to find and interpret @RestController , ...
public class WebMvcConfig {

	

}