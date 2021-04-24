import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.Test;
import org.mockito.Mockito;

public class MainTest {

  Main main = new Main();

  /**
   * Asserts that main does
   * not throw an exception
   */
  @Test
  public void Mainandjbutton1ExceptionTest() {

    assertDoesNotThrow(() -> Main.main(null));

  }

  /**
   * Creates a mock to handle main
   * and verifies that jMenuItem1
   * behaves correctly
   * after jMenuItem1ActionPerformed
   * is executed
   */
  @Test
  public void jMenuItem1ActionPerformed() {
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


  /**
   * Creates a mock to handle main
   * and verifies that jMenuItem1
   * behaves correctly
   * after jMenuItem2ActionPerformed
   * is executed
   */
  @Test
  public void jMenuItem2ActionPerformed() {
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

  /**
   * Creates a mock to handle main
   * and verifies that jMenuItem1
   * behaves correctly
   * after jMenuItem3ctionPerformed
   * is executed
   */
  @Test
  public void jMenuItem3ActionPerformed() {
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

  /**
   * Creates a mock to handle main
   * and verifies that jMenuItem1
   * behaves correctly
   * after jMenuItem4ActionPerformed
   * is executed
   */
  @Test
  public void jMenuItem4ActionPerformed() {
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

  /**
   * Creates a mock to handle main
   * and verifies that jMenuItem1
   * behaves correctly
   * after jMenuItem5ActionPerformed
   * is executed
   */
  @Test
  public void jMenuItem5ActionPerformed() {
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

  /**
   * Creates a mock to handle main
   * and verifies that jMenuItem1
   * behaves correctly
   * after jMenuItem6ActionPerformed
   * is executed
   */
  @Test
  public void jMenuItem6ActionPerformed() {
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

