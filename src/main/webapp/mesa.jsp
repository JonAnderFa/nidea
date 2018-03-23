<%@page import="com.iparek.formacion.nidea.pojo.Mesa"%>
<jsp:include page="templates/head.jsp"></jsp:include>
<jsp:include page="templates/navbar.jsp"></jsp:include>
<br>
<%
//Recoger atributo del controlador, si es que existe
Mesa mesa = (Mesa)request.getAttribute("mesa");
%>
<div onchange="cambiar()">
	<p>Precio <%= mesa.getPrecio() %> &euro;</p>
		<form action="generar-mesa" method="post" onload="cambiar()">
			<div class="form-group">
				<label for="patas">Numero de patas:</label>
				<input type="number" name="patas" value="<%=mesa.getNumeroPatas() %>" required>
			</div>
			<div class="form-group">
				<label for="dimension">Dimension en m2:</label>
				<input type="number" name="dimension" value="<%=mesa.getDimension() %>" required>
			</div>
			<div class="form-group">
			    <label for="exampleFormControlSelect1">Selecciona el material</label>
			    <select class="form-control" id="material" name="material" >
			    <%for (int i = 0; i < Mesa.MATERIAL_LISTA.length; i++){ %>
			    	<option value="<%= Mesa.MATERIAL_LISTA_CODIGO[i] %>"
			    	<%=(mesa.getMaterial()== Mesa.MATERIAL_LISTA_CODIGO[i])?"selected":"" %>>
			    	<%=Mesa.MATERIAL_LISTA[i] %>
			    	</option>
			    <%} %>
			    </select>
		  	</div>
		  	<div class="form-group" >
				<p>Color: <input type="color"  disabled value="<%=mesa.getColor() %>"></p>
				<p>¿ Quieres Personalizar el Color ? 
					<input type="checkbox" id="custom"name="custom" onclick="cambiar()" <%=(mesa.isCustom())?"checked":""%>>
					<input type="color" id="selectColor"name="color" value="<%=mesa.getColor() %>" style="visibility: hidden"> 
				</p>
		  	</div>
			<input type="submit" value="Calcular Precio">
		
		</form>
	</div>
	<script>
	cambiar();
	function cambiar(){
		
		if(document.getElementById('custom').checked){
			document.getElementById('selectColor').style.visibility='visible';
		}else{
			document.getElementById('selectColor').style.visibility='hidden';
		}
		
	}
	
	</script>
<jsp:include page="templates/footer.jsp"></jsp:include>