package com.github.iuryrayam.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void enviar(String messagem) {
        System.out.println("Enviado email: " + messagem);
    }
}
