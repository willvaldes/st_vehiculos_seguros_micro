package co.edu.univalle.app.models.entity.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class VehiculoRequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String propietario_tipo_doc;

	private Long propietario_doc;

	private String marca;

	private String linea;

	private Long modelo;

	private Long cilindraje;

	private String color;

	private String servicio;

	private String clase;

	private String tipo_carroceria;

	private String combustible;

	private Long pasajeros;

	private String puertas;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date revision_fecha;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date revision_vigencia;

	private String registro_usuario;

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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public Long getModelo() {
		return modelo;
	}

	public void setModelo(Long modelo) {
		this.modelo = modelo;
	}

	public Long getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(Long cilindraje) {
		this.cilindraje = cilindraje;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getTipo_carroceria() {
		return tipo_carroceria;
	}

	public void setTipo_carroceria(String tipo_carroceria) {
		this.tipo_carroceria = tipo_carroceria;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public Long getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Long pasajeros) {
		this.pasajeros = pasajeros;
	}

	public String getPuertas() {
		return puertas;
	}

	public void setPuertas(String puertas) {
		this.puertas = puertas;
	}

	public Date getRevision_fecha() {
		return revision_fecha;
	}

	public void setRevision_fecha(Date revision_fecha) {
		this.revision_fecha = revision_fecha;
	}

	public Date getRevision_vigencia() {
		return revision_vigencia;
	}

	public void setRevision_vigencia(Date revision_vigencia) {
		this.revision_vigencia = revision_vigencia;
	}

	public String getRegistro_usuario() {
		return registro_usuario;
	}

	public void setRegistro_usuario(String registro_usuario) {
		this.registro_usuario = registro_usuario;
	}

}
