package com.example.desafio.tecnico.model;

import java.util.ArrayList;
import java.util.Date;

public class Transacao {
    public ArrayList<Transacao> listaDeTransacoes;
    private Integer valor;
    private Date dataHora;

    public Transacao() {

    }

    public Transacao(Integer valor, Date dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;

    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }


}
