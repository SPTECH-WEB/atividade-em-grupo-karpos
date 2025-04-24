package com.atividade.karpos.controller;

import com.atividade.karpos.model.Pedido;
import com.atividade.karpos.service.FreteService;
import com.atividade.karpos.service.adapter.TransportadoraAdapter;
import com.atividade.karpos.service.strategy.EconomicoFrete;
import com.atividade.karpos.service.strategy.FreteStrategy;
import com.atividade.karpos.service.strategy.SedexFrete;
import com.atividade.karpos.service.strategy.TransportadoraFrete;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    private final FreteService service;

    public PedidoController(FreteService service) {
        this.service = service;
    }

    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedido) {
        FreteStrategy strategy;

        switch (pedido.getTipoEntrega()) {
            case "expressa":
                strategy = new SedexFrete();
                break;
            case "economica":
                strategy = new EconomicoFrete();
                break;
            case "transportadora":
                strategy = new TransportadoraFrete(new TransportadoraAdapter());
                break;
            default:
                throw new IllegalArgumentException("Tipo de entrega inválido!");
        }

        return service.salvarPedido(pedido, strategy);
    }

    @GetMapping
    public List<Pedido> listarPedidos() {
        return service.listarPedidos();
    }
}
