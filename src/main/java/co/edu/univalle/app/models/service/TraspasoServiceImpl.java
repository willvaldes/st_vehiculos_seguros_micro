package co.edu.univalle.app.models.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.univalle.app.models.dao.ITraspasoDao;
import co.edu.univalle.app.models.dao.IVehiculoDao;
import co.edu.univalle.app.models.entity.Traspaso;
import co.edu.univalle.app.models.entity.Vehiculo;
import co.edu.univalle.app.models.entity.dto.TraspasoRequestDTO;

@Service
public class TraspasoServiceImpl implements ITraspasoService {

	@Autowired
	private ITraspasoDao traspasoDao;
	@Autowired
	private IVehiculoDao vehiculoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Traspaso> findAll() {
		// TODO Auto-generated method stub
		return (List<Traspaso>) traspasoDao.findAll();
	}

	@Override
	@Transactional
	public void save(Traspaso cliente) {
		traspasoDao.save(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public Traspaso findOne(Long id) {
		return traspasoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		traspasoDao.deleteById(id);
	}

	@Override
	@Transactional
	public Traspaso inicializar(TraspasoRequestDTO traspasoRequestDTO) {
		Traspaso traspaso = new Traspaso();
		Vehiculo vehiculo = vehiculoDao.findById(traspasoRequestDTO.getVehiculo_id()).orElse(null);

		traspaso.setVehiculo(vehiculo);
		traspaso.setPropietario_tipo_doc(traspasoRequestDTO.getPropietario_tipo_doc());
		traspaso.setPropietario_doc(traspasoRequestDTO.getPropietario_doc());
		traspaso.setPropietario_anterior_tipo_doc(traspasoRequestDTO.getPropietario_anterior_tipo_doc());
		traspaso.setPropietario_anterior_doc(traspasoRequestDTO.getPropietario_anterior_doc());
		traspaso.setTraspaso_fecha(traspasoRequestDTO.getTraspaso_fecha());
		traspaso.setRegistro_usuario(traspasoRequestDTO.getRegistro_usuario());

		return traspaso;
	}

}
