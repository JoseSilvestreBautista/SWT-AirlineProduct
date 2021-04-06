import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Null;

class MainTest {

  @Test
  public void mockOpenDatabase() throws Exception {
    Main main = Mockito.mock(Main.class);

    Mockito.doNothing().when(main).jMenuItem1ActionPerformed(null);

    try {
      main.jMenuItem1ActionPerformed(null);
      verify(main, times(1)).jMenuItem1ActionPerformed(null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

