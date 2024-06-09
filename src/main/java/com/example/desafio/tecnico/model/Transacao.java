package com.example.desafio.tecnico.model;

import java.util.Date;

public class Transacao {
    private int valor;
    private Date dataHora;

    public Transacao() {

    }

    public Transacao(int valor, Date dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }


}
