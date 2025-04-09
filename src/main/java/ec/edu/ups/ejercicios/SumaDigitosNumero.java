package ec.edu.ups.ejercicios;

public class SumaDigitosNumero {
    public int sumaDigitosNumero(int numero) {
        if(numero<10){
            return numero;
        }else{
            return (numero%10)+ sumaDigitosNumero(numero/10);

        }
    }
}
