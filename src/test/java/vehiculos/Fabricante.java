package vehiculos;

public class Fabricante {
	String nombre;
	String pais;
	
	public Fabricante(String name, String pais ) {
		this.nombre = name;
		this.pais = pais;
	}
	
	public Fabricante() {
		this(null, null)
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public País getPais() {
		return pais;
	}
	
	public void setNombre(String name) {
		this.nombre = name;
	}
	
	public void setPais(País country) {
		this.pais = country;
	}
}
