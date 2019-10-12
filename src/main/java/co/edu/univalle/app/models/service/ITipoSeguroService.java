package co.edu.univalle.app.models.service;

import java.util.List;

import co.edu.univalle.app.models.entity.TipoSeguro;
import co.edu.univalle.app.models.entity.dto.TipoSeguroRequestDTO;

public interface ITipoSeguroService {

	public List<TipoSeguro> findAll();

	public void save(TipoSeguro cliente);

	public TipoSeguro findOne(Long id);

	public void delete(Long id);

	public TipoSeguro inicializar(TipoSeguroRequestDTO tipoSeguroRequestDTO);
}
