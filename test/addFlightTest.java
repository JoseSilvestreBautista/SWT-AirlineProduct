import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
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

    // Makes sure that the user has entered data for each argument
    @Test
    void jButton1ActionPerformed() {
        assertFalse(addfl.invalidEntry(id, flightname, source, depart,date,departtime,arrtime,flightcharge));
        assertTrue(addfl.invalidEntry("", flightname, source, depart,date,departtime,arrtime,flightcharge));
        assertTrue(addfl.invalidEntry(id,  "", source, depart,date,departtime,arrtime,flightcharge));
        assertTrue(addfl.invalidEntry(id, flightname, "", depart,date,departtime,arrtime,flightcharge));
        assertTrue(addfl.invalidEntry(id, flightname, source, "",date,departtime,arrtime,flightcharge));
        assertTrue(addfl.invalidEntry(id, flightname, source, depart,"",departtime,arrtime,flightcharge));
        assertTrue(addfl.invalidEntry(id, flightname, source, depart,date,"",arrtime,flightcharge));
        assertTrue(addfl.invalidEntry(id, flightname, source, depart,date,departtime,"",flightcharge));
        assertTrue(addfl.invalidEntry(id, flightname, source, depart,date,departtime,arrtime,""));
    }

    // Test the db to see if it responds within 2 seconds
    @Test
    void dbTest() {
        assertTimeout(Duration.ofSeconds(2), () -> addfl.jButton1ActionPerformedTest(id, flightname, source, depart, date, departtime, arrtime, flightcharge));
    }

    // Integration test for db and data input
    @Test
    public void dbInputIntegration() {
        // create Mock class
        addflight mockFlight = mock(addflight.class);

        // create a stub to supply jButton1ActionPerformed with static data
        when(mockFlight.jButton1ActionPerformedTest(id, flightname, source, depart, date, departtime, arrtime, flightcharge)).thenReturn("Flight Created.........");
        when(mockFlight.jButton1ActionPerformedTest(id, "", source, depart, date, departtime, arrtime, flightcharge)).thenReturn("One or more of the fields for adding a flight is empty.");
        assertTimeout(Duration.ofSeconds(2), () -> assertEquals("Flight Created.........", mockFlight.jButton1ActionPerformedTest(id, flightname, source, depart, date, departtime, arrtime, flightcharge)));
        assertTimeout(Duration.ofSeconds(2), () -> assertEquals("One or more of the fields for adding a flight is empty.", mockFlight.jButton1ActionPerformedTest(id, "", source, depart, date, departtime, arrtime, flightcharge)));
    }
}
