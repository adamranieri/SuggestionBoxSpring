package dev.ranieri.SuggestionBoxSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "dev.ranieri")
@EntityScan(basePackages = "dev.ranieri.entities")
@EnableJpaRepositories(basePackages = "dev.ranieri.repos")
public class SuggestionBoxSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuggestionBoxSpringApplication.class, args);
	}

}
