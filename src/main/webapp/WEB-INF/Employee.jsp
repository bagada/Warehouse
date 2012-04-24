<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<HEAD>
<TITLE>FORMULARIOS</TITLE>
</HEAD>
<body>
		<form:form modelAttribute="RegisterEmployeeForm" action="Employee"
			method="POST">

			<table align="center" border="0">

				
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

			</TABLE>

			<table align="right" border="0">
				<tr>
					<td align="right" width="300"><INPUT NAME="boton" TYPE="submit"
						VALUE="Guardar"></td>
				</tr>

			</table>
	</form:form>
</body>
</html>