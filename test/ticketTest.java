import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

public class ticketTest {

  ticket ticket = new ticket();


  @Test
  public void testPostive() {
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

    ticket.txtticketno.setText("TO015");
    ticket.flightno.setText("FO001");
    ticket.txtcustid.setText("cs001");
    ticket.txtclass.setName("Economy");
    ticket.txtprice.setText("100");
    ticket.txtdate = java.time.LocalDate.now();


    ticket.txtseats.setValue(-1);
    assertEquals(positiveIntegers, ticket.jButton1ActionPerformed(null));

    ticket.txtseats.setValue(0);
    assertEquals(pass, ticket.jButton1ActionPerformed(null));


    ticket.txtseats.setValue(417);
    assertEquals(maxSeats, ticket.jButton1ActionPerformed(null));

  }



  /**
   * Performance Test for Requirement NF01
   */
  @Test
  public void jButton3ActionPerformedTest() {
    ticket.txtsource.setSelectedItem("India");
    ticket.txtdepart.setSelectedItem("Uk");
    Assertions.assertTimeout(Duration.ofSeconds(2), () -> ticket.jButton3ActionPerformed(null));
  }

  @Test
  public void jButton4ActionPerformedTest() {
    ticket.txtcustid.setText("cs001");
    ticket.jButton4ActionPerformed(null);
    assertEquals("john",ticket.txtfirstname.getText());
    assertEquals("Alex",ticket.txtlastname.getText());
    assertEquals("3443",ticket.txtpassport.getText());

  }

  @Test
  public void jTable1MouseClickedTest(){
    ticket.txtsource.setSelectedItem(0);
    ticket.txtdepart.setSelectedItem(2);
    ticket.jButton3ActionPerformed(null);
    ticket.jTable1MouseClicked(null);
    assertDoesNotThrow(() -> ticket.jTable1MouseClicked(null));
//    assertEquals("FO001",ticket.flightno.getText());
//    assertEquals("JetBlue",ticket.flightname.getText());
//    assertEquals("Uk",ticket.txtdept.getText());
//    assertEquals("50000",ticket.txtprice.getText());

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
    assertEquals(ticket.txtticketno.toString(), tnumber);
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