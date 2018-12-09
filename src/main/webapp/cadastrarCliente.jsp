<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery.js"></script>
<link rel="stylesheet" type="text/css" href="css/estilos.css" />
</head>
<body>
	<div class="container">
		<header class="row">
			<nav>
				<ul class="menu">
					<li><a href="index.jsp">Home</a></li>
					<li><a href="#">Cliente</a>
						<ul>
							<li><a href="cadastrarCliente.jsp">Cadastrar</a></li>
							<li><a href="ClienteAction.action">Consultar</a></li>
						</ul></li>
					<li><a href="#">Produto</a>
						<ul>
							<li><a href="cadastrarProduto.jsp">Cadastrar</a></li>
							<li><a href="ProdutoAction.action">Consultar</a></li>
						</ul></li>
				</ul>
			</nav>
		</header>
		<div class="row">
			<div role="main">
				<form action="adicionaCliente">
					<div class="form-group">
						<label for="nome">Nome</label> <input type="text"
							class="form-control" id="nome" aria-describedby="nome"
							placeholder="Seu nome">
					</div>
					<div class="form-group">
						<label for="cpf">CPF</label> <input type="text"
							class="form-control" id="cpf" placeholder="CPF">
					</div>

					<button type="submit" class="btn btn-primary">Enviar</button>
				</form>
			</div>
		</div>
		<footer class="row">rodape</footer>
	</div>
</body>
</html>