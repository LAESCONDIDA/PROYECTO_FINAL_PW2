/**
 * 
 */
$(document).ready(function(){
	$('#list').hide();
	$("#list").on("click",function(event){
		$.get('listabebida', function(responseText) {$("#tabla").html(responseText);});
	});
	$("#list").trigger( "click" );
	

	$('#submit').click(function(event) {
		var nombreVar = $('#nombre').val();
		var precioVar = $('#precio').val();
		var categoriaVar = $('#categoria:checked').val();
		var imagenVar = $('#imagen').val();
		// Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
		$.post('guardarbebida', {
			nombre : nombreVar,
			precio: precioVar,
			categoria: categoriaVar,
			imagen: imagenVar
			}, function(responseText) {
				$('#tabla').html(responseText);
				});
	});

	
	$("#eliminar").click(function(event){
		var listBebidas =[];
		$('input[name="eliminar"]:checked').each(function() {
			//$(this).val() es el valor del checkbox correspondiente
			listBebidas.push($(this).val());
		});
		if(listBebidas.length>0){
			$.get('eliminarbebida',{eliminar: listBebidas},
					function(responseText) {
						$('#tabla').html(responseText);
			});
		}
		else{
			alert("escoge por lo menos un elemento");
		}
		
	});
	
	/*BOTON MODIFICAR */
	$("#modificar").click(function(event){
		var listBebidas =[];
		$('input[name="eliminar"]:checked').each(function() {
			//$(this).val() es el valor del checkbox correspondiente
			listBebidas.push($(this).val());
		});
		if(listBebidas.length==1){
			$.get('modificarbebida',{modificar: listBebidas[0]},
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
		var idVar = $('#idBebida').val();
		
		// Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
		$.post('guardarbebida', {
			nombre : nombreVar,
			precio: precioVar,
			categoria: categoriaVar,
			imagen: imagenVar,
			idBebida:idVar
			}, function(responseText) {
				$('#tabla').html(responseText);
				});
	});
	
	$('#buscarbebida').change( function() {
	    var catVar = $(this).find('option:selected').val();
	    $.get('buscarbebida', {
			categoria : catVar,
			}, function(responseText) {
				$('#tabla').html(responseText);
				});
	});
	
	
	
}); 