package dtos;

public class clienteDto {

	long id;
	String nombre="aaaaa";
	String apellido1 = "aaaaa";
	String apellido2 = "aaaa";
	
	public clienteDto() {}
	public clienteDto(long id, String nombre, String apellido1, String apellido2) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}



	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	
	
	@Override
	public String toString() {
		return "clienteDto [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ "]";
	}
	
}
