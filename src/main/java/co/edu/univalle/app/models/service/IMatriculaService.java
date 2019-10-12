package co.edu.univalle.app.models.service;

import java.util.List;

import co.edu.univalle.app.models.entity.Matricula;
import co.edu.univalle.app.models.entity.dto.MatriculaRequestDTO;

public interface IMatriculaService {

	public List<Matricula> findAll();

	public void save(Matricula cliente);

	public Matricula findOne(Long id);

	public void delete(Long id);

	public Matricula inicializar(MatriculaRequestDTO matriculaRequestDTO);
}
