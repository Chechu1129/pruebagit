package main;

public class CuentaCorriente extends Cuenta {
	private double descubierto;
	public CuentaCorriente(int dni, double descubierto) {
		super(dni);
		this.descubierto=descubierto;
	}

	@Override
	public boolean haySaldoSufiente(double monto) {
		return this.getSaldo()+ descubierto>=monto;
	}

}
