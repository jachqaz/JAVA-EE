/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import modelo.Final;
import sessionBean.FinalService;

/**
 *
 * @author Rodolhan
 */
@Named("formF")
@SessionScoped
public class FormularioFinal implements Serializable {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Inject
    private FinalService finalService;
    private Final f;
    private double frecuencia;
    private int aciertos;
    private int cantidad;
    private List<Final> list;

    @PostConstruct
    public void construct() {

    }

    public void fin() {
        list = finalService.Final(cantidad);
        frecuencia = finalService.getCondicion() / cantidad ;
        aciertos=(int) finalService.getCondicion();
    }

    public FinalService getFinalService() {
        return finalService;
    }

    public void setFinalService(FinalService finalService) {
        this.finalService = finalService;
    }

    public Final getF() {
        return f;
    }

    public void setF(Final f) {
        this.f = f;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public List<Final> getList() {
        return list;
    }

    public void setList(List<Final> list) {
        this.list = list;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

}
