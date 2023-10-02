package vehiculos;
import java.util.ArrayList;

public class Automovil extends Vehiculo {
	protected int puestos;
	protected static ArrayList<Automovil> listado = new ArrayList<Automovil>();


	public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String tracción, String fabricante, int puestos) {
	    super(placa, puertas, velocidadMaxima, nombre, precio, peso, tracción, fabricante);
	    this.puestos = puestos;
	    Automovil.listado.add(this);
	} 
	
	public Automovil(String placa, String nombre, int precio, int peso, String fabricante, int puestos) {
		this(placa, 4, 100, nombre, precio, peso, "FWD", fabricante, puestos);
	}
	public Automovil() {
		this(null, null, 0, 0, null, 0);
	}
	public static int cantidadAutomoviles() {
	    return Automovil.listado.size();
	}
	public  ArrayList<Automovil> getListado() {
        return listado;
	}
	public void setListado(ArrayList<Automovil> listado) {
		Automovil.listado = listado;
	}

		
}

