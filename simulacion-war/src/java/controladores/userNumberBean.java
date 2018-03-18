/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Rodolhan
 */
@Named(value = "userNumberBean")
@RequestScoped
public class userNumberBean implements Serializable{
    private int userNumberBean;

    public int getUserNumberBean() {
        return userNumberBean;
    }

    public void setUserNumberBean(int userNumberBean) {
        this.userNumberBean = userNumberBean;
    }
    
    

    /**
     * Creates a new instance of userNumberBean
     */
    public userNumberBean() {
    }
    
}
