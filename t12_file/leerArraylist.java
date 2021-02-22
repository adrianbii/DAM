package t12_file;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class leerArraylist {

	public static void main(String[] args) throws IOException {

		// comprobar si existe el fichhero
		java.io.File fichero = new java.io.File("src/t12_file/misArchivos/array.txt");
		if (fichero.exists()) {
			System.out.println("El fichero ya existe");
			System.exit(0);
		} 
		// crear fichero

		java.io.PrintWriter salida = new java.io.PrintWriter(fichero);
		
		
		
		// MENU
		int valor = 0;
		while (valor != 3) {
			valor = crearMenu();
			switch (valor) {
			case 1:
				String nombre="adrian 10";
				salida.write(nombre);
				salida.print("Adriii Benitez 10");
				break;

			case 2:
				 nombre=" ";
				 salida.write(nombre);
				break;

			case 3:
				
				// Crear array
				ArrayList<String> notas = new ArrayList<String>();
				//notas.add("Adrian beni iglesias 10");
				//notas.add("que queso es 10");
				for (int i = 0; i < notas.size(); i++) {

					System.out.println(notas.get(i));
				}
				
				System.exit(0);
				break;
			}
		}
		//cerrar fichero
				salida.close();
	
				
	

	}

	public static int crearMenu() {
		// Menu
		Scanner in = new Scanner(System.in);
		System.out.println("Elige una opción ");
		System.out.println("----------------------------------------------");
		System.out.println("1. Añadir Nota ");
		System.out.println("----------------------");
		System.out.println("2. Eliminar Nota ");
		System.out.println("----------------------");
		System.out.println("3. Modificar datos ");
		System.out.println("----------------------");

		int value = in.nextInt();
		return value;
	}

}
