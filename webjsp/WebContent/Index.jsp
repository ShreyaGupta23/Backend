<!DOCTYPE html>
<html>
<head>
<title>JSP Demo</title>
</head>
<body>
<%
String name=request.getParameter("name");
out.println("Hello"+name);
//java code
%>
</body>
</html>