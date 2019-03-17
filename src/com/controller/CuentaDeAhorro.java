package com.controller;

import com.Exceptions.UserException;

public class CuentaDeAhorro extends Cuenta {

    private double saldo;
    private String type;

    public CuentaDeAhorro(String type, double saldo){
        this.saldo = saldo;
        this.type = type;
    }

    @Override
    public String depositar(double saldo) {
        this.saldo +=saldo;
        return "Success";
    }

    @Override
    public String retirar(double retiro) {
        try {
            if (saldo - retiro > 5000) saldo -= retiro;
            else throw new UserException();
        }catch(UserException e){
            return e.notEnoughMoney();
        }
        return "Success";
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
