package main;

public class Medico extends Profecional {

	public Medico(String nombre, String apellido) {
		super(nombre, apellido);
	}
	@Override
	public String toString() {
		return "Dr. "+ super.toString();
	}
	
}
