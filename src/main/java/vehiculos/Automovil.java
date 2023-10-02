package vehiculos;


public class Automovil extends Vehiculo {
	protected int puestos;
	protected static int cantidadAutomobiles;


	
	public Automovil(String placa , String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		cantidadAutomobiles++;
	} 

	public static int getCantidadAutomoviles() {
		  return cantidadAutomobiles;
	}	
	public int getPuestos() {
			return puestos;
	}
	public void setPuestos(int puestos) {
			this.puestos = puestos;
	}
}
