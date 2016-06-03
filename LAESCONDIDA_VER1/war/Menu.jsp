<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Menu</title>
	<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
	
	<meta charset="UTF-8" name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<link href="css/style.css" rel="stylesheet" type="text/css"  media="all" />

		<script type="text/javascript" src="js/move-top.js"></script>
		<link href="css/slider.css" rel="stylesheet" type="text/css"  media="all" />
		<link href="css/roboto.css" rel='stylesheet' type='text/css'>
		<script src="js/jquery.min.js"></script>

		<script type="text/javascript" src="js/jquery.easing.1.3.js"></script> 

	    <script type="text/javascript" src="js/camera.min.js"></script>
			<script type="text/javascript">
		   jQuery(function(){
				jQuery('#camera_wrap_1').camera({
					height: '500px',
					pagination: false,
				});
			});
	  	</script>
		<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
				});
			});
		</script>
	
	
</head>
<body>
	
	<div class="slider"  id="top">					     
		<div class="camera_wrap camera_azure_skin" id="camera_wrap_1">									           
			<div data-src="images/slider1.jpg">  </div> 
			<div data-src="images/slider2.jpg">  </div>
			<div data-src="images/slider3.jpg">  </div>
			<div data-src="images/slider4.jpg">  </div>
		</div>	
		
		<div class="clear"> </div>				       
	</div>
	
	<div class="clear"> </div>
		      			
	<div class="wrap">
		<div class="contenedor">
			<div class="top-header">
				<div class="container"><img src="images/logo.png" title="logo" /><strong>Tradicion Arequipeña</strong></div> 	
			    <div class="clear"> </div>
			</div>
		</div>
		
		<div class="content">
		
		<div class="top-grids">
			<nav class="navbar navbar-inverse navbar-static-top" role="navigation">
				<div class="container-fluid">
					<div class="navbar-header"><a class="navbar-brand" href="#">Usuarios</a></div>
					<ul class="nav navbar-nav">
						<li><a href="Bebida.jsp">Bebidas</a></li>
						<li><a href="Plato.jsp">Platos</a></li>
						<li><a href="Mesa.jsp">Mesas</a></li> 
						<li class="active"><a href="#">Menu del dia</a></li> 
					</ul>

					<form class="navbar-form navbar-right" role="search">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Buscar">
						</div>
						<button type="submit" class="btn btn-default">
							<span class="glyphicon glyphicon-search"></span>
						</button>
					</form>
				</div>
			</nav>
		</div>
		
		</div>
			<div class="clear"></div>
				<div class="mid-grids">
					<div class="row">
						<div class="col-md-2">
							<div class="panel panel-success">
								<div class="panel-heading">
								    <h3 class="panel-title">Categoria</h3>
								</div>
																
								<div class="panel-body" id="seleccionMenu">
									<select class="form-control" size="6" id=tiposplato style="scroll-y:hidden;">
										<option value="Entreda">Entradas</option>
									  	<option value="Plato de Fondo">Platos de Fondo</option>
									  	<option value="Postre">Postres</option>
									  	<option value="Gaseosa">Gaseosas</option>
									  	<option value="Cervezas">Cervezas</option>
									  	<option value="Refrescos">Otras Bebidas</option>
									</select>
								 </div>
							</div>
						 </div>

						 <div class="col-md-10">
						 <form>
							<div class="panel panel-info">
								<div class="panel-heading">
									<h3 class="panel-title">CATALOGO</h3>
								 </div>
								 <div class="panel-body operaciones">
								 
								 <!--Aqui empieza una fila de platos -->
								 <div class="row">
								 	<div class="col-md-3">
										<img src="images/prueba.jpg" alt="..." class="img-thumbnail">
										<div class="panel panel-default">
		  									<div class="panel-body eleccion_comida">
												<div class="checkbox">
													<label><input type="checkbox" value="nombre_comida">Nombre de entrada</label>
												</div>
												<div><input type="number" class="form-control" placeholder="Cantidad" value="0"></div>
											</div>
										</div>
									</div>
									
									<div class="col-md-3">
										<img src="images/prueba.jpg" alt="..." class="img-thumbnail">
										<div class="panel panel-default">
  											<div class="panel-body eleccion_comida">
												<div class="checkbox">
													<label><input type="checkbox" value="nombre_comida">Nombre de entrada</label>
												</div>
										      	<div><input type="text" class="form-control" placeholder="Cantidad"></div>
										   	</div>
										</div>
									</div>
									
									<div class="col-md-3">
										<img src="images/prueba.jpg" alt="..." class="img-thumbnail">
										<div class="panel panel-default">
  											<div class="panel-body eleccion_comida">
												<div class="checkbox">
												  	<label><input type="checkbox" value="nombre_comida">Nombre de entrada</label>
												</div>
										   		<div><input type="text" class="form-control" placeholder="Cantidad"></div>
											</div>
										</div>
									</div>
									<div class="col-md-3">
										<img src="images/prueba.jpg" alt="..." class="img-thumbnail">
										<div class="panel panel-default">
  											<div class="panel-body eleccion_comida">
												<div class="checkbox">
													<label><input type="checkbox" value="nombre_comida">Nombre de entrada</label>
												</div>
											   	<div><input type="text" class="form-control" placeholder="Cantidad"></div>
											</div>
										</div>
									</div>
								</div>
								
								<!--Aqui empieza la otra fila de platos -->
								<div class="row">
						  			<div class="col-md-3">
										<img src="images/prueba.jpg" alt="..." class="img-thumbnail">
										<div class="panel panel-default">
  											<div class="panel-body eleccion_comida">
												<div class="checkbox">
													<label><input type="checkbox" value="nombre_comida">Nombre de entrada</label>
												</div>
												<div><input type="text" class="form-control" placeholder="Cantidad"></div>
											</div>
										</div>
									</div>
									
									<div class="col-md-3">
										<img src="images/prueba.jpg" alt="..." class="img-thumbnail">
										<div class="panel panel-default">
  											<div class="panel-body eleccion_comida">
												<div class="checkbox">
													<label><input type="checkbox" value="nombre_comida">Nombre de entrada</label>
												</div>
												<div><input type="text" class="form-control" placeholder="Cantidad"></div>
											</div>
										</div>
									</div>
									
									<div class="col-md-3">
										<img src="images/prueba.jpg" alt="..." class="img-thumbnail">
										<div class="panel panel-default">
  											<div class="panel-body eleccion_comida">
												<div class="checkbox">
													<label><input type="checkbox" value="nombre_comida">Nombre de entrada</label>
												</div>
											  	<div><input type="text" class="form-control" placeholder="Cantidad"></div>
											</div>
										</div>
									</div>
									
									<div class="col-md-3">
										<img src="images/prueba.jpg" alt="..." class="img-thumbnail">
										<div class="panel panel-default">
  											<div class="panel-body eleccion_comida">
												<div class="checkbox">
													<label><input type="checkbox" value="nombre_comida">Nombre de entrada</label>
												</div>
											   	<div><input type="text" class="form-control" placeholder="Cantidad"></div>
											</div>
										</div>
									</div>
								</div>
							</div>
							
							<div class="panel-footer enviar">
								<div class="form-group">
									<input type="submit" class="btn btn-primary btnop" value="Enviar">
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>	
	
	<script src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/menuAjax.js"></script>
	
	
	<div id="menu"></div>

</body>
</html>