import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void checkIfLargestNumberWorksCorrectlyWithOtherParams(){
        List<Integer> list = Arrays.asList(100, 99 , 9);

        LargestNumber.largestNumber(list);
        assertEquals("999100", outputStreamCaptor.toString().trim());
    }

    @Test
    public void checkIfLargestNumberWorksCorrectly(){
        List<Integer> list = Arrays.asList(1, 2 , 3);

        LargestNumber.largestNumber(list);
        assertEquals("321", outputStreamCaptor.toString().trim());
    }

    @Test
    public void checkIfThereAreNegativesInList(){
        List<Integer> list = Arrays.asList(-1, 2 , 3);

        LargestNumber.largestNumber(list);
        assertEquals("There are negative numbers", outputStreamCaptor.toString().trim());
    }

    @Test
    public void checkIfListIsEmpty() {
        List<Integer> list = Arrays.asList();

        LargestNumber.largestNumber(list);
        assertEquals("List is empty", outputStreamCaptor.toString().trim());
    }

    @Test
    public void checkIfListIsNull() {
        LargestNumber.largestNumber(null);
        assertEquals("List is null", outputStreamCaptor.toString().trim());
    }
}
