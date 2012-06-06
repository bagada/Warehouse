
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="companyForm" action="registerCompany" method="POST"> 

<table align="center">
		
		
			<tr>
				<td><fmt:message key="name"/></td>
				<td><form:input path="name"/></td>
				<td><form:errors path="name"/></td>
			</tr>
			
			<tr>
				<td colspan="3" align="center">
					<input type="submit" value="<fmt:message key='submit'/>"/>
				</td>
			</tr>
</table>
</form:form>

</body>
</html>