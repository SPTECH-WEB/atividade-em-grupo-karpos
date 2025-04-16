package com.atividade.karpos.service.strategy;


public class SedexFrete implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 10.0;
    }
}
