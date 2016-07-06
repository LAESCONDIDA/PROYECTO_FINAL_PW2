<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="javax.servlet.http.HttpSession"%>


<%HttpSession misesion= request.getSession(); %>


<div class="col-md-2">
						  		<div class="panel panel-success" disable>
								  <div class="panel-heading">
								    <h3 class="panel-title">Categoria</h3>
								  </div>
								  <div class="panel-body">
								    <select multiple class="form-control" size="6" disabled>
									  <option>Entradas</option>
									  <option>Platos de Fondo</option>
									  <option>Postres</option>
									  <option>Gaseosas</option>
									  <option>Cervezas</option>
									  <option>Otras Bebidas</option>
									</select>
								  </div>
								</div>
						  	</div>

						  	<div class="col-md-10">
						  	
								<div class="panel panel-info">
								  <div class="panel-heading">
								    <h3 class="panel-title">INFORMACION</h3>
								  </div>
								  	<div class="panel-body operaciones">

						  				<h3>MENU AGREGADO SATISFACTORIAMENTE </h3>
								  		 	
									</div>

								</div>
							</div>
							
							
<%misesion.invalidate(); %>