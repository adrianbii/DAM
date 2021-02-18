package refactoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class refactor {

	public static String leercadena() {
		String cad = "";
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			cad = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cad;
	}

	public static int leernumero() {

		String cad = leercadena();
		return Integer.parseInt(cad);
	}

	
	public static void calculo1(int n) {
		
		n *= n;
	}
	
	public static int calculo2(int n) {
		
		return n*n*n;
	}
	
	public static int calculo3(int n) {
		
		n=n*n*n*n;
		return n;
	}
	
	public static void main(String[] args) {
		int opc = 0, num=0;
		String espera1, espera2, espera3;

		do {
			System.out.println("MENU PRINCIPAL\n\n");
			System.out.println("1.- Opci�n 1�");
			System.out.println("2.- Opci�n 2�");
			System.out.println("3.- Opci�n 3�");
			System.out.println("4.- Salir\n");
			System.out.print("Opci�n: ");
			opc = leernumero();
			switch (opc) {
				case 1:
					System.out.println("OPCI�N 1");
					System.out.print("�N�mero? ");
					num=leernumero();
					calculo1(num);
					System.out.println("El cuadrado es "+num);
					espera1 = leercadena();
					break;
				case 2:
					System.out.println("OPCI�N 2");
					System.out.print("Introducir un n�mero: ");
					num=leernumero();
					num=calculo2(num);
					System.out.println("El cubo es "+num);
					espera2 = leercadena();
					break;
				case 3:
					System.out.println("OPCI�N 3");
					System.out.print("�N�mero para calcular su potencia 4? ");
					num=leernumero();
					System.out.println("La potencia 4� es "+calculo3(num));
					espera3 = leercadena();
			}
		} while (opc != 4);
	}

}
