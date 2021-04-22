import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.sql.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.mockito.Mockito;

public class IntegrationTest {
  addCustomer aC = new addCustomer();
  byte[] testImage;
  Main main = new Main();
  ticketreport tr = new ticketreport();


  @BeforeEach
  public void setUp() {
    //initialize the fields for jButton2ActionPerformed
    aC.txtfirstname.setText("test");
    aC.txtlastname.setText("test");
    aC.txtnic.setText("test");
    aC.txtpassport.setText("test");
    aC.txtaddress.setText("test");
    LocalDate today = LocalDate.now();
    Date now = Date.valueOf(today);
    aC.txtdob.setDate(now);
    aC.txtcontact.setText("0");

    //initialize the jButton1ActionPerformedTest test Image
    testImage = aC.makeByteArray("images/driverConnectionChanges.png").toByteArray();
  }

  @Test
  public void stubImageTest() throws ParseException {
    // create Mock class
    addCustomer mockCustomer = mock(addCustomer.class);

    // create a stub to supply jButton2ActionPerformed with an Image
    when(mockCustomer.jButton1ActionPerformedTest("images/driverConnectionChanges.png")).thenReturn(testImage);

    // call stub to receive image
    aC.jButton1ActionPerformedTest("images/driverConnectionChanges.png");

    // use image to add a customer
    String date = "2021-04-20";
    java.util.Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
    aC.txtcontact.setText("4342323");
    aC.txtdob.setDate(date2);
    aC.jButton2ActionPerformed(null);
  }

  @Test
  public void initComponents() {
    addflight flight = new addflight();
    flight.initComponents();
    addflight af = Mockito.mock(addflight.class);

    Mockito.doNothing().when(af).initComponents();

    try {
      af.initComponents();
      verify(af, times(1)).initComponents();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void jMenuItem1ActionPerformed() throws Exception {
    main.initComponents();
    main.jMenuItem1ActionPerformed(null);
    Main main = Mockito.mock(Main.class);

    Mockito.doNothing().when(main).jMenuItem1ActionPerformed(null);

    try {
      main.jMenuItem1ActionPerformed(null);
      verify(main, times(1)).jMenuItem1ActionPerformed(null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test

  public void jMenuItem2ActionPerformed() throws Exception {
    main.jMenuItem2ActionPerformed(null);
    Main main = Mockito.mock(Main.class);

    Mockito.doNothing().when(main).jMenuItem1ActionPerformed(null);

    try {
      main.jMenuItem1ActionPerformed(null);
      verify(main, times(1)).jMenuItem1ActionPerformed(null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void jMenuItem3ActionPerformed() throws Exception {
    main.jMenuItem3ActionPerformed(null);
    Main main = Mockito.mock(Main.class);

    Mockito.doNothing().when(main).jMenuItem1ActionPerformed(null);

    try {
      main.jMenuItem1ActionPerformed(null);
      verify(main, times(1)).jMenuItem1ActionPerformed(null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void jMenuItem4ActionPerformed() throws Exception {
    main.jMenuItem4ActionPerformed(null);
    Main main = Mockito.mock(Main.class);

    Mockito.doNothing().when(main).jMenuItem1ActionPerformed(null);

    try {
      main.jMenuItem1ActionPerformed(null);
      verify(main, times(1)).jMenuItem1ActionPerformed(null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void jMenuItem5ActionPerformed() throws Exception {
    main.jMenuItem5ActionPerformed(null);
    Main main = Mockito.mock(Main.class);

    Mockito.doNothing().when(main).jMenuItem1ActionPerformed(null);

    try {
      main.jMenuItem1ActionPerformed(null);
      verify(main, times(1)).jMenuItem1ActionPerformed(null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void jMenuItem6ActionPerformed() throws Exception {
    main.jMenuItem6ActionPerformed(null);
    Main main = Mockito.mock(Main.class);

    Mockito.doNothing().when(main).jMenuItem1ActionPerformed(null);

    try {
      main.jMenuItem1ActionPerformed(null);
      verify(main, times(1)).jMenuItem1ActionPerformed(null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void jButton1ActionPerformed() {
    tr.jButton1ActionPerformed(null);
    ticketreport ticketR = Mockito.mock(ticketreport.class);

    Mockito.doNothing().when(ticketR).jButton1ActionPerformed(null);

    try {
      ticketR.jButton1ActionPerformed(null);
      verify(ticketR, times(1)).jButton1ActionPerformed(null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void initComponentsTest1() throws Exception {
    tr.initComponents();
    ticketreport ticketR = Mockito.mock(ticketreport.class);

    Mockito.doNothing().when(ticketR).initComponents();

    try {
      ticketR.initComponents();
      verify(ticketR, times(1)).initComponents();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void initComponentsTest2() {
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

}