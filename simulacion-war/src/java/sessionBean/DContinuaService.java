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
import org.apache.commons.math3.distribution.UniformRealDistribution;

/**
 *
 * @author Rodolhan
 */
@Stateless
public class DContinuaService implements Serializable {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")


//    static {
//       
//    }

    public DContinuaService() {
    }

    public List<Distribucion> Distribucion(int LimF, int LimS) {
        List<Distribucion> list=new ArrayList<>();
        UniformRealDistribution uid=new UniformRealDistribution(LimF, LimS);
            DecimalFormat df = new DecimalFormat("0.0000");
            do {
                list.add(new Distribucion(LimF+"", df.format(uid.density(LimF)), df.format(uid.cumulativeProbability(LimF))));
                LimF++;
            } while (LimF <= LimS);
        return list;
    }

}
