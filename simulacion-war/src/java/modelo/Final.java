/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author jach_
 */
public class Final implements Serializable{
    private String X1;
    private String X2;
    private String Perimetro;

    public Final(String X1, String X2, String Perimetro) {
        this.X1 = X1;
        this.X2 = X2;
        this.Perimetro = Perimetro;
    }



    public String getX1() {
        return X1;
    }

    public void setX1(String X1) {
        this.X1 = X1;
    }

    public String getX2() {
        return X2;
    }

    public void setX2(String X2) {
        this.X2 = X2;
    }

    public String getPerimetro() {
        return Perimetro;
    }

    public void setPerimetro(String Perimetro) {
        this.Perimetro = Perimetro;
    }
    
}
