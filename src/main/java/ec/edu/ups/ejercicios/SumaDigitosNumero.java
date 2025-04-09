package ec.edu.ups.ejercicios;

public class SumaDigitosNumero {
    public int sumaDigitosNumero(int numero) {
        if(numero<10){
            System.out.print(numero + " = ");
            return numero;
        }else{
            System.out.print(numero%10 +" + ");
            return (numero%10)+ sumaDigitosNumero(numero/10);

        }
    }
}
