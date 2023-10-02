package vehiculos;

public class Camion extends Vehiculo {
	protected int ejes;
	protected static int cantidadCamiones;
	
	public Camion(String plate, int doors, int speed, String name, int precio, int peso, String traction, String maker, int axles) {
		super(plate, doors, speed, name, precio, peso, traction, maker);
		this.ejes = axles;
		cantidadCamiones++;
	}
	
	public Camion(String placa ,String nombre, int precio, int peso, String fabricante, int ejes) {
		this(placa, 2, 80, nombre, precio, peso, "4X2", fabricante, ejes);
	}
	public Camion() {
		this(null, null, 0, 0, null, 0);
	}
	public static int getcantidadCamiones() {
		return cantidadCamiones ;
	}
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int axles) {
		this.ejes = axles;
	}
}
