package com.atividade.karpos.service.observer;

import com.atividade.karpos.model.Pedido;

public class NotificacaoObserver implements PedidoObserver {
    @Override
    public void notificar(Pedido pedido) {
        System.out.println("📱 Notificação enviada: Pedido de " + pedido.getProduto() + " do cliente " + pedido.getCliente());
    }
}
