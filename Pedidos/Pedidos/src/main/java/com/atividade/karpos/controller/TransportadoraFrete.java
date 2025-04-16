package com.atividade.karpos.controller;

@Component("terceirizada")
public class TransportadoraFrete implements FreteStrategy {
    private APITransportadoraExterna api = new APITransportadoraExterna();

    @Override
    public double calcularFrete(double peso) {
        return api.calcularPreco(peso);
    }
}
