<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta chartset="UTF-8" />
    <title>Cadastro de clientes</title>
  </head>
  <body> 
    <h1>Cadastro de clientes</h1>
    
    <table style="width: 50%">
      <tr>
        <td>Nome</td>
        <td><%= request.getParameter("name") %></td>
      </tr>

      <tr>
        <td>Sobrenome</td>
        <td><%= request.getParameter("surname") %></td>
      </tr>

      <tr> 
        <td>Endereco</td>
        <td><%= request.getParameter("address") %></td>
      </tr>

      <tr>
        <td>CEP</td>
        <td><%= request.getParameter("cep") %></td>
      </tr>

      <tr>
        <td>CPF</td>
        <td><%= request.getParameter("cpf") %></td>
      </tr>
    </table>
  </body>
</html>