package io.github.gustavosrosa.arquiteturaspring.montadora.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.gustavosrosa.arquiteturaspring.montadora.Motor;
import io.github.gustavosrosa.arquiteturaspring.montadora.TipoMotor;

@Configuration
public class MontadoraConfiguration {
	
	/**
	 * Utilizado para injeção de dependências
	 * Método que retorna um objeto construído
	 * @return motor
	 */
	@Bean
	Motor motor() {
		Motor motor = new Motor();
		motor.setCavalos(120);
		motor.setCilindros(4);
		motor.setModelo("X");
		motor.setLitragem(2.0);
		motor.setTipoMotor(TipoMotor.ASPIRADO);
		return motor;
	}

}
