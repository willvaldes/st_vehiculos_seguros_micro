package co.edu.univalle.app.models.service;

import java.util.List;

import co.edu.univalle.app.models.entity.Seguro;
import co.edu.univalle.app.models.entity.dto.SeguroRequestDTO;

public interface ISeguroService {

	public List<Seguro> findAll();

	public void save(Seguro cliente);

	public Seguro findOne(Long id);

	public void delete(Long id);
	
	public Seguro inicializar(SeguroRequestDTO seguroRequestDTO);
}
