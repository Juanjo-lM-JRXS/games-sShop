package co.edu.ue.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Ordenesdetalle;

@Repository
public interface IOrdenesdetalleJpa extends JpaRepository<Ordenesdetalle, Integer>{
	//Ordenesdetalle findByOrdenesID(int ordenesID);
}
