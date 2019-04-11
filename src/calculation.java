import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "calculation", urlPatterns = "/calculation")
public class calculation extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstNumberString=request.getParameter("first");
        String secondNumberString=request.getParameter("second");

        int numFirstNumber=Integer.parseInt(firstNumberString);
        int numSecondNumber=Integer.parseInt(secondNumberString);



        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h1> h1 </h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
