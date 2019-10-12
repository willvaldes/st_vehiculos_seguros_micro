package co.edu.univalle.app.models.service;

import java.util.List;

import co.edu.univalle.app.models.entity.Vehiculo;
import co.edu.univalle.app.models.entity.dto.VehiculoRequestDTO;

public interface IVehiculoService {

	public List<Vehiculo> findAll();

	public void save(Vehiculo cliente);

	public Vehiculo findOne(Long id);

	public void delete(Long id);
	
	public Vehiculo inicializar(VehiculoRequestDTO vehiculoRequestDTO);
}
