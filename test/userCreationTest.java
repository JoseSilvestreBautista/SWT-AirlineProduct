import static org.junit.jupiter.api.Assertions.*;
import java.sql.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

public class userCreationTest {
  userCreation userCreation = new userCreation();
  Exception exception;
  String sql;
  Connection connection;
  Statement statement;

  @BeforeEach
  public void setupDB() throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root", "password");
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
  public void setNewUsers() throws Exception {
    userCreation.txtuserid.setText(userCreation.txtuserid.getText());
    userCreation.txtfirstname.setText("jtest6");
    userCreation.txtlastname.setText("jtest6");
    userCreation.txtusername.setText("jtest6");
    userCreation.txtpassword.setText("jtest6");
    assertFalse(userCreation.jButton1ActionPerformed(null));
  }


  @Test
  public void autoID() {
    String userid = userCreation.txtuserid.toString();
    assertEquals(userCreation.txtuserid.toString(), userid);
  }


}
