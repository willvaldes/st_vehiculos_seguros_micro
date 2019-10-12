package co.edu.univalle.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tipo_seguros")
public class TipoSeguro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private Long modelo;
	@NotNull
	private Long cilindraje;
	@NotEmpty
	private String clase;
	@NotNull
	private Long tarifa;
	@NotNull
	private Double prima_soat;
	@NotNull
	private Double contribucion_fosyga;
	@NotNull
	private Double tasa_runt;
	@NotNull
	private Double total;

	@NotNull
	@Column(name = "revision_fecha")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date revision_fecha;

	@NotNull
	@Column(name = "revision_vigencia")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date revision_vigencia;

	@NotNull
	@Column(name = "registro_fecha")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date registro_fecha;

	@NotEmpty
	private String registro_usuario;

	public TipoSeguro() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
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

	public Date getRegistro_fecha() {
		return registro_fecha;
	}

	public void setRegistro_fecha(Date registro_fecha) {
		this.registro_fecha = registro_fecha;
	}

	public String getRegistro_usuario() {
		return registro_usuario;
	}

	public void setRegistro_usuario(String registro_usuario) {
		this.registro_usuario = registro_usuario;
	}

}
