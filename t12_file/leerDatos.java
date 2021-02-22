package t12_file;

import java.io.File;
import java.util.Scanner;

public class leerDatos {

	public static void main(String[] args) {


		java.io.File fichero = new java.io.File("punto.txt");
		
		//crear un scanner paara el archivo
		
		Scanner input = new Scanner(System.in);
//leer datos de un archivo
		
		while (input.hasNext()) {
			String nombre=input.next();
			String primerApellido = input.next();
			String segundoApellido = input.next();
			int punto = input.nextInt();
			
			System.out.println(nombre + " "+ primerApellido+" "+segundoApellido+" "+punto);
		}
		
		//cerrar fichero
		input.close();
		}
	}


