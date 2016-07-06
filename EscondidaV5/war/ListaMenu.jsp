<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="modelo.*" %>
<%@ page import="java.util.List" %>

<% List<Plato> platos = (List<Plato>) request.getAttribute("listaPlatos"); %>

<table border="0" cellspacing="1" cellpadding="5" bgcolor="#CCCCCC">
	<tr bgcolor="#407BA8">
		<td style="color: #ffffff; font-weight: bold;">ID</td>
		<td style="color: #ffffff; font-weight: bold;">Nombre</td>
		<td style="color: #ffffff; font-weight: bold;">Precio</td>
		<td style="color: #ffffff; font-weight: bold;">Categoria</td>
		<td style="color: #ffffff; font-weight: bold;">Imagen</td>
		<td style="color: #ffffff; font-weight: bold;">Descripcion</td>
		<td style="color: #ffffff; font-weight: bold;">modificar?</td>
	</tr>
	<% for(Plato v:platos){ %>
	<tr bgcolor="#407BA8">
		<td bgcolor="#ffffff"><%= v.getIdPlato() %></td>
		<td bgcolor="#ffffff"><%= v.getNombre() %></td>
		<td bgcolor="#ffffff"><%= v.getPrecio() %></td>
		<td bgcolor="#ffffff"><%= v.getCategoria() %></td>
		<td bgcolor="#ffffff"><%= v.getImagen() %></td>
		<td bgcolor="#ffffff"><%= v.getDescripcion() %></td>
		<td bgcolor="#ffffff">
		<input type="checkbox" name="eliminar" id="eliminarm" value="<%=v.getIdPlato() %>"/>
		</td>
	</tr>
	<% } %>
</table>