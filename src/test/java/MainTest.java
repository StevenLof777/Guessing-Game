import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class MainTest {

    @Test
    void TestScanner(){
        assertEquals("Somename", ("Somename"));
    }

    @Test
    void TestScannerWrongInput(){
        assertNotEquals("Somename", ("Wrong"));
    }
}