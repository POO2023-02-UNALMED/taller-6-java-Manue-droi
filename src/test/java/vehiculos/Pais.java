package vehiculos;
import java.util.ArrayList;

public class Pais {
	String nombre;
	int vehiculosVendidos = 0;
	protected int VecesPais;
	private static Pais elegido;
	protected static ArrayList<Pais> listado = new ArrayList<>();
	
public Pais(String nombre) {
	this.nombre = nombre;
	listado.add(this);
	}
	public Pais() {
		this(null);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String name) {
		this.nombre = name;
	}
	public int getCantidadVeces() {
		return VecesPais;
	}
	
public static Pais paisMasVendedor() {
		for(int i=0; i<(Pais.listado.size())-1;i++ ) {
			Pais MasVendido1=Pais.listado.get(0);
			Pais Masvendido2=Pais.listado.get(i+1);
			if (MasVendido1.getCantidadVeces()<Masvendido2.getCantidadVeces()) {
				elegido=Masvendido2;
			}else {
				elegido=MasVendido1;
			}
	
		}
		return elegido;
		}	  
}
