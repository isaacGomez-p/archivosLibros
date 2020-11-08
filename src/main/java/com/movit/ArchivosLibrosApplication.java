package com.movit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.movit")
@EntityScan("com.movit.entity")
@EnableJpaRepositories("com.movit.repository")
public class ArchivosLibrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArchivosLibrosApplication.class, args);
	}

}
