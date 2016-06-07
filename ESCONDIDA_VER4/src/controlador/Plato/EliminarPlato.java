package controlador.Plato;

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
import modelo.Plato;

@SuppressWarnings("serial")
public class EliminarPlato extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		String[] platos = req.getParameterValues("eliminar[]");
				
		//creamos una istancia de PersistenceManager
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			//pm.makePersistent(miplato);
			for(int i=0;i<platos.length;i++){
				Key k = KeyFactory.stringToKey(platos[i]);
				Plato a = pm.getObjectById(Plato.class, k);
				
				pm.deletePersistent(a);
				
			}
			
			
			/*final PersistenceManager pms = PMF.get().getPersistenceManager();
			final Query q = pms.newQuery(plato.class);
			
			try{
				@SuppressWarnings("unchecked")
				List<plato> lisplatos = (List<plato>) q.execute();
				req.setAttribute("listaplatos", lisplatos);
				RequestDispatcher rd = req.getRequestDispatcher("/Listaplatos.jsp");
				rd.forward(req, resp);
			}catch(Exception e){
				System.out.println(e);
			}finally{
				q.closeAll();
				pms.close();
			}*/
			resp.sendRedirect("listaplato");
	}
	finally{
		pm.close();
	}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse	response) throws ServletException, IOException { 
		doGet(request, response);
	}
}