package controlador.Bebida;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;


import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

import controlador.PMF;
import modelo.Bebida;

@SuppressWarnings("serial")
public class GuardarBebida extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/plain");
		
		String nombre= req.getParameter("nombre");
		String precio= req.getParameter("precio");
		double costo=Double.parseDouble(precio);
		String categoria= req.getParameter("categoria");
		String imagen= req.getParameter("imagen");
		
		String id=req.getParameter("idBebida");
		
		if(id==null){
		
		Bebida mibebida=new Bebida(nombre,costo,categoria,imagen);
		//creamos una istancia de PersistenceManager
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			pm.makePersistent(mibebida);
			
			Key k = KeyFactory.stringToKey(mibebida.getIdBebida());
			Bebida a = pm.getObjectById(Bebida.class, k);
			resp.sendRedirect("listabebida");
			/*req.setAttribute("Bebida", a);
			RequestDispatcher dispatcher =getServletContext().getRequestDispatcher("/listabebida");
			dispatcher.forward(req, resp);*/
			}
		finally {
			pm.close();
		}
		}else{
			PersistenceManager pm = PMF.get().getPersistenceManager();
		    try {
		    	Key k = KeyFactory.stringToKey(id);
				Bebida e = pm.getObjectById(Bebida.class, k);
				
				e.setNombre(nombre);
				e.setPrecio(costo);
				e.setCategoria(categoria);
				e.setImagen(imagen);
				
				resp.sendRedirect("listabebida");
			}catch(Exception e){
				System.out.println(e);
			}finally{
				pm.close();
			}
		}
		
		//resp.sendRedirect("telesales?action=accountDisplay&accountId="+a.getId());
	
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse	response) throws ServletException, IOException { 
		doGet(request, response);
	}
}
