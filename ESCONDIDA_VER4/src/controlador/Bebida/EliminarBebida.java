package controlador.Bebida;

import java.io.IOException;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

import controlador.PMF;
import modelo.Bebida;

@SuppressWarnings("serial")
public class EliminarBebida extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/plain");
		//PrintWriter out = resp.getWriter(); 
		String[] bebidas = req.getParameterValues("eliminar[]");
				
		//creamos una istancia de PersistenceManager
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			//pm.makePersistent(mibebida);
			for(int i=0;i<bebidas.length;i++){
				Key k = KeyFactory.stringToKey(bebidas[i]);
				Bebida a = pm.getObjectById(Bebida.class, k);
				
				pm.deletePersistent(a);
				
			}
	
			resp.sendRedirect("listabebida");
			//resp.sendRedirect("/ListaPlatos.jsp");
	}
	finally{
		pm.close();
	}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse	response) throws ServletException, IOException { 
		doGet(request, response);
	}
}