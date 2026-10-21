/*
Simúlese el lanzamiento de un dado. Se introducirá el número de veces que se lanza el dado (de no ser positivo, se establecerá a 100) y se mostrará el resumen de los lanzamientos. Se mostraán cuantas veces ha salido cada número. (Dado)
 */
package ejerciciosfor;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantas veces quieres tirar el dado");
        int veces = lector.nextInt();
        //de no ser positivo, se establecera en 100
        if (veces <=0) {
            veces = 100;
        }
        //simular 100 tiradas
        int vecesCara1=0, vecesCara2=0, vecesCara3=0, vecesCara4=0, vecesCara5=0, vecesCara6=0;
        for (int i = 0; i < veces; i++) {
            // dado entre 1 y 6
            //Random aleatorio = new Random();
            //System.out.println((aleatorio.nextInt(6)+1)+""); // elige entre este o el de abajo
            //System.out.println((int)(Math.random()*6)+1);
            int aleatorio = (int) (Math.random()*6)+1;
            switch (aleatorio) {
                case 1 -> vecesCara1++;
                case 2 -> vecesCara2++;
                case 3 -> vecesCara3++;
                case 4 -> vecesCara4++;
                case 5 -> vecesCara5++;
                case 6 -> vecesCara6++;
            }
        }
        System.out.println("El numero de veces que ha salido la cara 1 es "+vecesCara1);
        System.out.println("El numero de veces que ha salido la cara 2 es "+vecesCara2);
        System.out.println("El numero de veces que ha salido la cara 3 es "+vecesCara3);
        System.out.println("El numero de veces que ha salido la cara 4 es "+vecesCara4);
        System.out.println("El numero de veces que ha salido la cara 5 es "+vecesCara5);
        System.out.println("El numero de veces que ha salido la cara 6 es "+vecesCara6);
    }
}
