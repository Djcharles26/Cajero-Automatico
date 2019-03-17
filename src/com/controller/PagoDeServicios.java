package com.controller;

import java.rmi.server.ExportException;

public class PagoDeServicios {

    private double monto;
    private String servicio;
    private String[] telefonia = {"AT&T","TELMEX","TELCEL","MOVISTAR"};
    private String telefono = null;

    public PagoDeServicios(double monto, String servicio, String telefonia) throws Exception {
        this.monto = monto;
        this.servicio = servicio;
        if(servicio.equals("telefonia")){
            if(telefonia!=null){
                for(String telefono:this.telefonia){
                    if(telefono.equals(telefonia)){
                        this.telefono = telefono;
                        break;
                    }
                }
            }
            if(this.telefono==null) throw new Exception();

        }
    }

    public void pagarServicio(/*It must recieve the account where it will disccount and the mount*/){
        //TODO:
    }



}
