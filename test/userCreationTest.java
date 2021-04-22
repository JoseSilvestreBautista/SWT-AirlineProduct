import static org.junit.jupiter.api.Assertions.*;

import java.sql.*;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class userCreationTest {
  userCreation userCreation;
  Exception exception;
  String sql;
  Connection connection;
  Statement statement;

  @BeforeEach
  public void setupDB() throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root", "password");
    userCreation = new userCreation();
  }

  @AfterEach
  public void tearDown() throws SQLException {
    userCreation = null;
    exception = null;
    sql = null;
    if (connection != null) {
      connection.close();
    }
    if (statement != null) {
      statement.close();
    }
  }

  @Test
  public void testSetUsername() throws SQLException {
    sql =
        "INSERT INTO user (id, firstname, lastname, username, password) VALUES ('UO007', 'test', 'test', 'john', 'test')";
    statement = connection.createStatement();
    statement.execute(sql);
    userCreation.jButton1ActionPerformed(null); // Sets test to true //
    assertFalse(userCreation.jButton1ActionPerformed(null));
    statement.close();

    //exception = assertThrows(Exception.class, () -> userCreation.txtusername.getText());
    //assertEquals("User Already Exists, Try a New Username", exception.getMessage());

    //assertDoesNotThrow(() -> userCreation.jButton1ActionPerformed(null));
  }


  @Test
  void setNewUsers() throws SQLException {
//
//    sql =
//        "INSERT INTO user (id, firstname, lastname, username, password) VALUES ('UO007', 'test', 'test', 'test', 'test')";
//    statement = connection.createStatement();
//    statement.execute(sql);
    userCreation.autoID();
    userCreation.txtuserid.setText(userCreation.txtuserid.getText());
    userCreation.txtfirstname.setText("jtest3");
    userCreation.txtlastname.setText("jtest3");
    userCreation.txtusername.setText("jtest3");
    userCreation.txtpassword.setText("juser3");
    userCreation.jButton1ActionPerformed(null); // Sets test to true //
    assertFalse(userCreation.jButton1ActionPerformed(null));
  }


  @Test
  void autoID() {
  }
}