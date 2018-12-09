<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*,entity.*,dao.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Lista de Clientes Cadastrados</title>
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
		<header>
			<h3>Lista de Produtos Cadastrados</h3>
		</header>

		<table class="table">
			<tr>
				<td>Nome</td>
				<td>Preco</td>
				<td>Quantidade Disponivel</td>
				<td>Comprar</td>
			</tr>
			<s:iterator value="produtos" var="produto">
				<tr>
					<td><s:property value="nome" /></td>
					<td><s:property value="preco" /></td>
					<td><s:property value="quantidade" /></td>
					<td><input type="text" name="qtd" size="5" /></td>
					<td><a href="atualizar">Atualizar</a></td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>