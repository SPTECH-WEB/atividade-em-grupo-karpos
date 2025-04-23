package com.atividade.karpos.service.observer;


import com.atividade.karpos.model.Pedido;

public interface PedidoObserver {
    void notificar(Pedido pedido);
}
