package co.edu.univalle.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "traspasos")
public class Traspaso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private Vehiculo vehiculo;

	@NotEmpty
	private String propietario_tipo_doc;
	@NotNull
	private Long propietario_doc;
	@NotEmpty
	private String propietario_anterior_tipo_doc;
	@NotNull
	private Long propietario_anterior_doc;

	@NotNull
	@Column(name = "traspaso_fecha")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date traspaso_fecha;

	@NotNull
	@Column(name = "registro_fecha")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date registro_fecha;

	@NotEmpty
	private String registro_usuario;

	public Traspaso() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
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
