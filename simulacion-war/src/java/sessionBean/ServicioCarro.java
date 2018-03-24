/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import modelo.Carro;

/**
 *
 * @author Rodolhan
 */
@Stateless
@LocalBean
public class ServicioCarro implements Serializable {

    private static String[] modelos;
    private static int[] anos;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public ServicioCarro() {
        modelos = new String[3];
        modelos[0] = "Black";
        modelos[1] = "White";
        modelos[2] = "Green";

        anos = new int[3];
        anos[0] = 2011;
        anos[1] = 2012;
        anos[2] = 2013;
    }

    public List<Carro> createCars(int size) {
        List<Carro> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(new Carro(getRandomId(), getRandomModelo(), getRandomAno()));
        }

        return list;
    }

    private Integer getRandomId() {
        return (int) (Math.random() * 50);

    }

    private Integer getRandomAno() {
        return anos[(int) (Math.random() * 3)];
    }

    private String getRandomModelo() {
        return modelos[(int) (Math.random() * 3)];
    }

}
