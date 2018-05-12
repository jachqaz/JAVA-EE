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
public class LoginService implements Serializable {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")


//    static {
//       
//    }

    public LoginService() {
    }

    public boolean Login(String email, String password) {
   
        return false;
    }

}
