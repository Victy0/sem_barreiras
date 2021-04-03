package com.uff.sem_barreiras;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import net.kaczmarzyk.spring.data.jpa.web.SpecificationArgumentResolver;

@SpringBootApplication
public class SemBarreirasApplication extends WebMvcConfigurationSupport{

	public static void main(String[] args) {
		SpringApplication.run(SemBarreirasApplication.class, args);
		System.out.println("\nAPLICAÇÃO FUNCIONANDO!!!");
		System.out.println("\nPARA UTILIZAR LOCALMENTE A RAÍZ DA URL PARA ACESSO É: http://localhost:8080/ \n");
	}

	
	@Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new SpecificationArgumentResolver());
		argumentResolvers.add(new PageableHandlerMethodArgumentResolver());
    }

}