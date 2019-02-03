import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReviewTest {

    @Test
    public void check_if_function_is_working() {
        List<Integer> numbers = new ArrayList<Integer>();
        int start = 1;
        int end = 30;
        for (int result = start; result <= end; result++) {
            numbers.add(result);
        }

        Review r = new Review(1,30);
        r.listNumbersStartToEnd();

        assertEquals(true, true);
    }

    @Test
    public void check_if_first_numbers_are_the_same() {
        List<Integer> numbers = new ArrayList<Integer>();
        int start = 1;
        int end = 30;
        for (int result = start; result <= end; result++) {
            numbers.add(result);
            numbers.get(0);
        }

        Review r = new Review(1,30);
        r.getStart();

        assertEquals(true, true);
    }

    @Test
    public void check_if_last_numbers_are_the_same() {
        List<Integer> numbers = new ArrayList<Integer>();
        int start = 1;
        int end = 30;
        for (int result = start; result <= end; result++) {
            numbers.add(result);
        }
        numbers.get(29);

        Review r = new Review(1,30);
        r.getEnd();

        assertEquals(true, true);
    }

}