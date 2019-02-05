public class Main {


    public static void main(String[] args) {


        Review r = new Review();

        r.setStart(1);
        r.setEnd(30);

        r.printNumbersStartToEnd();
        r.listNumbersStartToEnd();

        r.setStart(3);
        r.setEnd(7);

        r.numberList();


    }
}
