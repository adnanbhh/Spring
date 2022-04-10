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
	<jsp:include page="navcadreadmin.jsp" />		
		<div>
			<h3>Update Filiere</h3>
		</div>
		<div>
			<f:form action="http://localhost:8080/absence_management/cadre/updateFiliereForm"
				method="POST" modelAttribute="FiliereModel" class="box">
				<f:hidden path="idFiliere" />
					<div class="row">
					<div class="col">
						<label>Titre de filiere</label>
						<f:input path="titreFiliere" type="text" class="form-control"
							placeholder="Titre de filiere" />
						<f:errors path="titreFiliere" class="text-danger" />
					</div>

					<div class="col">
						<label>Code de Filiere</label>
						<f:input path="codeFiliere" type="text" class="form-control"
							placeholder="Code de filiere" />
						<f:errors path="codeFiliere" class="text-danger" />
					</div>
					
					
					<div class="col">
						<label>Année d'accreditation</label>
						<f:input path="anneeaccreditation" type="text" class="form-control"
							placeholder="Année d'accreditation" />
						<f:errors path="anneeaccreditation" class="text-danger" />
					</div>
					
					<div class="col">
						<label>Année de Fin d'accreditation</label>
						<f:input path="anneeFinaccreditation" type="text" class="form-control"
							placeholder="Année de Fin d'accreditation" />
						<f:errors path="anneeFinaccreditation" class="text-danger" />
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