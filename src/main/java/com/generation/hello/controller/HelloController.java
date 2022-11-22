package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hello Wold!!!";
    }

    @GetMapping("/bsms")
    public String bsms(){
        return ""
                + "<ul>\n"
                + "<h2>Mentalidades</h2>"
                + "<li>Orientação</li>\n"
                + "<li>Responsabilidade Pessoal</li>\n"
                + "<li>Mentalidade de Crescimento</li>\n"
                + "<li>Persistência</li>\n"
                + "<h2>Habilidades</h2>\n"
                + "<li>Trabalho em Equipe</li>\n"
                + "<li>Atenção aos Detalhes</li>\n"
                + "<li>Proatividade</li>\n"
                + "<li>Comunicação"
                + "</ul>" ;
    }

    @GetMapping("/objetivo")
    public String objetivo(){
        return ""
                + "<ol>\n"
                + "<h2>Objetivos de aprendizagem desta semana.</h2>"
                + "<li>Focar no aprendizado do Spring Boot</li>\n"
                + "<li>Atenção aos Detalhes</li>\n"
                + "<li>Comunicação com a turma.</li>\n"
                + "</ol>" ;
    }


}
