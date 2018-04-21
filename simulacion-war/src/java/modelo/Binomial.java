package modelo;

import java.io.Serializable;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodolhan
 */
@Named(value = "binomialC")
@RequestScoped
public class Binomial implements Serializable{
    private String x;
    private String fx;
    private String FX;

    public Binomial(String x, String fx, String FX) {
        this.x = x;
        this.fx = fx;
        this.FX = FX;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public String getFX() {
        return FX;
    }

    public void setFX(String FX) {
        this.FX = FX;
    }
    
    
}
