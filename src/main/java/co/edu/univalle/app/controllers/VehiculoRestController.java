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

import co.edu.univalle.app.models.entity.Vehiculo;
import co.edu.univalle.app.models.entity.dto.VehiculoRequestDTO;
import co.edu.univalle.app.models.service.IVehiculoService;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoRestController {

	@Autowired
	private IVehiculoService vehiculoService;

	@GetMapping(value = "/buscarTodos", produces = { "application/json" })
	public List<Vehiculo> buscarTodos() {
		return vehiculoService.findAll();
	}

	@GetMapping(value = "/buscarPorId/{id}", produces = { "application/json" })
	public Vehiculo buscarPorId(@PathVariable(value = "id") Long id) {
		return vehiculoService.findOne(id);
	}

	@PostMapping(value = "/crear", produces = { "application/json" })
	public Vehiculo crear(@RequestBody VehiculoRequestDTO vehiculoRequestDTO) {
		Vehiculo vehiculo = vehiculoService.inicializar(vehiculoRequestDTO);
		vehiculo.setRegistro_fecha(new Date());
		vehiculoService.save(vehiculo);
		return vehiculoService.findOne(vehiculo.getId());
	}

	@PostMapping(value = "/actualizar/{id}", produces = { "application/json" })
	public Vehiculo actualizar(@PathVariable(value = "id") Long id,
			@RequestBody VehiculoRequestDTO vehiculoRequestDTO) {
		Vehiculo vehiculo = vehiculoService.inicializar(vehiculoRequestDTO);
		vehiculo.setId(id);
		vehiculo.setRegistro_fecha(new Date());
		vehiculoService.save(vehiculo);
		return vehiculoService.findOne(vehiculo.getId());
	}

	@DeleteMapping(value = "/eliminar/{id}", produces = { "application/json" })
	public String eliminar(@PathVariable(value = "id") Long id) {
		vehiculoService.delete(id);
		return "exito";
	}
}
