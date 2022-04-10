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
							<th scope="col">Titre de Matiere</th>
							<th scope="col">Code de Matiere</th>
							<th scope="col">idModule</th>
						</tr>
					</thead>
					<c:forEach items="${matiereList}" var="p">
						<tr>
							<td><c:out value="${p.nom}" /></td>
							<td><c:out value="${p.code}" /></td>
							<td><c:out value="${p.module.idModule}" /></td>
							<!--  <td>
								<ul>
									<li><a href="deleteMatiere/${p.idMatiere}">Delete</a></li>
	
									<li><a href="updateMatiere/${p.idMatiere}">Update</a></li>
								</ul>
							</td>-->
						</tr>
					</c:forEach>
				</table>
			</div>
</body>
</html>