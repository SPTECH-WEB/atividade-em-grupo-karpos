package com.atividade.karpos.service.observer;

import com.atividade.karpos.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class LogObserver implements PedidoObserver {
    public void notificar(Pedido pedido) {
        System.out.println("📝 Log: Pedido de " + pedido.getId() + " processado.");
    }
}
