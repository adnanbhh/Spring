<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Registration Form_Filiere</title>
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
		crossorigin="anonymous">
	
						<jsp:include page="style.jsp" />

	</head>
<body>
	<div class="container">
		<jsp:include page="navcadreadmin.jsp" />
	</br></br>
		<div>
			<h3>Registration Form Niveau</h3>
		</div>
				</br></br></br> 
		
		
		<div>
			<f:form action="addNiveau" method="POST" modelAttribute="NiveauModel" class="box">
				<div class="row">
						<div class="col">
							<label>Titre</label>
							<f:input path="titre" type="text" class="form-control"
								placeholder="Titre" />
							<f:errors path="titre" class="text-danger" />
						</div>						
						<div class="col">
							<label>Alias</label>
							<f:input path="alias" type="text" class="form-control"
								placeholder="Alias" />
							<f:errors path="alias" class="text-danger" />
						</div>	
						<div class="col">
							<label>Filiere</label>
							<select name="idFiliere">			
								<c:forEach items="${filiereList}" var="p">		
									<option value="${p.idFiliere}">
										<c:out value="${p.titreFiliere}" />
									</option>	
								</c:forEach>		
							</select> 
						</div>		
					</div>
					<div style="text-align: right">
						<br>
							<button type="submit" class="btn btn-primary">Register</button>
							<button type="reset" class="btn btn-secondary">Rest</button>
					</div>
				</f:form>
			</div>		</br></br></br> 
			
				
			<div>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Alias</th>
							<th scope="col">Titre</th>
							<th scope="col">Id Filiere</th>
						</tr>
					</thead>
					<c:forEach items="${niveauList}" var="p">
						<tr>
							<td><c:out value="${p.alias}" /></td>
							<td><c:out value="${p.titre}" /></td>
							<td><c:out value="${p.filiere.idFiliere}" /></td>
													<td>
								<ul>
									<li><a href="deleteNiveau/${p.idNiveau}">Delete</a></li>
	
									<li><a href="updateNiveau/${p.idNiveau}">Update</a></li>
								</ul>
							</td>
									
						</tr>
					</c:forEach>
				</table>
				</div>
	</div>
</body>
</html>