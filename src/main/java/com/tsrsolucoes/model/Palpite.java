package com.tsrsolucoes.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Palpite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime dataCriacao;
    @OneToOne
    private Jogo jogo;
    @Embedded
    private Pontuacao palpite;

}
