import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ticketTest {
  ticket ticket = new ticket();

  @Test
  public void testPostive(){
    ticket.txtprice.setText("1000");
    ticket.txtseats.setValue(5);

    ticket.txtseatsStateChanged(null);
    String tot = ticket.txttotal.getText();
    assertEquals("5000", tot);
  }

  @Test
  void jButton1ActionPerformedTest() {

    String positiveIntegers = "Only Enter Positive Integers";
    String maxSeats = "Only 416 Seats Are Available ";
    String pass = "pass";

    Assertions.assertEquals(positiveIntegers, ticket.jButton1ActionPerformedTest(-1));
    Assertions.assertEquals(pass, ticket.jButton1ActionPerformedTest(0));
    Assertions.assertEquals(maxSeats, ticket.jButton1ActionPerformedTest(417));

  }

  /**
   * Performance Test for Requirement NF01
   */
  @Test
  void jButton3ActionPerformedTest() {
    Assertions.assertTimeout(Duration.ofSeconds(2), () -> ticket.jButton3ActionPerformedTest());
  }

}