public class EjercicioBonoloto {
    public static void main(String[] args) {

        int[] cartonSistema = new int[5];
        for (int i = 0; i < cartonSistema.length; i++) {
            int aleatorio = 0;
           do {
               aleatorio = (int) (Math.random() * 11)+1;
           }while (estaNumero(aleatorio,cartonSistema));
           cartonSistema[i] = aleatorio;
        }
    }

    public static boolean estaNumero(int numero, int[] carton) {
        for(int item : carton) {
            if(item == numero) {
                return true;
            }
        }

        return false;
    }
}
