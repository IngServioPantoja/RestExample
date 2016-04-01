package co.com.conexia.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

import co.com.conexia.domain.Pagador;
import co.com.conexia.security.SecurityValidator;
import co.com.conexia.service.PagadorServiceWS;

@Stateless
public class PagadorServiceImpl implements Serializable, PagadorServiceWS{
	
	private static final long serialVersionUID = 7143324113539318787L;

	@Interceptors(SecurityValidator.class)
	public List<Pagador> listarPagadores(String password) {
		List<Pagador> pagadores = new ArrayList<Pagador>();
		Pagador pagadorA = new Pagador();
		pagadorA.setNombre("Servio Andres");
		pagadorA.setDireccion("Calle 128 # 46 - 11");
		Pagador pagadorB = new Pagador();
		pagadorB.setNombre("Servio Andres");
		pagadorB.setDireccion("Cr 7 # 77 ");
		pagadores.add(pagadorA);
		pagadores.add(pagadorB);
		return pagadores;

	}
	


}