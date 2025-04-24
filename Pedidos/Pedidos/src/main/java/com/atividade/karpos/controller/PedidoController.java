package com.atividade.karpos.controller;

import com.atividade.karpos.model.Pedido;
import com.atividade.karpos.service.FreteService;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController implements PedidoControllerDoc {
    private final FreteService service;

    public PedidoController(FreteService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> calcularFrete(@RequestBody Pedido request) {
        double valor = service.calcularFrete(request.getPeso(), request.getTipoEntrega());
        return ResponseEntity.ok("Valor do frete: R$ " + valor);
    }

}
