package io.github.gustavosrosa.arquiteturaspring.main;

import java.awt.Color;

import io.github.gustavosrosa.arquiteturaspring.montadora.Carro;
import io.github.gustavosrosa.arquiteturaspring.montadora.Montadora;
import io.github.gustavosrosa.arquiteturaspring.montadora.Motor;

public class HondaHRV extends Carro{

	public HondaHRV(Motor motor) {
		super(motor);
		setModelo("HRV");
		setCor(Color.BLACK);
		setMontadora(Montadora.HONDA);
	}

}
