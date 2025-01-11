package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculateInterest")
public class InterestCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Redirect to form if accessed via GET
        response.sendRedirect("InterestForm.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        double principal = Double.parseDouble(request.getParameter("principal"));
        double rate = Double.parseDouble(request.getParameter("rate"));
        double time = Double.parseDouble(request.getParameter("time"));

        double simpleInterest = (principal * rate * time) / 100;

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>Simple Interest Result</title></head>");
            out.println("<body>");
            out.println("<h2>Simple Interest Calculation Result</h2>");
            out.println("<p>Principal (P): " + principal + "</p>");
            out.println("<p>Rate of Interest (R): " + rate + "</p>");
            out.println("<p>Time (T): " + time + " years</p>");
            out.println("<h3>Simple Interest (SI): " + simpleInterest + "</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
