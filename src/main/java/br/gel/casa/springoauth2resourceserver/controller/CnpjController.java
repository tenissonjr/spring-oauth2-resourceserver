package br.gel.casa.springoauth2resourceserver.controller;

import java.time.LocalDateTime;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cnpj") 
public class CnpjController {

    @GetMapping("/{cnpj}")
    public String getCnpj(@PathVariable String cnpj) {
        return  """
                Acesso ao recurso realizado com sucesso!
                Data/Hora : %s
                CNPJ: %s
                """.formatted(LocalDateTime.now().toString(), cnpj);
    }
}
