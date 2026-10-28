import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa exceptions");
        System.out.println("Procedemos a ejecutar errores en codigo");
        int resultado = 100000;
        String nombre = null;
        try {
            System.out.println("Indica un operando 1");
            int op1 = scanner.nextInt();
            System.out.println("Indica un operando 2");
            int op2 = scanner.nextInt();
            resultado = op1 / op2;
            System.out.println("El resultado es " + resultado);
            if (nombre == null) {
                nombre = "Luis";
                System.out.println(nombre.charAt(10));
            }

        } catch (ArithmeticException e) {
            System.out.println("El op2 ha producido fallo");
            resultado = 0;
        } catch (NullPointerException e) {
            System.out.println("Fallo en la variable nombre");
        } catch (Exception e) {
            System.out.println("Cualquier fallo que no sea de los anteriores");
        } finally {
            // cerrar streams
            System.out.println("El resultado es " + resultado);
        }
        System.out.println("Ejecutamos el final del programa");
    }
}