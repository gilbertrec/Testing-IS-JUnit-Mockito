package modelExamples;

import modelexamples.Class1;
import modelexamples.Class2;
import modelexamples.Classe3;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Classe3Test {
    String param = "Hello";
    Classe3 classe3;

    @BeforeEach
    public void initTest(){
        this.classe3 = new Classe3(param);
    }

    @AfterEach
    public void afterTest(){
        classe3 = null;
    }

    @Test
    public void method1Test(){
        //Given
        Class1 classe1Mock = Mockito.mock(Class1.class);
        Mockito.when(classe1Mock.getFirstParameter()).thenReturn("Guys");
        //When
        String result = classe3.method1(classe1Mock);
        //Then
        assertEquals("HelloGuys", result);
    }

    @Test
    public void method2Test(){
        //Given
        Class2 class2Mock = Mockito.mock(Class2.class);
        Mockito.when(class2Mock.getParameter1()).thenReturn("World");
        //When
        String result = classe3.method2(class2Mock);
        //Then
        assertEquals("HelloWorld", result);
    }
}
