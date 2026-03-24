package com.homiak.ex10.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tarefa")
public class TarefaModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "desc_tarefa")
    private String descricao;

    private java.time.LocalDate dataVencimento;
    private Boolean concluida;

    public Long getId() { return id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public java.time.LocalDate getDataVencimento() { return dataVencimento; }
    public void setDataVencimento(java.time.LocalDate dataVencimento) { this.dataVencimento = dataVencimento; }

    public Boolean getConcluida() { return concluida; }
    public void setConcluida(Boolean concluida) { this.concluida = concluida; }
}