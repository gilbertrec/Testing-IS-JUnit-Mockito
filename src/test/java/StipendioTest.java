import modelexamples.Stipendio;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StipendioTest {

     Stipendio d;

    @BeforeEach
    public void initTest() {
        d= new Stipendio(3000);
    }

    @AfterEach
    public void afterTest() {
        d = null;
    }


    @Test
    public void testAggiuntaSaldo() {
        double aggiunta = 1000;
        d.aggiuntaSaldo(aggiunta);
        assertEquals(4000,d.getSaldo());
    }

    @Test
    public void testRimuoviSaldo() {
        double penale = 1000;

        d.rimuoviSaldo(penale);
        assertEquals(2000,d.getSaldo());
    }

    @Test
    public void testSaldoInsufficiente() {
        double penale = 8000;

        Exception exception = assertThrows(ArithmeticException.class, () ->
                d.rimuoviSaldo(penale));
        assertEquals("saldo insufficiente", exception.getMessage());
    }
}
