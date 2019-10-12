package co.edu.univalle.app.models.entity.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TipoSeguroRequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long modelo;

	private Long cilindraje;

	private String clase;

	private Long tarifa;

	private Double prima_soat;

	private Double contribucion_fosyga;

	private Double tasa_runt;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date revision_fecha;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date revision_vigencia;

	private String registro_usuario;

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

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public Long getTarifa() {
		return tarifa;
	}

	public void setTarifa(Long tarifa) {
		this.tarifa = tarifa;
	}

	public Double getPrima_soat() {
		return prima_soat;
	}

	public void setPrima_soat(Double prima_soat) {
		this.prima_soat = prima_soat;
	}

	public Double getContribucion_fosyga() {
		return contribucion_fosyga;
	}

	public void setContribucion_fosyga(Double contribucion_fosyga) {
		this.contribucion_fosyga = contribucion_fosyga;
	}

	public Double getTasa_runt() {
		return tasa_runt;
	}

	public void setTasa_runt(Double tasa_runt) {
		this.tasa_runt = tasa_runt;
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
