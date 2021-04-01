import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class addCustomerTest {

    @Test
    public void genderChosenTest() {
        addCustomer ct = new addCustomer();
        Boolean test1 = ct.genderOption(true,false);//tests if only male is selected
        Boolean test2 = ct.genderOption(false,true);//tests if only female is selected
        Boolean test3 = ct.genderOption(true,true); //test if both male and female is selected

        assertEquals(true, test1);
        assertEquals(true, test2);
        assertEquals(false, test3);
    }
}