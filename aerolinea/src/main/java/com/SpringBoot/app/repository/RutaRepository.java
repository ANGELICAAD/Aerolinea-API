package com.SpringBoot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.app.entity.Ruta;

@Repository
public interface RutaRepository extends JpaRepository<Ruta, Long> {

}
