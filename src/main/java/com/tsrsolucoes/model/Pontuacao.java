package com.tsrsolucoes.model;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Pontuacao {
    private int golTime1;
    private int gotlTime2;
}
