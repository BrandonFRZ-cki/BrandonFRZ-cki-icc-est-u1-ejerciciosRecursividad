package ec.edu.ups.principal;

import ec.edu.ups.ejercicios.SumaDigitosNumero;
import ec.edu.ups.ejercicios.SumaEnterosConsecutivos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int numero = 0;

        do{
            System.out.println("\n-------- MENU DE EJERCICIOS -------\n1. Suma de enteros consecutivos\n2. Potencia de un numero\n3. Suma de dijitos de un numero\n4. Salir");
            System.out.print  ("-----------------------------------\nOpcion: ");
            opcion = scanner.nextInt();
            int resultado = 0;
            System.out.print("Numero: ");
            numero = scanner.nextInt();
            switch(opcion){
                case 1:
                    SumaEnterosConsecutivos sumaEnterosConsecutivos = new SumaEnterosConsecutivos();
                    resultado = sumaEnterosConsecutivos.sumaEnterosConsecutivos(numero);
                    System.out.println("Suma consecutivos = "+resultado);
                    break;
                case 2:
                    //Potencia
                    break;
                case 3:
                    //SumaDigitos
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }while(opcion != 4);


    }
}
