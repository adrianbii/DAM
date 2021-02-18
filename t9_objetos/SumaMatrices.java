package t9_objetos;

public class SumaMatrices {
	public static void main (String[] args) {
		
		int matriz1 [][]= new int [3][3];
		int matriz2 [][]= new int [3][3];
		int matriz3 [][]= new int [3][3];
		
		for (int i=0; i<matriz1.length; i++) {
			System.out.println(" ");
			for (int j=0; j<matriz2.length; j++) {
				matriz1[i][j]= (int) (Math.random() * 5);
				System.out.println(" ["+matriz1[i][j]+" ]");
				
			}System.out.println(" ");
		}
		
		for (int i=0; i<matriz1.length; i++) {
			System.out.println(" ");
			for (int j=0; j<matriz2.length; j++) {
				matriz2[i][j]= (int) (Math.random() * 5);
				System.out.print(" ["+matriz2[i][j]+" ]");
			}System.out.println(" ");
			
		}
		
		//imprimir matrices
		for (int i=0; i<matriz1.length; i++) {
		System.out.println(" ");
			for( int j=0; j<matriz1.length; j++) {
				matriz3[i][j]=  matriz1[i][j]*matriz2[i][j];
				System.out.print(" ["+matriz3[i][j]+" ]");
				
			}System.out.println(" ");
		}
	}
}
