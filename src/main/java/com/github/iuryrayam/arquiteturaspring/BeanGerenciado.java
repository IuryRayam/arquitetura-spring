package com.github.iuryrayam.arquiteturaspring;

import com.github.iuryrayam.arquiteturaspring.todos.TodoEntity;
import com.github.iuryrayam.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

//@Lazy
@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
//@Scope(WebApplicationContext.SCOPE_APPLICATION)
//@Scope("request")
//@Scope("session")
//@Scope("application")
public class BeanGerenciado {

    @Autowired
    private TodoValidator validator;

    @Autowired
    private AppProperties properties;

    @Autowired
    public BeanGerenciado(TodoValidator validator) {
        this.validator = validator;
    }

    public void utilizar(TodoValidator validator) {
        var todo = new TodoEntity();
        validator.validar(todo);
    }

    public void printProperties() {
        System.out.println(properties.getVariavel());
        System.out.println(properties.getValor1());
    }
}
