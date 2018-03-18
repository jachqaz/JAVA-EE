package calculadora_ajax;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
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
@Named(value = "datos_ajax")
@SessionScoped
public class Datos_ajax implements Serializable {

    private String N1;
    private String N2;
    private String Operacion;
    private String resultado;

    public Datos_ajax() {
    }

    public void calcular() {
        double numero1 = Double.parseDouble(N1);
        double numero2 = Double.parseDouble(N2);
        double respuesta = 0;
        if (Operacion.equals("Suma")) {
            resultado = String.valueOf(numero1 + numero2);
        } else if (Operacion.equals("Resta")) {
            resultado = String.valueOf(numero1 - numero2);
        } else if (Operacion.equals("Multiplicacion")) {
            resultado = String.valueOf(numero1 * numero2);
        } else if (Operacion.equals("Division")) {
            resultado = String.valueOf(numero1 / numero2);
        }
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

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

}
