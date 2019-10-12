package co.edu.univalle.app.models.entity.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TraspasoRequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;
 
	private Long vehiculo_id;

	private String propietario_tipo_doc;

	private Long propietario_doc;

	private String propietario_anterior_tipo_doc;

	private Long propietario_anterior_doc;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date traspaso_fecha;

	private String registro_usuario;

	public Long getVehiculo_id() {
		return vehiculo_id;
	}

	public void setVehiculo_id(Long vehiculo_id) {
		this.vehiculo_id = vehiculo_id;
	}

	public String getPropietario_tipo_doc() {
		return propietario_tipo_doc;
	}

	public void setPropietario_tipo_doc(String propietario_tipo_doc) {
		this.propietario_tipo_doc = propietario_tipo_doc;
	}

	public Long getPropietario_doc() {
		return propietario_doc;
	}

	public void setPropietario_doc(Long propietario_doc) {
		this.propietario_doc = propietario_doc;
	}

	public String getPropietario_anterior_tipo_doc() {
		return propietario_anterior_tipo_doc;
	}

	public void setPropietario_anterior_tipo_doc(String propietario_anterior_tipo_doc) {
		this.propietario_anterior_tipo_doc = propietario_anterior_tipo_doc;
	}

	public Long getPropietario_anterior_doc() {
		return propietario_anterior_doc;
	}

	public void setPropietario_anterior_doc(Long propietario_anterior_doc) {
		this.propietario_anterior_doc = propietario_anterior_doc;
	}

	public Date getTraspaso_fecha() {
		return traspaso_fecha;
	}

	public void setTraspaso_fecha(Date traspaso_fecha) {
		this.traspaso_fecha = traspaso_fecha;
	}

	public String getRegistro_usuario() {
		return registro_usuario;
	}

	public void setRegistro_usuario(String registro_usuario) {
		this.registro_usuario = registro_usuario;
	}

}
