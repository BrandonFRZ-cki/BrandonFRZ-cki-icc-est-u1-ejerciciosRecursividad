package ec.edu.ups.ejercicios;

public class SumaEnterosConsecutivos {
    public int llamadasRecursivas=1;
    public int sumaEnterosConsecutivos(int numero) {
        int idActual = llamadasRecursivas++;
        if(numero == 1){
            System.out.println("Llamada "+idActual +" con numero caso base alcanzado n = 1");
            System.out.println(numero);
            return 1;
        }else{
            System.out.println("Llamada "+idActual +" con numero = "+(numero-1));
            int resultadoParcial = sumaEnterosConsecutivos(numero-1);
            int resultado = numero + resultadoParcial;
            System.out.println("Llamada "+idActual +" sumando "+numero+" Resultado de  = "+resultado);

            return resultado;

        }
        /*
        if(numero == 0){
            return 0;
        }else{
            System.out.print(numero +" + ");
            return numero + sumaEnterosConsecutivos(numero-1);
        }
        */
    }
}
