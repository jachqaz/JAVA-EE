/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBean;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

import modelo.Final;
import org.apache.commons.math3.distribution.NormalDistribution;


/**
 *
 * @author Rodolhan
 */
@Stateless
public class FinalService implements Serializable {
private double condicion;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")


//    static {
//       
//    }

    public FinalService() {
    }

    public List<Final> Final(int cantidad) {
 condicion=0;
        List<Final> list = new ArrayList<>();
        NormalDistribution normalX1 = new NormalDistribution(2, 0.1);
        NormalDistribution normalX2 = new NormalDistribution(5, 0.2);
        DecimalFormat df = new DecimalFormat("0.0000000");
        
        double nros_aleatoriosX1[] = generarAleatorios(cantidad);
        double nros_aleatoriosX2[] = generarAleatorios(cantidad);
        double x1= 0;
        double x2 = 0;
        double perimetro= 0;
        
        
        for (int i = 0; i < nros_aleatoriosX1.length; i++) {
                x1 = normalX1.inverseCumulativeProbability(nros_aleatoriosX1[i]);
                x2 = normalX2.inverseCumulativeProbability(nros_aleatoriosX2[i]);
                perimetro=(2*x1)+(2*x2);
                list.add(new Final(x1+"", x2+"", perimetro+""));
                if(perimetro>14.5){
                    condicion++;
                }
            }
        
        return list;
    }
    public double[] generarAleatorios(int cantidad_valores) {
        double aleatorios[] = new double[cantidad_valores];
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = Math.random();
        }
        return aleatorios;
    }

    public double getCondicion() {
        return condicion;
    }



}
