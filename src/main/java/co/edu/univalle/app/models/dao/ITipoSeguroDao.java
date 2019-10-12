package co.edu.univalle.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import co.edu.univalle.app.models.entity.TipoSeguro;

public interface ITipoSeguroDao extends CrudRepository<TipoSeguro, Long> {

}
