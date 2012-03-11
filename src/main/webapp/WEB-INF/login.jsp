<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
<!--
<a class="linkopacity" href="#" title="Enlace 1" >

<img src="http://www.poliformasplasticas.com.mx/2011/jpg/fondo_columna.jpg" alt="Imagen 1"></a>-->

<p>
            <strong>
                Login
            </strong>
        </p>
        
     ${fn:replace(SPRING_SECURITY_LAST_EXCEPTION.message, 'Bad credentials', 'Username/Password are incorrect')}
        <c:if test="${not empty error}">
		<div class="errorblock">
		   
		</div>
	</c:if>

        <fieldset>
            <table border="0">
                <form:form modelAttribute="loginForm"  method="post" autocomplete="off">
                    <tbody>
                        <tr>
                            <td colspan="3" align="center">
                                <form:errors path="commonError_1">
                                    error
                                </form:errors>
                            </td>
                        </tr>
                        <tr>
                            <td><form:label id="userNameLabel" for="j_username" path="j_username" cssClass="error">UserName</form:label></td>
                            <td>
                                <form:input path="j_username" />
                            </td>
                            <td>
                                <form:errors path="j_username" />
                            </td>
                        </tr>
                        <tr>
                            <td><form:label id="passwordLabel" for="j_password" path="j_password" cssClass="error">Password</form:label></td>
                            <td>
                                <form:password path="j_password" />
                            </td>
                            <td>
                                <form:errors path="j_password"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="center" colspan="2">
                                <input type="submit" value="Enter" />
                            </td>
                        </tr>
                    </tbody>
                </form:form>
                    </table>
        </fieldset>

<a class="linkopacity" href="#" title="Enlace 3" >
<img src="http://profile.ak.fbcdn.net/hprofile-ak-snc4/274275_100001392390082_1810171003_n.jpg" alt="Imagen 3"></a>

 

</body>
</html>