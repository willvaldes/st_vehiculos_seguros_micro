package co.edu.univalle.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.univalle.app.models.dao.IMatriculaDao;
import co.edu.univalle.app.models.dao.IVehiculoDao;
import co.edu.univalle.app.models.entity.Matricula;
import co.edu.univalle.app.models.entity.Vehiculo;
import co.edu.univalle.app.models.entity.dto.MatriculaRequestDTO;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaDao matriculaDao;
	@Autowired
	private IVehiculoDao vehiculoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Matricula> findAll() {
		// TODO Auto-generated method stub
		return (List<Matricula>) matriculaDao.findAll();
	}

	@Override
	@Transactional
	public void save(Matricula cliente) {
		matriculaDao.save(cliente);
	}

	@Override
	@Transactional(readOnly = true)
	public Matricula findOne(Long id) {
		return matriculaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		matriculaDao.deleteById(id);
	}

	@Override
	@Transactional
	public Matricula inicializar(MatriculaRequestDTO matriculaRequestDTO) {
		Matricula matricula = new Matricula();
		Vehiculo vehiculo = vehiculoDao.findById(matriculaRequestDTO.getVehiculo_id()).orElse(null);
		matricula.setEstado(matriculaRequestDTO.getEstado());
		matricula.setVehiculo(vehiculo);
		matricula.setLicencia_transito_numero(matriculaRequestDTO.getLicencia_transito_numero());
		matricula.setPlaca(matriculaRequestDTO.getPlaca());
		matricula.setMatricula_fecha(matriculaRequestDTO.getMatricula_fecha());
		matricula.setOrganismo(matriculaRequestDTO.getOrganismo());
		matricula.setRegistro_usuario(matriculaRequestDTO.getRegistro_usuario());

		return matricula;
	}
}
