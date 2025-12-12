package io.github.gustavosrosa.arquiteturaspring;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication // Deve ter a annotation spring boot application
public class ArquiteturaspringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ArquiteturaspringApplication.class, args);
		
		/** Usado para pre-configurar o runner */
		
		SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaspringApplication.class);
		builder.bannerMode(Mode.OFF); // Remove o banner inicial
		
		// Usado para carregar um bean
		ConfigurableApplicationContext configurableApplicationContext = builder.context();
		Object produtoRepository = configurableApplicationContext.getBean("produtoRepository");
		
		builder.run(args);
	}

}
