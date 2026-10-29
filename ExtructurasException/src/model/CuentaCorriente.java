package model;

public class CuentaCorriente {

    private double saldo;
    private String titular;
    private int pin;

    public CuentaCorriente(){}
    public CuentaCorriente(String titular, double saldo, int pin){
        this.titular = titular;
        this.saldo = saldo;
        this.pin = pin;
    }

    public CuentaCorriente(String titular){
        this.titular = titular;
        this.pin = (int)(Math.random()*10000);
    }


    public CuentaCorriente(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
