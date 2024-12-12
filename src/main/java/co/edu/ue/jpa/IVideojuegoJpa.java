
package co.edu.ue.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Videojuego;

@Repository
public interface IVideojuegoJpa extends JpaRepository<Videojuego, Integer> {
	/*Videojuego findByVideojuegoID(int videojuegosID);*/
}
