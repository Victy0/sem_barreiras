package com.uff.sem_barreiras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SemBarreirasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SemBarreirasApplication.class, args);
		System.out.println("\nAPLICAÇÃO FUNCIONANDO!!!");
		System.out.println("\nPARA UTILIZAR LOCALMENTE A RAÍZ DA URL PARA ACESSO É: http://localhost:8080/ \n");
	}

}