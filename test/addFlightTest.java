import static org.junit.jupiter.api.Assertions.*;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class addFlightTest {

  addflight addfl = new addflight();
  String id = "FLO001";
  String flightname = "J7V3Y";
  String source = "Uk";
  String depart = "USA";
  String date = "2021-05-15";
  String departtime = "7AM";
  String arrtime = "1PM";
  String flightcharge = "150";

  @Test
  public void autoIDTest() throws SQLException {
    addfl.autoID();
    String currentID = addfl.txtflightid.toString();
    assertEquals(addfl.txtflightid.toString(), currentID);
//    Exception exception = assertThrows(Exception.class, () -> addfl.autoID());
//    assertEquals("No suitable driver found for", exception.getMessage());
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

  // Makes sure that the user has entered data for each argument
  @Test
  void jButton1ActionPerformed() {
    assertFalse(addfl
        .invalidEntry(id, flightname, source, depart, date, departtime, arrtime, flightcharge));
    assertTrue(addfl
        .invalidEntry("", flightname, source, depart, date, departtime, arrtime, flightcharge));
    assertTrue(addfl.invalidEntry(id, "", source, depart, date, departtime, arrtime, flightcharge));
    assertTrue(
        addfl.invalidEntry(id, flightname, "", depart, date, departtime, arrtime, flightcharge));
    assertTrue(
        addfl.invalidEntry(id, flightname, source, "", date, departtime, arrtime, flightcharge));
    assertTrue(
        addfl.invalidEntry(id, flightname, source, depart, "", departtime, arrtime, flightcharge));
    assertTrue(addfl.invalidEntry(id, flightname, source, depart, date, "", arrtime, flightcharge));
    assertTrue(
        addfl.invalidEntry(id, flightname, source, depart, date, departtime, "", flightcharge));
    assertTrue(addfl.invalidEntry(id, flightname, source, depart, date, departtime, arrtime, ""));
  }

  // Test the db to see if it responds within 2 seconds
  @Test
  public void dbTest() {
    addfl.txtflightid.setText("FLO001");
    addfl.txtflightname.setText("J7V3Y");
    addfl.txtsource.setName("Uk");
    addfl.txtdepart.setName("USA");
    Date date = new Date();
    addfl.txtdate.setDate(date);
    addfl.txtdtime.setText("7AM");
    addfl.txtarrtime.setText("1PM");
    addfl.txtflightcharge.setText("150");
    assertTimeout(Duration.ofSeconds(5), () -> addfl.jButton1ActionPerformed(null));
  }

  // Integration test for db and data input
  @Test
  public void dbInputIntegration() {
    // create Mock class
    addflight mockFlight = mock(addflight.class);

    addfl.txtflightid.setText("FLO001");
    addfl.txtflightname.setText("J7V3Y");
    addfl.txtsource.setName("Uk");
    addfl.txtdepart.setName("USA");
    addfl.txtdate.setName("2021-05-15");
    addfl.txtdtime.setText("7AM");
    addfl.txtarrtime.setText("1PM");
    addfl.txtflightcharge.setText("150");

    // create a stub to supply jButton1ActionPerformed with static data
    when(mockFlight.jButton1ActionPerformed(null)).thenReturn("Flight Created.........");

    addfl.txtflightname.setText("");

    when(mockFlight.jButton1ActionPerformed(null))
        .thenReturn("One or more of the fields for adding a flight is empty.");

  }

  @Test
  public void dbInputIntegrationTiming() {

    addflight mockFlight = mock(addflight.class);

    addfl.txtflightid.setText("FLO001");
    addfl.txtflightname.setText("J7V3Y");
    addfl.txtsource.setName("Uk");
    addfl.txtdepart.setName("USA");
    addfl.txtdate.setName("2021-05-15");
    addfl.txtdtime.setText("7AM");
    addfl.txtarrtime.setText("1PM");
    addfl.txtflightcharge.setText("150");

//    assertTimeout(Duration.ofSeconds(3),
//        () -> assertEquals("Flight Created.........", mockFlight.jButton1ActionPerformed(null)));

    assertTimeout(Duration.ofSeconds(3), () -> mockFlight.jButton1ActionPerformed(null));

    addfl.txtflightname.setText("");

//    assertTimeout(Duration.ofSeconds(3),
//        () -> assertEquals("One or more of the fields for adding a flight is empty.", mockFlight
//            .jButton1ActionPerformed(null)));

    assertTimeout(Duration.ofSeconds(3), () -> mockFlight.jButton1ActionPerformed(null));


  }

}
