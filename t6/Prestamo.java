package t6;

import java.util.Scanner;

public class Prestamo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
        System.out.println("Introduce la tasa de inter�s anual");
        int i;
		i=input.nextInt();
		
        System.out.println("Por cuantos a�os");
        int a;
		a=input.nextInt();
		
		System.out.println("Cantidad del pr�stamo");
        int p;
		p=input.nextInt();
		int panual=p/a;
		int pmensual= panual/12;
		System.out.println("la tasa mensual es de "+pmensual+"euros y la tasa anual es de "+panual);
	}

}
