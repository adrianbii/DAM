package ED;

public class Multiplica {
	
		public static int multiplica1_5() {
		int producto = 1;
		for (int inicial = 1; inicial < 5; inicial++)
		producto = producto * inicial;
		return producto;
		}
		public static void main(String[] args) {
		System.out.println("valor del producto de 1 a 5 es : " +
		multiplica1_5());
		}
		}



