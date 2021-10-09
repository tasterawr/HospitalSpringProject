<html>
<title>Hospital Spring App</title>
<head>

</head>
<body>
<div align="center">
<h1 color="red">Update user form</h1>
<form action="update-user" method="post" >
			<table>
			    <tr>
            	    <td>Enter user id</td>
            		 <td><input type="text" name="id" /></td>
            	</tr>
				<tr>
					<td>Select parameter to change</td>
					<td>
					    <select name="parameter">
					        <option value="name">Name</option>
					        <option value="number">Number</option>
					        <option value="email">Email</option>
					        <option value="login">Login</option>
					        <option value="password">Password</option>
					    </select>
					</td>
				</tr>
				<tr>
					<td>New parameter value</td>
					<td><input type="text" name="newValue" /></td>
				</tr>
				</table>
				<hr>
			<input type="submit" value="Update"/></form>
</div>
</body>
</html>

