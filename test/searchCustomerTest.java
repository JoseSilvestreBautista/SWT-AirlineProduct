import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class searchCustomerTest {
    searchCustomer sc = new searchCustomer();

    @Test
    void jButton4ActionPerformedTest() {
        Assertions.assertTimeout(Duration.ofSeconds(2), () -> sc.jButton4ActionPerformedTest());
    }

}
