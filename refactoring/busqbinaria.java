package refactoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class busqbinaria {
	
	static int[] lista;
	static int tam;

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

	public static int leerNumero() {
		int num;
		String cad = "";

		do {
			cad = leercadena();
			num = Integer.parseInt(cad);
		} while (num <= 0);
		return num;
	}
	
	public static void leer_total() {
		System.out.print("Cantidad: ");
		tam = leerNumero();
		lista = new int[tam];
	}

	
	
	public static void result(int pos) {
		if (pos >= 0) {
			System.out.println("Está en la posición " + pos + "ª");
		} else {
			System.out.println("No está en lista");
		}
	}

	private static int search(int[] lista, int tam, int num) {
		int pos;
		int inf;
		int centro;
		int sup;
		pos = -1;
		inf = 0;
		sup = tam - 1;
		while ((inf <= sup) && (pos < 0)) {
			centro = (sup + inf) / 2;
			if (lista[centro] == num)
				pos = centro + 1;
			else if (num < lista[centro]) {
				sup = centro - 1;
			} else {
				inf = centro + 1;
			}
		}
		return pos;
	}

	private static void load(int[] lista, int tam) {
		int i;
		for (i = 0; i < tam; i++) {
			System.out.print("¿Elemento " + (i + 1) + "º? ");
			lista[i] = leerNumero();
		}
	}

	private static void order(int[] lista, int tam) {
		int i;
		int j;
		int aux;
		for (i = 0; i < tam; i++) {
			for (j = i + 1; j < tam; j++) {
				if (lista[i] > lista[j]) {
					aux = lista[i];
					lista[i] = lista[j];
					lista[j] = aux;
				}
			}
		}
	}
	
public static void main(String[] args) {

		
		int pos = 0;
		
		leer_total();
		load(lista, tam);
		order(lista, tam);


		System.out.print("¿Número a buscar? ");
		int num = leerNumero();

//búsqueda binaria
		pos = search(lista, tam, num);
		

	}

}
