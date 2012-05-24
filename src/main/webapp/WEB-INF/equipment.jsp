<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EQUIPMENT</title>
</head>
<body>
<form ACTION="" METHOD=POST>
<table align="left" border="0">
<h1 align="center"> INFORMACION DE EQUIPOS </h1>
<tr>
<td align="left" width="200">Id Marca:
</td>
<td>
<form:select path="listita">

<form:options items="${listita}" itemValue="id_mark" itemLabel="name"/>

</form:select>

</td>
<td align="center" width="200"><INPUT NAME="boton" TYPE="SUBMIT" VALUE="Buscar"> 
</td>
</tr>

</table>
</form>
</body>
</html>