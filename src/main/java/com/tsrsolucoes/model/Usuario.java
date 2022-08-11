package com.tsrsolucoes.model;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private int pontuacao;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Palpite> palpite= new ArrayList<>();
}
