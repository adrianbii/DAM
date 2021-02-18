package t9_objetos;

public class principalCoche {

	public static void main(String[] args) {
		
		Coche[] arrayCoches= new Coche[3];
		
		arrayCoches[0] =new Coche("adsvavad","adcvsdav","avav","affdv");
		arrayCoches[1] =new Coche("adsvavad","adcvsdav","avav","affdv");
		arrayCoches[2] =new Coche("adsvavad","adcvsdav","avav","affdv");
		
		for (int i=0; i<arrayCoches.length; i++) {
			System.out.println(arrayCoches[i].toString());
		}
		
		
	}

}
