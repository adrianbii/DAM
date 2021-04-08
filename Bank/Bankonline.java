package Bank;


public class Bankonline {
	private String dni;
	private String nombre;
	private double dinero;
	
	//Crear cuenta
	public Bankonline(String dni, String nombre) {
		this.dni=dni;
		this.nombre=nombre;
		this.dinero=0;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	//sacar dinero
		public void sacar (double retirar) {
			if (dinero>=retirar) {
				dinero=dinero-retirar;
			}else {
				System.out.println("no tienes dinero suficiente");
			}
		}
		
	//retirar dinero
		public void ingresar (double ingresar) {
			dinero=dinero+ingresar;
			
			System.out.println("Tu saldo actual es de: "+dinero);
		}
		
	//Info
		
		public void info(){
			System.out.println("Dni: "+dni+ "\nNombre: "+nombre+"\nTu saldo actual es de: "+dinero);
			
		}

}


