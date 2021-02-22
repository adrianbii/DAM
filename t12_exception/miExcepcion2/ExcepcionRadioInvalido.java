package t12_exception.miExcepcion2;

import java.lang.Exception;

public class ExcepcionRadioInvalido extends Exception{


ExcepcionRadioInvalido()
{
super("ExcepcionRadioInvalido/ El radio no debe ser negativo");
}

ExcepcionRadioInvalido(double nuevoRadio)
{
super("ExcepcionRadioInvalido/ El radio "+ nuevoRadio+" no debe ser negativo");
}
ExcepcionRadioInvalido(String mensaje)
{
super(mensaje);
}

}