<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="modelo.*"%>
<%@page import="java.util.ArrayList"%>

<%HttpSession misesion= request.getSession(); %>

<%ArrayList<Plato> misEntradas=(ArrayList<Plato>)getServletContext().getAttribute("misEntradas");%>
<%ArrayList<String> misCanEntradas=(ArrayList<String>)getServletContext().getAttribute("misCanEntradas");%>


<div class="panel panel-info"> 
	<div class="panel-heading">
		<h3 class="panel-title">MENU SELECCIONADO</h3>
	</div>
	
	<div class="panel-body operaciones">
		<table class="table table-striped table-bordered">
			<col style="width:20%;" />
			<col style="width:50%;" />
			<col style="width:30%;" />
			<!-- DEFINIMOS LAS CABECERAS DE LA TABLA -->
			<tr>
				<th>CATEGORIA</th>
				<th>DESCRIPCION</th>
				<th>CANTIDAD</th>
			</tr>
			<!-- COLOCAMOS EL PRIMER ITEM SELECCIONADO -->
			<%if(misesion.getAttribute("misEntradas")!=null)
			for(int i=0;i<misEntradas.size();i++){ %>
			<tr>
				<td style="vertical-align:middle;"><label><%=misEntradas.get(i).getCategoria()%></label></td>
				<td>
					<img src="images/prueba.jpg" alt="..." class="img-thumbnail" width="100"><BR>
					<label><%=misEntradas.get(i).getNombre()%></label>  	
				</td>
				<td style="vertical-align:middle;">
					<div>
						<div class="col-md-6">
							<input type="number" class="form-control" value="<%=misCanEntradas.get(i)%>">
						</div>
						<button type="button" class="btn btn-primary">Eliminar</button>
					</div>
				</td>
			</tr>
			<%} %>
			
			
			
		</table>	
	</div>
	
	<div class="panel-footer enviar">
		<div class="form-group ">
			<input type="button" class="btn btn-success btnop" id="finalizar" value="FINALIZAR SELECCIÓN">
		</div>
	</div>
</div>

<script type="text/javascript" src="js/menu2Ajax.js"></script>
