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

import co.edu.univalle.app.models.entity.TipoSeguro;
import co.edu.univalle.app.models.entity.dto.TipoSeguroRequestDTO;
import co.edu.univalle.app.models.service.ITipoSeguroService;

@RestController
@RequestMapping("/api/tipoSeguros")
public class TipoSeguroRestController {

	@Autowired
	private ITipoSeguroService tipoSeguroService;

	@GetMapping(value = "/buscarTodos", produces = { "application/json" })
	public List<TipoSeguro> buscarTodos() {
		return tipoSeguroService.findAll();
	}

	@GetMapping(value = "/buscarPorId/{id}", produces = { "application/json" })
	public TipoSeguro buscarPorId(@PathVariable(value = "id") Long id) {
		return tipoSeguroService.findOne(id);
	}

	@PostMapping(value = "/crear", produces = { "application/json" })
	public TipoSeguro crear(@RequestBody TipoSeguroRequestDTO tipoSeguroRequestDTO) {
		TipoSeguro tipoSeguro = tipoSeguroService.inicializar(tipoSeguroRequestDTO);
		tipoSeguro.setRegistro_fecha(new Date());
		tipoSeguroService.save(tipoSeguro);
		return tipoSeguroService.findOne(tipoSeguro.getId());
	}

	@PostMapping(value = "/actualizar/{id}", produces = { "application/json" })
	public TipoSeguro actualizar(@PathVariable(value = "id") Long id, @RequestBody TipoSeguroRequestDTO tipoSeguroRequestDTO) {
		TipoSeguro tipoSeguro = tipoSeguroService.inicializar(tipoSeguroRequestDTO);
		tipoSeguro.setRegistro_fecha(new Date());
		tipoSeguro.setId(id);
		tipoSeguroService.save(tipoSeguro);
		return tipoSeguroService.findOne(tipoSeguro.getId());
	}

	@DeleteMapping(value = "/eliminar/{id}", produces = { "application/json" })
	public String eliminar(@PathVariable(value = "id") Long id) {
		tipoSeguroService.delete(id);
		return "exito";
	}
}
