import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class addFlightTest {
    addflight addfl = new addflight();


    @Test
    void jButton1ActionPerformed() {
        assertFalse(addfl.invalidEntry("1", "J7V3Y", "Tampa", "Jacksonville","2021-05-15","7AM","9AM","150"));
        assertTrue(addfl.invalidEntry("", "J7V3Y", "Tampa", "Jacksonville","2021-05-15","7AM","9AM","150"));
        assertTrue(addfl.invalidEntry("1", "", "Tampa", "Jacksonville","2021-05-15","7AM","9AM","150"));
        assertTrue(addfl.invalidEntry("1", "J7V3Y", "", "Jacksonville","2021-05-15","7AM","9AM","150"));
        assertTrue(addfl.invalidEntry("1", "J7V3Y", "Tampa", "","2021-05-15","7AM","9AM","150"));
        assertTrue(addfl.invalidEntry("1", "J7V3Y", "Tampa", "Jacksonville","","7AM","9AM","150"));
        assertTrue(addfl.invalidEntry("1", "J7V3Y", "Tampa", "Jacksonville","2021-05-15","","9AM","150"));
        assertTrue(addfl.invalidEntry("1", "J7V3Y", "Tampa", "Jacksonville","2021-05-15","7AM","","150"));
        assertTrue(addfl.invalidEntry("1", "J7V3Y", "Tampa", "Jacksonville","2021-05-15","7AM","9AM",""));
    }
}
