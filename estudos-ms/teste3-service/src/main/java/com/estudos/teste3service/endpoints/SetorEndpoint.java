package com.estudos.teste3service.endpoints;

import com.estudos.teste3service.entity.SetorEntity;
import com.estudos.teste3service.service.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/setores")
public class SetorEndpoint {

    @Autowired
    private SetorService service;

    @PostMapping({"","/"})
    public ResponseEntity<?> saveOne(@RequestBody SetorEntity entity){
        return ResponseEntity.ok(service.save(entity));
    }

    @GetMapping({"","/"})
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping({"{id}","/{id}"})
    public ResponseEntity<?> findOne(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(service.findOne(id));
    }


}
