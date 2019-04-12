import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
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
        String firstNumberString = request.getParameter("first");
        String secondNumberString = request.getParameter("second");
        String isCheck = request.getParameter("select_pheptinh");
        PrintWriter writer = response.getWriter();


        if (firstNumberString.equals("") || secondNumberString.equals("")) {
            RequestDispatcher RequetsDispatcherObj = request.getRequestDispatcher("/index.jsp");
            RequetsDispatcherObj.forward(request, response);
        } else {
            double numFirstNumber = Integer.parseInt(firstNumberString);
            double numSecondNumber = Integer.parseInt(secondNumberString);
            if (numSecondNumber == 0) {
                writer.println("<html>");
                writer.println("<h1>Vô </h1>");
                writer.println("</html>");
            } else {
                double result = Calculator.caculater(numFirstNumber, numSecondNumber, isCheck);
                writer.println("<html>");
                writer.println("<h1>" + result + " </h1>");
                writer.println("</html>");
            }
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
