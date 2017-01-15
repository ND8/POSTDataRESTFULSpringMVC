<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC RESTFul Service POST Data Complete</title>
</head>
<body>
<h2>Process data on server from @RequestBody </h2>
	<form action="springMVCRESTFulService" method="post">
		<p>
			<b>Name:</b> <input type="text" name="name">
		</p>
		<p>
			<b>String data:</b>
		</p>
		<textarea rows="5" cols="75" name="stringValue"></textarea>
		<p><input type="submit"></p> 
	</form>
<h2>Process data on server from @RequestParam </h2>	
	<form action="springMVCRESTFulService2" method="post">
		<p>
			<b>Name:</b> <input type="text" name="name">
		</p>
		<p>
			<b>String data:</b>
		</p>
		<textarea rows="5" cols="75" name="stringValue"></textarea>
		<p><input type="submit"></p> 
	</form>
</body>
</html>