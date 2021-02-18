package t9_objetos;

public class testLoan {

	public static void main(String[] args) {
		Loan adri= new Loan(2.5, 2, 20000);
		
		System.out.println(" La cantidad total a pagar es: "+adri.getTotalPayment()+"el interes mensual "+adri.getTotalPayment()/12);

	}

}
