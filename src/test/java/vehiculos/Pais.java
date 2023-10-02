package vehiculos;
public class Pais {
	String nombre;	
	
	
public Pais(String nombre) {
	this.nombre = nombre;
	}
	
	public Pais() {
		this(null);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String name) {
		this.nombre = name;
	}
}
