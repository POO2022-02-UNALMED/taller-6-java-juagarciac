package vehiculos;
import java.util.ArrayList;
public class Fabricante {
	private String nombre;
	private Pais pais;
	private int apariciones;
	private static ArrayList<Fabricante> numero = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre,Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public Pais getPais() {
		return this.pais;
	}
	
	public void setPais(Pais pais) {
		this.pais=pais;
	}
	public void aparicion() {
		this.apariciones+=1;
		this.pais.aparicion();
	}
	public int apariciones() {
		return this.apariciones;
	}
	public static Fabricante fabricaMayorVentas() {
		int p=0;
		for(int i=0;i<Fabricante.numero.size()-1;i++) {
			if(Fabricante.numero.get(i).apariciones()<Fabricante.numero.get(i+1).apariciones()) {
				p=i+1;
			}
			else {
				p=i;
			}
		}
		return Fabricante.numero.get(p);
	}
}
