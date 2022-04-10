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
	

	</head>
<body>
	<div class="container">
		<jsp:include page="navcadreadmin.jsp" />
	
		<div>
			<h3>Coordination</h3>
		</div>
		
		<div>
			<f:form action="addCoordination" method="POST" modelAttribute="CoordinationModel" class="box">
				<div class="row">
						<div class="col">
							<label>dateDebut</label>
							<f:input path="dateDebut" type="date" class="form-control"
								placeholder="dateDebut" />
							<f:errors path="dateDebut" class="text-danger" />
						</div>						
						<div class="col">
							<label>dateFin</label>
							<f:input path="dateFin" type="date" class="form-control"
								placeholder="dateFin" />
							<f:errors path="dateFin" class="text-danger" />
						</div>	
						<div class="col">
							<label>Filiere</label>
							<br>
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
			</div>
				
			<div>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">dateDebut</th>
							<th scope="col">dateFin</th>
							<th scope="col">Id Filiere</th>
						</tr>
					</thead>
					<c:forEach items="${coordinationList}" var="p">
						<tr>
							<td><c:out value="${p.dateDebut}" /></td>
							<td><c:out value="${p.dateFin}" /></td>
							<td><c:out value="${p.filiere.idFiliere}" /></td>
													<td>
								<ul>
									<li><a href="deleteCoordination/${p.idCoordination}">Delete</a></li>
	
									<li><a href="updateCoordination/${p.idCoordination}">Update</a></li>
								</ul>
							</td>
									
						</tr>
					</c:forEach>
				</table>
				</div>
	</div>
</body>
</html>