package co.edu.univalle.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.univalle.app.models.dao.ITipoSeguroDao;
import co.edu.univalle.app.models.entity.TipoSeguro;
import co.edu.univalle.app.models.entity.dto.TipoSeguroRequestDTO;

@Service
public class TipoSeguroServiceImpl implements ITipoSeguroService {

	@Autowired
	private ITipoSeguroDao tipoSeguroDao;

	@Override
	@Transactional(readOnly = true)
	public List<TipoSeguro> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoSeguro>) tipoSeguroDao.findAll();
	}

	@Override
	@Transactional
	public void save(TipoSeguro cliente) {
		tipoSeguroDao.save(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public TipoSeguro findOne(Long id) {
		return tipoSeguroDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		tipoSeguroDao.deleteById(id);
	}

	@Override
	@Transactional
	public TipoSeguro inicializar(TipoSeguroRequestDTO tipoSeguroRequestDTO) {
		TipoSeguro tipoSeguro = new TipoSeguro();

		tipoSeguro.setModelo(tipoSeguroRequestDTO.getModelo());
		tipoSeguro.setCilindraje(tipoSeguroRequestDTO.getCilindraje());
		tipoSeguro.setClase(tipoSeguroRequestDTO.getClase());
		tipoSeguro.setTarifa(tipoSeguroRequestDTO.getTarifa());
		tipoSeguro.setPrima_soat(tipoSeguroRequestDTO.getPrima_soat());
		tipoSeguro.setContribucion_fosyga(tipoSeguroRequestDTO.getContribucion_fosyga());
		tipoSeguro.setTasa_runt(tipoSeguroRequestDTO.getTasa_runt());
		tipoSeguro.setRevision_fecha(tipoSeguroRequestDTO.getRevision_fecha());
		tipoSeguro.setRevision_vigencia(tipoSeguroRequestDTO.getRevision_vigencia());
		tipoSeguro.setRegistro_usuario(tipoSeguroRequestDTO.getRegistro_usuario());
		tipoSeguro.setTotal(tipoSeguroRequestDTO.getPrima_soat() + tipoSeguroRequestDTO.getContribucion_fosyga()
				+ tipoSeguroRequestDTO.getTasa_runt());

		return tipoSeguro;
	}
}
