package calculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Rodolhan
 */
@Named(value = "calculadora")
@ApplicationScoped
public class Calculadora {

    public Calculadora() {

    }

    /**
     * Creates a new instance of Calculadora
     *
     * @param N1
     * @param N2
     * @param Operacion
     */
    public String Respuesta(String N1, String N2, String Operacion) {
        double numero1 = Double.parseDouble(N1);
        double numero2 = Double.parseDouble(N2);
        double respuesta = 0;
        if (Operacion.equals("Suma")) {
            respuesta = numero1 + numero2;
        } else if (Operacion.equals("Resta")) {
            respuesta = numero1 - numero2;
        } else if (Operacion.equals("Multiplicacion")) {
            respuesta = numero1 * numero2;
        } else if (Operacion.equals("Division")) {
            respuesta = numero1 / numero2;
        }
        return String.valueOf(respuesta);
    }
}
