package co.edu.univalle.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.univalle.app.models.dao.IVehiculoDao;
import co.edu.univalle.app.models.entity.Vehiculo;
import co.edu.univalle.app.models.entity.dto.VehiculoRequestDTO;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoDao vehiculoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Vehiculo> findAll() {
		// TODO Auto-generated method stub
		return (List<Vehiculo>) vehiculoDao.findAll();
	}

	@Override
	@Transactional
	public void save(Vehiculo cliente) {
		vehiculoDao.save(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public Vehiculo findOne(Long id) {
		return vehiculoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		vehiculoDao.deleteById(id);
	}

	@Override
	@Transactional
	public Vehiculo inicializar(VehiculoRequestDTO vehiculoRequestDTO) {
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setPropietario_tipo_doc(vehiculoRequestDTO.getPropietario_tipo_doc());
		vehiculo.setPropietario_doc(vehiculoRequestDTO.getPropietario_doc());
		vehiculo.setMarca(vehiculoRequestDTO.getMarca());
		vehiculo.setLinea(vehiculoRequestDTO.getLinea());
		vehiculo.setModelo(vehiculoRequestDTO.getModelo());
		vehiculo.setCilindraje(vehiculoRequestDTO.getCilindraje());
		vehiculo.setColor(vehiculoRequestDTO.getColor());
		vehiculo.setServicio(vehiculoRequestDTO.getServicio());
		vehiculo.setClase(vehiculoRequestDTO.getClase());
		vehiculo.setTipo_carroceria(vehiculoRequestDTO.getTipo_carroceria());
		vehiculo.setCombustible(vehiculoRequestDTO.getCombustible());
		vehiculo.setPasajeros(vehiculoRequestDTO.getPasajeros());
		vehiculo.setPuertas(vehiculoRequestDTO.getPuertas());
		vehiculo.setRevision_fecha(vehiculoRequestDTO.getRevision_fecha());
		vehiculo.setRevision_vigencia(vehiculoRequestDTO.getRevision_vigencia());
		vehiculo.setRegistro_usuario(vehiculoRequestDTO.getRegistro_usuario());

		return vehiculo;
	}

}
