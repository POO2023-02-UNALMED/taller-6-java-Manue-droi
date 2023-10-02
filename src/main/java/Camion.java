package vehiculos;

public class Camion extends Vehiculo {
	protected int ejes;
	protected static int cantidadCamiones;
	
	public Camion() {
		this(null, null, 0, 0, null, 0);
	}
	
	public Camion(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, String fabricante, int ejes) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		this.ejes = ejes;
		cantidadCamiones++;
	}
	
	public Camion(String placa ,String nombre, int precio, int peso, String fabricante, int ejes) {
		this(placa, 2, 80, nombre, precio, peso, "4X2", fabricante, ejes);
	}
	
	}
	public static int getcantidadCamiones() {
		return cantidadCamiones ;
	}
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}