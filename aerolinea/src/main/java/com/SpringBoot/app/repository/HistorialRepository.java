package com.SpringBoot.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.SpringBoot.app.entity.Historial;

@Repository
public interface HistorialRepository extends JpaRepository<Historial, Long> {

	@Query(value = "select cantViajes, cantMillas from historial where historial.idPasajero=:idPasajero", nativeQuery=true)
	List<Historial> listaHistoriaPasajero(Long idPasajero);
}
