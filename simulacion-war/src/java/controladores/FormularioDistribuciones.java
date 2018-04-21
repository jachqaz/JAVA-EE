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
import sessionBean.DNormalService;
import sessionBean.DPoisssonService;

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
    @Inject
    private DNormalService normalService;
    @Inject
    private DPoisssonService poisssonService;
    private Distribucion distribucion;
    private List<Distribucion> listbinomial;
    private List<Distribucion> listcontiua;
    private List<Distribucion> listnorm;
    private List<Distribucion> listpoisson;
    private double n;
    private double p;
    private int liminf;
    private int limsup;
    private double promedio;
    private double desvest;
    private double z;

    public void FormularioDistribuciones() {

    }

    @PostConstruct
    public void construct() {
    }

    public void binomial() {
        listbinomial = binomailService.Distribucion(n, p);
    }

    public void continua() {
        listcontiua = continuaService.Distribucion(liminf, limsup);
    }

    public void normal() {
        listnorm = normalService.Distribucion(promedio, desvest,z);
    }

    public void poisson() {
        listpoisson = poisssonService.Distribucion(promedio);
    }

    public List<Distribucion> getListbinomial() {
        return listbinomial;
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

    public List<Distribucion> getListnorm() {
        return listnorm;
    }

    public void setListnorm(List<Distribucion> listnorm) {
        this.listnorm = listnorm;
    }

    public List<Distribucion> getListpoisson() {
        return listpoisson;
    }

    public void setListpoisson(List<Distribucion> listpoisson) {
        this.listpoisson = listpoisson;
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

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getDesvest() {
        return desvest;
    }

    public void setDesvest(double desvest) {
        this.desvest = desvest;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double Z) {
        this.z = Z;
    }
    

}
