package exibir;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import java.util.ArrayList;

import com.google.gson.Gson;

import model.Produto;
import dao.ProdutoDao;

public class ExibirProduto extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter saida = resp.getWriter();
        List<Produto> list = new ArrayList<Produto>();
        ProdutoDao pd = new ProdutoDao();
        Gson parser = new Gson();
        String response = "";

        System.out.println("PARAMETER: " + req.getParameter("id"));

        try {
            if (req.getParameter("id") != null) {
                list = pd.pesquisar(Integer.parseInt(req.getParameter("id")));
            } else {
                list = pd.pesquisar();
            }

            response = parser.toJson(list);
        } catch (SQLException e) {
            response = e.getMessage();
        }

        saida.println(response);
        saida.flush();
        saida.close();
    }
}