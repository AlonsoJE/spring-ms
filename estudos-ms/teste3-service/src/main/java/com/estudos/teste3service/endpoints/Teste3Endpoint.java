package com.estudos.teste3service.endpoints;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste3")
@Slf4j
public class Teste3Endpoint {

    @GetMapping({"","/"})
    public ResponseEntity<?> teste(){
        log.info("servico3 : teste1");
        return ResponseEntity.ok("Funcionou!3");
    }
}
