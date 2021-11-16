package com.emarques.springmvc.mudi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter @Setter @NoArgsConstructor
public class Pedido {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeProduto;
    private BigDecimal valorNegociado;
    private LocalDate dataEntrega;
    @Column(length=510)
    private String urlProduto;
    @Column(length=510)
    private String urlImagem;
    private String descricao;
    
    @Enumerated(EnumType.STRING)
    private StatusPedido status;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
