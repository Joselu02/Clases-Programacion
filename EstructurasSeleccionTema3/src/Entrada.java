import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        System.out.println("Programa para la explicacion de sentencias");
        System.out.println("Sentencia if");
        Scanner lector = new Scanner(System.in);


        /*System.out.println("Introduce el pin");
        int pin = lector.nextInt();
        lector.close();

        boolean acierto = true;
        if (pin<0 || pin>9999){
            System.out.println("El pin no tiene formato valido");
        } else if (pin == 1234) {
            System.out.println("Pin correcto");
            System.out.println("Procedemos a operar en banca");
        } else if (pin == 0000) {
            System.out.println("Usuario en modo admin");
            System.out.println("Procedemos a realizar verificaciones");
        } else {
            System.out.println("Usuario incorrecto");
            System.out.println("La cuenta queda bloqueda");
        }*/
        //if ternario
        System.out.println("introduce el pin");
        int pin = lector.nextInt(); //pin de 4 digitos
        String mensaje = pin >=0  && pin <=9999 ? "Numero valido" : "Numero invalido";
        System.out.println(mensaje);

        //System.out.println("Numero invalido"); //si no tiene 4
        //System.out.println("Numero valido"); //si tiene 4


        System.out.println("Terminando la operativa del banco");
    }
}

