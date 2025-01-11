<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Processed Form Data</title>
</head>
<body>

    <h2>Processed Form Data</h2>
    
    <h3>Request Scope:</h3>
    <p>Name: <%= request.getParameter("name") %></p>
    <p>Age: <%= request.getParameter("age") %></p>

    <h3>Session Scope:</h3>
    <% 
        // Setting values in session scope
        session.setAttribute("sessionName", request.getParameter("name"));
        session.setAttribute("sessionAge", request.getParameter("age"));
    %>
    <p>Session Name: <%= session.getAttribute("sessionName") %></p>
    <p>Session Age: <%= session.getAttribute("sessionAge") %></p>

    <h3>Application Scope:</h3>
    <% 
        // Setting values in application scope
        application.setAttribute("appName", request.getParameter("name"));
        application.setAttribute("appAge", request.getParameter("age"));
    %>
    <p>Application Name: <%= application.getAttribute("appName") %></p>
    <p>Application Age: <%= application.getAttribute("appAge") %></p>

    <h3>Request Scope Example (using request object):</h3>
    <p>Request Name: <%= request.getAttribute("requestName") != null ? request.getAttribute("requestName") : "Not set" %></p>
    <p>Request Age: <%= request.getAttribute("requestAge") != null ? request.getAttribute("requestAge") : "Not set" %></p>

    <h3>Implicit Object (out) Example:</h3>
    <p>Message using out.println: </p>
    <%= "This message is printed using the out implicit object." %>

</body>
</html>
