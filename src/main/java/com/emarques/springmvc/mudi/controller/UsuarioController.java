package com.emarques.springmvc.mudi.controller;

import com.emarques.springmvc.mudi.model.Pedido;
import com.emarques.springmvc.mudi.model.StatusPedido;
import com.emarques.springmvc.mudi.repository.PedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/usuario")
@AllArgsConstructor
public class UsuarioController {

    PedidoRepository pedidoRepository;

    @GetMapping("/pedido")
    public String home(Model model, Principal principal) {
        List<Pedido> pedidos = pedidoRepository.findAllByUsuario(principal.getName());
        model.addAttribute("pedidos", pedidos);
        model.addAttribute("usuario", principal.getName());
        return "usuario/home";
    }

    @GetMapping("/pedido/{status}")
    public String porStatus(@PathVariable String status, Model model, Principal principal) {
        List<Pedido> pedidos = pedidoRepository.findAllByStatusEUser(StatusPedido.valueOf(status.toUpperCase()), principal.getName());
        model.addAttribute("pedidos",pedidos);
        model.addAttribute("status", status);
        return "usuario/home";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String onError() {
        return "redirect:/usuario/pedido";
    }
}
