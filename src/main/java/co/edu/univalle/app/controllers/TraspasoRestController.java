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

import co.edu.univalle.app.models.entity.Traspaso;
import co.edu.univalle.app.models.entity.dto.TraspasoRequestDTO;
import co.edu.univalle.app.models.service.ITraspasoService;

@RestController
@RequestMapping("/api/traspasos")
public class TraspasoRestController {

	@Autowired
	private ITraspasoService traspasoService;

	@GetMapping(value = "/buscarTodos", produces = { "application/json" })
	public List<Traspaso> buscarTodos() {
		return traspasoService.findAll();
	}

	@GetMapping(value = "/buscarPorId/{id}", produces = { "application/json" })
	public Traspaso buscarPorId(@PathVariable(value = "id") Long id) {
		return traspasoService.findOne(id);
	}

	@PostMapping(value = "/crear", produces = { "application/json" })
	public Traspaso crear(@RequestBody TraspasoRequestDTO traspasoRequestDTO) {
		Traspaso traspaso = traspasoService.inicializar(traspasoRequestDTO);
		traspaso.setRegistro_fecha(new Date());
		traspasoService.save(traspaso);
		return traspasoService.findOne(traspaso.getId());
	}

	@PostMapping(value = "/actualizar/{id}", produces = { "application/json" })
	public Traspaso actualizar(@PathVariable(value = "id") Long id,
			@RequestBody TraspasoRequestDTO traspasoRequestDTO) {

		Traspaso traspaso = traspasoService.inicializar(traspasoRequestDTO);
		traspaso.setRegistro_fecha(new Date());
		traspaso.setId(id);
		traspasoService.save(traspaso);
		return traspasoService.findOne(traspaso.getId());
	}

	@DeleteMapping(value = "/eliminar/{id}", produces = { "application/json" })
	public String eliminar(@PathVariable(value = "id") Long id) {
		traspasoService.delete(id);
		return "exito";
	}
}
