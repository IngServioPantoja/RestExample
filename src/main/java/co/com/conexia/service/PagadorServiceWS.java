package co.com.conexia.service;

import java.util.List;

import javax.ejb.Local;

import co.com.conexia.domain.Pagador;

@Local
public interface PagadorServiceWS {
	
	public List<Pagador> listarPagadores(String password);
}
