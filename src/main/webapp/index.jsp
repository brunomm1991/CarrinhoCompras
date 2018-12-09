<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<title>Loja virtual - Stone</title>
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
		</div>
		<footer class="row">rodape</footer>
	</div>

</body>
</html>
