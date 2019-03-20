package com.controller;


import java.util.HashMap;
import java.util.Map;

import com.Exceptions.UserException;

public class Usuario {
    private String nombre, pin;
    private Map<String,CuentaDeAhorro> cuentasDeAhorro;
    private Map<String,CuentaDeCheques> cuentasDeCheques;
    private int ahorroCounter = 0;
    private int chequeCounter = 0;

    public Usuario(String nombre,String pin){
        this.nombre = nombre;
        this.pin = pin;
        cuentasDeAhorro = new HashMap<>();
        cuentasDeCheques = new HashMap<>();
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getPin(){
        return this.pin;
    }

    public String addCuentaDeAhorro(CuentaDeAhorro cuenta){
        if(cuentasDeAhorro.size()<2){
            cuentasDeAhorro.put(cuenta.getNumeroDeCuenta(),cuenta);
            if(cuentasDeCheques.size()<2){
                cuentasDeCheques.put(cuenta.createNumeroDeCuenta(),new CuentaDeCheques("Cheque",0));
            }
            return "Exito";
        }
        return "Las dos cuentas de ahorro fueron creadas";
    }

    public String addCuentaDeCheques(CuentaDeCheques cuenta){
        if(cuentasDeCheques.size()<2){
            cuentasDeCheques.put(cuenta.getNumeroDeCuenta(),cuenta);
            return "Exito";
        }

        return "Las dos cuentas de cheques fueron creadas";
    }

    public String removeCuentas(String type, String numeroDeCuenta){
        if(type.equals("Cheque")){
            cuentasDeCheques.remove(numeroDeCuenta);
            return "Exito";
        }else if(type.equals("Ahorro")){
            cuentasDeAhorro.remove(numeroDeCuenta);
            return "Exito";
        }
        return "La cuenta no se ha encontrado";
    }


    public Map<String,CuentaDeAhorro> getCuentasDeAhorro(){
        return cuentasDeAhorro;
    }

    public Map<String,CuentaDeCheques> getCuentasDeCheques(){
        return cuentasDeCheques;
    }






}
