import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ticketreportTest {
    ticketreport tr = new ticketreport();
    ArrayList<String>  flightArray = new ArrayList<>();

    @Before
    public void setupDB() throws SQLException {
        flightArray = tr.loadDataTest();
    }

    @Test
    void loadData() {
        Assertions.assertEquals(false, tr.jButton1ActionPerformed(null));

    }

    @Test
    void jButton1ActionPerformed(){
        Assertions.assertEquals(false, tr.jButton1ActionPerformed(null));
    }
}