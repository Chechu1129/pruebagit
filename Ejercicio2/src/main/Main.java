package main;

import java.util.ArrayList;
import java.util.Collections;
public class Main {
	public static void main(String[] args) {
	Profecional chapatin= new Medico("Pepe", "Chapatin");
	Profecional cureta= new Cirujano("Pipo","Cureta" );
	Profecional muela= new Dentista("Paleta", "Muela");
	Profecional Colmillo= new Endodocista("Papa", "Colmillo");
	Profecional doctorine= new CirujanoCardioVascular("Corazao", "Doctorine");
	
	ArrayList<Profecional> listaProfecionales= new ArrayList<Profecional>();
	listaProfecionales.add(chapatin);
	listaProfecionales.add(cureta);
	listaProfecionales.add(muela);
	listaProfecionales.add(Colmillo);
	listaProfecionales.add(doctorine);
	System.out.println("/n Lista de profecionales /n");
	for(Profecional p: listaProfecionales)
		System.out.println(p);
	Collections.sort(listaProfecionales);
	System.out.println("/n Lista ordenada /n");
	for (Profecional p : listaProfecionales) {
		System.out.println(p);
	}
	}
}
