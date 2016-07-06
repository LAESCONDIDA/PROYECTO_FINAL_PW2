<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="modelo.*" %>

<% Plato myPlato = (Plato) request.getAttribute("Plato");%>

<input type="hidden" id="idPlato" name="idPlato" value="<%= myPlato.getIdPlato() %>" />
<!--div class="form-group">
	<label for="ejemplo_email_3" class="col-lg-2 control-label">ID</label>
		<div class="col-lg-10">
			<input type="text" class="form-control" placeholder="ID" disabled>
		</div>
</div-->
																
<div class="form-group">
	<label for="ejemplo_password_3" class="col-lg-2 control-label" for="nombre">Nombre</label>
	<div class="col-lg-10">
		<input type="text" class="form-control" placeholder="Nombre" id="nombre" name="nombre" value="<%= myPlato.getNombre() %>"/>
	</div>
</div>
								
<div class="form-group">
	<label for="ejemplo_password_3" class="col-lg-2 control-label" for="precio">Precio</label>
	<div class="col-lg-10">
		<input type="text" class="form-control" placeholder="Precio" id="precio" name="precio" value="<%= myPlato.getPrecio() %>"/>
	</div>
</div>
								
<div class="form-group">
	<label for="ejemplo_password_3" class="col-lg-2 control-label" for="Categoria">Categoria</label>
	<div class="radio col-lg-10">
	<% if(myPlato.getCategoria().equals("Entrada")){ %>
		<label class="radio"><input type="radio" id="categoria" name="categoria" value="Entrada" checked>Entrada</label>
		<label class="radio"><input type="radio" id="categoria" name="categoria" value="Plato de Fondo">Plato de Fondo</label>
		<label class="radio"><input type="radio" id="categoria" name="categoria" value="Postre">Postre</label>
	<%} %>
  	<% if(myPlato.getCategoria().equals("Plato de Fondo")){ %>
  		<label class="radio"><input type="radio" id="categoria" name="categoria" value="Entrada" >Entrada</label>
		<label class="radio"><input type="radio" id="categoria" name="categoria" value="Plato de Fondo" checked>Plato de Fondo</label>
		<label class="radio"><input type="radio" id="categoria" name="categoria" value="Postre">Postre</label>
	<%} %>
  	<% if(myPlato.getCategoria().equals("Postre")){ %>
  		<label class="radio"><input type="radio" id="categoria" name="categoria" value="Entrada" >Entrada</label>
		<label class="radio"><input type="radio" id="categoria" name="categoria" value="Plato de Fondo">Plato de Fondo</label>
		<label class="radio"><input type="radio" id="categoria" name="categoria" value="Postre" checked>Postre</label>
	<%} %>
	</div>
</div>
								
<div class="form-group">
	<label for="ejemplo_password_3" class="col-lg-2 control-label" for="imagen">Imagen</label>
	<div class="col-lg-10">
		<input type="file" class="btn btn-default" id="imagen" name="imagen" accept="image/*" value="<%=myPlato.getImagen()%>">
	</div>
</div>

<div class="form-group">
	<label for="ejemplo_password_3" class="col-lg-2 control-label" for="descripcion">Descripcion</label>
	<div class="col-lg-10">
		<input type="text" class="form-control" placeholder="Descripcion" id="descripcion" name="descripcion" value="<%=myPlato.getDescripcion()%>"/>
	</div>
</div>
								
<div class="form-group">
	<div class="col-lg-12 enviar">
			<input type="reset" value="Limpiar" class="btn btn-default"/>
			<input type="button" class="btn btn-default" id="guardar" value="Guardar"/>
	</div>
</div>

<script type="text/javascript" src="js/platoAjax.js"></script>