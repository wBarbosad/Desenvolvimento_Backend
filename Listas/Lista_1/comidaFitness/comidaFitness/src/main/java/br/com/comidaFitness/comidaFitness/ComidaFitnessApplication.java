package br.com.comidaFitness.comidaFitness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ComidaFitnessApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComidaFitnessApplication.class, args);
	}
}
