package controlador.Menu;

import java.io.IOException;
import java.util.ArrayList;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;


import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

import controlador.PMF;
import modelo.Bebida;
import modelo.Menu_Dia;
import modelo.Plato;
import modelo.PlatoMenu;

@SuppressWarnings("serial")
public class GuardarMenu extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		
		HttpSession misesion = req.getSession();
		
		ArrayList<Plato> misEntradas=(ArrayList<Plato>)misesion.getAttribute("misEntradas");
		ArrayList<String> misCanEntradas=(ArrayList<String>)misesion.getAttribute("misCanEntradas");

		ArrayList<Plato> misFondos=(ArrayList<Plato>)misesion.getAttribute("misFondos");
		ArrayList<String> misCanFondos=(ArrayList<String>)misesion.getAttribute("misCanFondos");

		ArrayList<Plato> misPostres=(ArrayList<Plato>)misesion.getAttribute("misPostres");
		ArrayList<String> misCanPostres=(ArrayList<String>)misesion.getAttribute("misCanPostres");

		ArrayList<Bebida> misGaseosas=(ArrayList<Bebida>)misesion.getAttribute("misGaseosas");
		ArrayList<String> misCanGaseosas=(ArrayList<String>)misesion.getAttribute("misCanGaseosas");

		ArrayList<Bebida> misCervezas=(ArrayList<Bebida>)misesion.getAttribute("misCervezas");
		ArrayList<String> misCanCervezas=(ArrayList<String>)misesion.getAttribute("misCanCervezas");

		ArrayList<Bebida> misRefrescos=(ArrayList<Bebida>)misesion.getAttribute("misRefrescos");
		ArrayList<String> misCanRefrescos=(ArrayList<String>)misesion.getAttribute("misCanRefrescos");
		
		
		Menu_Dia miMenu = new Menu_Dia();
		
		ArrayList<String> dataPlatos = new ArrayList<String>();
		ArrayList<String> dataBebidas = new ArrayList<String>();
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try{
			if(misEntradas != null){
				for(int i = 0; i< misEntradas.size();i++){
					PlatoMenu plato = new PlatoMenu(misEntradas.get(i),Integer.parseInt(misCanEntradas.get(i)),"Entrada");
					pm.makePersistent(plato);
					dataPlatos.add(plato.getIdPlatoMenu());
				}
			}
			if(misFondos != null){
				for(int i = 0; i< misFondos.size();i++){
					PlatoMenu plato = new PlatoMenu(misFondos.get(i),Integer.parseInt(misCanFondos.get(i)),"Fondo");
					pm.makePersistent(plato);
					dataPlatos.add(plato.getIdPlatoMenu());
				}
			}
			if(misPostres != null){
				for(int i = 0; i< misPostres.size();i++){
					PlatoMenu plato = new PlatoMenu(misPostres.get(i),Integer.parseInt(misCanPostres.get(i)),"Postre");
					pm.makePersistent(plato);
					dataPlatos.add(plato.getIdPlatoMenu());
				}
			}
			miMenu.setPlatos(dataPlatos);
			pm.makePersistent(miMenu);
			RequestDispatcher rd = req.getRequestDispatcher("/Final_Menu_Elegido.jsp");
			rd.forward(req, resp);
		}finally{
			pm.close();
		}
		
		
		
		
		
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
