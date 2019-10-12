package co.edu.univalle.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import co.edu.univalle.app.models.entity.Vehiculo;

public interface IVehiculoDao extends CrudRepository<Vehiculo, Long> {

}
