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
import org.apache.commons.math3.distribution.PoissonDistribution;

/**
 *
 * @author Rodolhan
 */
@Stateless
public class DPoisssonService implements Serializable {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")


//    static {
//       
//    }

    public DPoisssonService() {
    }

    public List<Distribucion> Distribucion(double Promedio) {
        List<Distribucion> list=new ArrayList<>();
        DecimalFormat df = new DecimalFormat("0.000000");
                PoissonDistribution pd=new PoissonDistribution(Promedio);
                String aux="";
                int X = 0;
                do {
                    list.add(new Distribucion(X+"", df.format(pd.probability(X)), df.format(pd.cumulativeProbability(X))));
                    aux = df.format(pd.cumulativeProbability(X));
                    X++;
                } while (!aux.contains("1,"));  
        return list;
    }

}
