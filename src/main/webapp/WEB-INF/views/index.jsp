<html>
<title>Hospital Spring App</title>
<body>
<div align="center">
<h1>Add student form</h1>
<form action="stud-servlet" method="post" >
			<table>
				<tr>
					<td>Full user name</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="phone" /></td>
				</tr>
				<tr>
                	<td>Phone number</td>
                	<td><input type="text" name="phone" /></td>
                </tr>
				<tr>
					<td>Knows blockchain</td>
					<td><input type="checkbox" name="knowsBlockchain" value="Knows Blockchain"></td>
				</tr>
				</table>
			<input type="submit" value="Submit" /></form>
<form action="student-list" method="get">
		<label for="blockchainFilter">Filter by blockchain value</label>
        <input type="checkbox" name="blockchainFilter" value="blockchainFilter">
        <label for="averageMarkFilter">Filter by average mark value</label>
        <input type="checkbox" name="averageMarkFilter" value="averageMarkFilter">
        <input type="submit" value="View student list" />
        </form>
</div>
</body>
</html>

