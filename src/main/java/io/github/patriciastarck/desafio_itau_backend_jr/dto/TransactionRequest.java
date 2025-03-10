package io.github.patriciastarck.desafio_itau_backend_jr.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;


public class TransactionRequest {

    @NotNull
    private Double valor;

    private OffsetDateTime dataHora;

    public Double getValor() {
        return valor;
    }
    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
