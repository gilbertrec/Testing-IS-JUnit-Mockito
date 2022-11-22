package modelExamples;

import modelexamples.Class5;
import modelexamples.Classe4Interface;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class Classe4InterfaceTest {

    @Test
    public void methodInterfaceTest(){
        //Given
        String username = "Dario";
        String password = "Dario";
        Classe4Interface interfaceMock = Mockito.mock(Classe4Interface.class);

        Mockito.when(interfaceMock.authentication(username, password)).thenReturn(false);
        //When
        boolean result = interfaceMock.authentication(username, password);
        //Then
        assertFalse(result);
    }
}
