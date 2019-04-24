package com.davi.spring.repository;

import com.davi.spring.model.Membro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MembroRepository extends JpaRepository<Membro, Long> {

}
