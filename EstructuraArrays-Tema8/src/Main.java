public class Main {
    public static void main(String[] args) {

        //Conjunto de datos
       /* int[] edades = new int[3];
        boolean[] aciertos = new boolean[4];
        */
        String[] clase = new String[5];
        String[] nombre = new String[]{"Borja","Marcos","Marta","Laura","Julia","Mateo"};

        System.out.println("El tamaño del array de nombre es "+nombre.length);
        clase[0] = "Marta";
        System.out.println("El nombre de la primera posicion es "+nombre[0]);
        // como saco la ultima posicion
        System.out.println("El nombre de la ultima posicion es "+nombre[nombre.length-1]);
        // como saco todos los nombres
        for(int i = 0; i < nombre.length; i++){
            System.out.println(nombre[i]);
        }
        for ( String element :nombre ){
            System.out.println(element);
        }
    }
}