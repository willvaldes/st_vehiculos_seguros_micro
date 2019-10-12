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
@Table(name = "vehiculos")
public class Vehiculo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	private String propietario_tipo_doc;
	@NotNull
	private Long propietario_doc;
	@NotEmpty
	private String marca;
	@NotEmpty
	private String linea;
	@NotNull
	private Long modelo;
	@NotNull
	private Long cilindraje;
	@NotEmpty
	private String color;
	@NotEmpty
	private String servicio;
	@NotEmpty
	private String clase;
	@NotEmpty
	private String tipo_carroceria;
	@NotEmpty
	private String combustible;
	@NotNull
	private Long pasajeros;
	@NotEmpty
	private String puertas;

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

	public Vehiculo() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Vehiculo(Long id, String propietario_tipo_doc, Long propietario_doc, String marca, String linea, Long modelo,
			Long cilindraje, String color, String servicio, String clase, String tipo_carroceria, String combustible,
			Long pasajeros, String puertas, Date revision_fecha, Date revision_vigencia, Date registro_fecha,
			String registro_usuario) {
		super();
		this.id = id;
		this.propietario_tipo_doc = propietario_tipo_doc;
		this.propietario_doc = propietario_doc;
		this.marca = marca;
		this.linea = linea;
		this.modelo = modelo;
		this.cilindraje = cilindraje;
		this.color = color;
		this.servicio = servicio;
		this.clase = clase;
		this.tipo_carroceria = tipo_carroceria;
		this.combustible = combustible;
		this.pasajeros = pasajeros;
		this.puertas = puertas;
		this.revision_fecha = revision_fecha;
		this.revision_vigencia = revision_vigencia;
		this.registro_fecha = registro_fecha;
		this.registro_usuario = registro_usuario;
	}

	public Vehiculo(Vehiculo vehiculoTmp) {
		super();
		this.propietario_tipo_doc = vehiculoTmp.getPropietario_tipo_doc();
		this.propietario_doc = vehiculoTmp.getPropietario_doc();
		this.marca = vehiculoTmp.getMarca();
		this.linea = vehiculoTmp.getLinea();
		this.modelo = vehiculoTmp.getModelo();
		this.cilindraje = vehiculoTmp.getCilindraje();
		this.color = vehiculoTmp.getColor();
		this.servicio = vehiculoTmp.getServicio();
		this.clase = vehiculoTmp.getClase();
		this.tipo_carroceria = vehiculoTmp.getTipo_carroceria();
		this.combustible = vehiculoTmp.getCombustible();
		this.pasajeros = vehiculoTmp.getPasajeros();
		this.puertas = vehiculoTmp.getPuertas();
		this.revision_fecha = vehiculoTmp.getRevision_fecha();
		this.revision_vigencia = vehiculoTmp.getRevision_vigencia();
		this.registro_fecha = vehiculoTmp.getRegistro_fecha();
		this.registro_usuario = vehiculoTmp.getRegistro_usuario();
	}

}
