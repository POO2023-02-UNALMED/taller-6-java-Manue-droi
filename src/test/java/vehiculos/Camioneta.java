package vehiculos;


public class Camioneta extends Vehiculo {
	protected boolean volco;
	protected static int cantidadCamionetas;
	
	
	public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String tracción, String fabricante, boolean volco) {
		super( placa, puertas, velocidadMaxima,  nombre, precio, peso, tracción, fabricante);
		this.volco = volco;
		cantidadCamionetas++;
	}
	
	public Camioneta(String placa, int puertas ,String nombre, int precio,int peso, String fabricante, boolean volco) {
		this(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante, volco);
	}	
	public Camioneta() {
		this(null,0, null, 0 , 0, null, false);
	}
	public boolean isvolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	public static int getcantidadCamionetas() {
		return cantidadCamionetas;
	}
}
