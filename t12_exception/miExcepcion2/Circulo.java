package t12_exception.miExcepcion2;

public class Circulo {

 private double radio;

 private static int numeroObjetos = 0;

 public Circulo() {
   this(1.0);
 }
 
 public Circulo(double nuevoRadio) {
   try {
     setRadius(nuevoRadio);
     numeroObjetos++;
   }
   catch (ExcepcionRadioInvalido ex) {
     ex.printStackTrace();
   }
 }

 public double getRadius() {
   return radio;
 }

 public void setRadius(double nuevoRadio) throws ExcepcionRadioInvalido {
   if (nuevoRadio >= 0)
    radio =  nuevoRadio;
   else
     throw new ExcepcionRadioInvalido(nuevoRadio);
 }

 public static int getNumeroObjetos() {
   return numeroObjetos;
 }

 public double darArea() {
   return radio * radio * 3.14159;
 }
}
