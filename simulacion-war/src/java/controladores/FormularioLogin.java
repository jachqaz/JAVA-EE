/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import org.primefaces.context.RequestContext;
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
    private String email;
    private String password;
    private final Conection conection = new Conection();

    public void FormularioLogin() {

    }

    @PostConstruct
    public void construct() {
    }

   public String login(){
       if (conection.loginControl(email, password)) {
            HttpSession session = getSession();
            session.setAttribute("email", email);
            return "index";
        } else {
            RequestContext.getCurrentInstance().update("growl");
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario o contraseña Invalidos", "Error de acceso"));
            /**/
            FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN,
							"Usuario o contraseña Invalidos",
							"Por favor ingrese un usuario o contraseña validos"));
                        email = "";
                        password = ""; 
			return "/login?faces-redirect=true";
        }
   }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public static HttpSession getSession() {
		return (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
	}
public String logout() {
		HttpSession session = getSession();
                
                email = "";
                password = "";           
		session.invalidate();
                /*FacesContext facesContext = FacesContext.getCurrentInstance();
                // define the navigation rule that must be used in order to redirect the user to the adequate page...
                NavigationHandler myNav = facesContext.getApplication().getNavigationHandler();
                myNav.handleNavigation(facesContext, null, "/login?faces-redirect=true");*/
                FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN,
							"Sesion Terminada",
							"Ingrese nuevamente"));
		return "/login?faces-redirect=true";
               
	}
}
