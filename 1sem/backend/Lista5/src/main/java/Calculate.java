import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Calculate extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String base = request.getParameter("base");
    String height = request.getParameter("height");
    String ratio = request.getParameter("ratio");
    String geometry = request.getParameter("geometry");

    Double result = 0.0;
    
    RequestDispatcher req = request.getRequestDispatcher("result.jsp");

    Calculator calculator = new Calculator();

    if (geometry.equals("square")) {
      result = calculator.calc(Integer.parseInt(base), Integer.parseInt(height));
    } else if (geometry.equals("triangle")) {
      result = calculator.calc(Double.parseDouble(base), Double.parseDouble(height));
    } else {
      result = calculator.calc(Double.parseDouble(ratio));
    }

    getServletContext().setAttribute("res", result.toString());
    req.forward(request, response);
  }
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String geometry = request.getParameter("geometry");

    RequestDispatcher req = request.getRequestDispatcher("calculate.jsp");
    request.setAttribute("geometry", geometry);

    req.forward(request, response);
  }
}
