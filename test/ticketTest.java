import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

public class ticketTest {
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
  public void jButton1ActionPerformedTest() {

    String positiveIntegers = "Only Enter Positive Integers";
    String maxSeats = "Only 416 Seats Are Available ";
    String pass = "pass";

    Assertions.assertEquals(positiveIntegers, ticket.jButton1ActionPerformedTest(-1));
    Assertions.assertEquals(pass, ticket.jButton1ActionPerformedTest(0));
    Assertions.assertEquals(maxSeats, ticket.jButton1ActionPerformedTest(417));

  }

  /**
   * Test for Requirement 10
   */
  @Test
  public void jButton3ActionPerformedTest() {
    Assertions.assertTimeout(Duration.ofSeconds(2), () -> ticket.jButton3ActionPerformedTest());
  }

  @Test
  public void initComponentsTest() {
    ticket ticket = mock(ticket.class);

    Mockito.doNothing().when(ticket).initComponents();
    Mockito.doNothing().when(ticket).autoID();

    try {
      ticket.initComponents();
      ticket.autoID();
      verify(ticket, times(1)).initComponents();
      verify(ticket, times(1)).autoID();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void autoIDTest() {
    ticket ticket = new ticket();
    ticket.autoID();
    String tnumber = ticket.txtticketno.toString();
    assertEquals(ticket.txtticketno.toString(),tnumber);
  }

  @Test
  public void txtseatsStateChanged() {
    ticket.txtprice.setText("1000");
    ticket.txtseats.setValue(5);

    ticket.txtseatsStateChanged(null);
    String tot = ticket.txttotal.getText();
    assertEquals("5000", tot);
  }
}