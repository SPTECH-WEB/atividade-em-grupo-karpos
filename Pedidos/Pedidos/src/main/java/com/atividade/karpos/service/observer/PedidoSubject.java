package com.atividade.karpos.service.observer;

import com.atividade.karpos.model.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoSubject {
    private List<PedidoObserver> observers = new ArrayList<>();

    public void adicionarObserver(PedidoObserver observer) {
        observers.add(observer);
    }

    public void notificarObservers(Pedido pedido) {
        for (PedidoObserver observer : observers) {
            observer.notificar(pedido);
        }
    }
}
