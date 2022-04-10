<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


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

        <s:authorize access="isAuthenticated()">
            You are connected with:
            <s:authentication property="principal.username" /> <br>
            Your Email : <s:authentication property="principal.email" /><br>
            Your First Name : <s:authentication property="principal.firstName" /><br>
            Your Last name : <s:authentication property="principal.LastName" /><br>
        </s:authorize>
    </div>

    <div>

<%--        <select class="form-select" aria-label="Default select example">--%>
<%--            <option selected>modules</option>--%>
<%--            <c:forEach items="${NiveauList}" var="p">--%>
<%--                <option value="idNiveau">${p.idNiveau}</option>--%>

<%--            </c:forEach>--%>
<%--        </select>--%>
<%--        <select class="form-select" aria-label="Default select example">--%>
<%--            <option selected>type seance</option>--%>
<%--            <c:forEach items="${seance_types}" var="s">--%>
<%--                <option value="type">${s.intitule}</option>--%>
<%--            </c:forEach>--%>
<%--        </select>--%>


<%--        <f:form method="GET" modelAttribute="NiveauList" items="${NiveauList}"--%>
<%--                var="p" action="${pageContext.request.contextPath}/prof/getListEtudiants/${NiveauList}">--%>

<%--        <div>--%>
<%--            <input type="idNiveau" class="form-control" id="idNiveau" aria-describedby="idNiveau" placeholder="Enter id">--%>
<%--        </div>--%>

<%--            <ul>--%>

<%--                <td>--%>
<%--                    <ul>--%>
<%--                        <li><a href="${pageContext.request.contextPath}/prof/getListEtudiants/${p.idNiveau}">open</a></li>--%>
<%--                    </ul>--%>
<%--                </td>--%>
<%--            <button type="submit" class="btn btn-primary">Submit</button>--%>
            <c:forEach items="${NiveauList}" var="s"  >

            <a href="${pageContext.request.contextPath}/prof/getListEtudiants/${s.idNiveau}" class="list-group-item list-group-item-action" aria-current="true">
                    ${s.titre}
            </a>


            </c:forEach>



<%--    <f:form action="${pageContext.request.contextPath}/prof/searchClass"--%>
<%--            method="POST" modelAttribute="absModel">--%>

<%--        <f:hidden path="idInscription" />--%>
<%--;--%>

<%--        <div class="row">--%>

<%--            <div class="col">--%>
<%--                <label>Please select the user role</label>--%>

<%--                <f:select items="${nvList}" var ="s" path="id" multiple="false" size="1"--%>
<%--                          class="form-control">--%>
<%--                    <f:options items="${roleList}" itemValue="idRole" itemLabel="nomRole" />--%>
<%--                </f:select>--%>


<%--            </div>--%>
<%--        </div>--%>


<%--        <div style="text-align: right">--%>
<%--            <button type="submit" class="btn btn-primary">Create</button>--%>
<%--            <button type="reset" class="btn btn-secondary">Rest</button>--%>
<%--        </div>--%>

<%--    </f:form>--%>


    </div>



    <jsp:include page="../fragments/userfooter.jsp" />

