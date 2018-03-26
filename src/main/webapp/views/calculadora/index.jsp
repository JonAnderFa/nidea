<jsp:include page="/templates/head.jsp"></jsp:include>
<jsp:include page="/templates/navbar.jsp"></jsp:include>
<jsp:include page="/templates/alert.jsp"></jsp:include>

<br>
Formulario Calcular
<form action="calculadora" method="post">
 	<div class="form-group">
	    <label for="num1">Numero</label>
	    <input type="text" class="form-control" name="num1">
  	</div>
   	<div class="form-group">
	    <label for="num2">Numero 2</label>
	    <input type="text" class="form-control" name="num2">
	</div>
	<div class="form-group">
		<label for="exampleFormControlSelect1">Selecciona la operacion</label>
		<select class="form-control" id="operador" name="operador">
			<option value="1">Suma</option>
			<option value="2">Resta</option>
			<option value="3">Multiplicacion</option>
			<option value="4">Division</option>
		</select>
	</div>
<input type="submit" value="Calcular">
</form>
<jsp:include page="/templates/footer.jsp"></jsp:include>