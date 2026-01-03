package io.github.gustavosrosa.arquiteturaspring.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private TodoRepository todoRepository;
	private TodoValidator todoValidator;
	private MailSender mailSender;
	
	public TodoService(TodoRepository todoRepository, TodoValidator todoValidator, MailSender mailSender) {
		this.todoRepository = todoRepository;
		this.todoValidator = todoValidator;
		this.mailSender = mailSender;
	}
	
	public TodoEntity salvar(TodoEntity novoTodo) {
		todoValidator.validar(novoTodo);
		return todoRepository.save(novoTodo);
	}
	
	public void atualizarStatus(TodoEntity todo) {
		todoRepository.save(todo);
		String status = todo.getConcluido() == Boolean.TRUE ? "Concluído" : "Não concluído";
		mailSender.enviarEmail("Todo " + todo.getDescricao() + " foi atualizado para: " + status);
	}

	public TodoEntity buscar(Integer id) {
		return todoRepository.findById(id).orElse(null);
	}

	public void atualizarCampoUnico(TodoEntity todo) {
		todoRepository.save(todo);
	}

}
