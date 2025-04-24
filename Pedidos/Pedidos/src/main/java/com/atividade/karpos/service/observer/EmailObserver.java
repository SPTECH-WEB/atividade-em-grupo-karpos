package com.atividade.karpos.service.observer;

import org.springframework.stereotype.Component;

@Component
public class EmailObserver implements Observer {
    @Override
    public void notificar(String mensagem) {
        System.out.println("[EMAIL] Enviado: " + mensagem);
    }
}