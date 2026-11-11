import java.util.Arrays;
import java.util.Scanner;

public class EjercicioBonoloto {
    public static void main(String[] args) {
        // [1,23,56,98,423] -> carton sistema

        //  pedir al usario 5 numeros y comprobar cuantos han
        //  sido acertados (numero y posicion)
        // [1,15,23,458,423] -> carton sistema
        
        int[] cartonSistema = new int[5];
        for (int i = 0; i < cartonSistema.length; i++) {
            int aleatorio = 0;
            do {
                aleatorio = (int) (Math.random() * 10)+1; // 5posicion 1,2,3,4
            } while (estaNumero(aleatorio, cartonSistema));
            // si esta en el carton -> saca otro aleatorio
            // si no esta en el carton ->
            cartonSistema[i] = aleatorio;
        }

        System.out.println("Carton del sistema "+Arrays.toString(cartonSistema));

        int[] cartonUsuario = new int[5];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < cartonUsuario.length; i++) {
                int numeroUsuario;
                do {
                    System.out.println("Introduce el numero de usuario: "+(i+1));
                    numeroUsuario = scanner.nextInt();
                } while (estaNumero(numeroUsuario, cartonUsuario) || numeroUsuario > 10 || numeroUsuario < 1);
                cartonUsuario[i] = numeroUsuario;
            }

            System.out.println("Carton del usuario "+Arrays.toString(cartonUsuario));

            int aciertos = 0;
            for (int i = 0; i < cartonUsuario.length; i++) {
                if (cartonUsuario[i] == cartonSistema[i]) {
                    aciertos++;
                }
                //aciertos = cartonUsuario[i] == cartonSistema[i] ? aciertos+1 : aciertos; //if ternario --> como se debe hacer en el futuro
            }
            System.out.println("El numero de aciertos es: "+aciertos);

        }catch (Exception e){
            System.out.println("Error en el tratamiento");
        }
    }



    // [2.3.4.5.7] 3
    public static boolean estaNumero(int numero, int[] carton) {
        for (int item : carton) {
            if (numero == item) {

                return true;
            }
        }
        return false;
    }
}
