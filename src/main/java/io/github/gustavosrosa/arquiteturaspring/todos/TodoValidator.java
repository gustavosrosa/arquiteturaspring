package io.github.gustavosrosa.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {
	
	private TodoRepository todoRepository;
	
	public TodoValidator(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	public void validar(TodoEntity todoEntity) {
		String descricao = todoEntity.getDescricao();
		if (todoRepository.existsByDescricao(descricao)) {
			throw new IllegalArgumentException("Já existe uma tarefa com essa descrição!");
		}
	}	

}
