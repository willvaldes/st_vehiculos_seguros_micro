package co.edu.univalle.app.models.entity.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MatriculaRequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String estado;

	private Long vehiculo_id;

	private String licencia_transito_numero;

	private String placa;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date matricula_fecha;

	private String organismo;

	private String registro_usuario;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getVehiculo_id() {
		return vehiculo_id;
	}

	public void setVehiculo_id(Long vehiculo_id) {
		this.vehiculo_id = vehiculo_id;
	}

	public String getLicencia_transito_numero() {
		return licencia_transito_numero;
	}

	public void setLicencia_transito_numero(String licencia_transito_numero) {
		this.licencia_transito_numero = licencia_transito_numero;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Date getMatricula_fecha() {
		return matricula_fecha;
	}

	public void setMatricula_fecha(Date matricula_fecha) {
		this.matricula_fecha = matricula_fecha;
	}

	public String getOrganismo() {
		return organismo;
	}

	public void setOrganismo(String organismo) {
		this.organismo = organismo;
	}

	public String getRegistro_usuario() {
		return registro_usuario;
	}

	public void setRegistro_usuario(String registro_usuario) {
		this.registro_usuario = registro_usuario;
	}

}
