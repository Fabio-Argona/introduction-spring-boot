package io.github.fabioargona.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class salesApplication {

	@Value("${application.name}")
	private String applicationName;

	@Dog
	private Animal animal;

	@Bean
	public CommandLineRunner execute(){
		return arg -> this.animal.makeNoise();
	}

	@GetMapping("/hello")
	public String helloWord() {
		return applicationName;
	}

	public static void main(String[] args) {

		SpringApplication.run(salesApplication.class, args);
	}

}
