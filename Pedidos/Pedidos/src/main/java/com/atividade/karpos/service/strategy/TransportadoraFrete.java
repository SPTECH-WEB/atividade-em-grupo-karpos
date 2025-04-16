package com.atividade.karpos.service.strategy;


public class TransportadoraFrete implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 15.0;
    }
}
