package com.SpringBoot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.app.entity.CiudadDestino;

@Repository
public interface CiudadDestinoRepository extends JpaRepository<CiudadDestino, Long> {

}
