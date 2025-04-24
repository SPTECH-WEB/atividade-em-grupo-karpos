package com.atividade.karpos.service;

import com.atividade.karpos.model.Pedido;
import com.atividade.karpos.repository.PedidoRepository;
import com.atividade.karpos.service.adapter.TransportadoraAdapter;
import com.atividade.karpos.service.observer.PedidoSubject;
import com.atividade.karpos.service.strategy.FreteStrategy;
import com.atividade.karpos.service.observer.EmailObserver;
import com.atividade.karpos.service.observer.LogObserver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreteService {
    private final PedidoRepository repository;
    private final PedidoSubject observer;
    private final TransportadoraAdapter adapter;

    public FreteService(PedidoRepository repository, PedidoSubject observer, TransportadoraAdapter adapter) {
        this.repository = repository;
        this.observer = observer;
        this.adapter = adapter;

        observer.adicionarObserver(new LogObserver());
        observer.adicionarObserver(new EmailObserver());
    }

    public Pedido salvarPedido(Pedido pedido, FreteStrategy strategy) {
        double frete = strategy.calcularFrete(pedido.getPeso());
        String mensagem = "Pedido processado: " + pedido.getProduto() + " | Frete: R$ " + frete;
        observer.notificarObservers(mensagem);

        adapter.enviarPedido(pedido);

        return repository.save(pedido);
    }

    public List<Pedido> listarPedidos(){
        return repository.findAll();
    }
}
