package controlador.Menu;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;


import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

import controlador.PMF;
import modelo.Plato;

@SuppressWarnings("serial")
public class GuardarMenu extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		
		RequestDispatcher rd = req.getRequestDispatcher("/Final_Menu_Elegido.jsp");
		rd.forward(req, resp);
		
		
		
		
		/*resp.setContentType("text/html");
		
		String nombre= req.getParameter("nombre");
		String precio= req.getParameter("precio");
		float costo=Float.parseFloat(precio);
		String categoria= req.getParameter("categoria");
		String imagen= req.getParameter("imagen");
		String descripcion= req.getParameter("descripcion");
		
		String id=req.getParameter("idPlato");
		
		if(id==null){
		
			Plato miPlato=new Plato(nombre,descripcion,categoria,costo,imagen);
			//creamos una instancia de PersistenceManager
			PersistenceManager pm = PMF.get().getPersistenceManager();
			try {
				pm.makePersistent(miPlato);
				
				Key k = KeyFactory.stringToKey(miPlato.getIdPlato());
				Plato a = pm.getObjectById(Plato.class, k);
				resp.sendRedirect("listaplato");
				}
			finally {
				pm.close();
			}
		}else{
			PersistenceManager pm = PMF.get().getPersistenceManager();
		    try {
		    	Key k = KeyFactory.stringToKey(id);
				Plato e = pm.getObjectById(Plato.class, k);
				
				e.setNombre(nombre);
				e.setPrecio(costo);
				e.setCategoria(categoria);
				e.setImagen(imagen);
				e.setDescripcion(descripcion);
				
				resp.sendRedirect("listaplato");
			}catch(Exception e){
				System.out.println(e);
			}finally{
				pm.close();
			}
		}*/	
	}
	public void doPost(HttpServletRequest request, HttpServletResponse	response) throws ServletException, IOException { 
		doGet(request, response);
	}
}
