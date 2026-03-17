package com.phcvfcorp.movies_manegement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.phcvfcorp.movies_manegement")
@EnableJpaRepositories(basePackages = "com.phcvfcorp.movies_manegement.Repository")
public class MoviesManegementApplication {
	public static void main(String[] args) {
		SpringApplication.run(MoviesManegementApplication.class, args);
	}

}
