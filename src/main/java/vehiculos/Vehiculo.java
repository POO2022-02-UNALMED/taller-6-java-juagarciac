package vehiculos;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos=0;
	static int Automoviles=0;
	static int Camionetas=0;
	static int Camiones=0;
	
	Vehiculo(String placa,int puertas, int velocidad,String nombre,int precio,int peso,String traccion,Fabricante fabricante){
		this.nombre=nombre;
		this.peso=peso;
		this.placa=placa;
		this.precio=precio;
		this.puertas=puertas;
		this.traccion=traccion;
		this.velocidadMaxima=velocidad;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPlaca(String placa) {
		this.placa=placa;
	}
	
	public int getPuertas() {
		return this.puertas;
	}
	
	public void setPuertas(int puertas) {
		this.puertas=puertas;
	}
	
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	
	public void setVelocidadMaxima(int velocidad) {
		this.velocidadMaxima=velocidad;
	}
	
	public string getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	public void setPeso(int peso) {
		this.peso=peso;
	}
	
	public String getTraccion() {
		return this.traccion;
	}
	
	public void setTraccion(String traccion) {
		this.traccion=traccion;
	}
	
	public Fabricante getFabicante() {
		return this.fabricante;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante=fabricante;
	}
	
	public static int getCantidadVehiculos() {
		return Vehiculo.CantidadVehiculos;
	}
	
	public static int setCantidadVehiculos(int numero){
		Vehiculo.CantidadVehiculos=numero;
	}
	
	public static void Automoviles() {
		Vehiculo.Automoviles+=1;
	}
	
	public static void Camionetas() {
		Vehiculo.Camionetas+=1;
	}
	
	public static void Camiones() {
		Vehiculo.Camiones+=1;
	}
	public static int Auto() {
		return Vehiculo.Automoviles;
	}
	
	public static int camion() {
		return Vehiculo.Camiones;
	}
	
	public static int camioneta() {
		return Vehiculo.Camionetas;
	}
	
	public static String vehiculosPorTipo() {
		return "Automoviles: "+Vehiculo.Auto()+"\nCamionetas: "+Vehiculo.Camioneta()+"\nCamiones: "+Vehiculo.Camion();
	}
	}
