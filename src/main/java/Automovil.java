package vehiculos;


public class Automovil extends Vehiculo {
	protected int puestos;
	protected static int cantidadAutomobiles;


	public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, String fabricante, int puestos) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		this.puestos = puestos;
		cantidadAutomobiles++;
	} 
		
	public Automovil(String placa, String nombre, int precio, int peso, String fabricante, int puestos) {
			this(placa, 4, 100, nombre, precio, peso, "FWD", fabricante, puestos);
	}
	public Automovil() {
			this(null, null, 0, 0, null, 0);
	}
	public static int getcantidadAutomoviles() {
		  return cantidadAutomobiles;
	}	
	public int getPuestos() {
			return puestos;
	}
	public void setPuestos(int puestos) {
			this.puestos = puestos;
	}
}
