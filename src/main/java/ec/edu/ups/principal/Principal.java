package ec.edu.ups.principal;

import ec.edu.ups.ejercicios.PotenciaDeNumero;
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

            switch(opcion){
                case 1:
                    System.out.print("------ EJERCICIO [1] - SUMA CONSECUTIVOS\nNumero: ");
                    numero = scanner.nextInt();
                    SumaEnterosConsecutivos sumaEnterosConsecutivos = new SumaEnterosConsecutivos();
                    resultado = sumaEnterosConsecutivos.sumaEnterosConsecutivos(numero);
                    System.out.println(" 0 = "+resultado);
                    break;
                case 2:
                    System.out.print("------ EJERCICIO [2] - POTENCIA\nBase: ");
                    numero = scanner.nextInt();
                    int exponente = 0;
                    System.out.print("Exponente: ");
                    exponente = scanner.nextInt();
                    PotenciaDeNumero potenciaDeNumero = new PotenciaDeNumero();
                    resultado = potenciaDeNumero.potenciaDeNumero(numero, exponente);
                    System.out.println(numero+" ^ "+exponente+" = "+resultado);

                    break;
                case 3:
                    System.out.print("------ EJERCICIO [3] - SUMA DIGITOS NUMERO\nNumero: ");
                    numero = scanner.nextInt();
                    SumaDigitosNumero sumaDigitosNumero = new SumaDigitosNumero();
                    resultado = sumaDigitosNumero.sumaDigitosNumero(numero);
                    System.out.println(resultado);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }while(opcion != 4);


    }
}
