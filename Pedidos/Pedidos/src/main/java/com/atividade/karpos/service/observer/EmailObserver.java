package com.atividade.karpos.service.observer;

import com.atividade.karpos.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class EmailObserver implements PedidoObserver {
    public void notificar(Pedido pedido) {
        System.out.println("📧 E-mail enviado para " + pedido.getCliente());
    }
}