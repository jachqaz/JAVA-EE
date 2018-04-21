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
import modelo.Distribucion;
import org.apache.commons.math3.distribution.BinomialDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;

/**
 *
 * @author Rodolhan
 */
@Stateless
public class DNormalService implements Serializable {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")


//    static {
//       
//    }

    public DNormalService() {
    }

    public List<Distribucion> Distribucion(double promedio, double desvest) {
        List<Distribucion> list=new ArrayList<>();
        NormalDistribution nd = new NormalDistribution(promedio, desvest);
        DecimalFormat df = new DecimalFormat("0.000000");
        for (int X = 0; X <= promedio; X++) {
            list.add(new Distribucion(X+"", df.format(nd.probability(X)), df.format(nd.cumulativeProbability(X))));
        }   
        return list;
    }

}
