<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="SHIELD - Free Bootstrap 3 Theme">
    <meta name="author" content="Carlos Alvarez - Alvarez.is - blacktie.co">
    <link rel="shortcut icon" href="assets/ico/favicon.png">

    <title> SHIELD - Free Bootstrap 3 Theme</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="assets/css/main.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/icomoon.css">
    <link href="assets/css/animate-custom.css" rel="stylesheet">


    
    <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,300,700' rel='stylesheet' type='text/css'>
    
    <script src="assets/js/jquery.min.js"></script>
	<script type="text/javascript" src="assets/js/modernizr.custom.js"></script>
    
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="assets/js/html5shiv.js"></script>
      <script src="assets/js/respond.min.js"></script>
    <![endif]-->
  </head>

  <body data-spy="scroll" data-offset="0" data-target="#navbar-main">
  
  
  	<div id="navbar-main">
      <!-- Fixed navbar -->
    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="icon icon-shield" style="font-size:30px; color:#3498db;"></span>
          </button>
          <a class="navbar-brand hidden-xs hidden-sm" href="#home"><span class="icon icon-shield" style="font-size:18px; color:#3498db;"></span></a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li> <a href="index.jsp" class="smoothScroll"> Inicio</a></li>
			<li> <a href="#contact" class="smoothScroll"> Contact</a></li></ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>
    </div>
 <section>
	    	<div class="row white" id="icon">
	    		<figure>
	    			<img src="http://gprint.ctis.com.br/IMG/icone_usuario.png"></img>

				</figure>
					<p id="nomeCli"><span id="nomeCliente">${nomeUser} ${sobreUser }</span></p>





	    	</div>

	    </section>
<div class="row" >
	    <div class="cou">
		</br>
		</br>
		</br>
			 		
						<form class="form-horizontal" role="form" action="Servlet01">
							<div class="form-group">
						    <label for="text1" class="col-lg-4 control-label"></label>
						    <div class="col-lg-10">
						      <input type="text" class="form-control" id="emailU" placeholder="Digite o E-mail do usuário..." name="email">
						    </div>
						  </div>
						  
						  

						 	<div class="form-group ">
						    <label for="text1" class="col-lg-4 ">Doação</label>
						    
						    <div class="col-lg-10">
						       <select name="tipo" id="tipoO" >
						     <option>Selecione</option>
   							 <option  value="roupa">Roupas</option>
   							 <option  value="brinquedo">Brinquedo</option>
						     <option  value="moveis">Móveis</option>
						     </select>

   						    </div>
						    </div>
						 

<!-- 						  <div class="form-group"> -->
<!-- 						    <label for="text1" class="col-lg-4 "></label> -->
<!-- 						    <div class="col-lg-10"> -->
<!-- 						      <input type="text" class="form-control" id="tipoO" placeholder="Digite o nome do objeto..." maxlength="30" required="required" name="tamanho"> -->
<!-- 						    </div> -->
<!-- 						  </div> -->
						  
						  <div class="form-group">
						    <label for="text1" class="col-lg-4 control-label"></label>
						    <div class="col-lg-10">
						      <input type="text" class="form-control" id="descricaoO" placeholder="Descrição do objeto..." maxlength="60" required="required" name="descricao">
							<input type="hidden" name="form" value="cadastroDoacao"/>
						    </div>
						  </div>
						  
						  <div class="form-group">
						    <label for="text1" class="col-lg-4 "></label>
						    <div class="col-lg-10">
						      <input type="text" class="form-control" id="QtO" placeholder="Digite a quantidade de objetos a serem doados..." maxlength="4" required="required" name="qtd">
						    </div>
						  </div>
						  
<!-- 						  <div class="form-group"> -->
<!-- 						    <label for="text1" class="col-lg-4 "></label> -->
<!-- 						    <div class="col-lg-10"> -->
<!-- 						      <input type="text" class="form-control" id="estadoO" placeholder="Digite o estado do objeto(Ruim, regular, bom)..." maxlength="4" required="required" name="tamanho"> -->
<!-- 						    </div> -->
<!-- 						  </div> -->

						<div class="form-group ">
						    <label for="text1" class="col-lg-4 ">Estado</label>
						    
						    <div class="col-lg-10">
						       <select name="estado" id="estadoO" >
						     <option>Selecione</option>
   							 <option  value="reforma">Precisa de reforma</option>
   							 <option  value="usado">Usado</option>
						     <option  value="novo">Novo</option>
						     </select>

   						    </div>
						  </div>

<!-- 						  <div class="form-group"> -->
<!-- 						    <label for="text1" class="col-lg-4 "></label> -->
<!-- 						    <div class="col-lg-10"> -->
<!-- 						      <input type="text" class="form-control" id="descricaoO" placeholder="Descrição do objeto..." maxlength="20" required="required" name="descricao"> -->
<!-- 						    </div> -->
<!-- 						  </div> -->
						  
<!-- 						  <div class="form-group"> -->
<!-- 						    <label for="text1" class="col-lg-4 "></label> -->
<!-- 						    <div class="col-lg-10"> -->
<!-- 						      <input type="text" class="form-control" id="generoO" placeholder="Digite o gênero do objeto(Masculino ou feminino)..." maxlength="9" required="required" name="tamanho"> -->
<!-- 						    </div> -->
<!-- 						  </div> -->
						  
						  <div class="form-group ">
						    <label for="text1" class="col-lg-4 ">Gênero</label>
						    
						    <div class="col-lg-10">
						       <select name="genero" id="generoO" >
						     <option>Selecione</option>
   							 <option  value="masculino">Masculino</option>
   							 <option  value="feminino">Feminino</option>
						     <option  value="genero">Sem Gênero</option>
						     </select>

   						    </div>
						  </div>


						  <div class="form-group">
						    <div class="col-lg-10">
						      <button type="submit" class="btn btn-success" onclick="javascript:validarObjeto()">Cadastrar Objeto</button>
						    </div>
						  </div>
						
					   </form><!-- form -->
					</div>
					
					<p>${msg}</p>
</div>
		<div id="footerwrap">
			<div class="container">
				<h4>Criado por <a href="http://blacktie.co">HelpBox.com.br</a> - Copyright 2015</h4>
			</div>
		</div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
		

	<script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="assets/js/retina.js"></script>
	<script type="text/javascript" src="assets/js/jquery.easing.1.3.js"></script>
    <script type="text/javascript" src="assets/js/smoothscroll.js"></script>
	<script type="text/javascript" src="assets/js/jquery-func.js"></script>
  </body>
</html>
