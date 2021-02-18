package T3;

import java.util.Scanner;

public class granja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.println("introduce 1 si es una empresa y 0 si es un particular");
        int b;
		b=input.nextInt();
		
		System.out.println("Cuantos kilos?");
		int k;
		k=input.nextInt();
		double precio=k*3.5;
		double descuento;
		if(b==0) {
			
			if(k>=12) {
				descuento=precio*0.10;
				 System.out.println(" Es un particular, el importe en bruto es de "+precio+" el importe con descuento "+descuento+" el precio con iba"+descuento*0.21+"el importe total"+descuento*0.21);
			}
			if(k>=30) {
				descuento=precio*0.15;
				System.out.println(" Es un particular, el importe en bruto es de "+precio+" el importe con descuento "+descuento+" el precio con iba"+precio*0.21+"el importe total"+descuento*0.21);
			}
			if(k>=60) {
				descuento=precio*0.25;
				System.out.println(" Es un particular, el importe en bruto es de "+precio+" el importe con descuento "+descuento+" el precio con iba"+precio*0.21+"el importe total"+descuento*0.21);
			}
			if(k>=120) {
				descuento=precio*0.40;
				System.out.println(" Es un particular, el importe en bruto es de "+precio+" el importe con descuento "+descuento+" el precio con iba"+precio*0.21+"el importe total"+descuento*0.21);
			}
			 System.out.println(" Particular");
		}else {
			if(k>=10) {
				descuento=precio*0.10;
				System.out.println(" Es una empresa, el importe en bruto es de "+precio+" el importe con descuento "+(precio-descuento)+" el precio con iba"+(precio-descuento)*0.21);
			}
			if(k>=25) {
				descuento=precio*0.15;
				System.out.println(" Es una empresa, el importe en bruto es de "+precio+" el importe con descuento "+descuento+" el precio con iba"+precio*0.21+" el importe total"+descuento*0.21);
			}
			if(k>=50) {
				descuento=precio*0.25;
				System.out.println(" Es una empresa, el importe en bruto es de "+precio+" el importe con descuento "+descuento+" el precio con iba"+precio*0.21+" el importe total"+descuento*0.21);
			}
			if(k>=100) {
				descuento=precio*0.40;
				System.out.println(" Es una empresa, el importe en bruto es de "+precio+" el importe con descuento "+descuento+" el precio con iba"+precio*0.21+" el importe total"+descuento*0.21);
			}
			 System.out.println(" Empresa");
		}
	}

}
