import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ticketTest {

  @Test
  public void testPostive(){
    ticket tk = new ticket();
    tk.txtprice.setText("1000");
    tk.txtseats.setValue(5);


    tk.txtseatsStateChanged(null);
    String tot = tk.txttotal.getText();
    assertEquals("5000", tot);
  }

}