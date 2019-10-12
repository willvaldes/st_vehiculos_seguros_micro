package co.edu.univalle.app.models.service;

import java.util.List;

import co.edu.univalle.app.models.entity.Traspaso;
import co.edu.univalle.app.models.entity.dto.TraspasoRequestDTO;

public interface ITraspasoService {

	public List<Traspaso> findAll();

	public void save(Traspaso cliente);

	public Traspaso findOne(Long id);

	public void delete(Long id);

	public Traspaso inicializar(TraspasoRequestDTO traspasoRequestDTO);
}
