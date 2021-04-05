import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class searchCustomerTest {
    searchCustomer sc = new searchCustomer();

    @Test
    public void searchTimeTest(){
        Boolean actualResult = assertTimeout(Duration.ofSeconds(2), () -> searchCustomer.testSearchTime("U001") );
        assertFalse(actualResult);
    }

}
