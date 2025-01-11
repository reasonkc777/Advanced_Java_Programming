package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/displayInfo")  // URL Mapping
public class NewServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            // Output 1: Display message 10 times
            out.println("<h1>Java is one of the powerful programming languages!</h1>");
            for (int i = 1; i <= 10; i++) {
                out.println("<p>" + i + ". Java is one of the powerful programming languages!</p>");
            }

            // Output 2: Display current date and time
            Date currentDate = new Date();
            out.println("<h2>Current Date and Time: " + currentDate + "</h2>");

            // Output 3: Display Name, Roll No, and Section
            out.println("<h3>Name: Nishchal K.C.</h3>");
            out.println("<h3>Roll No: 211806</h3>");
            out.println("<h3>Section: A</h3>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);  // Handle POST requests similarly
    }

    @Override
    public String getServletInfo() {
        return "Displays programming message, date/time, and user details.";
    }
}
