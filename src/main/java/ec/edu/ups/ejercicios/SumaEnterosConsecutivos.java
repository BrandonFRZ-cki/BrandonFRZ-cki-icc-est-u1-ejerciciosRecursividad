package ec.edu.ups.ejercicios;

public class SumaEnterosConsecutivos {
    public int sumaEnterosConsecutivos(int numero) {
        if(numero == 0){
            return 0;
        }else{
            System.out.print(numero +" + ");
            return numero + sumaEnterosConsecutivos(numero-1);
        }
    }
}
