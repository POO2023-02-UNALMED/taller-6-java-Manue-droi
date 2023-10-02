package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	protected String nombre;
	protected String pais;
	protected int vecesFabricante;
	private static Fabricante fabricanteElegido;
	protected  static ArrayList <Fabricante> elegidoFab = new ArrayList<Fabricante>();
	
	
	public Fabricante(String name, String pais ) {
		this.nombre = nombre;
		this.pais = pais;
		elegidoFab.add(this);
		
	}
	
	public Fabricante() {

	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setNombre(String name) {
		this.nombre = name;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getVecesFabricante() {
		return vecesFabricante;		
	}
		
	public static  Fabricante fabricaMayorVentas () {
			
		for(int i=0;i<(elegidoFab.size())-1; i++ ) {
				Fabricante MasVendido1=elegidoFab.get(0);
				Fabricante MasVendido2=elegidoFab.get(i+1);
				if (MasVendido1.getVecesFabricante()>MasVendido2.getVecesFabricante()) {
					fabricanteElegido=MasVendido1;
				}else {
					fabricanteElegido=MasVendido2;	
				}
			}
			return fabricanteElegido;
		}

}
