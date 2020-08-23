<%@ page import="models.Cliente" %>
<%@ page import="java.util.ArrayList" %>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Gerenciar Clientes</title>
    <style>
      table {
        border-collapse: collapse;
        border-spacing:0;
      }

      table td {
        border-color:black;
        border-style:solid;
        border-width:1px;
        font-family:Arial, sans-serif;
        font-size:14px;
        overflow:hidden;
        padding:15px 5px;
        word-break:normal;
      }

      table.register td {
        border-color: white;
      }

      table th {
        border-color:black;
        border-style:solid;
        border-width:1px;
        font-family:Arial, sans-serif;
        font-size:14px;
        font-weight:normal;
        overflow:hidden;
        padding:15px 5px;
        word-break:normal;
      }

      table.register th {
        border-color: white;
      }
    </style>
  </head>
  <body>
    <h2>Clientes</h2>

    <table>
      <thead>
        <tr>
          <th>Nome</th>
          <th>Endereco</th>
          <th>Telefone</th>
          <th>CEP</th>
          <th>CPF/CNPJ</th>
        </tr>
      </thead>
      <tbody>
        <% ArrayList<Cliente> list = (ArrayList<Cliente>) getServletContext().getAttribute("res"); %>

        <% for (Cliente cli : list) { %>
          <tr>
            <td><%= cli.getName() %></td>
            <td><%= cli.getAddress() %></td>
            <td><%= cli.getPhone() %></td>
            <td><%= cli.getZipcode() %></td>
            <td><%= cli.getDocument() %></td>
          </tr>
        <% } %>
      </tbody>
    </table>

    <br>

    <h2>Adicionar Cliente</h2>

    <form action="Clientes" method="POST">
      <table class="register">
        <tr>
          <td>Nome: </td>
          <td><input type="text" name="name" /></td>
        </tr>

        <tr>
          <td>Endereco: </td>
          <td><input type="text" name="address" /></td>
        </tr>

        <tr>
          <td>Telefone: </td>
          <td><input type="text" name="phone" /></td>
        </tr>

        <tr>
          <td>CEP: </td>
          <td><input type="text" name="zipcode" /></td>
        </tr>

        <tr>
          <td>Tipo: </td>
          <td>Pessoa Fisica: <input type="radio" name="type" value="pf" /></td>
          <td>Pessoa Juridica: <input type="radio" name="type" value="pj" /></td>
        </tr>

        <tr>
          <td>CPF/CNPJ</td>
          <td><input type="text" name="document" /></td>
        </tr>

        <tr>
          <td><input type="submit" /></td>
        </tr>
      </table>
    </form>
  </body>
</html>
