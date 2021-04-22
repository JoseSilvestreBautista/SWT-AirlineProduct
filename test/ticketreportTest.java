import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.Test;

public class ticketreportTest {

  ticketreport tr = new ticketreport();


  @Test
  public void loadData() {
    assertDoesNotThrow(() -> tr.LoadData());
  }

  @Test
  public void jButton1ActionPerformed() {
    tr.jButton1ActionPerformed(null);
    ticketreport ticketR = Mockito.mock(ticketreport.class);

    Mockito.doNothing().when(ticketR).jButton1ActionPerformed(null);

    try {
      ticketR.jButton1ActionPerformed(null);
      verify(ticketR, times(1)).jButton1ActionPerformed(null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void initComponents() throws Exception {
    tr.initComponents();
    ticketreport ticketR = Mockito.mock(ticketreport.class);

    Mockito.doNothing().when(ticketR).initComponents();

    try {
      ticketR.initComponents();
      verify(ticketR, times(1)).initComponents();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void jbutton1() throws Exception {
    tr.initComponents();
    assertEquals("Cancel", tr.jButton1.getText());
  }

}