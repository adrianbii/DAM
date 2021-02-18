package t4;

import java.util.Random;


public class Algoritmo {

	public static void main(String[] args) {
		
        int cont=0;
        int media=0;
        int sum=0;
		
		
			//se puede crear e instaciar un array asi int[] intArray = new int;
		
			// Otra forma for (int i=0;i<arr.length;i++)
			int[] arr = new int[1000];
				
			 for (int i = 0; i < arr.length; i++) {
				 arr[i]= (int) (Math.random()*100); 
				 
				 sum+= arr[i];
			 }
				 media= sum / arr.length;
		
				 for (int i = 0; i < arr.length; i++) {
				 if (arr[i]>media) cont++;}
				 System.out.println(cont);
				 System.out.println(media);
			 
			
}





}
	