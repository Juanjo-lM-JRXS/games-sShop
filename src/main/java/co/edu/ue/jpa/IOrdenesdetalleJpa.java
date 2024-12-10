package co.edu.ue.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.entity.Ordenesdetalle;

public interface IOrdenesdetalleJpa extends JpaRepository<Ordenesdetalle, Integer>{
	//Ordenesdetalle findByOrdenesID(int ordenesID);
}
