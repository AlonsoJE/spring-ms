package com.estudos.teste2service.repository;

import com.estudos.teste2service.entity.EspecialidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadeRepository extends JpaRepository<EspecialidadeEntity, Long> {
}
