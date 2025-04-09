package ec.edu.ups.ejercicios;

public class PotenciaDeNumero {
    public int potenciaDeNumero(int numero, int exponente) {
        if(exponente == 0){
            return 1;
        }else{
            return numero * potenciaDeNumero(numero, exponente-1);
        }
    }
}
