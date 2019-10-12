package co.edu.univalle.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import co.edu.univalle.app.models.entity.Matricula;

public interface IMatriculaDao extends CrudRepository<Matricula, Long> {

}
