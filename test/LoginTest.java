import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.Test;

public class LoginTest {

  Login log = new Login();

  /**
   * Asserts that login and main
   * do not throw and exception
   * with the given user and pass
   */
  @Test
  public void Mainandjbutton1ExceptionTest() {

    assertDoesNotThrow(() -> Login.main(null));
    log.txtuser.setText("john");
    log.txtpass.setText("123");
    assertDoesNotThrow(() -> log.jButton1ActionPerformed(null));


  }

  /**
   * Cleans up user and pass
   * after each test
   */
  @AfterEach
  public void cleanup() {
    log.txtuser.setText("");
    log.txtpass.setText("");
  }

  /**
   * Asserts that an exception is thrown
   * when no user and pass is entered
   * Also asserts that the correct message
   * is given with the exception
   */
  @Test
  public void Test1() {
    log.txtuser.setText("");
    log.txtpass.setText("");
    Exception exception = assertThrows(Exception.class, () -> log.jButton1ActionPerformed(null));
    assertEquals("UserName or Password Blank", exception.getMessage());
  }

  /**
   * Asserts that an exception is thrown
   * when no user or pass is entered
   * Also asserts that the correct message
   * is given with the exception
   */
  @Test
  public void Test2() {
    log.txtuser.setText("");
    log.txtpass.setText("123");
    Exception exception = assertThrows(Exception.class, () -> log.jButton1ActionPerformed(null));
    assertEquals("UserName or Password Blank", exception.getMessage());
  }

  /**
   * Asserts that an exception is thrown
   * when no user or pass is entered
   * Also asserts that the correct message
   * is given with the exception
   */
  @Test
  public void Test3() {
    log.txtuser.setText("john");
    log.txtpass.setText("");
    Exception exception = assertThrows(Exception.class, () -> log.jButton1ActionPerformed(null));
    assertEquals("UserName or Password Blank", exception.getMessage());
  }

  /**
   * Asserts that login works
   * correctly with the given
   * user and pass
   *
   * @throws Exception - to catch database errors
   */
  @Test
  public void Test4() throws Exception{
    log.txtuser.setText("john");
    log.txtpass.setText("123");
    assertTrue(log.jButton1ActionPerformed(null));
  }

  /**
   * Asserts that an exception is thrown
   * with the given user and pass
   * Also asserts that the correct message
   * is given with the exception
   */
  @Test
  public void Test5() {
    log.txtuser.setText("NoUserExist");
    log.txtpass.setText("NoUserExist");
    Exception exception = assertThrows(Exception.class, () -> log.jButton1ActionPerformed(null));
    assertEquals("UserName or Password do not Match", exception.getMessage());
  }

  /**
   * NF03 Performance Test
   * Tests that the system allows access
   * within 2 seconds of logging in
   */
  @Test
  public void Test6() {
    log.txtuser.setText("john");
    log.txtpass.setText("123");
    assertTimeout(Duration.ofSeconds(2), () -> log.jButton1ActionPerformed(null));
  }

}