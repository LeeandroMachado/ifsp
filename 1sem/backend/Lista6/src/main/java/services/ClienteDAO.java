package services;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.*;
import models.*;

public class ClienteDAO {
  private Connection connection;

  public ClienteDAO() {
    this.connection = new Conexao().getConnection();
  }

  public void cadastrar(PessoaFisica c) throws SQLException {
    String query = "INSERT INTO tbcliente (name, address, phone, zipcode, document) VALUES (?, ?, ?, ?, ?);";
    PreparedStatement st = connection.prepareStatement(query);

    st.setString(1, c.getName());
    st.setString(2, c.getAddress());
    st.setString(3, c.getPhone());
    st.setString(4, c.getZipcode());
    st.setString(5, c.getCpf());

    st.execute();
    st.close();

    connection.close();
  }

  public void cadastrar(PessoaJuridica c) throws SQLException {
    String query = "INSERT INTO tbcliente (name, address, phone, zipcode, document) VALUES (?, ?, ?, ?, ?);";
    PreparedStatement st = connection.prepareStatement(query);

    st.setString(1, c.getName());
    st.setString(2, c.getAddress());
    st.setString(3, c.getPhone());
    st.setString(4, c.getZipcode());
    st.setString(5, c.getCnpj());

    st.execute();
    st.close();

    connection.close();
  }

  public List<Cliente> pesquisar() throws SQLException, Exception {
    List<Cliente> lista = new ArrayList<Cliente>();
    String query = "SELECT * FROM tbcliente";
    PreparedStatement st = connection.prepareStatement(query);
    ResultSet rs = st.executeQuery();

    while(rs.next()) {
      Cliente cli = new Cliente();

      cli.setName(rs.getString("name"));
      cli.setAddress(rs.getString("address"));
      cli.setPhone(rs.getString("phone"));
      cli.setZipcode(rs.getString("zipcode"));
      cli.setDocument(rs.getString("document"));

      lista.add(cli);
    }

    return lista;
  }
}