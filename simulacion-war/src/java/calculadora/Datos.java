package calculadora;


import javax.enterprise.context.RequestScoped;
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
@Named(value = "datos")
@RequestScoped
public class Datos {
    private String N1;
    private String N2;
    private String Operacion;

    public Datos() {
    }

    public String getN1() {
        return N1;
    }

    public void setN1(String N1) {
        this.N1 = N1;
    }

    public String getN2() {
        return N2;
    }

    public void setN2(String N2) {
        this.N2 = N2;
    }

    public String getOperacion() {
        return Operacion;
    }

    public void setOperacion(String Operacion) {
        this.Operacion = Operacion;
    }
    
}
