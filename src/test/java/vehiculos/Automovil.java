package vehiculos;
import java.util.ArrayList;

public class Automovil extends Vehiculo {
	protected int puestos;
	protected static ArrayList<Automovil> listado = new ArrayList<Automovil>();


	public Automovil(String placa, int puertas, double velocidadMaxima, String nombre, double precio, double peso, String tracción, String fabricante, int puestos) {
	    super(placa, puertas, velocidadMaxima, nombre, precio, peso, tracción, fabricante);
	    this.puestos = puestos;
	    Automovil.listado.add(this);
	} 
	
	public Automovil(String placa, String nombre, double precio, double peso, String fabricante, int puestos) {
		this(placa, 4, 100, nombre, precio, peso, "FWD", fabricante, puestos);
	}
	public Automovil() {
		this(null, 4, 100, null, 0, 0, "FWD", null, 0);
	}
	public static int cantidadAutomoviles() {
	    return Automovil.listado.size();
	}
	public static  ArrayList<Automovil> getListado() {
        return listado;
	}
	public static void setListado(ArrayList<Automovil> listado) {
		Automovil.listado = listado;
	}
}
