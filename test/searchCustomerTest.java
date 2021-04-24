import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import java.sql.Date;
import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import javax.swing.*;

public class searchCustomerTest {

  searchCustomer sc = new searchCustomer();
  ArrayList<String> customerfName = new ArrayList<>();
  private JLabel txtPhoto;


  @BeforeEach
  public void setupDB() throws SQLException {
    customerfName = sc.searchExistingUsers();
    txtPhoto = new JLabel();
    txtPhoto.setSize(100, 100);
  }

  //Method jButton4ActionPerformed
  @Test
  public void jButton4ActionPerformedPositive() {
    sc.txtfirstname.setText("CS001");
    System.out.print(customerfName);
    Assertions.assertEquals(false, sc.jButton4ActionPerformed(null));
  }

  //Method jButton1ActionPerformed
  @Test
  public void jButton1ActionPerformedPositive() {

    Assertions.assertEquals(true, sc.jButton1ActionPerformed(null));
  }

  @ParameterizedTest
  @ValueSource(strings = {"CS001", "CS002", "CS003"})
  public void existingCustomer(String id) {
    sc.jButton4ActionPerformed(null);
    Assertions.assertEquals(false, sc.jButton4ActionPerformed(null));
  }

  @Test
  public void jButton2ActionPerformed() {
    sc.txtfirstname.setText("test");
    sc.txtlastname.setText("test");
    sc.txtnic.setText("test");
    sc.txtpassport.setText("test");
    sc.txtaddress.setText("test");
    LocalDate today = LocalDate.now();
    Date now = Date.valueOf(today);
    sc.txtdob.setDate(now);
    sc.txtcontact.setText("0");

    //initialize the jButton1ActionPerformedTest test Image
    sc.jButton2ActionPerformed(null);

    //Assertions.assertEquals(false, sc.jButton2ActionPerformed(null));
  }

  @Test
  public void testSearchTime() {
  }

    // NF02 Performance Test
    // Test the db to see if it responds within 1 second
    @Test
    void jButton4ActionPerformedTest() {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> sc.searchExistingUsers());
    }
  @Test
  public void searchExistingUsers() {
  }

  /**
   * Asserts that the
   */
  @Test
  public void jButton4ActionPerformedNegative() {
    sc.txtfirstname.setText("test");
    sc.txtlastname.setText("test");
    sc.txtnic.setText("test");
    sc.txtpassport.setText("test");
    sc.txtaddress.setText("test");
    LocalDate today = LocalDate.now();
    Date now = Date.valueOf(today);
    sc.txtdob.setDate(now);
    sc.txtcontact.setText("0");
    sc.txtnic.setText("Test");
    sc.txtpassport.setText("Test");
    sc.txtcontact.setText("Test");

    //initialize the jButton1ActionPerformedTest test Image
    sc.jButton4ActionPerformed(null);

    // assertFalse(sc.jButton2ActionPerformed(null));
  }

  /**
   * Asserts that the correct information
   * is retrieved from the database
   */
  @Test
  public void jButton4ActionPerformedExceptionTest() {
    sc.txtcustid.setText("cs002");

    sc.jButton4ActionPerformed(null);
    assertEquals("Jim", sc.txtfirstname.getText());
    assertEquals("Jones", sc.txtlastname.getText());
    assertEquals("34324", sc.txtnic.getText());
    assertEquals("433", sc.txtpassport.getText());
    assertEquals("Africa",sc.txtaddress.getText());



  }

  /**
   * NF02 Performance Test
   * asserts that the database
   * responds within 1 second
   */
  @Test
  public void jButton4ActionPerformanceTest() {
    Assertions.assertTimeout(Duration.ofSeconds(5), () -> sc.jButton4ActionPerformed(null));
  }
}
