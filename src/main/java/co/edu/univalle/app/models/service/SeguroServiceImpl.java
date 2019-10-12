package co.edu.univalle.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.univalle.app.models.dao.ISeguroDao;
import co.edu.univalle.app.models.dao.IVehiculoDao;
import co.edu.univalle.app.models.entity.Seguro;
import co.edu.univalle.app.models.entity.Vehiculo;
import co.edu.univalle.app.models.entity.dto.SeguroRequestDTO;

@Service
public class SeguroServiceImpl implements ISeguroService {

	@Autowired
	private ISeguroDao seguroDao;
	@Autowired
	private IVehiculoDao vehiculoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Seguro> findAll() {
		// TODO Auto-generated method stub
		return (List<Seguro>) seguroDao.findAll();
	}

	@Override
	@Transactional
	public void save(Seguro cliente) {
		seguroDao.save(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public Seguro findOne(Long id) {
		return seguroDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		seguroDao.deleteById(id);
	}

	@Override
	@Transactional
	public Seguro inicializar(SeguroRequestDTO seguroRequestDTO) {
		Seguro seguro = new Seguro();
		Vehiculo vehiculo = vehiculoDao.findById(seguroRequestDTO.getVehiculo_id()).orElse(null);

		seguro.setVehiculo(vehiculo);
		seguro.setTomador_tipo_doc(seguroRequestDTO.getTomador_tipo_doc());
		seguro.setTomador_doc(seguroRequestDTO.getTomador_doc());
		seguro.setExpedicion_fecha(seguroRequestDTO.getExpedicion_fecha());
		seguro.setVigencia_desde(seguroRequestDTO.getVigencia_desde());
		seguro.setVigencia_hasta(seguroRequestDTO.getVigencia_hasta());
		seguro.setPoliza_numero(seguroRequestDTO.getPoliza_numero());
		seguro.setAseguradora_codigo(seguroRequestDTO.getAseguradora_codigo());
		seguro.setSucursal_codigo(seguroRequestDTO.getSucursal_codigo());
		seguro.setTarifa(seguroRequestDTO.getTarifa());
		seguro.setPrima_soat(seguroRequestDTO.getPrima_soat());
		seguro.setContribucion_fosyga(seguroRequestDTO.getContribucion_fosyga());
		seguro.setTasa_runt(seguroRequestDTO.getTasa_runt());
		seguro.setRegistro_usuario(seguroRequestDTO.getRegistro_usuario());
		seguro.setTotal(seguroRequestDTO.getPrima_soat() + seguroRequestDTO.getContribucion_fosyga()
				+ seguroRequestDTO.getTasa_runt());

		return seguro;
	}
}
