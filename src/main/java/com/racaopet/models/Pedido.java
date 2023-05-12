package com.racaopet.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Pedido {

    @Id
    private Date data;
    @Column
    private Double valor;
    @Column
    private Racao fk_racao;

}
