import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoginTest {
  @Test
  public void negativeTesting(){
    Login log = new Login();

    Exception empty =  assertThrows(Exception.class, () ->log.jButton1ActionPerformedTest("",""));
    assertEquals("UserName or Password Blank", empty.getMessage());

    Exception noUserExistException =  assertThrows(Exception.class, () ->log.jButton1ActionPerformedTest("lee","123"));
    assertEquals("UserName or Password do not Match", noUserExistException.getMessage());

  }

  @Test
  void inputValidation() {
    Login log = new Login();
    assertTrue(log.invalidEntry("", ""));

    assertTrue(log.invalidEntry("john", ""));

    assertTrue(log.invalidEntry("", "123"));

    assertFalse(log.invalidEntry("john", "123"));
  }

}