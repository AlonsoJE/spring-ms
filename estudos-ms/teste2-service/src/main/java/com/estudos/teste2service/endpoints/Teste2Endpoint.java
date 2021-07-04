package com.estudos.teste2service.endpoints;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste2")
@Slf4j
public class Teste2Endpoint {

    @GetMapping({"","/"})
    public ResponseEntity<?> teste(){
        log.info("servico2 : teste1");
        return ResponseEntity.ok("Funcionou2!");
    }

}
