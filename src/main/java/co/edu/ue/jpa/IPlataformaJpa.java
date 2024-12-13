package co.edu.ue.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.ue.entity.Plataforma;

@Repository
public interface IPlataformaJpa extends JpaRepository<Plataforma, Integer>{
}
