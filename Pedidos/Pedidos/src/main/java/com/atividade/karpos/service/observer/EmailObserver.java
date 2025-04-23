package com.atividade.karpos.service.observer;

import com.atividade.karpos.model.Pedido;

public class EmailObserver implements PedidoObserver {
    @Override
    public void notificar(Pedido pedido) {
        System.out.println("📧 E-mail enviado para " + pedido.getCliente());
    }
}