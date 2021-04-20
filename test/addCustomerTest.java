import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockConstruction;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class addCustomerTest {
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
    public void stubImageTest() {
        // create Mock class
        addCustomer mockCustomer = mock(addCustomer.class);

        // create a stub to supply jButton2ActionPerformed with an Image
        when(mockCustomer.jButton1ActionPerformedTest("images/driverConnectionChanges.png")).thenReturn(testImage);

        // call stub to receive image
        aC.jButton1ActionPerformedTest("images/driverConnectionChanges.png");

        // use image to add a customer
        aC.jButton2ActionPerformed(null);
    }

}