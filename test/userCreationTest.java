import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class userCreationTest {
  userCreation uC = new userCreation();
  ArrayList<String> Usernames = new ArrayList<>();

  @BeforeEach
  public void setupDB() throws SQLException {
    Usernames = uC.getExistingUsers();
  }


  @Test
  void getExistingUsers() {
  }

  @Test
  void jButton1ActionPerformed() {
    uC.txtusername.setText("john"); //"john" already exists within the db
    //jButtonActionPerformed returns true when the user already exists
    Assertions.assertEquals(true, uC.jButton1ActionPerformed(null));
  }

  @Test
  void autoID() {
  }
}