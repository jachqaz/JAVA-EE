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
import modelo.Binomial;
import sessionBean.BinomailService;



/**
 *
 * @author Rodolhan
 */
@Named("formBin")
@SessionScoped
public class FormularioBinomial implements Serializable {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Inject
    private BinomailService binomailService;
    private Binomial binomial;
    private List<Binomial> listbinomial;
    private double n;
    private double p;

    public void FormularioBinomial() {
        
    }
    
    @PostConstruct
    public void construct() {
    }

    public void init() {
        listbinomial =binomailService.Distribucion(n, p);
    }

    public List<Binomial> getListbinomial() {
        return listbinomial;
    }

    public void setListbinomial(List<Binomial> listbinomial) {
        this.listbinomial = listbinomial;
    }

    public Binomial getBinomial() {
        return binomial;
    }

    public void setBinomial(Binomial binomial) {
        this.binomial = binomial;
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
