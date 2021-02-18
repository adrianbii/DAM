package miException2;

public class AplicacionCirculo {

 public static void main(String[] args) {
   try {
     Circulo c1 = new Circulo(5);
     c1.setRadius(-5);
     Circulo c3 = new Circulo(0);
   }
   catch (ExcepcionRadioInvalido ex) {
     System.out.println(ex);
   }

   System.out.println("Numero de objetos creado: " +
    Circulo.getNumeroObjetos());
 }
}

