package main;

public abstract class Profecional implements Comparable<Profecional>{
	private static final double HONORARIO_BASICO=500000.0;
	private String nombre;
	private String apellido;
	public Profecional(String nombre, String apellido) {
		this.apellido=apellido;
		this.nombre=nombre;
	}
	public double getHonorario() {
		return Profecional.HONORARIO_BASICO;
	}
	
	@Override
	public String toString() {
		return "Profecional [nombre=" + nombre + ", apellido=" + apellido +"Honorario="+this.getHonorario() +"]";
	}
	public int compareTo(Profecional p) {
		return (-1)*Double.compare(this.getHonorario(), p.getHonorario());
	}
}
