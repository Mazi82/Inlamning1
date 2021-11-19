package Test;
import Sort.Sorter;

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
            System.out.println("Test2 Ok");
        } else {
            System.err.println("Error Test2: Not Sorted");
        }
        if (testSorterMain3()) {
            System.out.println("Test3 Ok");
        } else {
            System.err.println("Error Test3: Not Sorted");
        }
        if (testSorterMain4()) {
            System.out.println("Test4 Ok");
        } else {
            System.err.println("Error Test4: Not Sorted");
        }
        if (testSorterMain5()) {
            System.out.println("Test5 Ok");
        } else {
            System.err.println("Error Test5: Not Sorted");
        }

        return true;
    }



    public static boolean testSorterMain1(){
        Sorter s = new Sorter();
        int[] arrList = {5, 225, 555, 185, 375};
        int[] result = s.sort(arrList);
        int[] expected = {5, 185, 225, 375, 555};
        for (int a = 0; a < result.length; a++) {
            if (result[a] != expected[a]) {
                System.out.println("Test1 Failed");
                return false;
            }
        }
    }
    private static boolean testSorterMain2() {
}
    private static boolean testSorterMain3() {
    }
    private static boolean testSorterMain4() {
        }
    }private static boolean testSorterMain5() {
        }