package com.tsrsolucoes.services;

import com.tsrsolucoes.model.Jogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public class JogoService {

    @Autowired
    private JpaRepository repository;

    public void save(Jogo jogo){
        repository.save(jogo);
    }
}
