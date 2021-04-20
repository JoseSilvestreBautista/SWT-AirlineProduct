import static org.junit.jupiter.api.Assertions.*;

import java.sql.*;
import java.time.Duration;

import com.mysql.cj.conf.ConnectionUrl;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ticketTest {
  ticket ticket = new ticket();
  Connection connection;
  Statement stmt = connection.createStatement();

  ticketTest() throws SQLException {
  }

  @Before
  public void before() throws SQLException {
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root", "password");
  }

  @After
  public void after() throws SQLException {
    stmt.close();
  }

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
   * Test for Requirement 10
   */
  @Test
  void jButton3ActionPerformedTest() {
    Assertions.assertTimeout(Duration.ofSeconds(2), () -> ticket.jButton3ActionPerformedTest());
  }

  @Test
  void initComponents() {
  }

  @Test
  void autoID() {

  }

  @Test
  void txtseatsStateChanged() {
    ticket.txtprice.setText("1000");
    ticket.txtseats.setValue(5);

    ticket.txtseatsStateChanged(null);
    String tot = ticket.txttotal.getText();
    assertEquals("5000", tot);
  }
}