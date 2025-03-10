package io.github.patriciastarck.desafio_itau_backend_jr.model;

import java.time.OffsetTime;

public class Transaction {

    private double valor;
    private OffsetTime dataHora;
    public Transaction(final double valor, final OffsetTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public double getValor() {
        return valor;
    }
    public OffsetTime getDataHora() {
        return dataHora;
    }
}
