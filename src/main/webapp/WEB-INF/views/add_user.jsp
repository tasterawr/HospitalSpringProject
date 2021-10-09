
<html>
<title>Hospital Spring App</title>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/add_user.css' />" />
</head>
<body>
<div align="center">
<h1 color="red">Add user form</h1>
<form action="add-user" method="post" >
			<table>
			    <tr>
            	    <td>Id</td>
            		    <td><input type="text" name="id" /></td>
            	</tr>
				<tr>
					<td>Full user name</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" /></td>
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
                	<td><input type="text" name="password" /></td>
                </tr>
				</table>
				<hr>
			<input type="submit" value="Register"/></form>
</div>
</body>
</html>

