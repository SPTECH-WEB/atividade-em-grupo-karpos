package com.atividade.karpos.controller;

@Component("economica")
public class EconomicoFrete implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 5.0;
    }
}
