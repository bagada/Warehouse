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
       <form:form modelAttribute="RegisterEmployeeForm" action="registerCompany" method="POST">
               <table align="center">

               <tr>
                               <td><fmt:message key="name"/></td>
                               <td><form:input path="name" /></td>
                               <td><form:errors path="name"/></td>
               </tr>
               <tr>
					<td align="left" width="5">Num Empleado: </td>
					<td><form:input path="ID_EMPLOYEE" type="TEXT"
							name="ID" class="campoID" size="12" /></td>
				</tr>
				
				<tr>
					<td align="left" width="5">Nombre : </td>
					<td><form:input path="name" type="TEXT"
							name="Nombre" class="campoNombre" size="12" /></td>
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
 
               
               
               