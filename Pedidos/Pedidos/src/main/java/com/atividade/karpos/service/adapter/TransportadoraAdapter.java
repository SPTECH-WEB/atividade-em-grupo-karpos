package com.atividade.karpos.service.adapter;

public class TransportadoraAdapter {
    private final TransportadoraApiExterna api;

    public TransportadoraAdapter(TransportadoraApiExterna api) {
        this.api = api;
    }

    public double calcularFrete(Double peso) {
        return api.calcularFrete(peso);
    }
}
