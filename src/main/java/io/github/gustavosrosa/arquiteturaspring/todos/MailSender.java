package io.github.gustavosrosa.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {
	
	public void enviarEmail(String mensagem) {
		System.out.format("Enviando email com mensagem {%s}", mensagem);
	}

}
