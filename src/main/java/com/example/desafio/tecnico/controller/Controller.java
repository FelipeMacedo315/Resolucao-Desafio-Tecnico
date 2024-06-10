package com.example.desafio.tecnico.controller;

import com.example.desafio.tecnico.model.Transacao;
import com.example.desafio.tecnico.service.TransacaoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/DesafioTecnico")
public class Controller {
    @Autowired
    private TransacaoService transacaoService;

    @PostMapping(value = "/transacao")
    public ResponseEntity PostTransacao(@RequestBody Transacao dados) throws JsonProcessingException {
        int resposta = transacaoService.receberTransacao(dados);
        return ResponseEntity.status(resposta).build();
    }

    @DeleteMapping(value = "/delete/transacao")
    public ResponseEntity DeleteTransacao() {
        int response = transacaoService.deleteTransacaoService();
        return ResponseEntity.status(response).build();

    }

    @GetMapping (value ="/estatistica")
    public ResponseEntity estatistica (){
        int resposta = transacaoService.estatistica();
        return ResponseEntity.status(201).build();
    }

}


