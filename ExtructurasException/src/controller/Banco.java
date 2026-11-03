package controller;

import model.CuentaCorriente;
import utils.BancoException;

public class Banco {
    //direccion, nombre, numeroEntidad, caja
    //lista de cuentas (usuario, dinero, pin)

    private CuentaCorriente cuenta;
    private String nombre;

    //contructores

    public Banco(){}

    public Banco(String nombre){
        this.nombre = nombre;
    }

    //funcionalidades -> darAltaCuenta, ingresarDinero, sacarDinero, consultarDinero, resetearPin, transferirSaldo

    public void darAltaCuenta(CuentaCorriente cuenta){
        this.cuenta = cuenta;
    }

    public void ingresarDinero(double saldoIngreso, int pin, String titular) throws BancoException{
        try {
            if (cuenta.getTitular().equalsIgnoreCase(titular) && cuenta.getPin() == pin) {
                // ingresar dinero
            } else {
                throw new BancoException("Validacion erronea");
            }

        } catch (NullPointerException e){
            System.out.println("No hay cuenta");
        }
    }

    public void cancelarCuenta(double saldoIngreso, int pin, String titular) throws Exception {

        if(cuenta.getPin() == pin && cuenta.getTitular().equalsIgnoreCase(titular)){
            //ingreso dinero
        } else {
            System.out.println("Fallo de validacion");
        }
    }



    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
