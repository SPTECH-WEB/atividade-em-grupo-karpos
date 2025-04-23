package com.atividade.karpos.service.observer;

import com.atividade.karpos.model.Pedido;

public class LogObserver implements PedidoObserver {
    @Override
    public void notificar(Pedido pedido) {
        System.out.println("📝 Log: Pedido de " + pedido.getProduto() + " processado.");
    }
}
