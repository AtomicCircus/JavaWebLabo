<%@ include file ="../include/importTags.jsp" %>
<%@  taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<mvc:resources mapping="/webapp/**" location="/webapp/" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">

    <link type="text/css" href="<spring:url value='/css/first.css' />" rel="Stylesheet">

    <title>Test Bootstrap</title>
    <link rel="stylesheet" href="<spring:url value='/css/bootstrap.min.css' />">

    <link rel="stylesheet" href="<spring:url value='/css/myOwnStyle.css' />">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src=<spring:url value='/js/bootstrap.min.js' />></script>
    <script src=<spring:url value='/js/internationalization.js' />></script>
</head>
<body>
<spring:url var="localeFr" value="">
    <spring:param name="locale" value="fr"/>
</spring:url>
<spring:url var="localeEn" value="">
    <spring:param name="locale" value="en"/>
</spring:url>
<div class="jumbotron">
    <div class="container text-center">
        <h1>Online Store</h1>
        <p>Mission, Vission & Values</p>
    </div>
</div>

<div class="webSiteContent">
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand">Logo</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li ><a href="<c:url value="/hello"/>">Home</a></li>
                <li><a href="<c:url value="/listProduct"/>">Products</a></li>
                <li><a href="#">Deals</a></li>
                <li><a href="#">Stores</a></li>
                <li><a href="#">Contact</a></li>
            </ul>

            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><img id="imgNavSel" src="<spring:url value="/images/${pageContext.response.locale}.gif"/>" alt="..." class="img-thumbnail icon-small"><span id="lanNavSel"> <spring:message code="lang"/></span> <span class="caret"></span></a>

                    <ul class="dropdown-menu" role="menu">
                        <li><a id="navFra" href="${localeFr}" class="language"><img id="imgNavFra" src="<spring:url value='/images/fr.gif' />" alt="..." class="img-thumbnail icon-small"><span id="lanNavFra"> Francais</span></a></li>
                        <li><a id="navEng" href="${localeEn}" class="language"><img id="imgNavEng" src="<spring:url value='/images/en.gif' />" alt="..." class="img-thumbnail icon-small"><span id="lanNavEng"> English</span></a></li>
                    </ul>
                </li>
            </ul>

            <ul class="nav navbar-nav navbar-right">

                <li><a href="#"><span class="glyphicon glyphicon-user"></span><sec:authorize access="isAuthenticated()">${pageContext.request.userPrincipal.name}</sec:authorize><sec:authorize access="!isAuthenticated()">Your account</sec:authorize> </a></li>
                <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
            </ul>
        </div>
    </div>
</nav>
    <div class="row">
        <div class="col-sm-2">
            <div class="border border-dark">

            </div>
        </div>

        <div class="col-sm-10">
            <sec:authorize access="isAuthenticated()">
                <sec:authorize access="hasRole('ADMIN')">
<p>
    <a href="<c:url value="/admin"/>">ADMINLINK</a>
                        <a href="<spring:url value='/admin' />"><button name="submit" value="admin" /></a>
</p>
                </sec:authorize>
            </sec:authorize>
            <sec:authorize access="isAuthenticated()">
                <form name='f' action="logout" method='POST'>
<p>
                            <input name="submit" type="submit" value="submit" />
</p>
                </form>
            </sec:authorize>
<tiles:insertAttribute name ="main-content" />
        </div>
    </div>
<footer class="container-fluid text-center">
    <p>Online Store Copyright</p>
    <form class="form-inline">Get deals:
        <input type="email" class="form-control" size="50" placeholder="Email Address">
        <button type="button" class="btn btn-danger">Sign Up</button>
    </form>
</footer>
</div>
</body>
</html>
