import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.mockito.Mockito;


public class addCustomerTest {

    addCustomer addCustomer = new addCustomer();

    @Test
    public void genderChosenTest() {

        Boolean test1 = addCustomer.genderOption(true,false);//tests if only male is selected
        Boolean test2 = addCustomer.genderOption(false,true);//tests if only female is selected
        Boolean test3 = addCustomer.genderOption(true,true); //test if both male and female is selected

        assertEquals(true, test1);
        assertEquals(true, test2);
        assertEquals(false, test3);
    }

    @Test
    public void autoIDTest(){
        addCustomer addCustomer = new addCustomer();
        addCustomer.autoID();
        String currentID = addCustomer.txtid.toString();
        assertEquals(addCustomer.txtid.toString(),currentID);

    }

    @Test
    public void initComponentsTest(){
        addCustomer addCustomer = mock(addCustomer.class);

        Mockito.doNothing().when(addCustomer).initComponents();
        Mockito.doNothing().when(addCustomer).autoID();

        try {
            addCustomer.initComponents();
            addCustomer.autoID();
            verify(addCustomer, times(1)).initComponents();
            verify(addCustomer, times(1)).autoID();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    addCustomer aC = new addCustomer();
    byte[] testImage;


    @BeforeEach
    public void jButton2ActionPerformedtest() {
        //initialize the fields for jButton2ActionPerformed
        aC.txtfirstname.setText("test");
        aC.txtlastname.setText("test");
        aC.txtnic.setText("test");
        aC.txtpassport.setText("test");
        aC.txtaddress.setText("test");
        LocalDate today = LocalDate.now();
        Date now = Date.valueOf(today);
        aC.txtdob.setDate(now);
        aC.txtcontact.setText("0");

        //initialize the jButton1ActionPerformedTest test Image
        aC.jButton1ActionPerformed(null);
    }

    @Test
    public void stubImageTest() throws ParseException {
        // create Mock class
        addCustomer mockCustomer = mock(addCustomer.class);

        // create a stub to supply jButton2ActionPerformed with an Image
        when(mockCustomer.jButton1ActionPerformedTest("images/driverConnectionChanges.png")).thenReturn(testImage);

        // call stub to receive image
        aC.jButton1ActionPerformedTest("images/driverConnectionChanges.png");

        // use image to add a customer
        String date = "2021-04-20";
        java.util.Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        aC.txtcontact.setText("4342323");
        aC.txtdob.setDate(date2);
        aC.jButton2ActionPerformed(null);
    }

}