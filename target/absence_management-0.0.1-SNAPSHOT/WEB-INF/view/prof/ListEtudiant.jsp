<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags"%>


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

    <f:form>
    <tr>
        <th scope="col">id inscription</th>
        <th scope="col">cne</th>
        <th scope="col"> etudiant</th>
        <th scope="col">set absence</th>
    </tr>
    <c:forEach  items="${inscriptions}" var="p" >
    <tr>
        <td>${p.idInscription}</td>
        <td>${p.etudiant}</td>
        <td>${p.annee}</td>
        <td> <div style="text-align: right">
            <button type="submit" class="btn btn-primary">Enregistrer</button>
            <button type="reset" class="btn btn-secondary">Annuler</button>
        </div></td>
    </tr>
    </c:forEach>

    </f:form>


    <jsp:include page="../fragments/userfooter.jsp" />
