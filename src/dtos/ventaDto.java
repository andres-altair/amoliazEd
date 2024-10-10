package dtos;

import java.time.LocalDateTime;

public class ventaDto {

	long id ;
	double cantidad =0.0;
	LocalDateTime fchaIntante= LocalDateTime.now();
	
	public ventaDto() {}
	public ventaDto(long id, double cantidad) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.fchaIntante =  LocalDateTime.now();
	}

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public LocalDateTime getFchaIntante() {
		return fchaIntante;
	}
	public void setFchaIntante(LocalDateTime fchaIntante) {
		this.fchaIntante = fchaIntante;
	}
	
	
	@Override
	public String toString() {
		return "ventaDto [id=" + id + ", cantidad=" + cantidad + ", fchaIntante=" + fchaIntante + "]";
	}


}
