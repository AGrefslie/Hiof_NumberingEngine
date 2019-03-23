import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Hiof_NumberEngineTest {

    private static ArrayList<String> list = new ArrayList<>();
    static Hiof_NumberEngine hiof_numberEngine = new Hiof_NumberEngine(list);


    //Kjører metoden på listen før testene kjører.
    @BeforeAll
    public static void setup() {
        hiof_numberEngine.numberEngine(list);
    }


    @Test
    public void ArrayContainHundredElements() {
        Assertions.assertEquals(100, list.size());
    }

    @Test
    public void NumberCanBeDividedByThree() {
        Assertions.assertEquals("Hi", list.get(3));
    }

    @Test
    public void NumberCanBeDividedByFive() {
        Assertions.assertEquals("Of", list.get(5));
    }

    @Test
    public void NumberCanBeDividedByThreeAndFive() {
        Assertions.assertEquals("HiOf", list.get(15));
    }

    @Test
    public void ChecksForNegativeNumbers() throws NegativeNumberException{
        
    }


    @AfterAll
    public static void EndOfTests() {
        System.out.println("Finished");
    }
}