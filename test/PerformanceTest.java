

    import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.time.Duration;
import org.junit.Test;
import org.mockito.Mockito;


    public class PerformanceTest {

        Login log = new Login();

        @Test
        public void initComponentsTest() {
            ticket ticket = mock(ticket.class);

            Mockito.doNothing().when(ticket).initComponents();
            Mockito.doNothing().when(ticket).autoID();

            try {
                ticket.initComponents();
                ticket.autoID();
                verify(ticket, times(1)).initComponents();
                verify(ticket, times(1)).autoID();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Test
        public void Test6() throws Exception {
            log.txtuser.setText("john");
            log.txtpass.setText("123");
            assertTimeout(Duration.ofSeconds(2), () -> log.jButton1ActionPerformed(null));
        }
    }
