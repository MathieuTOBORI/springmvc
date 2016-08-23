<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<meta charset="utf-8" />
<title></title>
</head>
<body>
	<span style="float: right"> <a href="/spring/?lang=fr">fr</a> | <a href="/spring/?lang=en">en</a>
	</span>

	<h1>
		 Spring MVC :
<%-- 		 <spring:message code="page.client.title"></spring:message> --%>
		
	</h1>
	<form:form method="post" modelAttribute="client" action="/spring/saveClient">
		<table id="form">
			<tr>
				<td>id:</td>
				<td><form:hidden path="id" />${client.id}</td>
				<td></td>
			</tr>
			<tr>
				<td>nom:</td>
				<td><form:input path="nom" /></td>
				<td><form:errors path="nom" /></td>
			</tr>
			<tr>
				<td>prénom:</td>
				<td><form:input path="prenom" /></td>
				<td><form:errors path="prenom" /></td>
			</tr>
			<tr>
				<td>login:</td>
				<td><form:input path="login" /></td>
				<td><form:errors path="login" /></td>
			</tr>
			<tr>
				<td>mot de passe:</td>
				<td><form:input path="motDePasse" /></td>
				<td><form:errors path="motDePasse" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Add/Edit client" /></td>
			</tr>
		</table>
	</form:form>
	<c:if test="${flashMsg != null}">
		<div class="${flashMsgClass}" id="flash">${flashMsg}</div>
	</c:if>
	<table id="prez">
		<tr>
			<th class="border">id</th>
			<th class="border">Nom</th>
			<th class="border">prenom</th>
			<th class="border">login</th>
			<th class="border">motdepasse</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach items="${clients}" var="client">
			<tr>
				<td>${client.id}</td>
				<td>${client.nom}</td>
				<td>${client.prenom}</td>
				<td>${client.login}</td>
				<td>${client.motDePasse}</td>
			</tr>
		</c:forEach>
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	</table>
</body>
</html>
