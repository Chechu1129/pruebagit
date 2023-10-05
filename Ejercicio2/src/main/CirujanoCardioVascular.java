package main;

public class CirujanoCardioVascular extends Cirujano {

	public CirujanoCardioVascular(String nombre, String apellido) {
		super(nombre, apellido);
	}
	@Override
	public double getHonorario() {
		return super.getHonorario()*1.25;
	}
	@Override
	public String toString() {
		return "Cardiovascular "+super.getHonorario()*1.35;
	}
}
