package Test;
import Sorter.Sorter;

public class Sorttest {
    public static void main(String[] args) {
        SortTester();
    }
    public static boolean SortTester(){
        if (testSorterMain1()) {
            System.out.println("Test1 Ok");
        } else {
            System.err.println("Error Test1: Not Sorted");
        }
        if (testSorterMain2()) {
            System.out.println("Test1 Ok");
        } else {
            System.err.println("Error Test2: Not Sorted");
        }
    }
}