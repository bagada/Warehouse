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
       <form:form modelAttribute="registerPropertyForm" action="registerProperty" method="POST">
              <table align="center">
              
               <tr>
                              <td><fmt:message key="ID_Equipment"/></td>
                              <td><form:input path="ID_Equipment" /></td>
                              <td><form:errors path="ID_Equipment"/></td>
               </tr>
               <tr>
                              <td><fmt:message key="Code"/></td>
                              <td><form:input path="Code" /></td>
                              <td><form:errors path="Code"/></td>
               </tr>
                <tr>
                              <td><fmt:message key="Date_Buy"/></td>
                              <td><form:input path="Date_Buy" /></td>
                              <td><form:errors path="Date_Buy"/></td>
               </tr>
                <tr>
                              <td><fmt:message key="Date_Warranty"/></td>
                              <td><form:input path="Date_Warranty" /></td>
                              <td><form:errors path="Date_Warranty"/></td>
               </tr>
                <tr>
                              <td><fmt:message key="Serie"/></td>
                              <td><form:input path="Serie" /></td>
                              <td><form:errors path="Serie"/></td>
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
              
              