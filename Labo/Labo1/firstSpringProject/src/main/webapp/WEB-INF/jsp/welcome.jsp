<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="include/importTags.jsp" %>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="test/html" charset="UTF-8">
    <title>${title}</title>
</head>
<body>
Welcome to our wonderful world!
<form:form id="inscription" method="POST"
           action="/firstSpring/hello"
           modelAttribute="magicKeyForm">
    <form:label path="magicKey"><spring:message code="magicKey"/></form:label>
    <form:input path="magicKey"/>
    <br/>
    <form:errors path="magicKey"/>
    <br/>
    <form:button>Submit</form:button>
</form:form>
<br/>
<a href="/firstSpring/listProduct"><button>Article1</button></a>
<a href="#"><button >Article2</button></a>
</body>
</html>