import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GUI_Test
{
  private FrameFixture window;

  @Before
  public void setUp() {
    Main frame = GuiActionRunner.execute(() -> new Main());
    window = new FrameFixture(frame);
    window.show(); // shows the frame to test

  }

  @Test
  public void seachCustomerTest() {
    window.menuItem("jMenu1").click();
    window.menuItem("searchCustomer").click();
    window.textBox("txtcustid").enterText("cs001");
    window.button("jButton4").click();
  }

  @Test
  public void addCustomerTest() {
    window.menuItem("jMenu1").click();
    window.menuItem("addCustomer").click();
    window.textBox("txtfirstname").enterText("FirstName");
    window.textBox("txtlastname").enterText("LastName");
    window.textBox("txtnic").enterText("Nickname");
    window.textBox("txtpassport").enterText("12345");
    window.textBox("txtaddress").enterText("Address");
    window.panel("txtdob").textBox().setText("Apr 22, 2021");
    window.radioButton("r1").click(); // select Male
    window.textBox("txtcontact").enterText("12345");
  }

  @After
  public void cleanUp(){
    window.cleanUp();
  }
}
