package com.atividade.karpos.service.observer;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PedidoSubject {
    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    public void notificarObservers(String mensagem) {
        observers.forEach(o -> o.notificar(mensagem));
    }
}
