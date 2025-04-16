package com.atividade.karpos.service.strategy;


import com.atividade.karpos.service.adapter.TransportadoraAdapter;

public class TransportadoraFrete implements FreteStrategy {
    private final TransportadoraAdapter adapter;

    public TransportadoraFrete(TransportadoraAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public double calcularFrete(double peso) {
        return adapter.calcularFrete(peso);
    }
}
