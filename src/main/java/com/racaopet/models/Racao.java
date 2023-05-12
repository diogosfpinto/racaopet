package com.racaopet.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Racao {
    @Id
    private String idRacao;
    @Column
    private String nome;
    @Column
    private String descricao;
}
