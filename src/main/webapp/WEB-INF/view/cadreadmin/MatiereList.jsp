<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Matiere</title>
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
			<h3>Update Matiere</h3>
		</div>
		<div>
			<f:form action="http://localhost:8081/absence_management/cadre/updateMatiereForm"
				method="POST" modelAttribute="MatiereModel" class="box">
				<f:hidden path="idMatiere" />
					<div class="row">
					<div class="col">
						<label>Titre de Matiere</label>
						<f:input path="nom" type="text" class="form-control"
							placeholder="Nom" />
						<f:errors path="nom" class="text-danger" />
					</div>

					<div class="col">
						<label>Code</label>
						<f:input path="code" type="text" class="form-control"
							placeholder="code" />
						<f:errors path="code" class="text-danger" />
					</div>
					<div class="col">
							<label>Module</label>
							<select name="idModule">			
								<c:forEach items="${moduleList}" var="p">		
									<option value="${p.idModule}">
										<c:out value="${p.titre}" />
									</option>	
								</c:forEach>		
							</select> 
						</div>
					
				</div>


				<div style="text-align: right">
					<button type="submit" class="btn btn-primary">Update</button>
					<button type="reset" class="btn btn-secondary">Rest</button>
				</div>

			</f:form>
			</div>
</body>
</html>