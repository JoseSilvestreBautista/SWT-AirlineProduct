import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class searchCustomerTest {
searchCustomer searchCustomer = new searchCustomer();
  @BeforeEach
  void jButton1ActionPerformedTest(){
    searchCustomer.jButton1ActionPerformedTest();
  }

  @Test
  void jButton2ActionPerformedTest() {
    Assertions.assertTimeout(Duration.ofSeconds(1), () -> searchCustomer.jButton2ActionPerformedTest());
  }

}