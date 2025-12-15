package io.github.gustavosrosa.arquiteturaspring.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.gustavosrosa.arquiteturaspring.main.HondaHRV;
import io.github.gustavosrosa.arquiteturaspring.montadora.Carro;
import io.github.gustavosrosa.arquiteturaspring.montadora.CarroStatus;
import io.github.gustavosrosa.arquiteturaspring.montadora.Chave;
import io.github.gustavosrosa.arquiteturaspring.montadora.Motor;

@RestController
@RequestMapping("carro")
public class TesteFabricaController {
	
	/**
	 * Vai no Bean e recupera a instancia de motor
	 * Ir até as cofigurations
	 */
	@Autowired
	private Motor motor;
	
	@PostMapping
	public CarroStatus ligarCarro(@RequestBody Chave chave) {
		Carro carro = new HondaHRV(motor);
		return carro.darIgnicao(chave);
	}

}
