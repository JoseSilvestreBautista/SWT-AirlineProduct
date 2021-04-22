import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.Test;
import org.mockito.Mockito;

public class MainTest {

  Main main = new Main();

  @Test
  public void Mainandjbutton1ExceptionTest() throws Exception {

    assertDoesNotThrow(() -> Main.main(null));

  }

  @Test
  public void jMenuItem1ActionPerformed() throws Exception {
    main.initComponents();
    main.jMenuItem1ActionPerformed(null);
    Main main = Mockito.mock(Main.class);

    Mockito.doNothing().when(main).jMenuItem1ActionPerformed(null);

    try {
      main.jMenuItem1ActionPerformed(null);
      verify(main, times(1)).jMenuItem1ActionPerformed(null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test

  public void jMenuItem2ActionPerformed() throws Exception {
    main.jMenuItem2ActionPerformed(null);
    Main main = Mockito.mock(Main.class);

    Mockito.doNothing().when(main).jMenuItem1ActionPerformed(null);

    try {
      main.jMenuItem1ActionPerformed(null);
      verify(main, times(1)).jMenuItem1ActionPerformed(null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void jMenuItem3ActionPerformed() throws Exception {
    main.jMenuItem3ActionPerformed(null);
    Main main = Mockito.mock(Main.class);

    Mockito.doNothing().when(main).jMenuItem1ActionPerformed(null);

    try {
      main.jMenuItem1ActionPerformed(null);
      verify(main, times(1)).jMenuItem1ActionPerformed(null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void jMenuItem4ActionPerformed() throws Exception {
    main.jMenuItem4ActionPerformed(null);
    Main main = Mockito.mock(Main.class);

    Mockito.doNothing().when(main).jMenuItem1ActionPerformed(null);

    try {
      main.jMenuItem1ActionPerformed(null);
      verify(main, times(1)).jMenuItem1ActionPerformed(null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void jMenuItem5ActionPerformed() throws Exception {
    main.jMenuItem5ActionPerformed(null);
    Main main = Mockito.mock(Main.class);

    Mockito.doNothing().when(main).jMenuItem1ActionPerformed(null);

    try {
      main.jMenuItem1ActionPerformed(null);
      verify(main, times(1)).jMenuItem1ActionPerformed(null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void jMenuItem6ActionPerformed() throws Exception {
    main.jMenuItem6ActionPerformed(null);
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

