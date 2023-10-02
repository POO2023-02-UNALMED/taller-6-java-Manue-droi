package vehiculos;

public class Fabricante {
	String nombre;
	String pais;
	
	public Fabricante(String name, String pais ) {
		this.nombre = name;
		this.pais = pais;
	}
	
	public Fabricante() {
		this(null, null);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setNombre(String name) {
		this.nombre = name;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
}
