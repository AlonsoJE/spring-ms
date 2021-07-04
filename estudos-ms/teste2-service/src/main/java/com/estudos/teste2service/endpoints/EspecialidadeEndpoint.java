package com.estudos.teste2service.endpoints;

import com.estudos.teste2service.entity.EspecialidadeEntity;
import com.estudos.teste2service.service.EspecialidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadeEndpoint {

    @Autowired
    private EspecialidadeService service;

    @PostMapping({"","/"})
    public ResponseEntity<?> saveOne(@RequestBody EspecialidadeEntity entity){
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
