import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

public class Hiof_ParameterizedTest {

    // Setting up the test subjects
    private static ArrayList<String> list = new ArrayList<>();
    static Hiof_NumberEngine hiof_numberEngine = new Hiof_NumberEngine(list);


    //Runs the method on list before all tests
    @BeforeAll
    public static void setup() throws NegativeNumberException {
        hiof_numberEngine.numberEngine(list);
    }

    //********** Task 2: Runs test cases using multiple parameters ************//
    @ParameterizedTest
    @ValueSource(ints = {2, 5, 8, 11, 17})
    public void CanDivideByThree(int y) throws NegativeNumberException {
        Assertions.assertEquals("Hi", list.get(y));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 9, 19, 24, 34})
    public void CanDivideByFive(int y) throws NegativeNumberException {
        Assertions.assertEquals("Of", list.get(y));
    }

    @ParameterizedTest
    @ValueSource(ints = {14, 29,  44, 59, 74})
    public void CanDivideByThreeAndFive(int y) throws NegativeNumberException {
        Assertions.assertEquals("HiOf", list.get(y));
    }

    @AfterAll
    public static void EndOfTests() {
        System.out.println("Fisnished");
    }

}
