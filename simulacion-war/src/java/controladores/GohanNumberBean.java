/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Rodolhan
 */
@Named(value = "gohanNumberBean")
@SessionScoped
public class GohanNumberBean implements Serializable {

    /**
     * Creates a new instance of GohanNumberBean
     */
    private Integer randomInt = null;
    private long maximun = 10;
    private long minimun = 0;

    public GohanNumberBean() {
        Random randomGR = new Random();
        long range = maximun + minimun + 1;
        randomInt = (int) (minimun + randomGR.nextDouble() * range);

    }
//ajaxguessnumber
    public Integer getRandomInt() {
        return randomInt;
    }

    public void setRandomInt(Integer randomInt) {
        this.randomInt = randomInt;
    }

    public long getMaximun() {
        return maximun;
    }

    public void setMaximun(long maximun) {
        this.maximun = maximun;
    }

    public long getMinimun() {
        return minimun;
    }

    public void setMinimun(long minimun) {
        this.minimun = minimun;
    }

}
