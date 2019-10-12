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

import co.edu.univalle.app.models.entity.Seguro;
import co.edu.univalle.app.models.entity.dto.SeguroRequestDTO;
import co.edu.univalle.app.models.service.ISeguroService;

@RestController
@RequestMapping("/api/seguros")
public class SeguroRestController {

	@Autowired
	private ISeguroService seguroService;

	@GetMapping(value = "/buscarTodos", produces = { "application/json" })
	public List<Seguro> buscarTodos() {
		return seguroService.findAll();
	}

	@GetMapping(value = "/buscarPorId/{id}", produces = { "application/json" })
	public Seguro buscarPorId(@PathVariable(value = "id") Long id) {
		return seguroService.findOne(id);
	}

	@PostMapping(value = "/crear", produces = { "application/json" })
	public Seguro crear(@RequestBody SeguroRequestDTO seguroRequestDTO) {
		Seguro seguro = seguroService.inicializar(seguroRequestDTO);
		seguro.setRegistro_fecha(new Date());
		seguroService.save(seguro);
		return seguroService.findOne(seguro.getId());
	}

	@PostMapping(value = "/actualizar/{id}", produces = { "application/json" })
	public Seguro actualizar(@PathVariable(value = "id") Long id, @RequestBody SeguroRequestDTO seguroRequestDTO) {
		Seguro seguro = seguroService.inicializar(seguroRequestDTO);
		seguro.setRegistro_fecha(new Date());
		seguro.setId(id);
		seguroService.save(seguro);
		return seguroService.findOne(seguro.getId());
	}

	@DeleteMapping(value = "/eliminar/{id}", produces = { "application/json" })
	public String eliminar(@PathVariable(value = "id") Long id) {
		seguroService.delete(id);
		return "exito";
	}
}
