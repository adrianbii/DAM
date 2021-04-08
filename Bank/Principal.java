package Bank;

public class Principal {

	public static void main(String[] args) {
		Bankonline adrian= new Bankonline ("44248538B","Adrian");
		
		adrian.ingresar(500);
		adrian.sacar(200);
		adrian.info();
		

	}

}
