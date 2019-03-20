package com.Exceptions;

public class UserException extends Exception {
    public UserException(){
        super();
    }
    public String notEnoughMoney()
    {
        return "No hay dinero suficiente para ese movimiento";
    }

    public String fullAccounts()
    {
        return "Ya tienes el numero máximo de cuentas, si lo deseas puedes eliminar alguna cuenta mas tarde";
    }

}
