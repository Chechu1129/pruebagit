package main;

import java.util.ArrayList;
import java.util.Collections;

public class Banco {
	
	private ArrayList<Cuenta> cuentas;

	public Banco(){
		this.cuentas= new ArrayList<Cuenta>();
	}
	public Cuenta abrirCuentaCorriente(int dni, double descubierto){
		Cuenta aux = new CuentaCorriente(dni, descubierto);
		cuentas.add(aux);
		return aux;
	}
	public Cuenta abrirCajaDeAhorro(int dni){
		Cuenta aux= new CuentaAhorro(dni);
		cuentas.add(aux);
		return aux;
	}
	public double totalSaldoEnDescubierto(){
		double total=0;
		for(Cuenta aux: cuentas) 
			if(aux.getSaldo()<0) 
				total+=aux.getSaldo();
			return Math.abs(total);
	}
	public void listarCuentas(){
		Collections.sort(cuentas);
		System.out.println("DNI" + "\t\t" + "Saldo");
		for(Cuenta aux:cuentas )
			System.out.println(aux);
	}

}
