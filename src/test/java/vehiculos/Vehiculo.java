package vehiculos;

public class Vehiculo {
	String placa;
	int puertas;
	double velocidadMaxima;
	String nombre;
	double precio;
	double peso;
	String tracción;
	String fabricante;
	int CantidadVehiculos;
	
	public Vehiculo(String placa, int puertas, double velocidadMaxima, String nombre, double precio, double peso, String tracción, String fabricante, int CantidadVehiculos) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.tracción = tracción;
		this.fabricante = fabricante;
		this.CantidadVehiculos = CantidadVehiculos;
	}
	
	
	public int vehiculosPorTipo() {
		return "Automoviles: " + Automóvil.CantidadAutomobiles() + "\n" +
                "Camionetas: " + Camion.cantidad() + "\n" +
                "Camiones: " + Camioneta.cantidadReptiles();
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
	public void setVelocidadMaxima(double velocidadMaxima ) {
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
	public void setPrecio(double precio) {
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
}

