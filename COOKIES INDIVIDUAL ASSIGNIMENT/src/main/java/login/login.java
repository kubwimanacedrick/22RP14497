package login;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet {
    private static final String VALID_USERNAME = "kubwimana";
    private static final String VALID_PASSWORD = "cedro@123";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password)) {
            response.sendRedirect("welcome.html");
        } else {
            out.println("<html><body>");
            out.println("<h2>Login to not well</h2>");
            out.println("<p>unknown username or password.</p>");
            out.println("<a href='form.html'>Try Again</a>");
            out.println("</body></html>");
        }
    }
}