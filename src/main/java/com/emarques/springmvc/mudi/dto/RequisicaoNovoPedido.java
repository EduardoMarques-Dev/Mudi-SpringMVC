package com.emarques.springmvc.mudi.dto;

import com.emarques.springmvc.mudi.model.Pedido;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RequisicaoNovoPedido {

    private String nomeProduto;
    private String urlProduto;
    private String urlImagem;
    private String descricao;

    public RequisicaoNovoPedido() {
    }

    public RequisicaoNovoPedido(String nomeProduto, String urlProduto, String urlImagem, String descricao) {
        this.nomeProduto = nomeProduto;
        this.urlProduto = urlProduto;
        this.urlImagem = urlImagem;
        this.descricao = descricao;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto(getNomeProduto());
        pedido.setUrlProduto(getUrlProduto());
        pedido.setUrlImagem(getUrlImagem());
        pedido.setDescricao(descricao);
        return pedido;
    }
}
