package io.github.gustavosrosa.arquiteturaspring.montadora;

import java.awt.Color;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carro {
	
	private String modelo;
	private Color cor;
	private Motor motor;
	private Montadora montadora;
	
	// Motor é uma dependência do carro
	// Carro depende de motor para funcionar
	public Carro(Motor motor) {
		this.motor = motor;
	}

}
