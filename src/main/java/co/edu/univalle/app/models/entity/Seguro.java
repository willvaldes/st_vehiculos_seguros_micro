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
@Table(name = "seguros")
public class Seguro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private Vehiculo vehiculo;

	@NotEmpty
	private String tomador_tipo_doc;
	@NotNull
	private Long tomador_doc;

	@NotNull
	@Column(name = "expedicion_fecha")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date expedicion_fecha;

	@NotNull
	@Column(name = "vigencia_desde")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date vigencia_desde;

	@NotNull
	@Column(name = "vigencia_hasta")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date vigencia_hasta;
	@NotEmpty
	private String poliza_numero;
	@NotEmpty
	private String aseguradora_codigo;
	@NotEmpty
	private String sucursal_codigo;
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
	@Column(name = "registro_fecha")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date registro_fecha;

	@NotEmpty
	private String registro_usuario;

	public Seguro() {
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

	public String getTomador_tipo_doc() {
		return tomador_tipo_doc;
	}

	public void setTomador_tipo_doc(String tomador_tipo_doc) {
		this.tomador_tipo_doc = tomador_tipo_doc;
	}

	public Long getTomador_doc() {
		return tomador_doc;
	}

	public void setTomador_doc(Long tomador_doc) {
		this.tomador_doc = tomador_doc;
	}

	public Date getExpedicion_fecha() {
		return expedicion_fecha;
	}

	public void setExpedicion_fecha(Date expedicion_fecha) {
		this.expedicion_fecha = expedicion_fecha;
	}

	public Date getVigencia_desde() {
		return vigencia_desde;
	}

	public void setVigencia_desde(Date vigencia_desde) {
		this.vigencia_desde = vigencia_desde;
	}

	public Date getVigencia_hasta() {
		return vigencia_hasta;
	}

	public void setVigencia_hasta(Date vigencia_hasta) {
		this.vigencia_hasta = vigencia_hasta;
	}

	public String getPoliza_numero() {
		return poliza_numero;
	}

	public void setPoliza_numero(String poliza_numero) {
		this.poliza_numero = poliza_numero;
	}

	public String getAseguradora_codigo() {
		return aseguradora_codigo;
	}

	public void setAseguradora_codigo(String aseguradora_codigo) {
		this.aseguradora_codigo = aseguradora_codigo;
	}

	public String getSucursal_codigo() {
		return sucursal_codigo;
	}

	public void setSucursal_codigo(String sucursal_codigo) {
		this.sucursal_codigo = sucursal_codigo;
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
