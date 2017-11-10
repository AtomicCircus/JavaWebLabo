<%@ taglib prefix="spring" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<meta charset="UTF-8">
<title>${title}</title>
<c:if test="${not empty products}">

        <c:forEach items="${products}" var="product">
            <a href="<c:url value="/product/${product.getId()}"/>" >
            <div class="col-sm-4">
                <div class="panel panel-primary">
                    <div class="panel-heading">${product.getNom()}</div>
                    <div class="panel-body"><img src="<spring:url value='/images/palme.jpeg' />" class="img-responsive" style="width:100%" alt="Image"></div>
                    <div class="panel-footer">${product.getPrix()}</div>
                </div>
            </div></a>
        </c:forEach>
</c:if>

