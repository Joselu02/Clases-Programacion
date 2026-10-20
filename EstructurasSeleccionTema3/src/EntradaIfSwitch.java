import java.util.Scanner;

public class EntradaIfSwitch {
    public static void main(String[] args) {
        System.out.println("Programa para la explicacion de sentencias");
        System.out.println("Sentencia if");
        Scanner lector = new Scanner(System.in);


        System.out.println("Introduce el pin");
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
        }
        //if ternario
        System.out.println("introduce el pin");
        //int pin = lector.nextInt(); //pin de 4 digitos
        String mensaje = pin >=0  && pin <=9999 ? "Numero valido" : "Numero invalido";
        System.out.println(mensaje);

        //System.out.println("Numero invalido"); //si no tiene 4
        //System.out.println("Numero valido"); //si tiene 4

        System.out.println("Terminando la operativa del banco");


    }
}



/*import java.util.Scanner;

public class MainSwitch {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = 20;
        String correo = "null";
        correo = numero<20 ? null: "borja@gmail.com";
        System.out.println( correo == null ? "vacio" : correo);
        if (correo == null){
            System.out.println("Vacio");
        } else {
            System.out.println(correo);
        }
        /*
        System.out.println("Indica el numero que quieres evaluar");
        int numero = lector.nextInt();
        String mensaje;
        switch (numero) {
            // aqui no escribas NADA
            // int dato = 0;
            // System.out.println("asdasd");
            case 1:
                // haz lo que quieras
                System.out.println("Variable con valor 1");
                mensaje = "opcion 1";
                break;
            case 2:
                System.out.println("Variable con valor 2");
                mensaje = "opcion 2";
                break;
            case 3:
                System.out.println("Variable con valor 3");
                mensaje = "opcion 3";
                break;
            case 4:
                System.out.println("Variable con valor 4");
                mensaje = "opcion 4";
                break;
            case 5,6,7,8,9:
                System.out.println("Variable con valor conjunto");
                mensaje = "opcion conjunta";
                break;
            default:
                System.out.println("Variable no contemplada");
                mensaje = "no contemplado";
        }
        System.out.println("El mensaje es "+mensaje);*/
        /*
        System.out.println("Introduce nombre");
        String nombre = lector.next();
        String mensaje = null;
        switch (nombre) {
            // no escribas nada aqui
            case "Borja" -> {
                mensaje = "nombre borja";
                System.out.println("El nombre introducido es Borja");
            }
            case "Maria" -> {
                int dato = 10;
                mensaje = "nombre maria";
                System.out.println("El nombre introducido es Maria");
            }
            case "Juan","Pepe" -> {
                int dato = 10;
                mensaje = "nombre conjunto";
                System.out.println("El nombre introducido es conjunto");
            }
            default -> {
                mensaje = "nombre sin contemplar";
                System.out.println("Nombre no contemplado");
            }
        }
        System.out.println(mensaje);

         */
        /*
        boolean acierto = true;
        switch (acierto){
            case true->{}
            case false -> {}
        }

         */
        /*
        System.out.println("1. Opcion 1");
        System.out.println("2. Opcion 2");
        System.out.println("3. Opcion 3");
        System.out.println("4. Opcion 4");
        System.out.println("Que opcion quieres realizar");
        int opcion = lector.nextInt();
        switch (opcion){
            case 1->{}
            case 2->{}
            case 3->{}
            case 4->{}
        }


        System.out.println("Indicame la calificacion");
        char calificacion = lector.next().toUpperCase().charAt(0); // "A" -> 'A'
        String mensaje = null;
        switch (calificacion) {
            case 'A' -> {
                mensaje = "Excelente";
            }
            case 'B' -> {
                mensaje = "Muy bien";
            }
            case 'C' -> {
                mensaje = "Bien";
            }
            case 'D' -> {
                mensaje = "Suficiente";
            }
            case 'F' -> {
                mensaje = "Suspenso";
            }
            default -> {
                mensaje = "sin calificar";
            }
        }
        System.out.println("La calificacion es "+mensaje);
        System.out.println("Terminada la evaluacion");

    }
}
         */