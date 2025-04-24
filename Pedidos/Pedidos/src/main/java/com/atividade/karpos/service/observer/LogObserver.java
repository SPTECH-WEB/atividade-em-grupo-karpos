package com.atividade.karpos.service.observer;

import org.springframework.stereotype.Component;

@Component
public class LogObserver implements Observer {
    @Override
    public void notificar(String mensagem) {
        System.out.println("[LOG] " + mensagem);
    }
}
