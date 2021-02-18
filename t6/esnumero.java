package t6;

public class esnumero {


		public static boolean esnumero(String cad) {

			   int cont=0;

			        for(int j=0;j<cad.length();j++) {

			              if (cad.charAt(j)=='.') {cont++;}

			        }

			       if (cont>1) {return false;}

			       for(int i=1;i<cad.length();i++) {

			           if (!(((cad.charAt(i)>='0') &&(cad.charAt(i)<='9'))||(cad.charAt(i)=='.'))) {return false;}

			        }

			        if (!((cad.charAt(0)=='+')||(cad.charAt(0)=='-')||((cad.charAt(0)>='0')&&(cad.charAt(0)<='9')))) { 

			            return false;

			         }

			         return true;

			}
	}


