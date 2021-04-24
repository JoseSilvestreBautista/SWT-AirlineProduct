import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GUI_Test
{
  private FrameFixture window;

  /**
   * Sets up the testing window
   * before automatic testing begins
   */
  @Before
  public void setup() {
    Main frame = GuiActionRunner.execute(() -> new Main());
    window = new FrameFixture(frame);
    window.show(); // shows the frame to test

  }

  /**
   * Automatically tests searchCustomer
   * with the given static data
   */
  @Test
  public void searchCustomerTest() {
    window.menuItem("jMenu1").click();
    window.menuItem("searchCustomer").click();
    window.textBox("txtcustid").enterText("cs001");
    window.button("jButton4").click();
  }

  /**
   * Automatically tests addCustomer
   * with the given static data
   */
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

  /**
   * Automatically tests bookTicket
   * with the given static data
   */
  @Test
  public void bookTicketTest() {
    window.menuItem("jMenu2").click();
    window.menuItem("bookTicket").click();
    window.comboBox("txtsource").selectItem(2);
    window.comboBox("txtdepart").selectItem(3);
    window.button("searchflights").click();
    window.table("flightstable").selectRows(0);
    window.textBox("txtcustid").enterText("cs001");
    window.button("searchCustomers").click();
    window.spinner("txtseats").increment();
    window.button("book").click();

  }

  /**
   * Automatically tests ticketReport
   */
  @Test
  public void ticketReportTest() {
    window.menuItem("jMenu2").click();
    window.menuItem("ticketReport").click();
  }

  /**
   * Automatically tests addflight
   * with the given static data
   */
  @Test
  public void addFlightTest() {
    window.menuItem("jMenu3").click();
    window.menuItem("addflight").click();
    window.textBox("txtflightname").enterText("Test Flight");
    window.comboBox("txtsource").selectItem(0);
    window.comboBox("txtdepart").selectItem(0);
    window.panel("txtdate").textBox().setText("Apr 22, 2021");
    window.textBox("txtdtime").enterText("8.00AM");
    window.textBox("txtarrtime").enterText("10.00PM");
    window.textBox("txtflightcharge").enterText("1000");
    window.button("addBtn");
  }

  /**
   * Automatically tests user creation
   * with the given static data
   */
  @Test
  public void userCreationTest() {
    window.menuItem("jMenu4").click();
    window.menuItem("userCreation").click();
    window.textBox("txtfirstname").enterText("Test Firstname");
    window.textBox("txtlastname").enterText("Test Lastname");
    window.textBox("txtusername").enterText("Test Username");
    window.textBox("txtpassword").enterText("Test Password");
    window.button("addBtn").click();
  }

  /**
   * Clears data in window after tests
   */
  @After
  public void cleanUp(){
    window.cleanUp();
  }
}
