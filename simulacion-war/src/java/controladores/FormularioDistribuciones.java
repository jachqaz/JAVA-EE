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
import modelo.Distribucion;
import sessionBean.DBinomailService;
import sessionBean.DContinuaService;

/**
 *
 * @author Rodolhan
 */
@Named("formD")
@SessionScoped
public class FormularioDistribuciones implements Serializable {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Inject
    private DBinomailService binomailService;
    @Inject
    private DContinuaService continuaService;
    private Distribucion distribucion;
    private List<Distribucion> listbinomial;
    private List<Distribucion> listcontiua;
    private double n;
    private double p;
    private int liminf;
    private int limsup;

    public void FormularioDistribuciones() {

    }

    @PostConstruct
    public void construct() {
    }

    public void binomial() {
        listbinomial = binomailService.Distribucion(n, p);
    }

    public List<Distribucion> getListbinomial() {
        return listbinomial;
    }

    public void continua() {
        listcontiua = continuaService.Distribucion(liminf, limsup);
    }

    public void setListbinomial(List<Distribucion> listbinomial) {
        this.listbinomial = listbinomial;
    }

    public Distribucion getDistribucion() {
        return distribucion;
    }

    public void setDistribucion(Distribucion distribucion) {
        this.distribucion = distribucion;
    }

    public List<Distribucion> getListcontiua() {
        return listcontiua;
    }

    public void setListcontiua(List<Distribucion> listcontiua) {
        this.listcontiua = listcontiua;
    }

    public int getLiminf() {
        return liminf;
    }

    public void setLiminf(int liminf) {
        this.liminf = liminf;
    }

    public int getLimsup() {
        return limsup;
    }

    public void setLimsup(int limsup) {
        this.limsup = limsup;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

}
