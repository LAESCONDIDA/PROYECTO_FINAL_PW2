package controlador.MenuUsuario;

import java.io.IOException;
import java.util.ArrayList;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

import controlador.PMF;
import modelo.Bebida;
import modelo.Plato;

@SuppressWarnings("serial")
public class ListaSeleccionUser extends HttpServlet{
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		String[] codigos = req.getParameterValues("codigo[]");
		String[] cantidades = req.getParameterValues("cantidades[]");
		//String tipo = req.getParameter("clase");
		
		System.out.println(codigos);
		System.out.println(cantidades);
		//System.out.println(tipo);
		//creamos una instancia de PersistenceManager
		/*PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			if(tipo.equals("Platos")){
				
				
					ArrayList<Plato> misEntradas=(ArrayList<Plato>)getServletContext().getAttribute("misEntradas");
					ArrayList<String> misCanEntradas=(ArrayList<String>)getServletContext().getAttribute("misCanEntradas");
					if(misEntradas==null){
						misEntradas = new ArrayList<Plato>();
						misCanEntradas = new ArrayList<String>();
					    /*misesion.setAttribute("misEntradas", misEntradas);
					    misesion.setAttribute("misCanEntradas",misCanEntradas);
					   */
		/*			    for(int i=0;i<codigos.length;i++){
							Key k = KeyFactory.stringToKey(codigos[i]);
							Plato a = pm.getObjectById(Plato.class, k);
							misEntradas.add(a);
							misCanEntradas.add(cantidades[i]);
						}
					    getServletContext().setAttribute("misEntradas", misEntradas);
					    getServletContext().setAttribute("misCanEntradas",misCanEntradas);
					   
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
						getServletContext().setAttribute("misEntradas", misEntradas);
					    getServletContext().setAttribute("misCanEntradas",misCanEntradas);
					   
					}
				
			}*/
			RequestDispatcher rd = req.getRequestDispatcher("/UserJsp/MenuElegidoUser.jsp");
			rd.forward(req, resp);
			
	/*}
	finally{
		pm.close();
	}*/
		
	}
	
public void doPost(HttpServletRequest req, HttpServletResponse resp){
	
	String [] val = req.getParameterValues("codigo");
	String [] can = req.getParameterValues("cantidades");
	
	System.out.println(val);
	System.out.println(can);
}
}
