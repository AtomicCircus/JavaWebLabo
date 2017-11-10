<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="include/importTags.jsp" %>

<h1>Page d'inscription</h1>
<form:form id="inscription" method="POST"
           action="/firstSpring/hello2/send"
           modelAttribute="user">
    <form:label path="name">Nom : </form:label>
    <form:input path="name"/>
    <br/>
    <form:errors path="name"/>
    <c:if test="${not empty name}">${name}</c:if>
    <br/>
    <form:label path="age">Age : </form:label>
    <form:input path="age"/>
    <br/>
    <form:errors path="age"/>
    <br/>
    <form:radiobutton path="male" value="true"/>Boy
    <form:radiobutton path="male" value="false"/>Girl
    <br/>
    <form:label path="hobby">What's your preffered hobby ? </form:label>
    <form:select path="hobby" >
        <form:options items="${hobbies}" itemValue="name" itemLabel="name"/>
    </form:select>
    <form:button>Submit</form:button>

</form:form>