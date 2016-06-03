<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="modelo.*" %>
<%@ page import="java.util.List" %>

<% List<Plato> platos = (List<Plato>) request.getAttribute("listaPlatos"); %>

<% for(Plato v:platos){ %>
	<div id="platos_lista">
		<div><img alt="" src=""></div>
		<div>
			<input type="checkbox"/>
			<label><%=v.getNombre() %></label>
		</div>
		<div><input type="number" name="cantidad"></div>
	</div>
	<% } %>
</table>