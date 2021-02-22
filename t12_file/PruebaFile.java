package t12_file;

import java.io.FileNotFoundException;

public class PruebaFile {

	public static void main(String[] args) throws java.io.IOException {

		java.io.File fichero = new java.io.File("src/t12_file/misArchivos/prueba.txt");
		if (fichero.exists()) {
			System.out.println("El fichero ya existe");
			System.exit(0);
		} else {
			System.out.println("el fichero no existe");
		}

		// crear fichero

		java.io.PrintWriter salida = new java.io.PrintWriter(fichero);
		int pasta = 10;
		String c = "ESTO ES UNA CADENA";

		// ESCRIBIR SALIDA FORMATEADA EN EL ARCHIVO

		salida.write(c);
		salida.print(" Adrian Benitez");
		salida.println(95);
		salida.print(" Holaaaa ");
		salida.append(" otra cadena ");
		salida.write(" y otra");
		
		//cerrar fichero
		salida.close();
	}

}
