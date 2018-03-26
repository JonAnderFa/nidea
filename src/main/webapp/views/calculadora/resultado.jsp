<jsp:include page="/templates/head.jsp"></jsp:include>
<jsp:include page="/templates/navbar.jsp"></jsp:include>
<%
float resul=(Float)request.getAttribute("resultado");%>
<h1>RESULTADO DE LA OPERACION: <%=resul %></h1>
<a href="calculadora">Volver</a>

<jsp:include page="/templates/footer.jsp"></jsp:include>