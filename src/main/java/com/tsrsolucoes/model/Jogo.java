package com.tsrsolucoes.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name="jogo")
@Data
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime dataJogo;
    @Embedded
    private Pontuacao pontuacao;
    private String time1;
    private String time2;
    private String timeVencedor;
    private Boolean empate;

}
