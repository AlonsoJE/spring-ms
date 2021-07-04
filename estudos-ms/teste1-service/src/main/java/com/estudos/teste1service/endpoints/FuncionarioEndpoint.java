package com.estudos.teste1service.endpoints;

import com.estudos.teste1service.entity.FuncionarioEntity;
import com.estudos.teste1service.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioEndpoint {

    @Autowired
    FuncionarioService service;

    @PostMapping({"","/"})
    public ResponseEntity<?> saveOne(@RequestBody FuncionarioEntity entity){
        return ResponseEntity.ok(service.save(entity));
    }

    @GetMapping({"","/"})
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping({"{id}","/{id}"})
    public ResponseEntity<?> getOne(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(service.findOne(id));
    }

    @GetMapping({"completo-rest/{id}","/completo-rest/{id}"})
    public ResponseEntity<?> getCompleteOne(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(service.getCompleteOne(id));
    }

    @GetMapping({"completo-feign/{id}","/completo-feign/{id}"})
    public ResponseEntity<?> getCompleteOneWithFeign(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(service.getCompleteOneWithFeign(id));
    }

}
