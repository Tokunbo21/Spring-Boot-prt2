package org.Generation.brogPessoal;

import org.Generation.brogPessoal.model.Postagem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class BrogPessoalApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrogPessoalApplication.class, args);
	}
	
	

}
