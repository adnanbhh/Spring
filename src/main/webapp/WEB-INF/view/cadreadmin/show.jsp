<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Show</title>
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
		crossorigin="anonymous">
	
					<jsp:include page="style.jsp" />

	</head>

<body>
	<jsp:include page="navcadreadmin.jsp" />		
		<div>
			<h3>Show</h3>
		</div>
		
			<div>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Titre</th>
							<th scope="col">Code</th>
							<th scope="col">Année d'accreditation</th>
							<th scope="col">Année de Fin d'accreditation</th>
						</tr>
					</thead>
					<c:forEach items="${filiereList}" var="p">
						<tr>
							<td><a href="showF/${p.idFiliere}"><c:out value="${p.titreFiliere}" /></a></td>
							<td><c:out value="${p.codeFiliere}" /></td>
							<td><c:out value="${p.anneeaccreditation}" /></td>
							<td><c:out value="${p.anneeFinaccreditation}" /></td>
						</tr>
					</c:forEach>
				</table>
			</div>
</body>
</html>