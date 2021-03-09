package t12_ejercicios;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1_T12 {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double a=0;
		
		float b=0;
		try {
			System.out.println("Intrduce un double");
			a=input.nextDouble();
			System.out.println("Introduce un float");
			b=input.nextFloat();
			
		System.out.println(a/b);
		}catch (InputMismatchException e1) {
            System.out.println("Debe ingresar obligatoriamente un número double entre un float.");
        
		}catch(ArithmeticException e2) {
			System.out.println("No se puede dividir entre 0");
		}

	}

}

