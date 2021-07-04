package com.estudos.teste3service.repository;

import com.estudos.teste3service.entity.SetorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetorRepository extends JpaRepository<SetorEntity, Long> {
}
