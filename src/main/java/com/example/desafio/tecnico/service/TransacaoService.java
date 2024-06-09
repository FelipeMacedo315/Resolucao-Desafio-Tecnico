package com.example.desafio.tecnico.service;

import com.example.desafio.tecnico.model.Transacao;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TransacaoService {
    private Transacao transacao;

    public Transacao receberTransacao(Transacao dado) {
        Date d = new Date();
        transacao = new Transacao(dado.getValor(), d);
        return transacao;
    }
}
