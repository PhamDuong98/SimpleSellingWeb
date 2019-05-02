<%-- 
    Document   : logout
    Created on : Nov 1, 2018, 10:43:34 AM
    Author     : Duong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("index_admin.jsp");
        %>
    </body>
</html>
