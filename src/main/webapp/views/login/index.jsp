<jsp:include page="/templates/head.jsp"></jsp:include>
<jsp:include page="/templates/navbar.jsp"></jsp:include>
<jsp:include page="/templates/alert.jsp"></jsp:include>
<div class="container">
<form action="login" method="post">
    <div class="row">
    
        <div class="col-md-offset-5 col-md-3">
            <div class="form-login">
            <h4>Login</h4>
            <input type="text" name="usuario" class="form-control input-sm chat-input" placeholder="Usuario" />
            </br>
            <input type="password" name="pass" class="form-control input-sm chat-input" placeholder="Contraseña" />
            </br>
            <div class="wrapper">
            
      		<input type="submit" class="btn btn-primary btn-md" value="Login">
     
            </div>
            </div>
  
        
        </div>
	
    </div>
    </form>
</div>
<jsp:include page="/templates/footer.jsp"></jsp:include>