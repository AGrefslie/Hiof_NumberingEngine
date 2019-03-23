import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;

public class Hiof_NumberEngineTest {

    // Setting up the test subjects
    private static ArrayList<String> list = new ArrayList<>();
    static Hiof_NumberEngine hiof_numberEngine = new Hiof_NumberEngine(list);


    //Runs the method on list before all tests
    @BeforeAll
    public static void setup() throws NegativeNumberException {
        hiof_numberEngine.numberEngine(list);
    }

    //*********** Task 1: Run tests for numberingEngine ***************//
    @Test
    public void ArrayContainHundredElements() {
        Assertions.assertEquals(100, list.size());
    }

    @Test
    public void NumberCanBeDividedByThree() {
        Assertions.assertEquals("Hi", list.get(2));
    }

    @Test
    public void NumberCanBeDividedByFive() {
        Assertions.assertEquals("Of", list.get(4));
    }

    @Test
    public void NumberCanBeDividedByThreeAndFive() {
        Assertions.assertEquals("HiOf", list.get(14));
    }

    //*********** Task 3: Run tests for NegativeNumberExeptions ***************//
    @Test
    public void ChecksForNegativeNumbNumbersExeptionForZero() throws NegativeNumberException {
        Assertions.assertThrows(NegativeNumberException.class, new Executable() {
            public void execute() throws Throwable {
                list.set(0, "0");
                hiof_numberEngine.numberEngine(list);
            }
        });
    }

    @Test
    public void ChecksForNegativeNumbers() throws NegativeNumberException {
        Assertions.assertThrows(NegativeNumberException.class, new Executable() {
            public void execute() throws Throwable {
                list.set(0, "-1");
                hiof_numberEngine.numberEngine(list);
            }
        });
    }

    @AfterAll
    public static void EndOfTests() {
        System.out.println("Finished");
    }
}