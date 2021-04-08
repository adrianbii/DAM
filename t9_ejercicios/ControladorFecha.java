package t9_ejercicios;

import java.text.ParseException;

public class ControladorFecha {

	public static void main(String[] args) throws ParseException {
		
		Fecha fecha= new Fecha(30,05,1997);
		Fecha[] fechas=new Fecha[2];
		/*
		fecha.DiaSemana(30, 5, 1997);
		fecha.EsFechaCorrecta();
		fecha.DiaSiguiente(20, 05, 1997);
		fecha.Verfecha();
		fecha.MesSiguiente();
		fecha.AvanzaDias(90);
		fecha.FechaMayor();
		System.out.println(fecha.FechaMayor());
		fecha.FechaMenor();
		System.out.println(fecha.FechaMenor());
		fecha.FechaIgual();
		System.out.println(fecha.FechaIgual());
		*/
		arrayFechas(fechas);
		
	}
	public static void arrayFechas(Fecha[] fechas) throws ParseException {
		Fecha fecha= new Fecha();
		for (int i=0; i>fechas.length; i++) {
			//fecha.ArrayFechas[i]=;
		}
	}

}
