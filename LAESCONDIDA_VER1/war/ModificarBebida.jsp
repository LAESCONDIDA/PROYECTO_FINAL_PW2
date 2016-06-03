<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="modelo.*" %>

<% Bebida myBebida = (Bebida) request.getAttribute("Bebida");%>

<input type="hidden" id="idBebida" name="idBebida" value="<%= myBebida.getIdBebida() %>" />
<!--div class="form-group">
	<label for="ejemplo_email_3" class="col-lg-2 control-label">ID</label>
		<div class="col-lg-10">
			<input type="text" class="form-control" placeholder="ID" disabled>
		</div>
</div-->
																
<div class="form-group">
	<label for="ejemplo_password_3" class="col-lg-2 control-label" for="nombre">Nombre</label>
	<div class="col-lg-10">
		<input type="text" class="form-control" placeholder="Nombre" id="nombre" name="nombre" value="<%= myBebida.getNombre() %>"/>
	</div>
</div>
								
<div class="form-group">
	<label for="ejemplo_password_3" class="col-lg-2 control-label" for="precio">Precio</label>
	<div class="col-lg-10">
		<input type="text" class="form-control" placeholder="Precio" id="precio" name="precio" value="<%= myBebida.getPrecio() %>"/>
	</div>
</div>
								
<div class="form-group">
	<label for="ejemplo_password_3" class="col-lg-2 control-label" for="Categoria">Categoria</label>
	<div class="radio col-lg-10">
	<% if(myBebida.getCategoria().equals("Gaseosa")){ %>
		<label class="radio"><input type="radio" id="categoria" name="categoria" value="Gaseosa" checked>Gaseosa</label>
		<label class="radio"><input type="radio" id="categoria" name="categoria" value="Refresco">Refresco</label>
		<label class="radio"><input type="radio" id="categoria" name="categoria" value="Cerveza">Cerveza</label>
	<%} %>
  	<% if(myBebida.getCategoria().equals("Refresco")){ %>
  		<label class="radio"><input type="radio" id="categoria" name="categoria" value="Gaseosa" >Gaseosa</label>
		<label class="radio"><input type="radio" id="categoria" name="categoria" value="Refresco" checked>Refresco</label>
		<label class="radio"><input type="radio" id="categoria" name="categoria" value="Cerveza">Cerveza</label>
	<%} %>
  	<% if(myBebida.getCategoria().equals("Cerveza")){ %>
  		<label class="radio"><input type="radio" id="categoria" name="categoria" value="Gaseosa" >Gaseosa</label>
		<label class="radio"><input type="radio" id="categoria" name="categoria" value="Refresco">Refresco</label>
		<label class="radio"><input type="radio" id="categoria" name="categoria" value="Cerveza" checked>Cerveza</label>
	<%} %>
	</div>
</div>
								
<div class="form-group">
	<label for="ejemplo_password_3" class="col-lg-2 control-label" for="imagen">Imagen</label>
	<div class="col-lg-10">
		<input type="file" class="btn btn-default" id="imagen" name="imagen" accept="image/*" value="<%=myBebida.getImagen()%>">
	</div>
</div>
								
<div class="form-group">
	<div class="col-lg-12 enviar">
			<input type="reset" value="Limpiar" class="btn btn-default"/>
			<input type="button" class="btn btn-default" id="guardar" value="Guardar"/>
	</div>
</div>

<script type="text/javascript" src="js/bebidaAjax.js"></script>
