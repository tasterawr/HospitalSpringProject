<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>HospitalApp</title>
</head>
<body>
<div>
    <%@ page contentType="text/html;charset=utf-8" %>
    <h1>User home page</h1>
    <p>Name: "${name}"</p>
    <p>Login: "${login}"</p>
    <p>Phone: "${phone}"</p>
    <p>Email: "${email}"</p>
    <form action="/user/get-users" method="get">
        <input type="submit" value="Go to all users list" />
    </form>
    <form action="/user/update-user" method="get">
        <input type="submit" value="Edit personal info" />
    </form>
    <form action="/user/delete-user" method="get">
        <input type="submit" value="Delete current user" />
    </form>
    <form action="/logout" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Exit" />
    </form>
</div>
</body>
</html>