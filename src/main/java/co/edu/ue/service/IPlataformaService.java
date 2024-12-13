package co.edu.ue.service;

import java.util.List;

import co.edu.ue.entity.Ordene;
import co.edu.ue.entity.Plataforma;

public interface IPlataformaService {
	List<Plataforma> savePlataforma (Plataforma plataforma);
	Plataforma upPlataforma(Plataforma plataforma);
	
	List<Plataforma> listAllPlataformas();
	Plataforma findPorId(int id);

}
