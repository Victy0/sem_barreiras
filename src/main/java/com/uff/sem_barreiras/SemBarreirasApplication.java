package com.uff.sem_barreiras;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
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

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/img/**")
			.addResourceLocations("classpath:/static/img/");
		registry.addResourceHandler("/scripts/**")
			.addResourceLocations("classpath:/static/scripts/");
		registry.addResourceHandler("/css/**")
			.addResourceLocations("classpath:/static/css/");
	}

	//mapeamento dos HTML do front devem ser colocados aqui
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/listar-vaga").setViewName("index");
		registry.addViewController("/listar-curso").setViewName("curso");
		registry.addViewController("/cadastro-empresa").setViewName("empresa");
		registry.addViewController("/cadastro-vaga").setViewName("cadastroVaga");
		registry.addViewController("/cadastro-curso").setViewName("formCurso.html");
		registry.addViewController("/editar-curso").setViewName("formCurso.html");
		registry.addViewController("/login").setViewName("login");
		registry.addViewController("/acessar-vaga").setViewName("vaga.html");
		registry.addViewController("/v-libras").setViewName("vlibras.html");
	}
	
}