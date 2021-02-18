package t9_objetos;

import java.util.Arrays;

public class Pila {
	private int tamano;
	private Usuario[] elementos= new Usuario[tamano];
	
	public Pila (int capacidad) {
		
		elementos= new Usuario[capacidad];
	}
	
	public boolean vacia(Usuario[] elementos) {
		
	
			
			return elementos != null;	}
	
	public void verElemento (Usuario[] elementos) {
		for(int i=0; i<tamano; i++) {
			System.out.println(elementos[i]);
		}
		
	}
	
	public void addElement(Usuario value) {
		
	
		if( tamano>= elementos.length ) {
			Usuario[] temp= new Usuario[elementos.length * 2]; // aqui creamo el objeto que queramos apilar
			
			System.arraycopy(elementos, 0, temp, 0, elementos.length);
			elementos=temp;
		}
		
		elementos[tamano++]= value;
	}

	
	@Override
	public String toString() {
		return "Pila [tamano=" + tamano + ", elementos=" + Arrays.toString(elementos) + ", toString()="
				+ super.toString() + "]";
	}

	public int getTamaño() {
		return tamano;
	}

	public void setTamaño(int tamano) {
		this.tamano = tamano;
	}

	public Usuario[] getElementos() {
		return elementos;
	}

	public void setElementos(Usuario[] elementos) {
		this.elementos = elementos;
	}



}
