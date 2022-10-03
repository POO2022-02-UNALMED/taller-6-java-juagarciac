package vehiculos;
public class Automovil extends Vehiculo {
	private int puestos;
	
	public Automovil(String placa,String nombre,int precio,int peso,Fabricante fabricante,int puertas) {
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos=puertas;
		super.Automoviles();
	}
	
	public int getPuestos() {
		return this.puestos;
	}
	
	public void setPuestos(int puestos) {
		this.puestos=puestos;
	}
}
