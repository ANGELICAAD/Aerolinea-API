package com.SpringBoot.app.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.SpringBoot.app.entity.Vuelo;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Long> {

	@Query(value = "select hora, duracion, tipoRuta, precioUnitario, "
			+ "sillasDisponibles from vuelo inner join ruta on vuelo.idRuta=ruta.idRuta "
			+ "inner join ciudadorigen on ruta.idCiudadOrigen=ciudadorigen.idCiudadOrigen "
			+ "where vuelo.tipoVuelo='ida' "
			+ "and vuelo.fecha=DATE_FORMAT(:fechaSeleccionada,\"%Y-%m-%d\") "
			+ "and ciudadorigen.ciudad=:ciudadOrigen", nativeQuery=true)
	List<Object[]> listaVuelosIdaFecha(Date fechaSeleccionada, String ciudadOrigen);
}
