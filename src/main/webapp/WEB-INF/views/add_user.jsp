<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<title>Hospital Spring App</title>
<head>
<%--    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/add_user.css' />" />--%>
</head>
<body>
<div align="center">
<h1>Add user</h1>
<form action="add-user" method="post" >
			<table>
				<tr>
					<td>User name</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="email" /></td>
				</tr>
				<tr>
                    <td>Login</td>
                    <td><input type="text" name="login" /></td>
                </tr>
				<tr>
                	<td>Phone number</td>
                	<td><input type="text" name="number" /></td>
                </tr>
                <tr>
                	<td>Password</td>
                	<td><input type="password" name="password" /></td>
                </tr>
				</table>
				<hr>
			<input type="submit" value="Register"/></form>
</div>
</body>
</html>

