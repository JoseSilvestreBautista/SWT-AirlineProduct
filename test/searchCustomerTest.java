import org.assertj.swing.fixture.FrameFixture;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.swing.edt.GuiActionRunner;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import javax.swing.*;

class searchCustomerTest {

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
  void jButton1ActionPerformedPositive() {

    Assertions.assertEquals(true, sc.jButton1ActionPerformed(null));
  }

  @ParameterizedTest
  @ValueSource(strings = {"CS001", "CS002", "CS003"})
  void existingCustomer(String id) {
    sc.jButton4ActionPerformed(null);
    Assertions.assertEquals(false, sc.jButton4ActionPerformed(null));
  }

  @Test
  void jButton2ActionPerformed() {
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
  void testSearchTime() {
  }

  @Test
  void searchExistingUsers() {
  }

  @Test
  void jButton4ActionPerformedNegative() {
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

    //Assertions.assertEquals(false, sc.jButton2ActionPerformed(null));
  }

  @Test
  public void jButton4ActionPerformedExceptionTest() {
    sc.txtcustid.setText("cs002");
    sc.jButton4ActionPerformed(null);
    assertEquals("john", sc.txtfirstname.getText());
    assertEquals("pink", sc.txtlastname.getText());
    assertEquals("34232222", sc.txtnic.getText());
    assertEquals("3443", sc.txtpassport.getText());
    assertEquals("1996-06-01", sc.txtdob.toString());
    assertEquals("Male", sc.Gender.getText());
    assertEquals("34324234", sc.txtcontact.toString());



  }
}
