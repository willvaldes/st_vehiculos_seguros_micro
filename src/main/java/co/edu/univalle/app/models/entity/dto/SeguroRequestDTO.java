package co.edu.univalle.app.models.entity.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SeguroRequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long   vehiculo_id;
	
	private String tomador_tipo_doc;
	
	private Long   tomador_doc;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date   expedicion_fecha;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date   vigencia_desde;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date   vigencia_hasta;
	
	private String poliza_numero;
	
	private String aseguradora_codigo;
	
	private String sucursal_codigo;
	
	private Long   tarifa;
	
	private Double prima_soat;
	
	private Double contribucion_fosyga;
	
	private Double tasa_runt;
	
	private String registro_usuario;

	public Long getVehiculo_id() {
		return vehiculo_id;
	}

	public void setVehiculo_id(Long vehiculo_id) {
		this.vehiculo_id = vehiculo_id;
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

	public String getRegistro_usuario() {
		return registro_usuario;
	}

	public void setRegistro_usuario(String registro_usuario) {
		this.registro_usuario = registro_usuario;
	}

}
