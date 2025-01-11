<%@ page contentType="text/html; charset=UTF-8" %>  <!-- JSP Directive for setting content type -->

<%@ page language="java" %> <!-- JSP Directive to specify the language as Java -->

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Demo: Directives, Declarations, Expressions, Scriplets, Comments</title>
</head>
<body>

    <h2>Welcome to JSP Features Demonstration</h2>
    
    <!-- JSP Comment: This part demonstrates JSP Comments, this will not be displayed in the output -->
    <%-- 
        JSP Comments are not rendered in the browser output
        This is a multi-line comment
    --%>
    
    <!-- JSP Declaration -->
    <%!
        // Declaration: Defining a method that returns a greeting message
        public String getGreetingMessage() {
            return "Hello, welcome to JSP learning!";
        }
    %>
    
    <!-- JSP Expression -->
    <h3>Expression Example</h3>
    <p>
        <%= "This is an example of a JSP expression: " + getGreetingMessage() %>
    </p>

    <h3>JSP Scriplet Example</h3>
    <p>
        <%
            // JSP Scriplet: This is used to embed Java code directly into the page.
            String name = "Nishchal";
            out.println("Hello, " + name + "! This is a dynamic message from JSP scriplet.");
        %>
    </p>

    <h3>Displaying Current Date and Time using JSP Expression</h3>
    <p>
        <%= "Current Date and Time: " + new java.util.Date() %>
    </p>

    <!-- JSP Comment Example (in-line) -->
    <p>
        <%= "This part uses an in-line JSP comment (the browser won't see this comment) " %>
    </p>
    
</body>
</html>
