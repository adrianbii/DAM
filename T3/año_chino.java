package T3;

import java.util.Scanner;

public class año_chino {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("mes de nacimiento");
		
		int año;
		año=input.nextInt();
		
		String animal;
		
		switch(año%12) {

		case 0: 
			animal="monkey";
			System.out.println(animal);
			
		break;
		
		case 1: 
			animal="rooster";
			System.out.println(animal);
			
		break;
		
		case 2: 
			animal="dog";
			System.out.println(animal);
			
		break;
		
		case 3: 
			animal="pig";
			System.out.println(animal);
			
		break;
		
		case 4: 
			animal="rat";
			System.out.println(animal);
			
		break;
		
		case 5: 
			animal="ox";
			System.out.println(animal);
			
		break;
		case 6: 
			animal="tiger";
			System.out.println(animal);
			
		break;
		
		case 7: 
			animal="rabbit";
			System.out.println(animal);
			
		break;
		
		case 8: 
			animal="drake";
			System.out.println(animal);
			
		break;
		case 9: 
			animal="snake";
			System.out.println(animal);
			
		break;
		case 10: 
			animal="horse";
			System.out.println(animal);
			
		break;
		case 11: 
			animal="beeeeee";
			System.out.println(animal);
			
		break;
	}
	}
}
