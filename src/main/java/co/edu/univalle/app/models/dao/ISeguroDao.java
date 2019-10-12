package co.edu.univalle.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import co.edu.univalle.app.models.entity.Seguro;

public interface ISeguroDao extends CrudRepository<Seguro, Long> {

}
