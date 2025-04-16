package com.atividade.karpos.service.strategy;


public class EconomicoFrete implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 5.0;
    }
}
