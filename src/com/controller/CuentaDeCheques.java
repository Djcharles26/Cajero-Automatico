package com.controller;
import com.Exceptions.UserException;
public class CuentaDeCheques extends Cuenta {

    private  double saldo;
    private  String type;

    public CuentaDeCheques(String type, double saldo){
        this.type = type;
        this.saldo = saldo;
    }

    @Override
    public String depositar(double saldo) {
        this.saldo += saldo;
        return String.valueOf(this.saldo);
    }

    @Override
    public String retirar(double retiro) {
        try {
            if (saldo - retiro > 0) saldo -= retiro;
            else throw new UserException();
        }catch(UserException e){
            return e.notEnoughMoney();
        }
        return String.valueOf(this.saldo);
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
