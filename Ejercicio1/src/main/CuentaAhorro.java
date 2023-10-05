package main;

public class CuentaAhorro extends Cuenta {

	public CuentaAhorro(int dni) {
		super(dni);
	}

	@Override
	public boolean haySaldoSufiente(double monto) {
		return this.getSaldo()>=monto;
	}

}
