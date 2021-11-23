package br.com.projeto2.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Projeto2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Projeto2Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Projeto2Application");
	}
}
 