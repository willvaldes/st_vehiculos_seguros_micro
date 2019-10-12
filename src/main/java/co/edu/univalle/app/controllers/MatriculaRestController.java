package co.edu.univalle.app.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.univalle.app.models.entity.Matricula;
import co.edu.univalle.app.models.entity.dto.MatriculaRequestDTO;
import co.edu.univalle.app.models.service.IMatriculaService;

@RestController
@RequestMapping("/api/matriculas")
public class MatriculaRestController {

	@Autowired
	private IMatriculaService matriculaService;

	@GetMapping(value = "/buscarTodos", produces = { "application/json" })
	public List<Matricula> buscarTodos() {
		return matriculaService.findAll();
	}

	@GetMapping(value = "/buscarPorId/{id}", produces = { "application/json" })
	public Matricula buscarPorId(@PathVariable(value = "id") Long id) {
		return matriculaService.findOne(id);
	}

	@PostMapping(value = "/crear", produces = { "application/json" })
	public Matricula crear(@RequestBody MatriculaRequestDTO matriculaRequestDTO) {
		Matricula matricula = matriculaService.inicializar(matriculaRequestDTO);
		matricula.setRegistro_fecha(new Date());
		matriculaService.save(matricula);
		return matriculaService.findOne(matricula.getId());
	}

	@PostMapping(value = "/actualizar/{id}", produces = { "application/json" })
	public Matricula actualizar(@PathVariable(value = "id") Long id,
			@RequestBody MatriculaRequestDTO matriculaRequestDTO) {
		Matricula matricula = matriculaService.inicializar(matriculaRequestDTO);
		matricula.setRegistro_fecha(new Date());
		matricula.setId(id);
		matriculaService.save(matricula);
		return matriculaService.findOne(matricula.getId());
	}

	@DeleteMapping(value = "/eliminar/{id}", produces = { "application/json" })
	public String eliminar(@PathVariable(value = "id") Long id) {
		matriculaService.delete(id);
		return "exito";
	}
}
