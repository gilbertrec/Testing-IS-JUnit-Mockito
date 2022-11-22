import modelexamples.Stipendio;
import modelexamples.MetodoDiPagamento;
import modelexamples.Utente;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UtenteTest {

    Utente utente1;
    MetodoDiPagamento pagamento1;
    Stipendio stipendio1;

    @BeforeEach
    public void initTest() {
        pagamento1 = Mockito.mock(MetodoDiPagamento.class);
    }

    @AfterEach
    public void afterTest() {
        pagamento1 =null;
        stipendio1 =null;
        utente1 = null;
    }

    @Test
    public void aggiungiBonusUtenteTest(){

        //Mock
        stipendio1 = Mockito.mock(Stipendio.class);
        Mockito.when(stipendio1.getSaldo()).thenReturn(3000.0);
        //Given
        double bonus = 0;
        utente1 = new Utente("Dario","Di Dario",stipendio1,pagamento1);
        
        //When
        bonus = utente1.calcolaBonusUtente(10);
        //Then
        assertEquals(300,bonus);
    }
}
