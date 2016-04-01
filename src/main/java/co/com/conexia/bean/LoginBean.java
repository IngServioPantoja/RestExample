package co.com.conexia.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.com.conexia.service.PagadorServiceWS;

@ManagedBean
@ViewScoped
public class LoginBean {
	
	@EJB PagadorServiceWS pagadorServiceWS;

	public LoginBean() {
		System.out.println("Lolaso");
	}
	
	public void miMetodo(){
		
		pagadorServiceWS.listarPagadores("Servio Pantoja");
		System.out.println("LOl");
	}
	
}
