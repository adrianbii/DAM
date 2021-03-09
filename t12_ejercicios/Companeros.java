package t12_ejercicios;

import java.util.Scanner;

public class Companeros {
	
	String nombre;
	Scanner input=new Scanner(System.in);
	
	public Companeros () {}
	public Companeros (String nombre) {
		this.nombre=nombre;
	}
	
public void leerCompas () {
	System.out.println("introduce el nombre");
	this.nombre=input.nextLine();
}
	
}
