package com.controller;
import java.util.Random;

public abstract class Cuenta {
    private Random random = new Random();
    //TODO: Declarar numero de cuenta
    private String numeroDeCuenta;

    public abstract String depositar(double saldo);

    public abstract String retirar(double retiro) throws Exception;

    public abstract String getType();

    public abstract double getSaldo();


    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String createNumeroDeCuenta(){

        String newNumeroDeCuenta = "";
        newNumeroDeCuenta = "5522";
        for(int i=0; i<12; i++){
            newNumeroDeCuenta += random.nextInt(10);
        }

        return newNumeroDeCuenta;
    }
}
