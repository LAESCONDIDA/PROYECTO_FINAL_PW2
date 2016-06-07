/**
 * 
 */

$(document).ready(function(){
	$('#list').hide();
	$('#list').on('click',function(event){
		 var catVar = "Entrada";
		 $.get('listaplatomenu', {
				categoria : catVar
				}, function(responseText) {
					$('#cuadros').html(responseText);
				});
	});
	$('#list').trigger( 'click' );
	

	$('#seleccionMenu').change( function() {
	    var catVar = $(this).find('option:selected').val();
	    $.get('listaplatomenu', {
			categoria : catVar
			}, function(responseText) {
				$('#cuadros').html(responseText);
				});
	});

	/*$('#agregar').click(function(event){
		var lista =[];
		var tipo="";
		$('input[name="Entrada"]:checked').each(function() {
			//$(this).val() es el valor del checkbox correspondiente
			lista.push($(this).val());
			tipo="Plato";
		});
		$('input[name="Plato de Fondo"]:checked').each(function() {
			//$(this).val() es el valor del checkbox correspondiente
			lista.push($(this).val());
			tipo="Plato";
		});
		$('input[name="Postre"]:checked').each(function() {
			//$(this).val() es el valor del checkbox correspondiente
			lista.push($(this).val());
			tipo="Plato";
		});
		$('input[name="Gaseosa"]:checked').each(function() {
			//$(this).val() es el valor del checkbox correspondiente
			lista.push($(this).val());
			tipo="Bebida";
		});
		$('input[name="Cerveza"]:checked').each(function() {
			//$(this).val() es el valor del checkbox correspondiente
			lista.push($(this).val());
			tipo="Bebida";
		});
		$('input[name="Refresco"]:checked').each(function() {
			//$(this).val() es el valor del checkbox correspondiente
			lista.push($(this).val());
			tipo="Bebida";
		});
		if(lista.length>0){
			var cantidadVar=[];
			for(i=0;i<lista.length;i++){
				var idVar='#'+lista[i];
				cantidadVar.push($(idVar).val());
			}
			/*alert(cantidadVar[1]);*/
			/*$.get('listaseleccion',{codigos: lista, cantidades: cantidadVar,clase: tipo},
					function(responseText) {
						$('#cuadros').html(responseText);
					});*/
		/*}
		else{
			alert("escoge un elemento");
		}
	});*/
	
	/*$("#eliminar").click(function(event){
		var listBebidas =[];
		$('input[name="eliminar"]:checked').each(function() {
			//$(this).val() es el valor del checkbox correspondiente
			listBebidas.push($(this).val());
		});
		if(listBebidas.length>0){
			$.get('eliminarplato',{eliminar: listBebidas},
					function(responseText) {
						$('#tabla').html(responseText);
			});
		}
		else{
			alert("escoge por lo menos un elemento");
		}
		
	});
	
	/*BOTON MODIFICAR */
	/*$("#modificar").click(function(event){
		var listPlatos =[];
		$('input[name="eliminar"]:checked').each(function() {
			//$(this).val() es el valor del checkbox correspondiente
			listPlatos.push($(this).val());
		});
		if(listPlatos.length==1){
			$.get('modificarplato',{modificar: listPlatos[0]},
					function(responseText) {
						$('#formulario').html(responseText);
					});
		}
		else{
			alert("escoge un elemento");
		}
		
	});
	
	
	
	$('#guardar').click(function(event) {
		var nombreVar = $('#nombre').val();
		var precioVar = $('#precio').val();
		var categoriaVar = $('#categoria:checked').val();
		var imagenVar = $('#imagen').val();
		var descripcionVar = $('#descripcion').val();
		var idVar = $('#idPlato').val();
		
		// Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
		$.post('guardarplato', {
			nombre : nombreVar,
			precio: precioVar,
			categoria: categoriaVar,
			imagen: imagenVar,
			idPlato:idVar,
			descripcion: descripcionVar
			}, function(responseText) {
				$('#tabla').html(responseText);
				});
	});
	
	$('#buscarplato').change( function() {
	    var catVar = $(this).find('option:selected').val();
	    $.get('buscarplato', {
			categoria : catVar,
			}, function(responseText) {
				$('#tabla').html(responseText);
				});
	});
	*/
	
	
});