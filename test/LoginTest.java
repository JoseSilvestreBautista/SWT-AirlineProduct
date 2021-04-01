import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class LoginTest {
  Login log = new Login();

    @Test
    void jButton1ActionPerformed() {
      assertTrue(log.invalidEntry("", ""));
      assertTrue(log.invalidEntry("john", ""));
      assertTrue(log.invalidEntry("", "123"));
      assertFalse(log.invalidEntry("john", "123"));
    }



  @AfterEach
  void cleanup(){
    log.txtuser.setText("");
    log.txtpass.setText("");
  }

  @Test
  void Test1() {
    log.txtuser.setText("");
    log.txtpass.setText("");
    Exception exception = assertThrows(Exception.class, () -> log.jButton1ActionPerformed(null));
    assertEquals("UserName or Password Blank", exception.getMessage());
  }

  @Test
  void Test2() {
    log.txtuser.setText("");
    log.txtpass.setText("123");
    Exception exception = assertThrows(Exception.class, () -> log.jButton1ActionPerformed(null));
    assertEquals("UserName or Password Blank", exception.getMessage());
  }


  @Test
  void Test3() {
    log.txtuser.setText("john");
    log.txtpass.setText("");
    Exception exception = assertThrows(Exception.class, () -> log.jButton1ActionPerformed(null));
    assertEquals("UserName or Password Blank", exception.getMessage());
  }


  @Test
  void Test4() throws Exception {
    log.txtuser.setText("john");
    log.txtpass.setText("123");
    assertTrue(log.jButton1ActionPerformed(null));
  }

}