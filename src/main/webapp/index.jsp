<jsp:include page="templates/head.jsp"></jsp:include>
<jsp:include page="templates/navbar.jsp"></jsp:include>
		<%
			//Scriplet
			//Varias sentencias
			String nombre="Pepe";
			String hora=" 10:50";
		
		%>
	<h2>Hello <%=nombre %></h2>
	<a href="generar-mesa">¿Quieres comprar una mesa?</a>
	<p><%= hora %></p>
<jsp:include page="templates/footer.jsp"></jsp:include>