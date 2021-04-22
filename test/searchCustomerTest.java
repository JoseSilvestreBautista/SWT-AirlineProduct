import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class searchCustomerTest {
    searchCustomer sc = new searchCustomer();

    // NF02 Performance Test
    // Test the db to see if it responds within 1 second
    @Test
    void jButton4ActionPerformedTest() {
        Assertions.assertTimeout(Duration.ofSeconds(1), () -> sc.jButton4ActionPerformedTest());
    }

}
