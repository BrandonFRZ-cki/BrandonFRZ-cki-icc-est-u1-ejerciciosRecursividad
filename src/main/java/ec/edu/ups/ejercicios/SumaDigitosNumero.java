package ec.edu.ups.ejercicios;

public class SumaDigitosNumero {
    public int sumaDigitosNumero(int numero) {
        if(numero<10){
            return numero;
        }else{
            return (numero%10)+ sumaDigitosNumero(numero/10);

        }

        /*
        * numero = 256
        * resultado= 13
        *
        * Prueba Escritorio
        *
        *   256 % 10 = 6
        *   6 + (25 % 10)
        *       25 % 10 = 5     el numero sin el 6 se saca con una division entera numero/10
        *   6 + 5 + (2 < 10)
        *   6 + 5 + 2
        *   13
         */
    }
}
