package com.gilgamesh.financeapp.repository;

import com.gilgamesh.financeapp.model.entity.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroRepository extends JpaRepository<Registro,Long> {
}
