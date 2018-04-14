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

/**
 *
 * @author Rodolhan
 */
@Stateless
public class DBinomailService implements Serializable {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")


//    static {
//       
//    }

    public DBinomailService() {
    }

    public List<Distribucion> Distribucion(double n, double p) {
        List<Distribucion> list=new ArrayList<>();
        BinomialDistribution bd=new BinomialDistribution((int) n,p);
        DecimalFormat df = new DecimalFormat("0.000000");
        for (int X = 0; X <= n; X++) {
            list.add(new Distribucion(X+"", df.format(bd.probability(X)), df.format(bd.cumulativeProbability(X))));
        }   
        return list;
    }

}
