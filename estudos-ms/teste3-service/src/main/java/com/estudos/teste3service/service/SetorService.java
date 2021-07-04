package com.estudos.teste3service.service;

import com.estudos.teste3service.entity.SetorEntity;
import com.estudos.teste3service.repository.SetorRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Log4j2
public class SetorService {

    @Autowired
    SetorRepository repository;

    public SetorEntity save(SetorEntity entity){
        log.info("SetorService : save(entity)");
        return repository.save(entity);
    }

    public List<SetorEntity> findAll(){
        log.info("SetorService : findAll()");
        return repository.findAll();
    }

    public Optional<SetorEntity> findOne(Long id){
        log.info("SetorService : findOne(id)");
        return repository.findById(id);
    }

}
