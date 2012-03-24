<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!--<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
a.linkopacity img {
        filter:alpha(opacity=25);
        -moz-opacity: 0.5;
        opacity: 0.5;
        -khtml-opacity: 0.5;
}
 
a.linkopacity:hover img {
        filter:alpha(opacity=50);  
        -moz-opacity: 1.0;  
        opacity: 1.0;
        -khtml-opacity: 1.0; 
}
.errorblock {
	color: #ff0000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>

</head>
<body >
 <h1 align="center">BIENVENIDOS A POLIFORMAS</h1>

<a class="linkopacity" href="#" title="Enlace 1" >

<img src="http://www.poliformasplasticas.com.mx/2011/jpg/fondo_columna.jpg" alt="Imagen 1"></a>

<a class="linkopacity" href="#" title="Enlace 3" >
<img src="http://profile.ak.fbcdn.net/hprofile-ak-snc4/274275_100001392390082_1810171003_n.jpg" alt="Imagen 3"></a>
-->

<!DOCTYPE html>

<html>
<head>
<title>Poliformas Warehouse</title>
	
	<link rel="stylesheet" href="resources/css/login.css" type="text/css" media="screen" />
</head>

<body>


<form:form id="login" modelAttribute="loginForm"  method="post" autocomplete="off">
    <h1>Inciar</h1>
    <fieldset id="inputs">
        <form:input id="username" path="j_username"  placeholder="Username" autofocus="true" required="true"/>   
        <form:password   path="j_password"  id="password" placeholder="Password" required="true"/>
    </fieldset>
    <fieldset id="actions">
        <input type="submit" id="submit" value="Log in">
        <!--  <a href="">Forgot your password?</a><a href="">Register</a>-->
        ${fn:replace(SPRING_SECURITY_LAST_EXCEPTION.message, 'Bad credentials', 'Username/Password are incorrect')}
    </fieldset>
  <!--    <a href="http://www.red-team-design.com/slick-login-form-with-html5-css3" id="back">Back to article...</a>-->
</form:form>

<!-- BSA AdPacks code -->
<script src="http://code.jquery.com/jquery-1.6.3.min.js"></script>


</body>
</html>

    