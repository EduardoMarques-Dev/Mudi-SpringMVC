package com.emarques.springmvc.mudi.controller;

import com.emarques.springmvc.mudi.dto.RequisicaoNovoPedido;
import com.emarques.springmvc.mudi.model.Pedido;
import com.emarques.springmvc.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository repository;

    @GetMapping("/formulario")
    public String formulario() {
        return "pedido/formulario";
    }

    @PostMapping("/novo")
    public String novo(RequisicaoNovoPedido requisicao) {

        Pedido pedido = requisicao.toPedido();
        repository.save(pedido);

        return "pedido/formulario";
    }
}
