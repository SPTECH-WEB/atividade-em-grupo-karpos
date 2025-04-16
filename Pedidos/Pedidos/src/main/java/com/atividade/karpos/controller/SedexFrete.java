package com.atividade.karpos.controller;

@Component("expressa")
public class SedexFrete implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 10.0;
    }
}
