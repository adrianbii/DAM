import java.util.Scanner;

public class Getnumber {

	public static void main(String[] args) {
		// Declaración
		 int num;
		 Scanner input = new Scanner(System.in);
         System.out.println("Get number:");
		 num=input.nextInt();
		 
	          int hora= num/3600;
	          int resto= hora % 3600;
	          int rest= num % 60;
	          int dias= hora/24;
	          
	          
	          System.out.println(num+"segundos son "+dias+"dias"+hora +" horas"+resto+" minutos y "+rest+"segundos");
	       
	        	 
	          
	}

}
