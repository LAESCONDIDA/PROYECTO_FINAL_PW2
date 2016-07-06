package controlador.Menu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

import controlador.PMF;
import modelo.Bebida;
import modelo.Plato;

@SuppressWarnings("serial")
public class ListaMenuSeleccionado  extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		String[] codigos = req.getParameterValues("codigos[]");
		String[] cantidades = req.getParameterValues("cantidades[]");
		String tipo = req.getParameter("clase");
		
		HttpSession misesion= req.getSession();
				
		
		//String tip=(String) misesion.getAttribute("tipo");
		
		/*if(misesion.getAttribute("tipo") != null){
			misesion.setAttribute("tipo", tipo);
		}
		else{
			misesion.setAttribute("tipo", tipo);
		}*/
		
		//creamos una instancia de PersistenceManager
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			if(tipo.equals("Entrada")||tipo.equals("Plato de Fondo")||tipo.equals("Postre")){
				
				if(tipo.equals("Entrada")){
					ArrayList<Plato> misEntradas=(ArrayList<Plato>)misesion.getAttribute("misEntradas");
					ArrayList<String> misCanEntradas=(ArrayList<String>)misesion.getAttribute("misCanEntradas");
					if(misEntradas==null){
						misEntradas = new ArrayList<Plato>();
						misCanEntradas = new ArrayList<String>();
					    misesion.setAttribute("misEntradas", misEntradas);
					    misesion.setAttribute("misCanEntradas",misCanEntradas);
					   
					    for(int i=0;i<codigos.length;i++){
							Key k = KeyFactory.stringToKey(codigos[i]);
							Plato a = pm.getObjectById(Plato.class, k);
							misEntradas.add(a);
							misCanEntradas.add(cantidades[i]);
						}
					}
					else{
						for(int i=0;i<codigos.length;i++){
							int j;
							for(j=0;j<misEntradas.size();j++){
								if(misEntradas.get(j).getIdPlato().equals(codigos[i])){
									int num =Integer.parseInt(misCanEntradas.get(j))+Integer.parseInt(cantidades[i]);
									misCanEntradas.set(j, num+"");
									break;
								}
							}
							if(j==misEntradas.size()){
								Key k = KeyFactory.stringToKey(codigos[i]);
								Plato a = pm.getObjectById(Plato.class, k);
								misEntradas.add(a);
								misCanEntradas.add(cantidades[i]);
							}
						}
					}
					
						
				}
				else if(tipo.equals("Plato de Fondo")){
					ArrayList<Plato> misFondos=(ArrayList<Plato>)misesion.getAttribute("misFondos");
					ArrayList<String> misCanFondos=(ArrayList<String>)misesion.getAttribute("misCanFondos");
					if(misFondos==null){
						misFondos = new ArrayList<Plato>();
						misCanFondos = new ArrayList<String>();
					    misesion.setAttribute("misFondos", misFondos);
					    misesion.setAttribute("misCanFondos",misCanFondos);
					   
					    for(int i=0;i<codigos.length;i++){
							Key k = KeyFactory.stringToKey(codigos[i]);
							Plato a = pm.getObjectById(Plato.class, k);
							misFondos.add(a);
							misCanFondos.add(cantidades[i]);
						}
					}
					else{
						for(int i=0;i<codigos.length;i++){
							int j;
							for(j=0;j<misFondos.size();j++){
								if(misFondos.get(j).getIdPlato().equals(codigos[i])){
									int num =Integer.parseInt(misCanFondos.get(j))+Integer.parseInt(cantidades[i]);
									misCanFondos.set(j, num+"");
									break;
								}
							}
							if(j==misFondos.size()){
								Key k = KeyFactory.stringToKey(codigos[i]);
								Plato a = pm.getObjectById(Plato.class, k);
								misFondos.add(a);
								misCanFondos.add(cantidades[i]);
							}
						}
					}
				}
				else{
					ArrayList<Plato> misPostres=(ArrayList<Plato>)misesion.getAttribute("misPostres");
					ArrayList<String> misCanPostres=(ArrayList<String>)misesion.getAttribute("misCanPostres");
					if(misPostres==null){
						misPostres = new ArrayList<Plato>();
						misCanPostres = new ArrayList<String>();
					    misesion.setAttribute("misPostres", misPostres);
					    misesion.setAttribute("misCanPostres",misCanPostres);
					   
					    for(int i=0;i<codigos.length;i++){
							Key k = KeyFactory.stringToKey(codigos[i]);
							Plato a = pm.getObjectById(Plato.class, k);
							misPostres.add(a);
							misCanPostres.add(cantidades[i]);
						}
					}
					else{
						for(int i=0;i<codigos.length;i++){
							int j;
							for(j=0;j<misPostres.size();j++){
								if(misPostres.get(j).getIdPlato().equals(codigos[i])){
									int num =Integer.parseInt(misCanPostres.get(j))+Integer.parseInt(cantidades[i]);
									misCanPostres.set(j, num+"");
									break;
								}
							}
							if(j==misPostres.size()){
								Key k = KeyFactory.stringToKey(codigos[i]);
								Plato a = pm.getObjectById(Plato.class, k);
								misPostres.add(a);
								misCanPostres.add(cantidades[i]);
							}
						}
					}
				}
				
			}
			else if(tipo.equals("Gaseosa")||tipo.equals("Refresco")||tipo.equals("Cerveza")){
				if(tipo.equals("Gaseosa")){
					ArrayList<Bebida> misGaseosas=(ArrayList<Bebida>)misesion.getAttribute("misGaseosas");
					ArrayList<String> misCanGaseosas=(ArrayList<String>)misesion.getAttribute("misCanGaseosas");
					if(misGaseosas==null){
						misGaseosas = new ArrayList<Bebida>();
						misCanGaseosas = new ArrayList<String>();
					    misesion.setAttribute("misGaseosas", misGaseosas);
					    misesion.setAttribute("misCanGaseosas",misCanGaseosas);
					   
					    for(int i=0;i<codigos.length;i++){
							Key k = KeyFactory.stringToKey(codigos[i]);
							Bebida a = pm.getObjectById(Bebida.class, k);
							misGaseosas.add(a);
							misCanGaseosas.add(cantidades[i]);
						}
					}
					else{
						for(int i=0;i<codigos.length;i++){
							int j;
							for(j=0;j<misGaseosas.size();j++){
								if(misGaseosas.get(j).getIdBebida().equals(codigos[i])){
									int num =Integer.parseInt(misCanGaseosas.get(j))+Integer.parseInt(cantidades[i]);
									misCanGaseosas.set(j, num+"");
									break;
								}
							}
							if(j==misGaseosas.size()){
								Key k = KeyFactory.stringToKey(codigos[i]);
								Bebida a = pm.getObjectById(Bebida.class, k);
								misGaseosas.add(a);
								misCanGaseosas.add(cantidades[i]);
							}
						}
					}
					
						
				}
				else if(tipo.equals("Refresco")){
					ArrayList<Bebida> misRefrescos=(ArrayList<Bebida>)misesion.getAttribute("misRefrescos");
					ArrayList<String> misCanRefrescos=(ArrayList<String>)misesion.getAttribute("misCanRefrescos");
					if(misRefrescos==null){
						misRefrescos = new ArrayList<Bebida>();
						misCanRefrescos = new ArrayList<String>();
					    misesion.setAttribute("misRefrescos", misRefrescos);
					    misesion.setAttribute("misCanRefrescos",misCanRefrescos);
					   
					    for(int i=0;i<codigos.length;i++){
							Key k = KeyFactory.stringToKey(codigos[i]);
							Bebida a = pm.getObjectById(Bebida.class, k);
							misRefrescos.add(a);
							misCanRefrescos.add(cantidades[i]);
						}
					}
					else{
						for(int i=0;i<codigos.length;i++){
							int j;
							for(j=0;j<misRefrescos.size();j++){
								if(misRefrescos.get(j).getIdBebida().equals(codigos[i])){
									int num =Integer.parseInt(misCanRefrescos.get(j))+Integer.parseInt(cantidades[i]);
									misCanRefrescos.set(j, num+"");
									break;
								}
							}
							if(j==misRefrescos.size()){
								Key k = KeyFactory.stringToKey(codigos[i]);
								Bebida a = pm.getObjectById(Bebida.class, k);
								misRefrescos.add(a);
								misCanRefrescos.add(cantidades[i]);
							}
						}
					}
					
						
				
				}
				else{
					ArrayList<Bebida> misCervezas=(ArrayList<Bebida>)misesion.getAttribute("misCervezas");
					ArrayList<String> misCanCervezas=(ArrayList<String>)misesion.getAttribute("misCanCervezas");
					if(misCervezas==null){
						misCervezas = new ArrayList<Bebida>();
						misCanCervezas = new ArrayList<String>();
					    misesion.setAttribute("misCervezas", misCervezas);
					    misesion.setAttribute("misCanCervezas",misCanCervezas);
					   
					    for(int i=0;i<codigos.length;i++){
							Key k = KeyFactory.stringToKey(codigos[i]);
							Bebida a = pm.getObjectById(Bebida.class, k);
							misCervezas.add(a);
							misCanCervezas.add(cantidades[i]);
						}
					}
					else{
						for(int i=0;i<codigos.length;i++){
							int j;
							for(j=0;j<misCervezas.size();j++){
								if(misCervezas.get(j).getIdBebida().equals(codigos[i])){
									int num =Integer.parseInt(misCanCervezas.get(j))+Integer.parseInt(cantidades[i]);
									misCanCervezas.set(j, num+"");
									break;
								}
							}
							if(j==misCervezas.size()){
								Key k = KeyFactory.stringToKey(codigos[i]);
								Bebida a = pm.getObjectById(Bebida.class, k);
								misCervezas.add(a);
								misCanCervezas.add(cantidades[i]);
							}
						}
					}
					
				}
			}
			
			//misesion.setAttribute("cantidades", cantidades);
						
			/*PrintWriter out=resp.getWriter();
			out.println(" <div class='row'>"
					+ "<div class='col-md-3'>"
					+ "<img src='images/prueba.jpg' alt='...' class='img-thumbnail'>"
					+ "<div class='panel panel-default'>"
					+ "<div class='panel-body eleccion_comida'>"
					+ "<div class='checkbox'>"
					+ "<label><input type='checkbox' value='nombre_comida'>"+misesion.getAttribute("tipo")+"</label>"
					+ "</div>"
					+ "<div><input type='text' class='form-control' placeholder='Cantidad' value='"+misesion.getId()+"'></div>"
					+ "</div>"
					+ "</div>"
					+ "</div>");
		*/
			RequestDispatcher rd = req.getRequestDispatcher("/Menu_Elegido.jsp");
			rd.forward(req, resp);
			
	}
	finally{
		pm.close();
	}
		
	}
	
}