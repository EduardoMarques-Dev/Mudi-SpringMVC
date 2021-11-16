package com.emarques.springmvc.mudi.controller;

import java.security.Principal;
import java.util.List;

import com.emarques.springmvc.mudi.model.User;
import com.emarques.springmvc.mudi.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emarques.springmvc.mudi.model.Pedido;
import com.emarques.springmvc.mudi.model.StatusPedido;
import com.emarques.springmvc.mudi.repository.PedidoRepository;

@Controller
@RequestMapping("/home")
@AllArgsConstructor
public class HomeController {

    PedidoRepository pedidoRepository;

    @GetMapping("")
    public String home(Model model) {

        Sort sort = Sort.by("dataEntrega").descending();
        PageRequest paginacao = PageRequest.of(0, 10, sort);

        List<Pedido> pedidos = pedidoRepository.findAllByStatus(StatusPedido.ENTREGUE,paginacao);
        model.addAttribute("pedidos", pedidos);
        return "home";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String onError() {
        return "redirect:/home";
    }

}
