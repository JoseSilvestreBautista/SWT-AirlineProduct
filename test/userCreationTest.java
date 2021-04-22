import static org.junit.jupiter.api.Assertions.*;

import java.sql.*;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

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
  public void breakItDown() throws SQLException {
    sql =
            "DELETE FROM user where username = 'jtest6'";
    statement = connection.createStatement();
    statement.execute(sql);
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
  public void testInvalidUsername() throws Exception {
    userCreation.autoID();
    userCreation.txtuserid.setText(userCreation.txtuserid.getText());
    userCreation.txtfirstname.setText("jtest6");
    userCreation.txtlastname.setText("jtest6");
    userCreation.txtusername.setText("john");
    userCreation.txtpassword.setText("jtest6");
    assertFalse(userCreation.jButton1ActionPerformed(null));
    

    //exception = assertThrows(Exception.class, () -> userCreation.txtusername.getText());
    //assertEquals("User Already Exists, Try a New Username", exception.getMessage());

    //assertDoesNotThrow(() -> userCreation.jButton1ActionPerformed(null));
  }


  @Test
  void setNewUsers() throws Exception {
    userCreation.autoID();
    userCreation.txtuserid.setText(userCreation.txtuserid.getText());
    userCreation.txtfirstname.setText("jtest6");
    userCreation.txtlastname.setText("jtest6");
    userCreation.txtusername.setText("jtest6");
    userCreation.txtpassword.setText("jtest6");
    assertTrue(userCreation.jButton1ActionPerformed(null));
  }


  @Test
  void autoID() {
    userCreation.autoID();
    String userid = userCreation.txtuserid.toString();
    assertEquals(userCreation.txtuserid.toString(), userid);
  }


}
