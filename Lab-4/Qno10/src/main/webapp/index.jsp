<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Input and Implicit Object Scope Demo</title>
</head>
<body>

    <h2>Enter your details</h2>
    <form method="post" action="processForm.jsp">
        <label for="name">Name: </label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="age">Age: </label>
        <input type="text" id="age" name="age" required><br><br>

        <input type="submit" value="Submit">
    </form>

</body>
</html>
