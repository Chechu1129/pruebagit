package main;

public class Endodocista extends Dentista{

	public Endodocista(String nombre, String apellido) {
		super(nombre, apellido);
	}
	@Override
	public double getHonorario() {
		return super.getHonorario()*1.25;
	}
	@Override 
	public String toString() {
		return "Endodocista "+ super.toString();
	}
	
}
