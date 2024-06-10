package com.example.desafio.tecnico.service;

import com.example.desafio.tecnico.model.Transacao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class TransacaoService {
    Transacao transacao = new Transacao();

    public int receberTransacao(Transacao dado) {
        Date d = new Date();
        if (dado.getValor() <= 0 || d.getDate() > d.getDate()) {
            return 422;
        }
        if (dado.toString().isEmpty()) {
            return 400;
        }
        transacao.listaDeTransacoes.add(new Transacao(dado.getValor(), d));
        return 201;

    }

    public int deleteTransacaoService() {
        transacao.setDataHora(null);
        transacao.setValor(null);
        return 201;
    }

    public int estatistica() {
        ArrayList<Integer> listaDeValores =
                (ArrayList<Integer>) transacao.listaDeTransacoes.stream().map(transacao1 -> transacao.getValor()).toList();
        System.out.println(listaDeValores);
//        int somaTodosValores = transacao.listaDeTransacoes.stream().reduce(0,
//        (acumulador, element) -> acumulador + element);
        return 4;
    }
}
