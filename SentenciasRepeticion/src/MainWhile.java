import java.util.Scanner;

public class MainWhile {
    public static void main(String[] args) {

        int i = 5;
        while (i>0){
            System.out.println("Imprimo");
            i--;
        }

        int j = 10;
        do{
            System.out.println("Imprimo");
            j--;
        }while( j>0);

        Scanner lector = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("1 - Opcion 1");
            System.out.println("2 - Opcion 2");
            System.out.println("3 - Opcion 3");
            System.out.println("4 - Salir");
            System.out.println("Indica opcion");
            opcion = lector.nextInt();
            switch(opcion){
                case 1 -> System.out.println("Opcion 1");
                case 2 -> System.out.println("Opcion 2");
                case 3 -> System.out.println("Opcion 3");
            }

        }while(opcion!=4);
    }
}
