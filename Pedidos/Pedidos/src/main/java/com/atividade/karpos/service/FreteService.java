package com.atividade.karpos.service;

import com.atividade.karpos.service.strategy.FreteStrategy;

import java.util.Map;

public class FreteService {
    private Map<String, FreteStrategy> estrategias;

    public double calcularFrete(Double peso, String modalidade) {
        FreteStrategy estrategia = estrategias.get(modalidade.toLowerCase());
        if (estrategia == null) throw new IllegalArgumentException("Modalidade invalida");
        double valor = estrategia.calcularFrete(peso);
        return valor;
    }
}
