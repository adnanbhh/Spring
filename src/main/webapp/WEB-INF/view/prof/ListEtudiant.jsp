<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags"%>
<script type="text/javascript"  src="${pageContext.request.contextPath }/js/jquery-1.10.2.js"></script>

<jsp:include page="../fragments/userheader.jsp" />
<div class="container">

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">

            <jsp:include page="../fragments/usermenu.jsp" />

        </div>
    </nav>
    <div>
        <h3>Prof home page</h3>
        <p>Hello and welcome to your application</p>

    </div>
  <f:form action="addabsents" method="POST" modelAttribute="absenceModel">

    <table class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">#idInscription</th>
        <th scope="col">nom</th>
        <th scope="col">prenom</th>
        <th scope="col">cne</th>
		<th><input type="checkbox" id="checkBoxAll" /></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach  items="${inscriptions}" var="p" >
    <tr>
    <th scope="row">${p.idInscription} </th>
        <td>${p.etudiant.nom}</td>
        <td>${p.etudiant.prenom}</td>
        <td>${p.etudiant.cne}</td>
        <td><input type="checkbox" class="chCheckboxId"  value="${p.idInscription}"></td>    
    </tr>
    </c:forEach>
    </tbody>
    </table>
    <div class="col">
							<label>Matiere</label>
							<select name="idMatiere">			
								<c:forEach items="${matieres}" var="p">		
									<option value="${p.idMatiere}">
										<c:out value="${p.nom}" />
									</option>	
								</c:forEach>		
							</select> 
						</div>
	 <div class="col">
							<label>Type de Sceance</label>
							<select name="idTypeSceance">			
								<c:forEach items="${sceances}" var="t">		
									<option value="${t.idTypeSeance}">
										<c:out value="${t.intitule}" />
									</option>	
								</c:forEach>		
							</select> 
						</div>
						
				<input  type="submit" value="Valider">
     </f:form>
     
</div>
<script type="text/javascript">
// $(document).ready(function()
// 		{
// 	$('#checkBoxAll').click(function()){
// 		if($(this).is(":checked"))
// 			$('.chCheckboxId').prop('checked');
// 		else
// 			$('.chCheckBoxId').prop('');
// 	});
// 		});
document.getElementById('checkBoxAll').onclick = function() {
    var checkboxes = document.querySelectorAll('input[type="checkbox"]');
    for (var checkbox of checkboxes) {
        checkbox.checked = this.checked;
    }
}
</script>
    <jsp:include page="../fragments/userfooter.jsp" />
