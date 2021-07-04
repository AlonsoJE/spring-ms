package com.estudos.teste1service.endpoints;

import io.micrometer.core.instrument.util.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste1")
@RefreshScope
@Component
@Slf4j
public class TesteEndpoint {

    @Value("${valor}")
    private String teste;

    @GetMapping({"","/"})
    public ResponseEntity<?> teste()
    {
        log.info("servico1 : teste1");
        return ResponseEntity.ok("Funcionou!");
    }

    @GetMapping({"novo","/novo"})
    public ResponseEntity<?> teste2(){
        log.info("servico1 : teste2");
        return ResponseEntity.ok(teste);
    }

}
