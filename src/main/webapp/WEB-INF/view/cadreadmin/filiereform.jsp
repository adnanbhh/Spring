<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Filiere</title>
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
		crossorigin="anonymous">
		<link href="style.css" rel="stylesheet">
				<jsp:include page="style.jsp" />
		</head>
<body>
	<div class="container">
			<jsp:include page="navcadreadmin.jsp" />
		</br></br></br> 
		<div>
		
			<h3>Filiere</h3>
		</div>
		
		<div>
			<f:form action="addFiliere" method="POST" modelAttribute="FiliereModel" class="box">
				<div class="row">
					<div class="col">
						<label>Titre</label>
							<f:input path="titreFiliere" type="text" class="form-control"
								placeholder="Titre de filiere" />
							<f:errors path="titreFiliere" class="text-danger" />
					</div>
					<div class="col">
						<label>Code</label>
							<f:input path="codeFiliere" type="text" class="form-control"
								placeholder="Code de filiere" />
							<f:errors path="codeFiliere" class="text-danger" />
					</div>
					<div class="col">
						<label>Année d'accreditation</label>
							<f:input path="anneeaccreditation" type="number" class="form-control"
								placeholder="Année d'accreditation" />
							<f:errors path="anneeaccreditation" class="text-danger" />
						</div>
					
					<div class="col">
						<label>Fin d'accreditation</label>
						<f:input path="anneeFinaccreditation" type="number" class="form-control"
							placeholder="Année de Fin d'accreditation" />
						<f:errors path="anneeFinaccreditation" class="text-danger" />
					</div>
			</div>
			<div style="text-align: right">
			<br>
					<button type="submit" class="btn btn-primary">Register</button>
					<button type="reset" class="btn btn-secondary">Rest</button>
				</div>
				</f:form>
				</div>
				</br></br></br>
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
							<td><c:out value="${p.titreFiliere}" /></td>
							<td><c:out value="${p.codeFiliere}" /></td>
							<td><c:out value="${p.anneeaccreditation}" /></td>
							<td><c:out value="${p.anneeFinaccreditation}" /></td>
							<td>
								<ul>
									<li><a href="deleteFiliere/${p.idFiliere}">Delete</a></li>
	
									<li><a href="updateFiliere/${p.idFiliere}">Update</a></li>
								</ul>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
</body>
</html>