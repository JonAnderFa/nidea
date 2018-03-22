<%@page import="com.iparek.formacion.nidea.pojo.Mesa"%>
<jsp:include page="templates/head.jsp"></jsp:include>
<jsp:include page="templates/navbar.jsp"></jsp:include>
<br>
<%
//Recoger atributo del controlador, si es que existe
Mesa mesa = (Mesa)request.getAttribute("mesa");


%>
<p>Precio <%= mesa.getPrecio() %> &euro;</p>
	<form action="generar-mesa" method="post">
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
		    <%for(int i=0;i<5;i++){
		   %>
		   
		   <%=i %>
		   <%} %>
		    </select>
	  	</div>
		<input type="submit" value="Calcular Precio">
	
	</form>
	<!--   <form>
  <div class="form-group">
    <label for="exampleFormControlInput1">Email address</label>
    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
  </div>
  <div class="form-group">
    <label for="exampleFormControlSelect1">Example select</label>
    <select class="form-control" id="exampleFormControlSelect1">
      <option>1</option>
      <option>2</option>
      <option>3</option>
      <option>4</option>
      <option>5</option>
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlTextarea1">Example textarea</label>
    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
  </div>
</form>
-->
<jsp:include page="templates/footer.jsp"></jsp:include>