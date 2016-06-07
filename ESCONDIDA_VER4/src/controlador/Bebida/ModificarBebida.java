package controlador.Bebida;

import java.io.IOException;
import java.io.PrintWriter;
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
public class ModificarBebida extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		String bebida = req.getParameter("modificar");
		PrintWriter out = resp.getWriter();		
		//creamos una instancia de PersistenceManager
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
	    try {
	    	Key k = KeyFactory.stringToKey(bebida);
			Bebida e = pm.getObjectById(Bebida.class, k);
			
			req.setAttribute("Bebida", e);
			RequestDispatcher rd = req.getRequestDispatcher("/ModificarBebida.jsp");
			rd.forward(req, resp);
			
		}catch(Exception e){
			System.out.println(e);
		}finally{
			pm.close();
		}

		
		
		/*PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			//pm.makePersistent(mibebida);
			for(int i=0;i<bebidas.length;i++){
				Key k = KeyFactory.stringToKey(bebidas[i]);
				Bebida a = pm.getObjectById(Bebida.class, k);
				
				pm.deletePersistent(a);
				
			}
			pm.close();
			
			final PersistenceManager pms = PMF.get().getPersistenceManager();
			final Query q = pms.newQuery(Bebida.class);
			
			try{
				@SuppressWarnings("unchecked")
				List<Bebida> lisbebidas = (List<Bebida>) q.execute();
				req.setAttribute("listaBebidas", lisbebidas);
				RequestDispatcher rd = req.getRequestDispatcher("/ListaBebidas.jsp");
				rd.forward(req, resp);
			}catch(Exception e){
				System.out.println(e);
			}finally{
				q.closeAll();
				pms.close();
			}
	}
	finally{
	
	}*/
	}
	public void doPost(HttpServletRequest request, HttpServletResponse	response) throws ServletException, IOException { 
		doGet(request, response);
	}

}
