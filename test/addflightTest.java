import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import static org.mockito.Mockito.verify;

import static org.junit.jupiter.api.Assertions.*;

class addFlightTest {

    @Test
    public void mockAddFlight() throws ClassNotFoundException, SQLException {

        addflight addflight = Mockito.mock(addflight.class);

        Mockito.doNothing().when(addflight).jButton1ActionPerformedTest();

            addflight.jButton1ActionPerformedTest();
            verify(addflight).jButton1ActionPerformedTest();
    }
}