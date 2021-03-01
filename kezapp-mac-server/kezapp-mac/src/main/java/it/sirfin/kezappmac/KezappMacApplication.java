package it.sirfin.kezappmac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"it.sirfin.kezappmac"})
// Dice a Spring di usare i repository JPA e dove trovarli
@EnableJpaRepositories(basePackages = {"it.sirfin.kezappmac.repository"})
// Dice a Spring dove trovare le entità
@EntityScan(basePackages = {"it.sirfin.kezappmac.model"})
public class KezappMacApplication {

	public static void main(String[] args) {
		SpringApplication.run(KezappMacApplication.class, args);
	}

}
