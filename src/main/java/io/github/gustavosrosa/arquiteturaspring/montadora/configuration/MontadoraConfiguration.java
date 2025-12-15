package io.github.gustavosrosa.arquiteturaspring.montadora.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import io.github.gustavosrosa.arquiteturaspring.montadora.Motor;
import io.github.gustavosrosa.arquiteturaspring.montadora.TipoMotor;

@Configuration
public class MontadoraConfiguration {
	
	/**
	 * Utilizado para injeção de dependências
	 * Método que retorna um objeto construído
	 * @return motor
	 */
	@Primary // Se encontrar mais de 1 bean e eu ocultar o qualifier dele, utilizará este bean
	@Bean(name = "motorAspirado")
	Motor motorAspirado() {
		Motor motor = new Motor();
		motor.setCavalos(120);
		motor.setCilindros(4);
		motor.setModelo("X");
		motor.setLitragem(2.0);
		motor.setTipoMotor(TipoMotor.ASPIRADO);
		return motor;
	}
	
	@Bean(name = "motorEletrico")
	Motor motorEletrico() {
		Motor motor = new Motor();
		motor.setCavalos(120);
		motor.setCilindros(4);
		motor.setModelo("X");
		motor.setLitragem(2.0);
		motor.setTipoMotor(TipoMotor.ELETRICO);
		return motor;
	}
	
	@Bean(name = "motorTurbo")
	Motor motorTurbo() {
		Motor motor = new Motor();
		motor.setCavalos(120);
		motor.setCilindros(4);
		motor.setModelo("X");
		motor.setLitragem(2.0);
		motor.setTipoMotor(TipoMotor.TURBO);
		return motor;
	}

}
