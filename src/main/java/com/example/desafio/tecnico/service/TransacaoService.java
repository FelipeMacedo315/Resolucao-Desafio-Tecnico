package com.example.desafio.tecnico.service;

import com.example.desafio.tecnico.model.Transacao;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TransacaoService {

    public int receberTransacao(Transacao dado) {
        Date d = new Date();
        Transacao transacao = new Transacao(dado.getValor(), d);
        if (dado.getValor() <= 0 || d.getDate() > d.getDate()) {
            return 422;
        }
        if (dado.toString().isEmpty()) {
            return 400;
        }
        return 201;

    }
}
