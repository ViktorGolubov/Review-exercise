import java.util.ArrayList;
import java.util.List;

public class Review {
    private int start;
    private int end;


    public Review(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public Review() {
        this.start = 0;
        this.end = 0; // This gives an opportunity to change end and start point, if needed.
    }

    public void printNumbersStartToEnd() {
        System.out.println("Printing numbers:");
        for (int result = start; result <= end; result++) {
            System.out.println(result);
        }

    }

    public List<Integer> listNumbersStartToEnd() {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int result = start; result <= end; result++) {
            numbers.add(result);
        }
        System.out.println("Printing list of numbers:");
        System.out.println(numbers);
        return numbers;

    }

    // Extra points exercise

    public List<Integer> numberList () {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int result = start; result < end; result++) {
            numbers.add(result);
        }
        System.out.println("Printing include start and exclude end:");
        System.out.println(numbers);
        return numbers;

    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
