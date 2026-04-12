package com.github.iuryrayam.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    public void validar(TodoEntity todo) {
        if (existeTodoComEssaDescricao(todo.getDescricao())) {
            throw new IllegalArgumentException("Não pode cadastra dois todos com a mesma descrição!");
        }
    }

    private boolean existeTodoComEssaDescricao(String descricao) {
        return repository.existsByDescricao(descricao);
    }
}
