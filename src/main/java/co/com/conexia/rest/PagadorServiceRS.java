package co.com.conexia.rest;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import co.com.conexia.domain.Pagador;

@RequestScoped
@Path("/pagadores")
@Produces("application/json")
@Consumes("application/json")
public class PagadorServiceRS {

	@POST
	public Response create(final Pagador pagador) {
		//TODO: process the given pagador 
		//you may want to use the following return statement, assuming that Pagador#getId() or a similar method 
		//would provide the identifier to retrieve the created Pagador resource:
		//return Response.created(UriBuilder.fromResource(PagadorEndpoint.class).path(String.valueOf(pagador.getId())).build()).build();
		return Response.created(null).build();
	}

	@GET
	@Path("/{id:[0-9][0-9]*}")
	public Response findById(@PathParam("id") final Long id) {
		//TODO: retrieve the pagador 
		Pagador pagador = null;
		if (pagador == null) {
			return Response.status(Status.NOT_FOUND).build();
		}
		return Response.ok(pagador).build();
	}

	@GET
	public List<Pagador> listAll(@QueryParam("start") final Integer startPosition,
			@QueryParam("max") final Integer maxResult) {
		//TODO: retrieve the pagadors 
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

	@PUT
	@Path("/{id:[0-9][0-9]*}")
	public Response update(@PathParam("id") Long id, final Pagador pagador) {
		//TODO: process the given pagador 
		return Response.noContent().build();
	}

	@DELETE
	@Path("/{id:[0-9][0-9]*}")
	public Response deleteById(@PathParam("id") final Long id) {
		//TODO: process the pagador matching by the given id 
		return Response.noContent().build();
	}

}
