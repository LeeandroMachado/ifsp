package services;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.MysqlDataSource;

public class Conexao {
  private Connection connection = null;
  private final String DATABASE = "dbclientes";
  private final String LOGIN = "root";
  private final String PASSWORD = "";
  private final String HOST = "127.0.0.1";

  public Connection getConnection() {
    try {
      MysqlDataSource ds = new MysqlDataSource();

      ds.setServerName(HOST);
      ds.setDatabaseName(DATABASE);
      ds.setUser(LOGIN);
      ds.setPassword(PASSWORD);

      connection = ds.getConnection();
    }
    catch (SQLException sqlerror) {
      System.out.println("FALHA NA CONEXÃO: " + sqlerror.getMessage());
    }

    return connection;
  }
}