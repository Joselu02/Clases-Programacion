import controller.Banco;
import model.CuentaCorriente;

public class MainBanco {

    public static void main(String[] args) {

        Banco bbva = new Banco("BBVA");

       /* CuentaCorriente cuenta1 = new CuentaCorriente("Jose",1000,1234);
        CuentaCorriente cuenta2 = new CuentaCorriente("Antonio");
        CuentaCorriente cuenta3 = new CuentaCorriente("Arantxa",700);
        CuentaCorriente cuenta4 = new CuentaCorriente();*/
       // bbva.darAltaCuenta(new CuentaCorriente("Jose",1000,1234));

        try {
            bbva.ingresarDinero(1000,1234,"Jose");
        }catch (Exception e){
            System.out.println("No hay cuenta en el banco");
        }
    }
}
