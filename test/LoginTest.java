import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.Test;

public class LoginTest {

  Login log = new Login();

  @Test
  public void Mainandjbutton1ExceptionTest() throws Exception {
    assertDoesNotThrow(() -> Login.main(null));
    log.txtuser.setText("john");
    log.txtpass.setText("123");
    assertDoesNotThrow(() -> log.jButton1ActionPerformed(null));
  }

  @AfterEach
  public void cleanup() {
    log.txtuser.setText("");
    log.txtpass.setText("");
  }

  @Test
  public void Test1() {
    log.txtuser.setText("");
    log.txtpass.setText("");
    Exception exception = assertThrows(Exception.class, () -> log.jButton1ActionPerformed(null));
    assertEquals("UserName or Password Blank", exception.getMessage());
  }

  @Test
  public void Test2() {
    log.txtuser.setText("");
    log.txtpass.setText("123");
    Exception exception = assertThrows(Exception.class, () -> log.jButton1ActionPerformed(null));
    assertEquals("UserName or Password Blank", exception.getMessage());
  }


  @Test
  public void Test3() {
    log.txtuser.setText("john");
    log.txtpass.setText("");
    Exception exception = assertThrows(Exception.class, () -> log.jButton1ActionPerformed(null));
    assertEquals("UserName or Password Blank", exception.getMessage());
  }


  @Test
  public void Test4() throws Exception {
    log.txtuser.setText("john");
    log.txtpass.setText("123");
    assertTrue(log.jButton1ActionPerformed(null));
  }

  @Test
  public void Test5() throws Exception {
    log.txtuser.setText("NoUserExist");
    log.txtpass.setText("NoUserExist");
    Exception exception = assertThrows(Exception.class, () -> log.jButton1ActionPerformed(null));
    assertEquals("UserName or Password do not Match", exception.getMessage());
  }

}