package co.edu.ue.jpa;


import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.entity.Ordene;


public interface IOrdeneJpa extends JpaRepository<Ordene, Integer>{
	/*Ordene findByOrdenesID(int ordenesID);*/
}
