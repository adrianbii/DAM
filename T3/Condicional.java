package T3;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double v1=Math.random()*10;
		double v2=Math.random()*10;
		Scanner input = new Scanner(System.in);
        System.out.println("Cuanto suman"+v1+ "+"+v2);
        int i;
		i=input.nextInt();
		if(i==v1+v2) {
			System.out.println("Es correcto");
	}else {
		System.out.println("No es correcto");
	}

}
}
