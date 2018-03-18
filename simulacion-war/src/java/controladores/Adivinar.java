/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Rodolhan
 */
@Named(value = "adivinar")
@ApplicationScoped
public class Adivinar {

     boolean acceso=false;

    /**
     * Creates a new instance of Adivinar
     */
    public Adivinar() {
    }

    public boolean adivino(long N1, long N2) {
        if (N1 == N2) {
            acceso = true;
            return true;
        } 
        return false;
    }

    public String mensaje() {
        if (acceso==true) {
            acceso=false;
            return "ADIVINO";
        }
        return "";
    }
}
