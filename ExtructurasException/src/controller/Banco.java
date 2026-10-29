package controller;

import model.CuentaCorriente;

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

    public void ingresarDinero(double saldoIngreso, int pin, String titular) throws Exception{
        if(cuenta.getPin() == pin && cuenta.getTitular().equalsIgnoreCase(titular)){
            //ingreso dinero
        } else {
            //aviso que los datos no son validos
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
