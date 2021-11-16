package com.emarques.springmvc.mudi.controller;

import com.emarques.springmvc.mudi.dto.RequisicaoNovoPedido;
import com.emarques.springmvc.mudi.model.Pedido;
import com.emarques.springmvc.mudi.model.User;
import com.emarques.springmvc.mudi.repository.PedidoRepository;
import com.emarques.springmvc.mudi.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/pedido")
@AllArgsConstructor
public class PedidoController {

    private PedidoRepository pedidoRepository;
    private UserRepository userRepository;

    @GetMapping("/formulario")
    public String formulario(RequisicaoNovoPedido requisicao) {
        return "pedido/formulario";
    }

    @PostMapping("/novo")
    public String novo(@Valid RequisicaoNovoPedido requisicao, BindingResult result) {

        if(result.hasErrors()){
            return "pedido/formulario";
        }

        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userRepository.findByUsername(username);

        Pedido pedido = requisicao.toPedido();
        pedido.setUser(user);

        pedidoRepository.save(pedido);
        return "redirect:/home";
    }
}