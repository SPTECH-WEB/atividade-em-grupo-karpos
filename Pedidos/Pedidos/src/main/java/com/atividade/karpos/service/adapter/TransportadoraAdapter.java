package com.atividade.karpos.service.adapter;

import com.atividade.karpos.model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class TransportadoraAdapter {
    public String enviarPedido(Pedido pedido) {
        return "Pedido enviado à transportadora: " + pedido.getProduto();
    }

    public double calcularFrete(double peso) {
        return peso * 20;
    }
}