package t6;

import java.util.Scanner;

public class Ej_array {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 3, 5, 7, 9, 8, 1 };
		/*
		 * Ej_array.nmayor(arr); Ej_array.nmenor(arr); Ej_array.verArray(arr);
		 */
		Ej_array.copyarr(arr);
	}

	public static int nmayor(int[] arr) {

		int m = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > m)
				m = arr[i];
		}
		System.out.println(" El numero mayor" + m);
		return m;

	}

	public static void verArray(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			System.out.println(arr[i] + ", ");
		}
	}

	public static void nmenor(int[] arr) {

		int m = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < m)
				m = arr[i];

		}
		System.out.println("Numero menor " + m);
	}

	public static void copyarr(int[] arr) {

		int[] arr2 = arr;

		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cuanto quiere ampliar el array");

		int x = entrada.nextInt();
		int[] arr1 = {};

		// ahora aqui tendria que borrar el array y volcar arr2 a un nuevo arr1. Para
		// simularlo lo voy a volcar a uno nuevo

		// int[] ext=arr[20];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr2[i] + ", ");
		}

		System.out.println("Y ahora el ext ");

		for (int i = 0; i < arr.length; i++) {
			arr1[i] = (int) Math.random() * 100;
			System.out.println(arr1[i] + ", ");
		}
	}

}
