package com.SpringBoot.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.SpringBoot.app.entity.CiudadOrigen;

@Repository
public interface CiudadOrigenRepository extends JpaRepository<CiudadOrigen, Long> {

	@Query(value = "select ciudad from ciudadorigen", nativeQuery=true)
	List<CiudadOrigen> listaCiudadesOrigen();
	
	@Query(value = "select ciudaddestino.ciudad from ciudaddestino, "
			+ "(select idCiudadOrigen from ciudadorigen where ciudadorigen.ciudad=:ciudadOrigen) "
			+ "as subCiudadOrigen where "
			+ "ciudaddestino.idCiudadOrigen=subCiudadOrigen.idCiudadOrigen", nativeQuery=true)
	List<CiudadOrigen> listaCiudadesDestino(String ciudadOrigen);
}
