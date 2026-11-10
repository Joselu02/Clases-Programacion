//

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Cuantos estudiantes hay en clases");
            int nEstudiantes = scanner.nextInt();
            int[]calificaciones = new int[5];
            int posicion = 0;
            /*while (posicion < nEstudiantes) {
                calificaciones[posicion] = scanner.nextInt();
                posicion++;
            }
             */
            for (int i = 0; i < calificaciones.length; i++) {
                System.out.println("Ingrese el valor de la calificacion: ");
                calificaciones[i] = scanner.nextInt();
            }

          /* for (int item : calificaciones) {
                System.out.println(item+" ");
            }

           */

           /*for (int i = 0; i < calificaciones.length; i++) {
                System.out.println(calificaciones[i]);
            }
            */

            System.out.println(Arrays.toString(calificaciones));

            int totalCalificaciones = 0, nAprobados = 0, nAlta = calificaciones[0], nBaja = calificaciones[0];
            for (int item : calificaciones) {
                totalCalificaciones += item;
                //totalCalificaciones = totalCalificaciones + item;

               /* if (item >= 5){
                    nAprobados++;
                }

                */
                nAprobados = item >=5 ? nAprobados+1 : nAprobados;

                /*if (item > nAlta) {
                    nAlta = item;
                }

                 */
                nAlta = item > nAlta ? item : nAlta;
                //nAlta = Arrays.stream(calificaciones).max().getAsInt();

                /*if (item < nBaja) {
                    nBaja = item;
                }

                 */
                nBaja = item < nBaja ? item : nBaja;
               // nBaja = Arrays.stream(calificaciones).min().getAsInt();

            }
            //double media = Arrays.stream(calificaciones).asDoubleStream().average().getAsDouble(); //lo veremos mas adelante
            System.out.println("La media de las calificaciones es: " + (double) totalCalificaciones / nEstudiantes);
            System.out.println("El numero de aprobados es: " + nAprobados);
            System.out.println("La calificacion maxima es: " + nAlta);
            System.out.println("La calificacion minima es: " + nBaja);

        }catch (Exception e){
            System.out.println("Error en el programa");
        }
    }
}
