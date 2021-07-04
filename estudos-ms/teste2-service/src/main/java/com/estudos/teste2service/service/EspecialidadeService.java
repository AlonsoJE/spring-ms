package com.estudos.teste2service.service;

import com.estudos.teste2service.entity.EspecialidadeEntity;
import com.estudos.teste2service.repository.EspecialidadeRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Log4j2
public class EspecialidadeService {

    @Autowired
    EspecialidadeRepository repository;

    public EspecialidadeEntity save(EspecialidadeEntity entity){
        log.info("EspecialidadeService : save(entity)");
        return repository.save(entity);
    }

    public List<EspecialidadeEntity> findAll(){
        log.info("EspecialidadeService : findAll()");
        return repository.findAll();
    }

    public Optional<EspecialidadeEntity> findOne(Long id){
        log.info("EspecialidadeService : findOne(id)");
        return repository.findById(id);
    }

}
