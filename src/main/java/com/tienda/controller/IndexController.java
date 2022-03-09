
package com.tienda.controller;

import com.tienda.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class IndexController {
    @GetMapping("/")
    public String inicio(Model model){
    log.info("Se esta usando una arquitectura MVC");
   Cliente cliente1 = new Cliente("Alejandro","González Quesada","galejandro2222@hotmail.com","8567-7989");
   Cliente cliente2 = new Cliente("Josue","Bonilla Gomez","jsbg@hotmail.com","8842-6396");
    var clientes = Arrays.asList(cliente1,cliente2);
    model.addAttribute("clientes",clientes);
    return "index";
    }
    
}
