package co.edu.ue.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.entity.Ordenesdetalles;

public interface IOrdenesdetallesJpa extends JpaRepository<Ordenesdetalles, Integer>{
	Ordenesdetalles findByOrdenId(int orden);
}
