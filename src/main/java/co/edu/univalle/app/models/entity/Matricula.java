package co.edu.univalle.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "matriculas")
public class Matricula implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	private String estado;

	@ManyToOne
	private Vehiculo vehiculo;
	@NotEmpty
	private String licencia_transito_numero;
	@NotEmpty
	private String placa;

	@NotNull
	@Column(name = "matricula_fecha")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date matricula_fecha;

	@NotEmpty
	private String organismo;

	@NotNull
	@Column(name = "registro_fecha")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date registro_fecha;

	@NotEmpty
	private String registro_usuario;

	public Matricula() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
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
