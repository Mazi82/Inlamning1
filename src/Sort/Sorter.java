package Sort;

import java.util.Arrays;

public class Sorter<unsorted> {

    public static int[] sort(int[] unsorted) {

        Arrays.sort(unsorted);

        //System.out.println("Sorterad lista:");
        //for (int number:unsorted) {
        //System.out.println("nummer:" + number);
        return unsorted;
    }
}
