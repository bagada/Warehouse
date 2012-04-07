<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>jQuery UI Datepicker - Display button bar</title>
	
</head>
<body>
<link rel="stylesheet" href="resources/my/jquery.ui.all.css">
	
	<script type='text/javascript' src="resources/my/jquery-1.7.1.js"></script>
	<script type='text/javascript' src="resources/my/jquery.ui.core.js"></script>
	<script type='text/javascript' src="resources/my/jquery.ui.widget.js"></script>

	<script type='text/javascript' src="resources/my/jquery.ui.datepicker.js"></script>
	<link rel="stylesheet" href="resources/my/demos.css">
	<script>
	$(function() {
		$( "#datepicker" ).datepicker({
			showButtonPanel: true
		});
	});
	</script>

<div class="demo">

<p>Date: <input type="text" id="datepicker"></p>

</div>

</body>
</html