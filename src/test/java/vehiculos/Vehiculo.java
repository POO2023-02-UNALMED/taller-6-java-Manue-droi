package vehiculos;

public class Vehiculo {
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String tracción;
	protected String fabricante;
	public static int cantidadporPais;
	protected static int CantidadVehiculos;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String tracción, String fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.tracción = tracción;
		this.fabricante = fabricante;
		CantidadVehiculos++;
	}
	
	public String cantidadVehiculos() {
		return "Automoviles: " + Automovil.cantidadAutomoviles() + "\n" +
				"Camionetas: " + Camioneta.cantidadCamionetas() + "\n" +
				"Camiones: " + Camion.cantidadCamiones();
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int gePuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas ;
	}
	public double getVelocidadMaxima() {
		return velocidadMaxima ;
	}
	public void setVelocidadMaxima(int velocidadMaxima ) {
		this.velocidadMaxima = velocidadMaxima  ;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre ;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio ;
	}
	public String getTracción() {
		return tracción;
	}
	public void setTracción(String tracción) {
		this.tracción = tracción ;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante =fabricante  ;
	}
	public int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}
}

