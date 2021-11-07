package com.emarques.springmvc.mudi.controller;

import com.emarques.springmvc.mudi.model.Pedido;
import com.emarques.springmvc.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    PedidoRepository pedidoRepository;

    @GetMapping("/home")
    public String home(Model model) {

        List<Pedido> pedidos = pedidoRepository.recuperaTodosOsPedidos();

        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
