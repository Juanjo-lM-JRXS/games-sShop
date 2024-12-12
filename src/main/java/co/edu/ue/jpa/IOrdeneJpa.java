package co.edu.ue.jpa;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Ordene;

@Repository
public interface IOrdeneJpa extends JpaRepository<Ordene, Integer>{
	/*Ordene findByOrdenesID(int ordenesID);*/
}
