package JuegoFrases.controller;

import java.util.Scanner;


public class ControllerGame {
    
   
    public static void main(String[] args){

        Usuario[] matrizUsuarios;

        while (valor != 4) {
			valor = grabarMenu();
            int n=10;




            
			switch (valor) {
			case 1:

            System.out.println("Añadiendo nuevo usuario");
            matrizUsuarios[n]=grabaUsuario();
            break;

            case 2:
             String User;
             matrizUsuarios[--n]=null;
             System.out.println("Se ha eliminado la ultima persona de la lista");
             
            break;

            case 3:
            int posicion = buscaUser(buscaUser, matrizUsuarios, n);

					if (posicion == -1) {
						System.out.println("Usuario no encontrada!");
					} else {
						MatrizPersonas[posicion].grabaUsuario();
						/*MatrizPersonas[posicion].VerDatosPersona();*/
					}
            break;

            case 4:
           
            break;

            case 5:
            valor=5;
            System.out.println("Saliendo del programa");
            break;

            default:
            System.out.println("¡Opcion no encontrada!");
        
        }
    }

    }

    public static int grabarMenu() {

		Scanner in = new Scanner(System.in);
		System.out.println("Elige una opción ");
		System.out.println("----------------------------------------------");
		System.out.println("1. Añadir persona ");
		System.out.println("---------------------");
		System.out.println("2. Eliminar persona ");
		System.out.println("---------------------");
		System.out.println("3. Modificar datos ");
		System.out.println("----------------------");
		System.out.println("4. ver datos ");
		System.out.println("--------- -------------");
		System.out.println("5. Salir ");
		System.out.println(" ");
		System.out.println("----------------------");

		int value = in.nextInt();
		System.out.println();
		return value;
	}

    public static Usuario grabaUsuario() {
        Scanner input=new Scanner(System.in);

        String user, pass, pass1;

        System.out.println("Introduce el usuario");
        user=input.nextLine();

        do{
        System.out.println("Introduce la contraseña");
        pass=input.nextLine();


        System.out.println("Introduce de nuevo la contraseña");
        }while(!(pass(pass1)));

        Usuario usuario= new Usuario(user, pass);

        return usuario;

       }

    
}
