package main;

public class Dentista extends Profecional {

	public Dentista(String nombre, String apellido) {
		super(nombre, apellido);
	}
@Override
	public String toString() {
		return "Odontologo. "+super.toString();
}

}
