package com.emarques.springmvc.mudi.controller;

import com.emarques.springmvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model){
        Pedido pedido = new Pedido();

        pedido.setNomeProduto("Xiaomi Redmi Note 8");
        pedido.setUrlProduto( "https://www.amazon.com.br/Celular-Xiaomi-Vers%C3%A3o-Global-Space/dp/B07Y9ZHLXW/ref=sr_1_5?adgrpid=121307797178&gclid=CjwKCAjwz5iMBhAEEiwAMEAwGCdOSObwSXhUH2Ry1EeQA08-mHS_b4HiuXg1luv0RIdh9XwUG6yo-hoCXtYQAvD_BwE&hvadid=509964104849&hvdev=c&hvlocphy=9101607&hvnetw=g&hvqmt=e&hvrand=6920434257904313634&hvtargid=kwd-812603219722&hydadcr=17159_10869713&keywords=redmi+not+8&qid=1636243068&sr=8-5&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/51wgmCYDFML._AC_SL1000_.jpg");
        pedido.setDescricao("Uma descrição qualquer");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos",pedidos);
        return "home";
    }
}
