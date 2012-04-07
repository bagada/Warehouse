<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div id="errorDiv">
		<c:if test="${error!=null}">
			<fmt:message key="${error}"/> 
		</c:if>
	</div>
	<div id="registerFormDiv">
	<form:form modelAttribute="userForm" action="registerUser" method="POST">
		<table align="center">
		
		
			<tr>
				<td><fmt:message key="name"/></td>
				<td><form:input path="name"/></td>
				<td><form:errors path="name"/></td>
			</tr>
			<tr>
				<td><fmt:message key="password"/></td>
				<td><form:password path="password"/></td>
				<td><form:errors path="password"/></td>
			</tr>	
			<tr>
				<td><fmt:message key="role"/></td>
				<td><form:select path="role" >
					<form:option value="rol"></form:option>
					<form:option value="rol2"></form:option>
				</form:select>	
				</td>
				<td><form:errors path="role"/></td>
			</tr>	
			<tr>
				<td colspan="3" align="center">
			
					<input type="submit" value="<fmt:message key='submit'/>"/>
				</td>
			</tr>
		</table>
	</form:form>
	</div>
</body>
</html>