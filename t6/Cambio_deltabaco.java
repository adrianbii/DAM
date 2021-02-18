import java.util.Scanner;

public class Cambio_deltabaco {

	public static void main(String[] args) {
		
		// ERRORRES VARIOS
		
		Scanner input = new Scanner(System.in);
		System.out.println("Que cantidad quieres cambiar");
		
		double p;
		p=input.nextDouble();
		
		double dos=p/2;
		p=p%2;
		double un=p/1;
		p=p%1;
		double cin=p/0.5;
		p=p%0.5;
		double vei=p/0.2;
		p=p%0.2;
		double die=p/0.1;
		p=p%0.1;
		double ci=p/0.05;
		p=p%0.05;
		double d=p/0.02;
		p=p%0.02;
		double u=p/0.01;
		
		
		
		System.out.println("El cambio es de :"+un+"monedas de euros, "+dos+" monedas de 2 euros, "+cin+"modedas de 50 centimos, "+vei+"monedas de 20 centimos"+die+"mobedas de 10 centimos"+ci+"monedas de cinco centimos,"+d+"monedas de dos centimos"+u+" monedas de un centimos");
		
		
		
	}
}
