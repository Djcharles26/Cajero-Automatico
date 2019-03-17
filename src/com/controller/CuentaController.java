package com.controller;

import com.Exceptions.UserException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CuentaController {
    public static CuentaController sharedInstance;

    private List<Usuario>usuarios;

    public CuentaController(){
        sharedInstance = new CuentaController();
         usuarios = new ArrayList<>();
    }

    public void addUser(Usuario newUsuario){
        usuarios.add(newUsuario);
    }

    public Usuario getUser(String nombre){
        for(Usuario usuario: usuarios){
            if(usuario.getNombre().equals(nombre)){
                return usuario;
            }
        }
        return null;
    }

    public double removeUser(String nombre){
        double saldoADevolver = 0;

        for(Usuario usuario: usuarios){
            if(usuario.getNombre().equals(nombre)){
                for(CuentaDeAhorro cuenta: usuario.getCuentasDeAhorro().values()){
                    if(cuenta.getSaldo()>0){
                        saldoADevolver+= cuenta.getSaldo();
                    }
                }
                for(CuentaDeCheques cuenta: usuario.getCuentasDeCheques().values()){
                    if(cuenta.getSaldo()>0){
                        saldoADevolver+=cuenta.getSaldo();
                    }
                }
            }
        }

        return saldoADevolver;
    }

}
