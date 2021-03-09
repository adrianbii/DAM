package t12_ejercicios;

import java.util.Scanner;

public class Ejercicio2_T12 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		Companeros clase= new Companeros();
		Companeros[][] arr= new Companeros[5][1];
		
		for (int i=0; i<arr.length; i++) {
			
			for (int j=0; j<5; j++) {
				
				clase.leerCompas();
			}
		}
		
		
		
		for (int i=0; i<arr.length; i++) {
			
			for (int j=0; j<arr.length; j++) {
				System.out.println(arr[i][j]);
			}

	}
	}
}
