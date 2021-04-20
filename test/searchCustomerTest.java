import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.sql.SQLException;
import java.time.Duration;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class searchCustomerTest {
    searchCustomer sc = new searchCustomer();
    ArrayList<String> customerfName = new ArrayList<>();

    @BeforeEach
    public void setupDB() throws SQLException {
        customerfName = sc.searchExistingUsers();
    }

    //Method jButton4ActionPerformed
    @Test
    public void jButton4ActionPerformedPositive(){
        sc.txtfirstname.setText("CS001");
        System.out.print (customerfName);
        Assertions.assertEquals(true, sc.jButton4ActionPerformed(null));
    }

    //Method jButton1ActionPerformed
    @Test
    void jButton1ActionPerformedPositive() {
        //ByteArrayOutputStream testByte = sc.testingByteArray();
        Assertions.assertEquals(true, sc.jButton1ActionPerformed(null));
    }

    @Test
    void jButton1ActionPerformedNegative() {
        //ByteArrayOutputStream testByte = sc.testingByteArray();
        Assertions.assertEquals(false, sc.jButton1ActionPerformed(null));
    }

    @Test
    void jButton2ActionPerformed() {
        Assertions.assertEquals(true, sc.jButton2ActionPerformed(null));
    }

    @Test
    void jButton2Male(){
        sc.Gender.setText("Male");
        Assertions.assertEquals("Male", sc.jButton2ActionPerformed(null));
    }

    @Test
    void testSearchTime() {
    }

    @Test
    void searchExistingUsers() {
    }

    @Test
    void jButton4ActionPerformedNegative() {
        sc.txtfirstname.setText("CS100");
        System.out.print (customerfName);
        Assertions.assertEquals(false, sc.jButton4ActionPerformed(null));
    }
}
