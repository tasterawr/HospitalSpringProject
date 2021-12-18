<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>Hospital Spring App</title>
<head>
</head>
<body>
<div align="center">
	<h1>Change account info</h1>
	<form action="/user/update-user" method="post">
		<table>
			<tr>
				<td>Select parameter</td>
				<td>
					<select name="parameter">
						<option value="name">Name</option>
						<option value="number">Number</option>
						<option value="email">Email</option>
						<option value="password">Password</option>
						<option value="speciality">Speciality</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Enter new value</td>
				<td><input type="text" name="newValue"/></td>
			</tr>
		</table>
		<hr>
		<input type="submit" value="Update doctor"/></form>
</div>
</body>
</html>
