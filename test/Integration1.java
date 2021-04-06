import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.sql.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Integration1Test {
  addCustomer aC = new addCustomer();
  byte[] testImage;


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
  public void stubImageTest() {
    // create Mock class
    addCustomer mockCustomer = mock(addCustomer.class);

    // create a stub to supply jButton2ActionPerformed with an Image
    when(mockCustomer.jButton1ActionPerformedTest("images/driverConnectionChanges.png")).thenReturn(testImage);

    // call stub to receive image
    aC.jButton1ActionPerformedTest("images/driverConnectionChanges.png");

    // use image to add a customer
    aC.jButton2ActionPerformed(null);
  }
}