<jsp:include page="/templates/head.jsp"></jsp:include>
<jsp:include page="/templates/navbar.jsp"></jsp:include>
<jsp:include page="/templates/alert.jsp"></jsp:include>
<div class="container">
    <div class="row">
        <div class="col-md-offset-5 col-md-3">
            <div class="form-login">
            <h4>Login</h4>
            <input type="text" id="userName" class="form-control input-sm chat-input" placeholder="Usuario" />
            </br>
            <input type="password" id="userPassword" class="form-control input-sm chat-input" placeholder="Contraseña" />
            </br>
            <div class="wrapper">
            <span class="group-btn">     
                <a href="#" class="btn btn-primary btn-md">Login <i class="fa fa-sign-in"></i></a>
            </span>
            </div>
            </div>
        
        </div>
    </div>
</div>
<jsp:include page="/templates/footer.jsp"></jsp:include>