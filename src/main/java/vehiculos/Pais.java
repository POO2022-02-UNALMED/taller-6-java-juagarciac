package vehiculos;
import java.util.ArrayList;
import java.util.Iterator;
public class Pais {
	private String nombre;
	private int apariciones;
	private static ArrayList<Pais> numero =new ArrayList<Pais>();
	
	
	public Pais(String nombre){
		this.nombre=nombre;
		Pais.numero.add(this);
		this.apariciones=0;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void aparicion() {
		this.apariciones+=1;
	}
	public int apariciones() {
		return this.apariciones;
	}
	public static Pais paisMasVendedor() {
		int p=0;
		for(int i=0;i<Pais.numero.size();i++) {
			if(Pais.numero.get(i).apariciones()>Pais.numero.get(p).apariciones()) {
				p=i;
			}
		}
		return Pais.numero.get(p);
	}
	
}
