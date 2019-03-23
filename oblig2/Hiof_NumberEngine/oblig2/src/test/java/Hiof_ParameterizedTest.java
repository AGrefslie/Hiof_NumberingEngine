import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

public class Hiof_ParameterizedTest {

    private static ArrayList<String> list = new ArrayList<>();
    static Hiof_NumberEngine hiof_numberEngine = new Hiof_NumberEngine(list);


    //Kjører metoden på listen før testene kjører.
    @BeforeAll
    public static void setup() {
        hiof_numberEngine.numberEngine(list);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 18})
    public void CanDivideByThree(int y) throws NegativeNumberException {
        Assertions.assertEquals("Hi", list.get(y));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25, 35})
    public void CanDivideByFive(int y) throws NegativeNumberException {
        Assertions.assertEquals("Of", list.get(y));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30,  45, 60, 75})
    public void CanDivideByThreeAndFive(int y) throws NegativeNumberException {
        Assertions.assertEquals("HiOf", list.get(y));
    }

    @AfterAll
    public static void EndOfTests() {
        System.out.println("Fisnished");
    }

}
