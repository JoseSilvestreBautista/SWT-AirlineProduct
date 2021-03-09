import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ticketTest {

  @Test
  public void testPostive(){
    ticket tk = new ticket();
    String tot = tk.txtseatsStateChangedTest("1000","5");
    assertEquals("5000", tot);
  }

}