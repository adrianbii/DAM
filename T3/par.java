package T3;

import java.util.Scanner;

public class par {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int i;
		i=input.nextInt();
		
	
		if(i%2==0) {
			 System.out.println(" El numero es par");
		}else {
			 System.out.println(" El numero es impar");
		}
		//MULTIPLOS
		if(i%2==0) {
			System.out.println(" HiEVEN");
		}
		if (i%5==0){
			System.out.println("HiFIVE");
		}
	}

}
