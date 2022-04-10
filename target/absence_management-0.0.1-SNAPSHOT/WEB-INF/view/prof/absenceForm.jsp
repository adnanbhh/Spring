<%@page import="com.ensah.core.web.models.PersonModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags"%>


<jsp:include page="../fragments/adminHeader.jsp" />


<div class="container">

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">

            <jsp:include page="../fragments/menu.jsp" />

        </div>
    </nav>


    <div>
        <h3> Saisir l'absence
        </h3>
    </div>
    <div>
        <f:form action="setAbsence" method="POST" modelAttribute="absenceModel">

            <f:hidden path="idEnseignant"/>

            <div class="row">
                <div class="col">
                    <label>date et Heure de Debut d'Absence</label>
                        <f:input path="dateHeureDebutAbsence" type="date" class="form-control"  />
                    <f:errors path="dateHeureDebutAbsence" class="text-danger" />
                </div>

            <div class="col">
                <label>date et Heure Fin d'Absence</label>
                <f:input path="dateHeureFinAbsence" type="Date" class="form-control"
                         placeholder="dateHeureFinAbsence" />
                <f:errors path="dateHeureFinAbsence" class="text-danger" />
            </div>
        </div>
            <div class="row">
                <div class="col">
                    <label>type Saisie</label>
                    <f:input path="typeSaisie" type="text" class="form-control"
                             placeholder="type Saisie" />
                </div>
            </div>
            <c:forEach items="${matiers}" var="s"  >

                <a class="list-group-item list-group-item-action" aria-current="true">
                        ${s.nom} == ${s.idMatiere}
                </a>

            </c:forEach>

            </div>
            <div style="text-align: right">
                <button type="submit" class="btn btn-primary">Enregistrer</button>
                <button type="reset" class="btn btn-secondary">Annuler</button>
            </div>
            </f:form>
        </div>


<jsp:include page="../fragments/adminfooter.jsp" />
