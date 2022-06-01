package com.suely.modulo5desafio.repositorio;

import com.suely.modulo5desafio.entidade.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContatoRepository extends JpaRepository<Cliente, Long>{

    
}
