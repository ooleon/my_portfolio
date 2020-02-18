package practica.basica;
/**
4. Programa que crea un array de 20 elementos llamado Pares y guarde los 20 primeros números pares. Mostrar por pantalla el contenido del array creado. 
*/
/*
 * Programa que crea un array de 20 elementos
 * llamado Pares y guarde los 20 primeros
 * números pares.
 * Mostrar por pantalla el contenido
 * del array creado
 */
import java.util.*;
public class ArrayPares1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i, cont = 2;

        int[] pares = new int[20];

            //Llenamos el array con números pares. Utilizamos un contador
        //con valor inicial 2 y le sumamos dos en cada iteración.
        for (i = 0; i < pares.length; i++) {
            pares[i] = cont;
            cont += 2;
        }
         
            //Mostrar el array
        for (i = 0; i < pares.length; i++) {
            System.out.println(pares[i]);
        }
    }
}




