package io.github.gustavosrosa.arquiteturaspring.todos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExemploValue {
	
	@Value("${app.config.variavel}")
	private String variavel;
	
	public void imprimirVariavelDoApplicationProperties() {
		System.out.println(variavel);
	}

}
