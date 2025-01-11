import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SessionCookieServlet extends HttpServlet {

    // Handling GET request
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Setting content type for the response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Get the session object or create a new session if none exists
        HttpSession session = request.getSession(true);
        
        // Handling session creation - storing a user name
        String username = (String) session.getAttribute("username");
        
        if (username == null) {
            username = "Guest";
            session.setAttribute("username", username); // Store the username in session
        }
        
        // Handling cookies - setting a cookie to store preferred color
        Cookie[] cookies = request.getCookies();
        String preferredColor = null;
        
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("preferredColor")) {
                    preferredColor = cookie.getValue();
                    break;
                }
            }
        }
        
        // Displaying the session and cookie information to the user
        out.println("<html><body>");
        out.println("<h1>Session and Cookie Handling Example</h1>");
        out.println("<p>Welcome, " + username + "!</p>");
        
        if (preferredColor != null) {
            out.println("<p>Your preferred color is: " + preferredColor + "</p>");
        } else {
            out.println("<p>No preferred color set yet.</p>");
        }
        
        // Providing the option to set a new preferred color in the cookie
        out.println("<form method='post' action='SessionCookieServlet'>");
        out.println("Set your preferred color: <input type='text' name='color' />");
        out.println("<input type='submit' value='Set Color' />");
        out.println("</form>");
        
        // Providing the option to invalidate the session
        out.println("<form method='post' action='SessionCookieServlet'>");
        out.println("<input type='hidden' name='destroySession' value='true' />");
        out.println("<input type='submit' value='Invalidate Session' />");
        out.println("</form>");
        
        out.println("</body></html>");
    }
    
    // Handling POST request to update preferred color and/or invalidate session
    @Override
    protected void doPost(@org.jetbrains.annotations.NotNull HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String color = request.getParameter("color");
        String destroySession = request.getParameter("destroySession");

        // Check if the session needs to be destroyed
        if (destroySession != null && destroySession.equals("true")) {
            HttpSession session = request.getSession(false);  // Get the current session (without creating a new one)
            if (session != null) {
                session.invalidate(); // Destroy the session
            }
        }

        // If a color was provided, set a cookie for preferred color
        if (color != null && !color.isEmpty()) {
            Cookie colorCookie = new Cookie("preferredColor", color);
            colorCookie.setMaxAge(60 * 60 * 24 * 7); // Set cookie to expire in 7 days
            response.addCookie(colorCookie);
        }

        // After processing, redirect to the GET method to display the updated information
        response.sendRedirect("SessionCookieServlet");
    }
}
