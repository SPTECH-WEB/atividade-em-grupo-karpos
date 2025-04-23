package com.atividade.karpos.service;

import com.atividade.karpos.model.Pedido;
import com.atividade.karpos.service.strategy.FreteStrategy;
import com.atividade.karpos.service.observer.PedidoSubject;
import com.atividade.karpos.service.observer.EmailObserver;
import com.atividade.karpos.service.observer.LogObserver;
import com.atividade.karpos.service.observer.NotificacaoObserver;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FreteService {
    private Map<String, FreteStrategy> estrategias;

    public double calcularFrete(Double peso, String modalidade) {
        FreteStrategy estrategia = estrategias.get(modalidade.toLowerCase());
        if (estrategia == null) throw new IllegalArgumentException("Modalidade invalida");
        double valor = estrategia.calcularFrete(peso);
        return valor;
    }
    public Pedido processarPedido(Pedido pedido) {

        PedidoSubject subject = new PedidoSubject();
        subject.adicionarObserver(new EmailObserver());
        subject.adicionarObserver(new LogObserver());
        subject.adicionarObserver(new NotificacaoObserver());
        subject.notificarObservers(pedido);

        return pedido;
    }
}
