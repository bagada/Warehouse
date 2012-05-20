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
<select name="categorias">
    <optgroup label="fruta">
    <option value="1">naranja</option>
    <option value="2">fresas</option>
    <option value="3">peras</option>
    </optgroup>
    <optgroup label="verduras">
    <option value="1">zapallo</option>
    <option value="2">habas</option>
    </optgroup>
    <optgroup label="carnes">
    <option value="1">pollo</option>
    <option value="2">pescado</option>
    <option value="3">cerdo</option>
    </optgroup>
</select>
</td>
<td align="center" width="200"><INPUT NAME="boton" TYPE="SUBMIT" VALUE="Buscar"> 
</td>
</tr>

</table>
</form>
</body>
</html>