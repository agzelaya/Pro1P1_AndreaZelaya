package pro1p1_andreazelaya;

import java.util.Random;

public class metodosRecursion {

    /*como base case uso el length del string binario(que es un string para evitar
    evitar problemas con los 0). cuando el length del string sea 1, solo retornara el
    int que este en esa posicion. en el else, se vuelve a llamar al metodo pero sin
    el valor en la posicion en zero, es decir, se acorta por un caracter y a eso se
    le suma el valor en la posicion zero multiplicado por 2 elevado a la posicion en la que 
    esta*/
    public static int binarioAdecimal(String binario) {
        int length = binario.length();

        if (length == 1) {
            return Integer.parseInt(binario);
        } else {
            return (int) (binarioAdecimal(binario.substring(1, length))
                    + Integer.parseInt(binario.substring(0, 1))
                    * Math.pow(2, length - 1));
        }
    }

    /*
    como el caso base se toma al numero ingresado. cuando este llegue a 0, el metodo va a retornar 0.
    mientras no sea 0, se toma el residuo de num entre 2 y se le suma la multiplicacion de 10 por la llamada del
    metodo y num entre 2. eventualmente num sera 0.5 o 0, lo que hara que el metodo vaya terminando.
     */
    public static int decimalAbinario(int num) {
        if (num == 0) {
            return 0;
        } else {
            return (num % 2 + 10 * decimalAbinario(num / 2));
        }
    }

    

}
