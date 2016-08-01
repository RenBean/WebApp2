<%--
  Created by IntelliJ IDEA.
  User: Ari
  Date: 7/26/16
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String helloTo = "JSP";
    if(request.getParameter("who") != null && request.getParameter("who").length() > 0) {
        helloTo = request.getParameter("who");
    } else if (request.getAttribute("what") != null && request.getAttribute("what").toString().length() > 0) {
        helloTo = request.getAttribute("what").toString();
    }
%>


<html>
<head>
    <title>Hello</title>
</head>
<body>

Hello <%=helloTo%>

</body>
</html>
