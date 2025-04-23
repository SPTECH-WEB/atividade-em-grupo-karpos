package com.atividade.karpos.service.observer;

import com.atividade.karpos.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoObserver implements PedidoObserver {
    @Override
    public void notificar(Pedido pedido) {
        System.out.println("📱 Notificação enviada: Pedido de " + pedido.getPedido() + " do cliente " + pedido.getCliente());
    }
}
