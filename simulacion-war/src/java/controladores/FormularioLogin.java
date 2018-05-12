/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import sessionBean.LoginService;

/**
 *
 * @author Rodolhan
 */
@Named("formL")
@SessionScoped
public class FormularioLogin implements Serializable {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Inject
    private LoginService loginService;
    private String email;
    private String password;

    public void FormularioDistribuciones() {

    }

    @PostConstruct
    public void construct() {
    }

   public void Login(){
       loginService.Login(email, password);
   }
    

}
