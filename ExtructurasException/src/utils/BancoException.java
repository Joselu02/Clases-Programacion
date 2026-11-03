package utils;

//error

public class BancoException extends Exception {
    //heredado de Exception -> tengo todas las caracteristicas de la clase padre

    public BancoException() {}
    public BancoException(String element) {
        super(element);
    }

}
