package com.fundos.src.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "FUNDOS")
public class Fundos {

    @Id
    @ApiModelProperty(value = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ApiModelProperty(value = "Nome")
    @Column(name = "NOME", nullable = true, length = 10)
    private String nome;

    @ApiModelProperty(value = "Código ")
    @Column(name = "CODIGO", nullable = true, length = 10)
    private String codigo;

    @ApiModelProperty(value = "Composição")
    @Column(name = "COMPOSICAO", nullable = true, length = 10)
    private String composicao;

    @ApiModelProperty(value = "Taxa de Administração")
    @Column(name = "TAXA_ADM", nullable = true, length = 10)
    private String taxaAdm;

    public Fundos(String nome, String codigo, String composicao, String taxaAdm) {
    }
}
