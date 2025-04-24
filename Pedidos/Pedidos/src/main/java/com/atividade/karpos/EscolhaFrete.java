package com.atividade.karpos;

import com.atividade.karpos.service.strategy.FreteStrategy;

public class EscolhaFrete {
    public FreteStrategy estrategia;

    public void setEstrategia(FreteStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double peso) {
        return estrategia.calcularFrete(peso);
    }
}
