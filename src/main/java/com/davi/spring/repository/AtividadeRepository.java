package com.davi.spring.repository;

import com.davi.spring.model.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtividadeRepository extends JpaRepository<Atividade,Long> {
}
