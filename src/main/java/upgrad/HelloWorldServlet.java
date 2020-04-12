package upgrad;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/helloWorld")
public class HelloWorldServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter w=response.getWriter();
        w.print("<!DOCTYPE html>");
        w.print("<html>");
        w.print("<head>");
        w.print("<title>");
        w.print("Hello World!");
        w.print("</title>");
        w.print("</head>");
        w.print("<body>");
        w.print("<p>");
        w.print("Welcome to HTML, Hello World!");
        w.print("</p>");
        w.print("</body>");
        w.print("</html>");
        w.close();
    }
}
