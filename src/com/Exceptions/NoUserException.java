package com.Exceptions;

public class NoUserException extends Exception {
    public NoUserException(){
        super();
    }

    public String message(){
        return "El usuario no existe";
    }

}
