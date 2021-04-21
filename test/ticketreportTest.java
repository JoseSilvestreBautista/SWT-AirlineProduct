import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ticketreportTest {
    ticketreport tr = new ticketreport();


    @Test
    void loadData() {
tr.LoadData();
    }
}