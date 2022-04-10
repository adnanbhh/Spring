<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Registration Form_Module</title>
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
				</br></br></br> 
		
		<div>
			<h3>Registration Form_Module</h3>
		</div>
		
		<div>
			<f:form action="addModule" method="POST" modelAttribute="ModuleModel" class="box">
				<div class="row">
					<div class="col">
						<label>Titre de Module</label>
							<f:input path="titre" type="text" class="form-control"
								placeholder="Titre" />
							<f:errors path="titre" class="text-danger" />
					</div>
					<div class="col">
						<label>Code de Module</label>
							<f:input path="code" type="text" class="form-control"
								placeholder="Code" />
							<f:errors path="code" class="text-danger" />
					</div>
					<div class="col">
							<label>Niveau</label>
							<select name="idNiveau">			
								<c:forEach items="${niveauList}" var="p">		
									<option value="${p.idNiveau}">
										<c:out value="${p.titre}" />
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
				</div>
						</br></br></br> 
				
			<div>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Titre de Module</th>
							<th scope="col">Code de Module</th>
							<th scope="col">idNiveau</th>
						</tr>
					</thead>
					<c:forEach items="${moduleList}" var="p">
						<tr>
							<td><c:out value="${p.titre}" /></td>
							<td><c:out value="${p.code}" /></td>
							<td><c:out value="${p.niveau.idNiveau}" /></td>
							<td>
								<ul>
									<li><a href="deleteModule/${p.idModule}">Delete</a></li>
	
									<li><a href="updateModule/${p.idModule}">Update</a></li>
								</ul>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
</body>
</html>