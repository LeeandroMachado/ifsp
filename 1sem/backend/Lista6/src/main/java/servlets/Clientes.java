import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.SQLException;

import models.*;
import services.*;

public class Clientes extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String name = request.getParameter("name");
    String address = request.getParameter("address");
    String phone = request.getParameter("phone");
    String zipcode = request.getParameter("zipcode");
    String type = request.getParameter("type");
    String document = request.getParameter("document");

    ClienteDAO cd = new ClienteDAO();

    try {
      if (type.equals("pf")) {
        PessoaFisica p = new PessoaFisica();
        p.setName(name);
        p.setAddress(address);
        p.setPhone(phone);
        p.setZipcode(zipcode);
        p.setCpf(document);

        cd.cadastrar(p);
      } else {
        PessoaJuridica p = new PessoaJuridica();
        p.setName(name);
        p.setAddress(address);
        p.setPhone(phone);
        p.setZipcode(zipcode);
        p.setCnpj(document);

        cd.cadastrar(p);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }

    request.getRequestDispatcher("index.jsp").forward(request, response);
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    ClienteDAO cd = new ClienteDAO();
    List<Cliente> lstClientes = new ArrayList<Cliente>();

    try {
      lstClientes = cd.pesquisar();
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }


    getServletContext().setAttribute("res", lstClientes);
    System.out.println(getServletContext().getAttribute("res"));
    request.getRequestDispatcher("index.jsp").forward(request, response);
  }
}