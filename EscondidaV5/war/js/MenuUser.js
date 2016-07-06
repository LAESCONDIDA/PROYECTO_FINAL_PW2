/**
 * 
 */
$(document).ready(function(){
	
	$('#agregar').click(function(event){
		var lista =[];
		var tipo="";
		$('input[name="platos"]:checked').each(function() {
			//$(this).val() es el valor del checkbox correspondiente
			lista.push($(this).val());
			tipo="Platos";
		});
		
		if(lista.length>0){
			var cantidadVar=[];
			for(i=0;i<lista.length;i++){
				var idVar='#'+lista[i];
				cantidadVar.push($(idVar).val());
			}
			
			alert(lista[1]);
			alert(cantidadVar[1]);
			$.post('listaseleccionuser',{"codigo[]": lista, "cantidades[]": cantidadVar},
					function(responseText) {
						$('#cuadros').html(responseText);
					});
		}
		else{
			alert("escoge un elemento");
		}
	});
	
	
	$('#finalizar').click(function(event){
		
		$.get('guardarmenu',function(responseText) {
						$('#cuerpo').html(responseText);
		});
		
	});
	
	
});