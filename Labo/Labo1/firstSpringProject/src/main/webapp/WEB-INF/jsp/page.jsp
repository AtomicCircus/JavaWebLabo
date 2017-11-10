<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="include/importTags.jsp" %>

PAGE
Welcome ${pageContext.request.userPrincipal.name}

<a href="<c:url value="/hello3"/>">Lien vers page pour connecté</a>