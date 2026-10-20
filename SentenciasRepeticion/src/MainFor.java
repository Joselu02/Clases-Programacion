import java.util.Scanner;

public class MainFor {
    public static void main(String[] args) {
        /*
        for(inicio;final;incremento)
        {
        }
         */
        // (0 1 2 3 4 5)
        Scanner lector = new Scanner(System.in);
        // System.out.println("Indica el numero para ver su tabla");
        int numero = 10; // 8
        if (numero < 0) {
            System.out.println("Numero negativo, no se puede");
        } else {
            // sacar las tablas de multiplicar del 0 al 10
            for (int i = 0; i <= 10; i++) {
                System.out.println("\nTabla del " + i);
                for (int j = 0; j <= 10; j++) {
                    System.out.printf("\tLa multiplicacion del %d * %d = %d\n",i,j,i*j);
                }
            }
        }
    }
}