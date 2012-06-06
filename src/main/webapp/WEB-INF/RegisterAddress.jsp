<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="errorDiv">
               <c:if test="${error!=null}">
                       <fmt:message key="${error}"/>
               </c:if>
       </div>
       <div id="registerFormDiv">
       <form:form modelAttribute="RegisterAddressForm" action="RegisterAddress" method="POST">
              <table align="center">
              
               <tr>
					<td><fmt:message key="idAddress"/></td>
                              <td><form:input path="idAddress" /></td>
                              <td><form:errors path="idAddress"/></td>
               </tr>
               <tr>
                              <td><fmt:message key="state"/></td>
                              <td><form:input path="state" /></td>
                              <td><form:errors path="state"/></td>
               </tr>
                <tr>
                              <td><fmt:message key="city"/></td>
                              <td><form:input path="city" /></td>
                              <td><form:errors path="city"/></td>
               </tr>
                <tr>
                              <td><fmt:message key="street"/></td>
                              <td><form:input path="street" /></td>
                              <td><form:errors path="street"/></td>
               </tr>
                <tr>
                              <td><fmt:message key="phoneNumber"/></td>
                              <td><form:input path="phoneNumber" /></td>
                              <td><form:errors path="phoneNumber"/></td>
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