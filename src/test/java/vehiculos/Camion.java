package vehiculos;
import java.util.ArrayList;

public class Camion extends Vehiculo {
	protected int ejes;
	protected static ArrayList<Camion> listado = new ArrayList<Camion>();
	
	public Camion(String plate, int doors, int speed, String name, int precio, int peso, String traction, String maker, int axles) {
		super(plate, doors, speed, name, precio, peso, traction, maker);
		this.ejes = axles;
		Camion.listado.add(this);
	}
	
	public Camion(String placa ,String nombre, int precio, int peso, String fabricante, int ejes) {
		this(placa, 2, 80, nombre, precio, peso, "4X2", fabricante, ejes);
	}
	public Camion() {
		this(null, null, 0, 0, null, 0);
	}
	public static int cantidadCamiones() {
		return Camion.listado.size();
	}
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int axles) {
		this.ejes = axles;
	}
}
