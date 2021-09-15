package com.lista02.lista2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controler {
    @RequestMapping("/")
    String inicio(){
        return "index1";
    }
    @RequestMapping("/pag2")
    String fim(){
        return "index2";
    }
}
