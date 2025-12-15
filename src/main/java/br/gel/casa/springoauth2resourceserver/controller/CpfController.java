package br.gel.casa.springoauth2resourceserver.controller;

import java.time.LocalDateTime;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cpf") 
public class CpfController {

    @GetMapping("/{cpf}")
    public String consultarCpf(@PathVariable String cpf, @AuthenticationPrincipal Jwt   jwt) {
        return  """
                Consulta ao CPF realizada com sucesso!
                Data/Hora : %s
                CPF: %s
                Token recebido : 
                %s
                """.formatted(LocalDateTime.now().toString(), cpf, jwt.getTokenValue());
    }
}
